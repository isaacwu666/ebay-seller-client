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
 * This type defines the fields needed to delete an ad by its inventory reference ID.  You must always supply both &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt;.
 */
@ApiModel(description = "This type defines the fields needed to delete an ad by its inventory reference ID.  You must always supply both <b>inventory_reference_id</b> and <b>inventory_reference_type</b>.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class DeleteAdsByInventoryReferenceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INVENTORY_REFERENCE_ID = "inventoryReferenceId";
  @SerializedName(SERIALIZED_NAME_INVENTORY_REFERENCE_ID)
  private String inventoryReferenceId;

  public static final String SERIALIZED_NAME_INVENTORY_REFERENCE_TYPE = "inventoryReferenceType";
  @SerializedName(SERIALIZED_NAME_INVENTORY_REFERENCE_TYPE)
  private String inventoryReferenceType;


  public DeleteAdsByInventoryReferenceRequest inventoryReferenceId(String inventoryReferenceId) {
    
    this.inventoryReferenceId = inventoryReferenceId;
    return this;
  }

   /**
   * The inventory reference ID is a seller-defined SKU value for a single-item listing, or a seller-defined identifier for an inventory item group. Both of these values are defined when using the Inventory API, and an inventory item group is used to create a multiple-variation listing.
   * @return inventoryReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The inventory reference ID is a seller-defined SKU value for a single-item listing, or a seller-defined identifier for an inventory item group. Both of these values are defined when using the Inventory API, and an inventory item group is used to create a multiple-variation listing.")

  public String getInventoryReferenceId() {
    return inventoryReferenceId;
  }


  public void setInventoryReferenceId(String inventoryReferenceId) {
    this.inventoryReferenceId = inventoryReferenceId;
  }


  public DeleteAdsByInventoryReferenceRequest inventoryReferenceType(String inventoryReferenceType) {
    
    this.inventoryReferenceType = inventoryReferenceType;
    return this;
  }

   /**
   * The enumeration value passed into this field indicates the type of value used for the corresponding &lt;b&gt;inventoryReferenceId&lt;/b&gt; value. The enumeration value used here will either be &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; (to delete the ad for a single SKU listing) or &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; (to delete the ad for a multiple-variation listing). For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return inventoryReferenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The enumeration value passed into this field indicates the type of value used for the corresponding <b>inventoryReferenceId</b> value. The enumeration value used here will either be <code>INVENTORY_ITEM</code> (to delete the ad for a single SKU listing) or <code>INVENTORY_ITEM_GROUP</code> (to delete the ad for a multiple-variation listing). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum'>eBay API documentation</a>")

  public String getInventoryReferenceType() {
    return inventoryReferenceType;
  }


  public void setInventoryReferenceType(String inventoryReferenceType) {
    this.inventoryReferenceType = inventoryReferenceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAdsByInventoryReferenceRequest deleteAdsByInventoryReferenceRequest = (DeleteAdsByInventoryReferenceRequest) o;
    return Objects.equals(this.inventoryReferenceId, deleteAdsByInventoryReferenceRequest.inventoryReferenceId) &&
        Objects.equals(this.inventoryReferenceType, deleteAdsByInventoryReferenceRequest.inventoryReferenceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryReferenceId, inventoryReferenceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAdsByInventoryReferenceRequest {\n");
    sb.append("    inventoryReferenceId: ").append(toIndentedString(inventoryReferenceId)).append("\n");
    sb.append("    inventoryReferenceType: ").append(toIndentedString(inventoryReferenceType)).append("\n");
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

