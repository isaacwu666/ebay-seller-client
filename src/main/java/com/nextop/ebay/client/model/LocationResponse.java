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
import com.nextop.ebay.client.model.InventoryLocationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type is used by the base response payload for the &lt;strong&gt;getInventoryLocations&lt;/strong&gt; call.
 */
@ApiModel(description = "This type is used by the base response payload for the <strong>getInventoryLocations</strong> call.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class LocationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<InventoryLocationResponse> locations = null;


  public LocationResponse href(String href) {
    
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


  public LocationResponse limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The number of items returned on a single page from the result set.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items returned on a single page from the result set.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public LocationResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * The URI for the following page of results. This value is returned only if there is an additional page of results to display from the result set. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 2048
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI for the following page of results. This value is returned only if there is an additional page of results to display from the result set. <br><br><b>Max length</b>: 2048")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  public LocationResponse offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of results skipped in the result set before listing the first returned result. This value is set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter. &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;The items in a paginated result set use a zero-based list where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/p&gt;
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results skipped in the result set before listing the first returned result. This value is set in the request with the <b>offset</b> query parameter. <p class=\"tablenote\"><strong>Note: </strong>The items in a paginated result set use a zero-based list where the first item in the list has an offset of <code>0</code>.</p>")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public LocationResponse prev(String prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * The URI for the preceding page of results. This value is returned only if there is a previous page of results to display from the result set. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 2048
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI for the preceding page of results. This value is returned only if there is a previous page of results to display from the result set. <br><br><b>Max length</b>: 2048")

  public String getPrev() {
    return prev;
  }


  public void setPrev(String prev) {
    this.prev = prev;
  }


  public LocationResponse total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of items retrieved in the result set.  &lt;br&gt;&lt;br&gt;If no items are found, this field is returned with a value of &lt;code&gt;0&lt;/code&gt;.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of items retrieved in the result set.  <br><br>If no items are found, this field is returned with a value of <code>0</code>.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public LocationResponse locations(List<InventoryLocationResponse> locations) {
    
    this.locations = locations;
    return this;
  }

  public LocationResponse addLocationsItem(InventoryLocationResponse locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<InventoryLocationResponse>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * An array of one or more of the merchant&#39;s inventory locations.
   * @return locations
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "An array of one or more of the merchant's inventory locations.")

  public List<InventoryLocationResponse> getLocations() {
    return locations;
  }


  public void setLocations(List<InventoryLocationResponse> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationResponse locationResponse = (LocationResponse) o;
    return Objects.equals(this.href, locationResponse.href) &&
        Objects.equals(this.limit, locationResponse.limit) &&
        Objects.equals(this.next, locationResponse.next) &&
        Objects.equals(this.offset, locationResponse.offset) &&
        Objects.equals(this.prev, locationResponse.prev) &&
        Objects.equals(this.total, locationResponse.total) &&
        Objects.equals(this.locations, locationResponse.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, next, offset, prev, total, locations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

