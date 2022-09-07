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
 * This type is used to indicate the quantities of the inventory items that are reserved for the different listing formats of the SKU offers.
 */
@ApiModel(description = "This type is used to indicate the quantities of the inventory items that are reserved for the different listing formats of the SKU offers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class FormatAllocation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUCTION = "auction";
  @SerializedName(SERIALIZED_NAME_AUCTION)
  private Integer auction;

  public static final String SERIALIZED_NAME_FIXED_PRICE = "fixedPrice";
  @SerializedName(SERIALIZED_NAME_FIXED_PRICE)
  private Integer fixedPrice;


  public FormatAllocation auction(Integer auction) {
    
    this.auction = auction;
    return this;
  }

   /**
   * This integer value indicates the quantity of the inventory item that is reserved for the published auction format offers of the SKU.
   * @return auction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This integer value indicates the quantity of the inventory item that is reserved for the published auction format offers of the SKU.")

  public Integer getAuction() {
    return auction;
  }


  public void setAuction(Integer auction) {
    this.auction = auction;
  }


  public FormatAllocation fixedPrice(Integer fixedPrice) {
    
    this.fixedPrice = fixedPrice;
    return this;
  }

   /**
   * This integer value indicates the quantity of the inventory item that is available for the fixed-price offers of the SKU.
   * @return fixedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This integer value indicates the quantity of the inventory item that is available for the fixed-price offers of the SKU.")

  public Integer getFixedPrice() {
    return fixedPrice;
  }


  public void setFixedPrice(Integer fixedPrice) {
    this.fixedPrice = fixedPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatAllocation formatAllocation = (FormatAllocation) o;
    return Objects.equals(this.auction, formatAllocation.auction) &&
        Objects.equals(this.fixedPrice, formatAllocation.fixedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auction, fixedPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatAllocation {\n");
    sb.append("    auction: ").append(toIndentedString(auction)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
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

