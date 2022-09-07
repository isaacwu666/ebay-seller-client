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
import com.nextop.ebay.client.model.Contact;
import com.nextop.ebay.client.model.Order;
import com.nextop.ebay.client.model.PackageSpecification;
import com.nextop.ebay.client.model.PurchasedRate;
import com.nextop.ebay.client.model.ShipmentCancellation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This complex type defines a shipment for a specific package (for example, a box or letter). Shipments are always linked to a purchased shipping label. 
 */
@ApiModel(description = "This complex type defines a shipment for a specific package (for example, a box or letter). Shipments are always linked to a purchased shipping label. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class Shipment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CANCELLATION = "cancellation";
  @SerializedName(SERIALIZED_NAME_CANCELLATION)
  private ShipmentCancellation cancellation;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_LABEL_CUSTOM_MESSAGE = "labelCustomMessage";
  @SerializedName(SERIALIZED_NAME_LABEL_CUSTOM_MESSAGE)
  private String labelCustomMessage;

  public static final String SERIALIZED_NAME_LABEL_DOWNLOAD_URL = "labelDownloadUrl";
  @SerializedName(SERIALIZED_NAME_LABEL_DOWNLOAD_URL)
  private String labelDownloadUrl;

  public static final String SERIALIZED_NAME_LABEL_SIZE = "labelSize";
  @SerializedName(SERIALIZED_NAME_LABEL_SIZE)
  private String labelSize;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private List<Order> orders = null;

  public static final String SERIALIZED_NAME_PACKAGE_SPECIFICATION = "packageSpecification";
  @SerializedName(SERIALIZED_NAME_PACKAGE_SPECIFICATION)
  private PackageSpecification packageSpecification;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private PurchasedRate rate;

  public static final String SERIALIZED_NAME_RETURN_TO = "returnTo";
  @SerializedName(SERIALIZED_NAME_RETURN_TO)
  private Contact returnTo;

  public static final String SERIALIZED_NAME_SHIP_FROM = "shipFrom";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM)
  private Contact shipFrom;

  public static final String SERIALIZED_NAME_SHIPMENT_ID = "shipmentId";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_ID)
  private String shipmentId;

  public static final String SERIALIZED_NAME_SHIPMENT_TRACKING_NUMBER = "shipmentTrackingNumber";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TRACKING_NUMBER)
  private String shipmentTrackingNumber;

  public static final String SERIALIZED_NAME_SHIP_TO = "shipTo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO)
  private Contact shipTo;


  public Shipment cancellation(ShipmentCancellation cancellation) {
    
    this.cancellation = cancellation;
    return this;
  }

   /**
   * Get cancellation
   * @return cancellation
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public ShipmentCancellation getCancellation() {
    return cancellation;
  }


  public void setCancellation(ShipmentCancellation cancellation) {
    this.cancellation = cancellation;
  }


  public Shipment creationDate(String creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time the shipment was created, formatted as an &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[HH]:[MM]:[SS].[SSS]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the shipment was created, formatted as an <a href=\"https://www.iso.org/iso-8601-date-and-time-format.html\" title=\"https://www.iso.org\" target=\"_blank\">ISO 8601</a> string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  <br><br><b>Format:</b> <code>[YYYY]-[MM]-[DD]T[HH]:[MM]:[SS].[SSS]Z</code> <br><b>Example:</b> <code>2018-08-20T07:09:00.000Z</code>")

  public String getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public Shipment labelCustomMessage(String labelCustomMessage) {
    
    this.labelCustomMessage = labelCustomMessage;
    return this;
  }

   /**
   * If supported by the selected shipping carrier, this field can contain optional seller text to be printed on the shipping label.
   * @return labelCustomMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If supported by the selected shipping carrier, this field can contain optional seller text to be printed on the shipping label.")

  public String getLabelCustomMessage() {
    return labelCustomMessage;
  }


  public void setLabelCustomMessage(String labelCustomMessage) {
    this.labelCustomMessage = labelCustomMessage;
  }


  public Shipment labelDownloadUrl(String labelDownloadUrl) {
    
    this.labelDownloadUrl = labelDownloadUrl;
    return this;
  }

   /**
   * The direct URL the seller can use to download an image of the shipping label. By default, the file format is PDF. See &lt;a href&#x3D;\&quot;/api-docs/sell/logistics/resources/shipment/methods/downloadLabelFile\&quot;&gt;downloadLabelFile&lt;/a&gt; for requesting different response file formats.
   * @return labelDownloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The direct URL the seller can use to download an image of the shipping label. By default, the file format is PDF. See <a href=\"/api-docs/sell/logistics/resources/shipment/methods/downloadLabelFile\">downloadLabelFile</a> for requesting different response file formats.")

  public String getLabelDownloadUrl() {
    return labelDownloadUrl;
  }


  public void setLabelDownloadUrl(String labelDownloadUrl) {
    this.labelDownloadUrl = labelDownloadUrl;
  }


  public Shipment labelSize(String labelSize) {
    
    this.labelSize = labelSize;
    return this;
  }

   /**
   * The seller&#39;s desired label size. The support for multi-sized labels is shipping-carrier specific and if the size requested in the &lt;b&gt;creaateFromShippingQuote&lt;/b&gt; call matches a size the carrier supports, the value will be represented here in the shipment. &lt;br&gt;&lt;br&gt;Currently, the only valid value is: &lt;code&gt;4\&quot;x6\&quot;&lt;/code&gt;
   * @return labelSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The seller's desired label size. The support for multi-sized labels is shipping-carrier specific and if the size requested in the <b>creaateFromShippingQuote</b> call matches a size the carrier supports, the value will be represented here in the shipment. <br><br>Currently, the only valid value is: <code>4\"x6\"</code>")

  public String getLabelSize() {
    return labelSize;
  }


  public void setLabelSize(String labelSize) {
    this.labelSize = labelSize;
  }


  public Shipment orders(List<Order> orders) {
    
    this.orders = orders;
    return this;
  }

  public Shipment addOrdersItem(Order ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<Order>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * This list value is optionally assigned by the seller. When present, each element in the returned list contains seller-assigned information about an order (such as an order number). Because a package can contain all or part of one or more orders, this field provides a way for sellers to identify the packages that contain specific orders.
   * @return orders
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This list value is optionally assigned by the seller. When present, each element in the returned list contains seller-assigned information about an order (such as an order number). Because a package can contain all or part of one or more orders, this field provides a way for sellers to identify the packages that contain specific orders.")

  public List<Order> getOrders() {
    return orders;
  }


  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }


  public Shipment packageSpecification(PackageSpecification packageSpecification) {
    
    this.packageSpecification = packageSpecification;
    return this;
  }

   /**
   * Get packageSpecification
   * @return packageSpecification
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public PackageSpecification getPackageSpecification() {
    return packageSpecification;
  }


  public void setPackageSpecification(PackageSpecification packageSpecification) {
    this.packageSpecification = packageSpecification;
  }


  public Shipment rate(PurchasedRate rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public PurchasedRate getRate() {
    return rate;
  }


  public void setRate(PurchasedRate rate) {
    this.rate = rate;
  }


  public Shipment returnTo(Contact returnTo) {
    
    this.returnTo = returnTo;
    return this;
  }

   /**
   * Get returnTo
   * @return returnTo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public Contact getReturnTo() {
    return returnTo;
  }


  public void setReturnTo(Contact returnTo) {
    this.returnTo = returnTo;
  }


  public Shipment shipFrom(Contact shipFrom) {
    
    this.shipFrom = shipFrom;
    return this;
  }

   /**
   * Get shipFrom
   * @return shipFrom
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public Contact getShipFrom() {
    return shipFrom;
  }


  public void setShipFrom(Contact shipFrom) {
    this.shipFrom = shipFrom;
  }


  public Shipment shipmentId(String shipmentId) {
    
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * The unique eBay-assigned ID for the shipment. The ID is generated when the shipment is created by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;.
   * @return shipmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique eBay-assigned ID for the shipment. The ID is generated when the shipment is created by a call to <b>createFromShippingQuote</b>.")

  public String getShipmentId() {
    return shipmentId;
  }


  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }


  public Shipment shipmentTrackingNumber(String shipmentTrackingNumber) {
    
    this.shipmentTrackingNumber = shipmentTrackingNumber;
    return this;
  }

   /**
   * A unique carrier-assigned ID string that can be used to track the shipment.
   * @return shipmentTrackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique carrier-assigned ID string that can be used to track the shipment.")

  public String getShipmentTrackingNumber() {
    return shipmentTrackingNumber;
  }


  public void setShipmentTrackingNumber(String shipmentTrackingNumber) {
    this.shipmentTrackingNumber = shipmentTrackingNumber;
  }


  public Shipment shipTo(Contact shipTo) {
    
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public Contact getShipTo() {
    return shipTo;
  }


  public void setShipTo(Contact shipTo) {
    this.shipTo = shipTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.cancellation, shipment.cancellation) &&
        Objects.equals(this.creationDate, shipment.creationDate) &&
        Objects.equals(this.labelCustomMessage, shipment.labelCustomMessage) &&
        Objects.equals(this.labelDownloadUrl, shipment.labelDownloadUrl) &&
        Objects.equals(this.labelSize, shipment.labelSize) &&
        Objects.equals(this.orders, shipment.orders) &&
        Objects.equals(this.packageSpecification, shipment.packageSpecification) &&
        Objects.equals(this.rate, shipment.rate) &&
        Objects.equals(this.returnTo, shipment.returnTo) &&
        Objects.equals(this.shipFrom, shipment.shipFrom) &&
        Objects.equals(this.shipmentId, shipment.shipmentId) &&
        Objects.equals(this.shipmentTrackingNumber, shipment.shipmentTrackingNumber) &&
        Objects.equals(this.shipTo, shipment.shipTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellation, creationDate, labelCustomMessage, labelDownloadUrl, labelSize, orders, packageSpecification, rate, returnTo, shipFrom, shipmentId, shipmentTrackingNumber, shipTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    sb.append("    cancellation: ").append(toIndentedString(cancellation)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    labelCustomMessage: ").append(toIndentedString(labelCustomMessage)).append("\n");
    sb.append("    labelDownloadUrl: ").append(toIndentedString(labelDownloadUrl)).append("\n");
    sb.append("    labelSize: ").append(toIndentedString(labelSize)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    packageSpecification: ").append(toIndentedString(packageSpecification)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
    sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    shipmentTrackingNumber: ").append(toIndentedString(shipmentTrackingNumber)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
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

