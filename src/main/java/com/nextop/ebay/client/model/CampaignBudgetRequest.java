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
import com.nextop.ebay.client.model.BudgetRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A container for the details of a Promoted Listings campaign that uses the Cost Per Click (CPC) funding model.
 */
@ApiModel(description = "A container for the details of a Promoted Listings campaign that uses the Cost Per Click (CPC) funding model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class CampaignBudgetRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DAILY = "daily";
  @SerializedName(SERIALIZED_NAME_DAILY)
  private BudgetRequest daily;


  public CampaignBudgetRequest daily(BudgetRequest daily) {
    
    this.daily = daily;
    return this;
  }

   /**
   * Get daily
   * @return daily
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public BudgetRequest getDaily() {
    return daily;
  }


  public void setDaily(BudgetRequest daily) {
    this.daily = daily;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBudgetRequest campaignBudgetRequest = (CampaignBudgetRequest) o;
    return Objects.equals(this.daily, campaignBudgetRequest.daily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daily);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBudgetRequest {\n");
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
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

