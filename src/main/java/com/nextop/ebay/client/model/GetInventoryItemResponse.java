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
import com.nextop.ebay.client.model.Error;
import com.nextop.ebay.client.model.InventoryItemWithSkuLocaleGroupKeys;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type is used by the response of the &lt;strong&gt;bulkGetInventoryItem&lt;/strong&gt; method to give the status of each inventory item record that the user tried to retrieve.
 */
@ApiModel(description = "This type is used by the response of the <strong>bulkGetInventoryItem</strong> method to give the status of each inventory item record that the user tried to retrieve.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class GetInventoryItemResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_INVENTORY_ITEM = "inventoryItem";
  @SerializedName(SERIALIZED_NAME_INVENTORY_ITEM)
  private InventoryItemWithSkuLocaleGroupKeys inventoryItem;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<Error> warnings = null;


  public GetInventoryItemResponse errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public GetInventoryItemResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * This container will be returned if there were one or more errors associated with retrieving the inventory item record.
   * @return errors
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This container will be returned if there were one or more errors associated with retrieving the inventory item record.")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public GetInventoryItemResponse inventoryItem(InventoryItemWithSkuLocaleGroupKeys inventoryItem) {
    
    this.inventoryItem = inventoryItem;
    return this;
  }

   /**
   * Get inventoryItem
   * @return inventoryItem
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public InventoryItemWithSkuLocaleGroupKeys getInventoryItem() {
    return inventoryItem;
  }


  public void setInventoryItem(InventoryItemWithSkuLocaleGroupKeys inventoryItem) {
    this.inventoryItem = inventoryItem;
  }


  public GetInventoryItemResponse sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public GetInventoryItemResponse statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The HTTP status code returned in this field indicates the success or failure of retrieving the inventory item record for the inventory item specified in the &lt;strong&gt;sku&lt;/strong&gt; field. See the &lt;strong&gt;HTTP status codes&lt;/strong&gt; table to see which each status code indicates.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP status code returned in this field indicates the success or failure of retrieving the inventory item record for the inventory item specified in the <strong>sku</strong> field. See the <strong>HTTP status codes</strong> table to see which each status code indicates.")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public GetInventoryItemResponse warnings(List<Error> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public GetInventoryItemResponse addWarningsItem(Error warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<Error>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * This container will be returned if there were one or more warnings associated with retrieving the inventory item record.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This container will be returned if there were one or more warnings associated with retrieving the inventory item record.")

  public List<Error> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<Error> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInventoryItemResponse getInventoryItemResponse = (GetInventoryItemResponse) o;
    return Objects.equals(this.errors, getInventoryItemResponse.errors) &&
        Objects.equals(this.inventoryItem, getInventoryItemResponse.inventoryItem) &&
        Objects.equals(this.sku, getInventoryItemResponse.sku) &&
        Objects.equals(this.statusCode, getInventoryItemResponse.statusCode) &&
        Objects.equals(this.warnings, getInventoryItemResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, inventoryItem, sku, statusCode, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInventoryItemResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    inventoryItem: ").append(toIndentedString(inventoryItem)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

