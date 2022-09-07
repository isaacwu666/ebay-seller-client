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
import com.nextop.ebay.client.model.NegativeKeyword;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A type that defines the negative keywords, returned in a paged collection.
 */
@ApiModel(description = "A type that defines the negative keywords, returned in a paged collection.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class NegativeKeywordPagedCollectionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_NEGATIVE_KEYWORDS = "negativeKeywords";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_KEYWORDS)
  private List<NegativeKeyword> negativeKeywords = null;

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


  public NegativeKeywordPagedCollectionResponse href(String href) {
    
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


  public NegativeKeywordPagedCollectionResponse limit(Integer limit) {
    
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


  public NegativeKeywordPagedCollectionResponse negativeKeywords(List<NegativeKeyword> negativeKeywords) {
    
    this.negativeKeywords = negativeKeywords;
    return this;
  }

  public NegativeKeywordPagedCollectionResponse addNegativeKeywordsItem(NegativeKeyword negativeKeywordsItem) {
    if (this.negativeKeywords == null) {
      this.negativeKeywords = new ArrayList<NegativeKeyword>();
    }
    this.negativeKeywords.add(negativeKeywordsItem);
    return this;
  }

   /**
   * A list of negative keywords returned in the paginated collection.
   * @return negativeKeywords
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "A list of negative keywords returned in the paginated collection.")

  public List<NegativeKeyword> getNegativeKeywords() {
    return negativeKeywords;
  }


  public void setNegativeKeywords(List<NegativeKeyword> negativeKeywords) {
    this.negativeKeywords = negativeKeywords;
  }


  public NegativeKeywordPagedCollectionResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * The call URI that can be used to retrieve the next page in the result set. This value is returned only if there is an additional page of results to display from the result set.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The call URI that can be used to retrieve the next page in the result set. This value is returned only if there is an additional page of results to display from the result set.")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  public NegativeKeywordPagedCollectionResponse offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;The items in a paginated result set use a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the <b>offset</b> query parameter.<br /><br /><b>Default:</b> <code>0</code><br /><br /><span class=\"tablenote\"><b>Note: </b>The items in a paginated result set use a zero-based list, where the first item in the list has an offset of <code>0</code>.</span>")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public NegativeKeywordPagedCollectionResponse prev(String prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * The call URI that can be used to retrieve the previous page in the result set. Basically, all of the request parameters will remain the same except the offset value, which will be decreased to retrieve the previous page of results.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The call URI that can be used to retrieve the previous page in the result set. Basically, all of the request parameters will remain the same except the offset value, which will be decreased to retrieve the previous page of results.")

  public String getPrev() {
    return prev;
  }


  public void setPrev(String prev) {
    this.prev = prev;
  }


  public NegativeKeywordPagedCollectionResponse total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of result sets in the paginated collection.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of result sets in the paginated collection.")

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
    NegativeKeywordPagedCollectionResponse negativeKeywordPagedCollectionResponse = (NegativeKeywordPagedCollectionResponse) o;
    return Objects.equals(this.href, negativeKeywordPagedCollectionResponse.href) &&
        Objects.equals(this.limit, negativeKeywordPagedCollectionResponse.limit) &&
        Objects.equals(this.negativeKeywords, negativeKeywordPagedCollectionResponse.negativeKeywords) &&
        Objects.equals(this.next, negativeKeywordPagedCollectionResponse.next) &&
        Objects.equals(this.offset, negativeKeywordPagedCollectionResponse.offset) &&
        Objects.equals(this.prev, negativeKeywordPagedCollectionResponse.prev) &&
        Objects.equals(this.total, negativeKeywordPagedCollectionResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, negativeKeywords, next, offset, prev, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegativeKeywordPagedCollectionResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    negativeKeywords: ").append(toIndentedString(negativeKeywords)).append("\n");
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

