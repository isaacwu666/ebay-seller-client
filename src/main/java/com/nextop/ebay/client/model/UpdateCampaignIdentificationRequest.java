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
 * This type specifies the updated name, and start and end dates for an update-campaign request.
 */
@ApiModel(description = "This type specifies the updated name, and start and end dates for an update-campaign request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class UpdateCampaignIdentificationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;


  public UpdateCampaignIdentificationRequest campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * The new seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;If you don&#39;t want to change the name of the campaign, specify the current campaign name in this field.&lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters.
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new seller-defined name for the campaign. This value must be unique for the seller. <p>If you don't want to change the name of the campaign, specify the current campaign name in this field.<p>You can use any alphanumeric characters in the name, except the less than (&lt;) or greater than (&gt;) characters.</p><b>Max length: </b>80 characters.")

  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public UpdateCampaignIdentificationRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign\&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.&lt;p&gt;If you want to change only the end date of the campaign, specify the current campaign name and set &lt;b&gt;startDate&lt;/b&gt; to the current date (you cannot use a start date that is in the past), and set the &lt;b&gt;endDate&lt;/b&gt; as desired. Note that if you do not set a new end date in this call, any current endDate value will be set to null. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the campaign ends, in UTC format (<code>yyyy-MM-ddThh:mm:ssZ</code>). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an <a href=\"/api-docs/sell/marketing/resources/campaign/methods/endCampaign\">endCampaign</a> call, or if they update the campaign at a later time with an end date.<p>If you want to change only the end date of the campaign, specify the current campaign name and set <b>startDate</b> to the current date (you cannot use a start date that is in the past), and set the <b>endDate</b> as desired. Note that if you do not set a new end date in this call, any current endDate value will be set to null. To preserve the currently-set end date, you must specify the value again in your request.</p>")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public UpdateCampaignIdentificationRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The new start date for the campaign, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). &lt;p&gt;If the campaign is currently &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;, enter the current date in this field because you cannot submit past or future date for these campaigns.&lt;/p&gt;  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign.&lt;/p&gt;  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&#39;s campaigns.&lt;/p&gt;
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new start date for the campaign, in UTC format (<code>yyyy-MM-ddThh:mm:ssZ</code>). <p>If the campaign is currently <code>RUNNING</code> or <code>PAUSED</code>, enter the current date in this field because you cannot submit past or future date for these campaigns.</p>  <p>On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign.</p>  <p>Call <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> to retrieve the <b>campaign_id</b> and the campaign status (<code>RUNNING</code>, <code>PAUSED</code>, <code>ENDED</code>, and so on) for all the seller's campaigns.</p>")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignIdentificationRequest updateCampaignIdentificationRequest = (UpdateCampaignIdentificationRequest) o;
    return Objects.equals(this.campaignName, updateCampaignIdentificationRequest.campaignName) &&
        Objects.equals(this.endDate, updateCampaignIdentificationRequest.endDate) &&
        Objects.equals(this.startDate, updateCampaignIdentificationRequest.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignName, endDate, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignIdentificationRequest {\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

