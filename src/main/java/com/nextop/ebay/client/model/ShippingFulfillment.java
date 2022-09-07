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
import com.nextop.ebay.client.model.LineItemReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type contains the complete details of an existing fulfillment for an order.
 */
@ApiModel(description = "This type contains the complete details of an existing fulfillment for an order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class ShippingFulfillment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FULFILLMENT_ID = "fulfillmentId";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_ID)
  private String fulfillmentId;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<LineItemReference> lineItems = null;

  public static final String SERIALIZED_NAME_SHIPMENT_TRACKING_NUMBER = "shipmentTrackingNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TRACKING_NUMBER)
  private String shipmentTrackingNumber;

  public static final String SERIALIZED_NAME_SHIPPED_DATE = "shippedDate";
  @SerializedName(SERIALIZED_NAME_SHIPPED_DATE)
  private String shippedDate;

  public static final String SERIALIZED_NAME_SHIPPING_CARRIER_CODE = "shippingCarrierCode";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER_CODE)
  private String shippingCarrierCode;


  public ShippingFulfillment fulfillmentId(String fulfillmentId) {
    
    this.fulfillmentId = fulfillmentId;
    return this;
  }

   /**
   * The unique identifier of the fulfillment; for example, &lt;code&gt;9405509699937003457459&lt;/code&gt;. This eBay-generated value is created with a successful &lt;b&gt;createShippingFulfillment&lt;/b&gt; call.
   * @return fulfillmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the fulfillment; for example, <code>9405509699937003457459</code>. This eBay-generated value is created with a successful <b>createShippingFulfillment</b> call.")

  public String getFulfillmentId() {
    return fulfillmentId;
  }


  public void setFulfillmentId(String fulfillmentId) {
    this.fulfillmentId = fulfillmentId;
  }


  public ShippingFulfillment lineItems(List<LineItemReference> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public ShippingFulfillment addLineItemsItem(LineItemReference lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItemReference>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This array contains a list of one or more line items (and purchased quantity) to which the fulfillment applies.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This array contains a list of one or more line items (and purchased quantity) to which the fulfillment applies.")

  public List<LineItemReference> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<LineItemReference> lineItems) {
    this.lineItems = lineItems;
  }


  public ShippingFulfillment shipmentTrackingNumber(String shipmentTrackingNumber) {
    
    this.shipmentTrackingNumber = shipmentTrackingNumber;
    return this;
  }

   /**
   * The tracking number provided by the shipping carrier for the package shipped in this fulfillment. This field is returned if available.
   * @return shipmentTrackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tracking number provided by the shipping carrier for the package shipped in this fulfillment. This field is returned if available.")

  public String getShipmentTrackingNumber() {
    return shipmentTrackingNumber;
  }


  public void setShipmentTrackingNumber(String shipmentTrackingNumber) {
    this.shipmentTrackingNumber = shipmentTrackingNumber;
  }


  public ShippingFulfillment shippedDate(String shippedDate) {
    
    this.shippedDate = shippedDate;
    return this;
  }

   /**
   * The date and time that the fulfillment package was shipped. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field should only be returned if the package has been shipped.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
   * @return shippedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the fulfillment package was shipped. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field should only be returned if the package has been shipped.<br /><br /><b>Format:</b> <code>[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z</code> <br /><b>Example:</b> <code>2015-08-04T19:09:02.768Z</code>")

  public String getShippedDate() {
    return shippedDate;
  }


  public void setShippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
  }


  public ShippingFulfillment shippingCarrierCode(String shippingCarrierCode) {
    
    this.shippingCarrierCode = shippingCarrierCode;
    return this;
  }

   /**
   * The eBay code identifying the shipping carrier for this fulfillment. This field is returned if available. &lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&#39;s &lt;b&gt;ShippingCarrierCodeType&lt;/b&gt; enumeration type contains the most current list of eBay shipping carrier codes and the countries served by each carrier. See &lt;a href&#x3D;\&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/types/ShippingCarrierCodeType.html \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ShippingCarrierCodeType&lt;/a&gt;.&lt;/span&gt;
   * @return shippingCarrierCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The eBay code identifying the shipping carrier for this fulfillment. This field is returned if available. <br /><br /><span class=\"tablenote\"><strong>Note:</strong> The Trading API's <b>ShippingCarrierCodeType</b> enumeration type contains the most current list of eBay shipping carrier codes and the countries served by each carrier. See <a href=\"https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/types/ShippingCarrierCodeType.html \" target=\"_blank\">ShippingCarrierCodeType</a>.</span>")

  public String getShippingCarrierCode() {
    return shippingCarrierCode;
  }


  public void setShippingCarrierCode(String shippingCarrierCode) {
    this.shippingCarrierCode = shippingCarrierCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingFulfillment shippingFulfillment = (ShippingFulfillment) o;
    return Objects.equals(this.fulfillmentId, shippingFulfillment.fulfillmentId) &&
        Objects.equals(this.lineItems, shippingFulfillment.lineItems) &&
        Objects.equals(this.shipmentTrackingNumber, shippingFulfillment.shipmentTrackingNumber) &&
        Objects.equals(this.shippedDate, shippingFulfillment.shippedDate) &&
        Objects.equals(this.shippingCarrierCode, shippingFulfillment.shippingCarrierCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentId, lineItems, shipmentTrackingNumber, shippedDate, shippingCarrierCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingFulfillment {\n");
    sb.append("    fulfillmentId: ").append(toIndentedString(fulfillmentId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    shipmentTrackingNumber: ").append(toIndentedString(shipmentTrackingNumber)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    shippingCarrierCode: ").append(toIndentedString(shippingCarrierCode)).append("\n");
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

