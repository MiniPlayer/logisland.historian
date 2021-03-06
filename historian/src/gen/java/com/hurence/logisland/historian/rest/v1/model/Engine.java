/*
 * Logisland Data Historian
 * REST API for logisland historian
 *
 * OpenAPI spec version: v1
 * Contact: support@hurence.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hurence.logisland.historian.rest.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hurence.logisland.historian.rest.v1.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Engine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-10T20:51:14.764+02:00")
public class Engine   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("component")
  private String component = null;

  @JsonProperty("config")
  private List<Property> config = new ArrayList<Property>();

  public Engine name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Engine component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   **/
  @JsonProperty("component")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public Engine config(List<Property> config) {
    this.config = config;
    return this;
  }

  public Engine addConfigItem(Property configItem) {
    this.config.add(configItem);
    return this;
  }

  /**
   * Get config
   * @return config
   **/
  @JsonProperty("config")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<Property> getConfig() {
    return config;
  }

  public void setConfig(List<Property> config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Engine engine = (Engine) o;
    return Objects.equals(this.name, engine.name) &&
        Objects.equals(this.component, engine.component) &&
        Objects.equals(this.config, engine.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, component, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Engine {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

