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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.cache.annotation.Cacheable;

import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * Tag
 */
@Cacheable(value = "tag", key = "#itemName")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-10T20:47:54.004+02:00")
public class Tag   {
  @JsonProperty("item_name")
  private String itemName = null;

  @JsonProperty("datasource")
  private String datasource = null;

  /**
   * Gets or Sets dataType
   */
  public enum DataTypeEnum {
    INT("int"),
    
    LONG("long"),
    
    FLOAT("float"),
    
    DOUBLE("double"),
    
    STRING("string"),
    
    ARRAY("array"),
    
    BYTES("bytes"),
    
    BOOLEAN("boolean");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("data_type")
  private DataTypeEnum dataType = DataTypeEnum.FLOAT;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("creation_date")
  private Long creationDate = null;

  @JsonProperty("last_modification_date")
  private Long lastModificationDate = null;

  @JsonProperty("last_polling_date")
  private Long lastPollingDate = null;

  @JsonProperty("last_base64_value")
  private byte[] lastBase64Value = null;

  @JsonProperty("update_rate")
  private Integer updateRate = null;

  @JsonProperty("min_numeric_value")
  private BigDecimal minNumericValue = null;

  @JsonProperty("max_numeric_value")
  private Double maxNumericValue = null;

  @JsonProperty("last_numeric_value")
  private Double lastNumericValue = null;

  @JsonProperty("last_quality")
  private Integer lastQuality = null;

  public Tag itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * Get itemName
   * @return itemName
   **/
  @JsonProperty("item_name")
  @ApiModelProperty(value = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public Tag datasource(String datasource) {
    this.datasource = datasource;
    return this;
  }

  /**
   * Get datasource
   * @return datasource
   **/
  @JsonProperty("datasource")
  @ApiModelProperty(value = "")
  public String getDatasource() {
    return datasource;
  }

  public void setDatasource(String datasource) {
    this.datasource = datasource;
  }

  public Tag dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   **/
  @JsonProperty("data_type")
  @ApiModelProperty(value = "")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public Tag description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @JsonProperty("description")
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tag creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * timestamp
   * @return creationDate
   **/
  @JsonProperty("creation_date")
  @ApiModelProperty(value = "timestamp")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public Tag lastModificationDate(Long lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

  /**
   * timestamp
   * @return lastModificationDate
   **/
  @JsonProperty("last_modification_date")
  @ApiModelProperty(value = "timestamp")
  public Long getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(Long lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public Tag lastPollingDate(Long lastPollingDate) {
    this.lastPollingDate = lastPollingDate;
    return this;
  }

  /**
   * timestamp
   * @return lastPollingDate
   **/
  @JsonProperty("last_polling_date")
  @ApiModelProperty(value = "timestamp")
  public Long getLastPollingDate() {
    return lastPollingDate;
  }

  public void setLastPollingDate(Long lastPollingDate) {
    this.lastPollingDate = lastPollingDate;
  }

  public Tag lastBase64Value(byte[] lastBase64Value) {
    this.lastBase64Value = lastBase64Value;
    return this;
  }

  /**
   * base64 encoded value
   * @return lastBase64Value
   **/
  @JsonProperty("last_base64_value")
  @ApiModelProperty(value = "base64 encoded value")
 @Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")  public byte[] getLastBase64Value() {
    return lastBase64Value;
  }

  public void setLastBase64Value(byte[] lastBase64Value) {
    this.lastBase64Value = lastBase64Value;
  }

  public Tag updateRate(Integer updateRate) {
    this.updateRate = updateRate;
    return this;
  }

  /**
   * polling delay in ms
   * @return updateRate
   **/
  @JsonProperty("update_rate")
  @ApiModelProperty(value = "polling delay in ms")
  public Integer getUpdateRate() {
    return updateRate;
  }

  public void setUpdateRate(Integer updateRate) {
    this.updateRate = updateRate;
  }

  public Tag minNumericValue(BigDecimal minNumericValue) {
    this.minNumericValue = minNumericValue;
    return this;
  }

  /**
   * Get minNumericValue
   * @return minNumericValue
   **/
  @JsonProperty("min_numeric_value")
  @ApiModelProperty(value = "")
  public BigDecimal getMinNumericValue() {
    return minNumericValue;
  }

  public void setMinNumericValue(BigDecimal minNumericValue) {
    this.minNumericValue = minNumericValue;
  }

  public Tag maxNumericValue(Double maxNumericValue) {
    this.maxNumericValue = maxNumericValue;
    return this;
  }

  /**
   * Get maxNumericValue
   * @return maxNumericValue
   **/
  @JsonProperty("max_numeric_value")
  @ApiModelProperty(value = "")
  public Double getMaxNumericValue() {
    return maxNumericValue;
  }

  public void setMaxNumericValue(Double maxNumericValue) {
    this.maxNumericValue = maxNumericValue;
  }

  public Tag lastNumericValue(Double lastNumericValue) {
    this.lastNumericValue = lastNumericValue;
    return this;
  }

  /**
   * Get lastNumericValue
   * @return lastNumericValue
   **/
  @JsonProperty("last_numeric_value")
  @ApiModelProperty(value = "")
  public Double getLastNumericValue() {
    return lastNumericValue;
  }

  public void setLastNumericValue(Double lastNumericValue) {
    this.lastNumericValue = lastNumericValue;
  }

  public Tag lastQuality(Integer lastQuality) {
    this.lastQuality = lastQuality;
    return this;
  }

  /**
   * Get lastQuality
   * @return lastQuality
   **/
  @JsonProperty("last_quality")
  @ApiModelProperty(value = "")
  public Integer getLastQuality() {
    return lastQuality;
  }

  public void setLastQuality(Integer lastQuality) {
    this.lastQuality = lastQuality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.itemName, tag.itemName) &&
        Objects.equals(this.datasource, tag.datasource) &&
        Objects.equals(this.dataType, tag.dataType) &&
        Objects.equals(this.description, tag.description) &&
        Objects.equals(this.creationDate, tag.creationDate) &&
        Objects.equals(this.lastModificationDate, tag.lastModificationDate) &&
        Objects.equals(this.lastPollingDate, tag.lastPollingDate) &&
        Objects.equals(this.lastBase64Value, tag.lastBase64Value) &&
        Objects.equals(this.updateRate, tag.updateRate) &&
        Objects.equals(this.minNumericValue, tag.minNumericValue) &&
        Objects.equals(this.maxNumericValue, tag.maxNumericValue) &&
        Objects.equals(this.lastNumericValue, tag.lastNumericValue) &&
        Objects.equals(this.lastQuality, tag.lastQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemName, datasource, dataType, description, creationDate, lastModificationDate, lastPollingDate, lastBase64Value, updateRate, minNumericValue, maxNumericValue, lastNumericValue, lastQuality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    lastPollingDate: ").append(toIndentedString(lastPollingDate)).append("\n");
    sb.append("    lastBase64Value: ").append(toIndentedString(lastBase64Value)).append("\n");
    sb.append("    updateRate: ").append(toIndentedString(updateRate)).append("\n");
    sb.append("    minNumericValue: ").append(toIndentedString(minNumericValue)).append("\n");
    sb.append("    maxNumericValue: ").append(toIndentedString(maxNumericValue)).append("\n");
    sb.append("    lastNumericValue: ").append(toIndentedString(lastNumericValue)).append("\n");
    sb.append("    lastQuality: ").append(toIndentedString(lastQuality)).append("\n");
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

