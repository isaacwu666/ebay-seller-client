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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type is a container for a list of ad IDs.
 */
@ApiModel(description = "This type is a container for a list of ad IDs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class AdIds implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AD_IDS = "adIds";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<String> adIds = null;


  public AdIds adIds(List<String> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public AdIds addAdIdsItem(String adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<String>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * A list of ad IDs. Only one ad can be deleted per operation and only one adId value will be returned.
   * @return adIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of ad IDs. Only one ad can be deleted per operation and only one adId value will be returned.")

  public List<String> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdIds adIds = (AdIds) o;
    return Objects.equals(this.adIds, adIds.adIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdIds {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
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

