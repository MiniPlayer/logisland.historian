FROM azul/zulu-openjdk:8
MAINTAINER hurence <support@hurence.com>, http://www.hurence.com

VOLUME /tmp

# Update Ubuntu
RUN \
  bash -c 'apt-get -qq update && apt-get -y upgrade && apt-get -y autoclean && apt-get -y autoremove' && \
  bash -c 'DEBIAN_FRONTEND=noninteractive apt-get install -y curl wget tar'

ENV APP_JAR historian-0.0.1-SNAPSHOT.jar
ENV USER_NAME logisland
ENV APP_HOME /opt/$USER_NAME

RUN \
  useradd -ms /bin/bash $USER_NAME && \
  mkdir -p $APP_HOME

ADD ${APP_JAR} ${APP_HOME}/${APP_JAR}
RUN \
  chown $USER_NAME $APP_HOME/${APP_JAR} && \
  bash -c 'touch ${APP_HOME}/${APP_JAR}'

RUN ls  ${APP_HOME}/${APP_JAR}

ENV JAVA_TOOL_OPTIONS "-Xms128M -Xmx128M -Djava.awt.headless=true -Djava.security.egd=file:/dev/./urandom"

USER $USER_NAME
WORKDIR $APP_HOME
ENTRYPOINT ["java", "-jar", "historian-0.0.1-SNAPSHOT.jar"]

# Run as:
# docker run -idt -p 8701:8701 -e appPort=8701 asimio/springboot-jersey-swagger-docker:latest