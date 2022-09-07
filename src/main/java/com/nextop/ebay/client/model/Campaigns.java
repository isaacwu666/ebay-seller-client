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
import com.nextop.ebay.client.model.Campaign;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type contains a list of campaigns.
 */
@ApiModel(description = "This type contains a list of campaigns.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class Campaigns implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private List<Campaign> campaigns = null;


  public Campaigns campaigns(List<Campaign> campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

  public Campaigns addCampaignsItem(Campaign campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<Campaign>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * This is an array of one or campaigns that match the listing or inventory item group specified in the request.
   * @return campaigns
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This is an array of one or campaigns that match the listing or inventory item group specified in the request.")

  public List<Campaign> getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaigns campaigns = (Campaigns) o;
    return Objects.equals(this.campaigns, campaigns.campaigns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaigns {\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
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

