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
 * This type defines the fields that paginate the campaigns returned by the request. The entire &lt;i&gt;result set&lt;/i&gt; consists of 0 or more sequenced &lt;i&gt;response pages&lt;/i&gt;, where each page consists of 0 or more items from the complete result set.
 */
@ApiModel(description = "This type defines the fields that paginate the campaigns returned by the request. The entire <i>result set</i> consists of 0 or more sequenced <i>response pages</i>, where each page consists of 0 or more items from the complete result set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class CampaignPagedCollectionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private List<Campaign> campaigns = null;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private String prev;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;


  public CampaignPagedCollectionResponse campaigns(List<Campaign> campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

  public CampaignPagedCollectionResponse addCampaignsItem(Campaign campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<Campaign>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * This array contains all of the seller&#39;s campaign that match the request criteria.
   * @return campaigns
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This array contains all of the seller's campaign that match the request criteria.")

  public List<Campaign> getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
  }


  public CampaignPagedCollectionResponse href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * The URI of the current page of results from the result set.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI of the current page of results from the result set.")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public CampaignPagedCollectionResponse limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of items returned on a single page from the result set. This value can be set in the request with the &lt;b&gt;limit&lt;/b&gt; query parameter.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items returned on a single page from the result set. This value can be set in the request with the <b>limit</b> query parameter.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public CampaignPagedCollectionResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * The call URI that can be used to retrieve the next page in the result set. This value is returned only if there is an additional page of results to display from the result set. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 2048
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The call URI that can be used to retrieve the next page in the result set. This value is returned only if there is an additional page of results to display from the result set. <br><br><b>Max length</b>: 2048")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  public CampaignPagedCollectionResponse offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter. &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the <b>offset</b> query parameter. <p class=\"tablenote\"><strong>Note: </strong>The items in a paginated result set use a zero-based list where the first item in the list has an offset of <code>0</code>.</p>")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public CampaignPagedCollectionResponse prev(String prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * The call URI that can be used to retrieve the previous page in the result set. Basically, all of the request parameters will remain the same except the offset value, which will be decreased to retrieve the previous page of results. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 2048
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The call URI that can be used to retrieve the previous page in the result set. Basically, all of the request parameters will remain the same except the offset value, which will be decreased to retrieve the previous page of results. <br><br><b>Max length</b>: 2048")

  public String getPrev() {
    return prev;
  }


  public void setPrev(String prev) {
    this.prev = prev;
  }


  public CampaignPagedCollectionResponse total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of campaigns retrieved in the result set.  &lt;br&gt;&lt;br&gt;If no campaigns are found, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of campaigns retrieved in the result set.  <br><br>If no campaigns are found, this field is returned with a value of <code>0</code>.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPagedCollectionResponse campaignPagedCollectionResponse = (CampaignPagedCollectionResponse) o;
    return Objects.equals(this.campaigns, campaignPagedCollectionResponse.campaigns) &&
        Objects.equals(this.href, campaignPagedCollectionResponse.href) &&
        Objects.equals(this.limit, campaignPagedCollectionResponse.limit) &&
        Objects.equals(this.next, campaignPagedCollectionResponse.next) &&
        Objects.equals(this.offset, campaignPagedCollectionResponse.offset) &&
        Objects.equals(this.prev, campaignPagedCollectionResponse.prev) &&
        Objects.equals(this.total, campaignPagedCollectionResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, href, limit, next, offset, prev, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPagedCollectionResponse {\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

