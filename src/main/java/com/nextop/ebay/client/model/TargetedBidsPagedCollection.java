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
import com.nextop.ebay.client.model.SuggestedBids;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A type that defines the keywords of the paged collection.
 */
@ApiModel(description = "A type that defines the keywords of the paged collection.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class TargetedBidsPagedCollection implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SUGGESTED_BIDS = "suggestedBids";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_BIDS)
  private List<SuggestedBids> suggestedBids = null;


  public TargetedBidsPagedCollection suggestedBids(List<SuggestedBids> suggestedBids) {
    
    this.suggestedBids = suggestedBids;
    return this;
  }

  public TargetedBidsPagedCollection addSuggestedBidsItem(SuggestedBids suggestedBidsItem) {
    if (this.suggestedBids == null) {
      this.suggestedBids = new ArrayList<SuggestedBids>();
    }
    this.suggestedBids.add(suggestedBidsItem);
    return this;
  }

   /**
   * A list of bids in the paginated collection.
   * @return suggestedBids
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "A list of bids in the paginated collection.")

  public List<SuggestedBids> getSuggestedBids() {
    return suggestedBids;
  }


  public void setSuggestedBids(List<SuggestedBids> suggestedBids) {
    this.suggestedBids = suggestedBids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetedBidsPagedCollection targetedBidsPagedCollection = (TargetedBidsPagedCollection) o;
    return Objects.equals(this.suggestedBids, targetedBidsPagedCollection.suggestedBids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedBids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetedBidsPagedCollection {\n");
    sb.append("    suggestedBids: ").append(toIndentedString(suggestedBids)).append("\n");
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

