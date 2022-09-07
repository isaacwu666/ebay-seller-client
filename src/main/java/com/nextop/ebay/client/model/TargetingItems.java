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
import com.nextop.ebay.client.model.ItemBasis;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A type that defines the targeted items.
 */
@ApiModel(description = "A type that defines the targeted items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class TargetingItems implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BASES = "bases";
  @SerializedName(SERIALIZED_NAME_BASES)
  private List<ItemBasis> bases = null;

  public static final String SERIALIZED_NAME_LISTING_ID = "listingId";
  @SerializedName(SERIALIZED_NAME_LISTING_ID)
  private String listingId;


  public TargetingItems bases(List<ItemBasis> bases) {
    
    this.bases = bases;
    return this;
  }

  public TargetingItems addBasesItem(ItemBasis basesItem) {
    if (this.bases == null) {
      this.bases = new ArrayList<ItemBasis>();
    }
    this.bases.add(basesItem);
    return this;
  }

   /**
   * The metrics and additional information for the items.
   * @return bases
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "The metrics and additional information for the items.")

  public List<ItemBasis> getBases() {
    return bases;
  }


  public void setBases(List<ItemBasis> bases) {
    this.bases = bases;
  }


  public TargetingItems listingId(String listingId) {
    
    this.listingId = listingId;
    return this;
  }

   /**
   * The listing ID of the targeted item.
   * @return listingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The listing ID of the targeted item.")

  public String getListingId() {
    return listingId;
  }


  public void setListingId(String listingId) {
    this.listingId = listingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingItems targetingItems = (TargetingItems) o;
    return Objects.equals(this.bases, targetingItems.bases) &&
        Objects.equals(this.listingId, targetingItems.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bases, listingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingItems {\n");
    sb.append("    bases: ").append(toIndentedString(bases)).append("\n");
    sb.append("    listingId: ").append(toIndentedString(listingId)).append("\n");
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

