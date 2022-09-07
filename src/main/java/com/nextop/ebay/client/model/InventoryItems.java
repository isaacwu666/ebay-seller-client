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
import com.nextop.ebay.client.model.InventoryItemWithSkuLocaleGroupid;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type is used by the base response payload of &lt;strong&gt;getInventoryItems&lt;/strong&gt; call. 
 */
@ApiModel(description = "This type is used by the base response payload of <strong>getInventoryItems</strong> call. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class InventoryItems implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_INVENTORY_ITEMS = "inventoryItems";
  @SerializedName(SERIALIZED_NAME_INVENTORY_ITEMS)
  private List<InventoryItemWithSkuLocaleGroupid> inventoryItems = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private String prev;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;


  public InventoryItems href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * This is the URL to the current page of inventory items.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the URL to the current page of inventory items.")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public InventoryItems inventoryItems(List<InventoryItemWithSkuLocaleGroupid> inventoryItems) {
    
    this.inventoryItems = inventoryItems;
    return this;
  }

  public InventoryItems addInventoryItemsItem(InventoryItemWithSkuLocaleGroupid inventoryItemsItem) {
    if (this.inventoryItems == null) {
      this.inventoryItems = new ArrayList<InventoryItemWithSkuLocaleGroupid>();
    }
    this.inventoryItems.add(inventoryItemsItem);
    return this;
  }

   /**
   * This container is an array of one or more inventory items, with detailed information on each inventory item.
   * @return inventoryItems
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This container is an array of one or more inventory items, with detailed information on each inventory item.")

  public List<InventoryItemWithSkuLocaleGroupid> getInventoryItems() {
    return inventoryItems;
  }


  public void setInventoryItems(List<InventoryItemWithSkuLocaleGroupid> inventoryItems) {
    this.inventoryItems = inventoryItems;
  }


  public InventoryItems limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * This integer value is the number of inventory items that will be displayed on each results page.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This integer value is the number of inventory items that will be displayed on each results page.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public InventoryItems next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * This is the URL to the next page of inventory items. This field will only be returned if there are additional inventory items to view.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the URL to the next page of inventory items. This field will only be returned if there are additional inventory items to view.")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  public InventoryItems prev(String prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * This is the URL to the previous page of inventory items. This field will only be returned if there are previous inventory items to view.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the URL to the previous page of inventory items. This field will only be returned if there are previous inventory items to view.")

  public String getPrev() {
    return prev;
  }


  public void setPrev(String prev) {
    this.prev = prev;
  }


  public InventoryItems size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * This integer value indicates the total number of pages of results that are available. This number will depend on the total number of inventory items available for viewing, and on the &lt;strong&gt;limit&lt;/strong&gt; value.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This integer value indicates the total number of pages of results that are available. This number will depend on the total number of inventory items available for viewing, and on the <strong>limit</strong> value.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public InventoryItems total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * This integer value is the total number of inventory items that exist for the seller&#39;s account. Based on this number and on the &lt;strong&gt;limit&lt;/strong&gt; value, the seller may have to toggle through multiple pages to view all inventory items.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This integer value is the total number of inventory items that exist for the seller's account. Based on this number and on the <strong>limit</strong> value, the seller may have to toggle through multiple pages to view all inventory items.")

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
    InventoryItems inventoryItems = (InventoryItems) o;
    return Objects.equals(this.href, inventoryItems.href) &&
        Objects.equals(this.inventoryItems, inventoryItems.inventoryItems) &&
        Objects.equals(this.limit, inventoryItems.limit) &&
        Objects.equals(this.next, inventoryItems.next) &&
        Objects.equals(this.prev, inventoryItems.prev) &&
        Objects.equals(this.size, inventoryItems.size) &&
        Objects.equals(this.total, inventoryItems.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, inventoryItems, limit, next, prev, size, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItems {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    inventoryItems: ").append(toIndentedString(inventoryItems)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

