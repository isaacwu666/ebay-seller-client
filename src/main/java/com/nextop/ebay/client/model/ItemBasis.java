/*
 * ebay官方api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.nextop.ebay.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A container for details regarding the basis for an item.
 */
@ApiModel(description = "A container for details regarding the basis for an item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class ItemBasis implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ESTIMATED_VALUE = "estimatedValue";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_VALUE)
  private Integer estimatedValue;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private String metric;


  public ItemBasis estimatedValue(Integer estimatedValue) {
    
    this.estimatedValue = estimatedValue;
    return this;
  }

   /**
   * The estimated value of the search impressions for items based on the provided dimensions. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Duration:&lt;/b&gt; 17 days&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Total slots:&lt;/b&gt; 200 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Channel:&lt;/b&gt; Dweb, Mweb, Native
   * @return estimatedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The estimated value of the search impressions for items based on the provided dimensions. <br /><br /><b>Duration:</b> 17 days<br /><br /><b>Total slots:</b> 200 <br /><br /><b>Channel:</b> Dweb, Mweb, Native")

  public Integer getEstimatedValue() {
    return estimatedValue;
  }


  public void setEstimatedValue(Integer estimatedValue) {
    this.estimatedValue = estimatedValue;
  }


  public ItemBasis metric(String metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * The basis of the statistics. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:TargetingMetricsEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The basis of the statistics. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/marketing/types/pls:TargetingMetricsEnum'>eBay API documentation</a>")

  public String getMetric() {
    return metric;
  }


  public void setMetric(String metric) {
    this.metric = metric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBasis itemBasis = (ItemBasis) o;
    return Objects.equals(this.estimatedValue, itemBasis.estimatedValue) &&
        Objects.equals(this.metric, itemBasis.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedValue, metric);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBasis {\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

