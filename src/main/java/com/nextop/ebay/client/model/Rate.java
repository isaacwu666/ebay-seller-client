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
import com.nextop.ebay.client.model.AdditionalOption;
import com.nextop.ebay.client.model.Amount;
import com.nextop.ebay.client.model.PickupSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This complex type contains live quote information about a shipping service that&#39;s available for a given shipping quote request, including the shipping carrier and service, delivery window, shipping cost, and additional shipping options.
 */
@ApiModel(description = "This complex type contains live quote information about a shipping service that's available for a given shipping quote request, including the shipping carrier and service, delivery window, shipping cost, and additional shipping options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class Rate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADDITIONAL_OPTIONS = "additionalOptions";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_OPTIONS)
  private List<AdditionalOption> additionalOptions = null;

  public static final String SERIALIZED_NAME_BASE_SHIPPING_COST = "baseShippingCost";
  @SerializedName(SERIALIZED_NAME_BASE_SHIPPING_COST)
  private Amount baseShippingCost;

  public static final String SERIALIZED_NAME_DESTINATION_TIME_ZONE = "destinationTimeZone";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TIME_ZONE)
  private String destinationTimeZone;

  public static final String SERIALIZED_NAME_MAX_ESTIMATED_DELIVERY_DATE = "maxEstimatedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_MAX_ESTIMATED_DELIVERY_DATE)
  private String maxEstimatedDeliveryDate;

  public static final String SERIALIZED_NAME_MIN_ESTIMATED_DELIVERY_DATE = "minEstimatedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_MIN_ESTIMATED_DELIVERY_DATE)
  private String minEstimatedDeliveryDate;

  public static final String SERIALIZED_NAME_PICKUP_NETWORKS = "pickupNetworks";
  @SerializedName(SERIALIZED_NAME_PICKUP_NETWORKS)
  private List<String> pickupNetworks = null;

  public static final String SERIALIZED_NAME_PICKUP_SLOTS = "pickupSlots";
  @SerializedName(SERIALIZED_NAME_PICKUP_SLOTS)
  private List<PickupSlot> pickupSlots = null;

  public static final String SERIALIZED_NAME_PICKUP_TYPE = "pickupType";
  @SerializedName(SERIALIZED_NAME_PICKUP_TYPE)
  private String pickupType;

  public static final String SERIALIZED_NAME_RATE_ID = "rateId";
  @SerializedName(SERIALIZED_NAME_RATE_ID)
  private String rateId;

  public static final String SERIALIZED_NAME_RATE_RECOMMENDATION = "rateRecommendation";
  @SerializedName(SERIALIZED_NAME_RATE_RECOMMENDATION)
  private List<String> rateRecommendation = null;

  public static final String SERIALIZED_NAME_SHIPPING_CARRIER_CODE = "shippingCarrierCode";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER_CODE)
  private String shippingCarrierCode;

  public static final String SERIALIZED_NAME_SHIPPING_CARRIER_NAME = "shippingCarrierName";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER_NAME)
  private String shippingCarrierName;

  public static final String SERIALIZED_NAME_SHIPPING_SERVICE_CODE = "shippingServiceCode";
  @SerializedName(SERIALIZED_NAME_SHIPPING_SERVICE_CODE)
  private String shippingServiceCode;

  public static final String SERIALIZED_NAME_SHIPPING_SERVICE_NAME = "shippingServiceName";
  @SerializedName(SERIALIZED_NAME_SHIPPING_SERVICE_NAME)
  private String shippingServiceName;


  public Rate additionalOptions(List<AdditionalOption> additionalOptions) {
    
    this.additionalOptions = additionalOptions;
    return this;
  }

  public Rate addAdditionalOptionsItem(AdditionalOption additionalOptionsItem) {
    if (this.additionalOptions == null) {
      this.additionalOptions = new ArrayList<AdditionalOption>();
    }
    this.additionalOptions.add(additionalOptionsItem);
    return this;
  }

   /**
   * Contains service and pricing information for one or more shipping options that are offered by the carrier and can be purchased in addition to the base shipping service provided by this rate. Shipping options can include items such as &lt;code&gt;INSURANCE&lt;/code&gt; and &lt;code&gt;SIGNATURE&lt;/code&gt;.
   * @return additionalOptions
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Contains service and pricing information for one or more shipping options that are offered by the carrier and can be purchased in addition to the base shipping service provided by this rate. Shipping options can include items such as <code>INSURANCE</code> and <code>SIGNATURE</code>.")

  public List<AdditionalOption> getAdditionalOptions() {
    return additionalOptions;
  }


  public void setAdditionalOptions(List<AdditionalOption> additionalOptions) {
    this.additionalOptions = additionalOptions;
  }


  public Rate baseShippingCost(Amount baseShippingCost) {
    
    this.baseShippingCost = baseShippingCost;
    return this;
  }

   /**
   * Get baseShippingCost
   * @return baseShippingCost
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public Amount getBaseShippingCost() {
    return baseShippingCost;
  }


  public void setBaseShippingCost(Amount baseShippingCost) {
    this.baseShippingCost = baseShippingCost;
  }


  public Rate destinationTimeZone(String destinationTimeZone) {
    
    this.destinationTimeZone = destinationTimeZone;
    return this;
  }

   /**
   * The name of the time zone region, as defined in the &lt;a href&#x3D;\&quot;http://www.iana.org/time-zones\&quot;  target&#x3D;\&quot;_blank\&quot;&gt;IANA Time Zone Database&lt;/a&gt;, to which the package is being shipped.  &lt;br&gt;&lt;br&gt;Delivery dates are calculated relative to this time zone.  &lt;br&gt;&lt;br&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is different from a Coordinated Universal Time (UTC) offset. For example, the &lt;i&gt;America/Los_Angeles&lt;/i&gt; time zone identifies a region with the UTC standard time offset of &lt;code&gt;-08:00&lt;/code&gt;, but so do several other time zones, including &lt;i&gt;America/Tijuana&lt;/i&gt;,&lt;i&gt;America/Dawson&lt;/i&gt;, and &lt;i&gt;Pacific/Pitcairn&lt;/i&gt;.&lt;/span&gt;
   * @return destinationTimeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the time zone region, as defined in the <a href=\"http://www.iana.org/time-zones\"  target=\"_blank\">IANA Time Zone Database</a>, to which the package is being shipped.  <br><br>Delivery dates are calculated relative to this time zone.  <br><br><span class=\"tablenote\"><strong>Note:</strong> This is different from a Coordinated Universal Time (UTC) offset. For example, the <i>America/Los_Angeles</i> time zone identifies a region with the UTC standard time offset of <code>-08:00</code>, but so do several other time zones, including <i>America/Tijuana</i>,<i>America/Dawson</i>, and <i>Pacific/Pitcairn</i>.</span>")

  public String getDestinationTimeZone() {
    return destinationTimeZone;
  }


  public void setDestinationTimeZone(String destinationTimeZone) {
    this.destinationTimeZone = destinationTimeZone;
  }


  public Rate maxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
    
    this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
    return this;
  }

   /**
   * The latest stated date and time the shipment will be delivered at this rate.  &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[HH]:[MM]:[SS].[SSS]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
   * @return maxEstimatedDeliveryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latest stated date and time the shipment will be delivered at this rate.  <br><br>The time stamp is formatted as an <a href=\"https://www.iso.org/iso-8601-date-and-time-format.html\" title=\"https://www.iso.org\" target=\"_blank\">ISO 8601</a> string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  <br><br><b>Format:</b> <code>[YYYY]-[MM]-[DD]T[HH]:[MM]:[SS].[SSS]Z</code> <br><b>Example:</b> <code>2018-08-20T07:09:00.000Z</code>")

  public String getMaxEstimatedDeliveryDate() {
    return maxEstimatedDeliveryDate;
  }


  public void setMaxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
    this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
  }


  public Rate minEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
    
    this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
    return this;
  }

   /**
   * The estimated earliest date and time the shipment will be delivered at this rate. The time stamp is formatted as an ISO 8601 UTC string.
   * @return minEstimatedDeliveryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The estimated earliest date and time the shipment will be delivered at this rate. The time stamp is formatted as an ISO 8601 UTC string.")

  public String getMinEstimatedDeliveryDate() {
    return minEstimatedDeliveryDate;
  }


  public void setMinEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
    this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
  }


  public Rate pickupNetworks(List<String> pickupNetworks) {
    
    this.pickupNetworks = pickupNetworks;
    return this;
  }

  public Rate addPickupNetworksItem(String pickupNetworksItem) {
    if (this.pickupNetworks == null) {
      this.pickupNetworks = new ArrayList<String>();
    }
    this.pickupNetworks.add(pickupNetworksItem);
    return this;
  }

   /**
   * A list of pickup networks compatible with the shipping service.
   * @return pickupNetworks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of pickup networks compatible with the shipping service.")

  public List<String> getPickupNetworks() {
    return pickupNetworks;
  }


  public void setPickupNetworks(List<String> pickupNetworks) {
    this.pickupNetworks = pickupNetworks;
  }


  public Rate pickupSlots(List<PickupSlot> pickupSlots) {
    
    this.pickupSlots = pickupSlots;
    return this;
  }

  public Rate addPickupSlotsItem(PickupSlot pickupSlotsItem) {
    if (this.pickupSlots == null) {
      this.pickupSlots = new ArrayList<PickupSlot>();
    }
    this.pickupSlots.add(pickupSlotsItem);
    return this;
  }

   /**
   * A list of available pickup slots for the package.
   * @return pickupSlots
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "A list of available pickup slots for the package.")

  public List<PickupSlot> getPickupSlots() {
    return pickupSlots;
  }


  public void setPickupSlots(List<PickupSlot> pickupSlots) {
    this.pickupSlots = pickupSlots;
  }


  public Rate pickupType(String pickupType) {
    
    this.pickupType = pickupType;
    return this;
  }

   /**
   * The type of pickup or drop-off service associated with the &lt;b&gt;pickupSlots&lt;/b&gt; time frames. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/logistics/types/api:PickupTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return pickupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of pickup or drop-off service associated with the <b>pickupSlots</b> time frames. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/logistics/types/api:PickupTypeEnum'>eBay API documentation</a>")

  public String getPickupType() {
    return pickupType;
  }


  public void setPickupType(String pickupType) {
    this.pickupType = pickupType;
  }


  public Rate rateId(String rateId) {
    
    this.rateId = rateId;
    return this;
  }

   /**
   * The unique eBay-assigned ID for this shipping rate.
   * @return rateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique eBay-assigned ID for this shipping rate.")

  public String getRateId() {
    return rateId;
  }


  public void setRateId(String rateId) {
    this.rateId = rateId;
  }


  public Rate rateRecommendation(List<String> rateRecommendation) {
    
    this.rateRecommendation = rateRecommendation;
    return this;
  }

  public Rate addRateRecommendationItem(String rateRecommendationItem) {
    if (this.rateRecommendation == null) {
      this.rateRecommendation = new ArrayList<String>();
    }
    this.rateRecommendation.add(rateRecommendationItem);
    return this;
  }

   /**
   * A list of reasons this rate is recommended. Available values are: &lt;ul&gt; &lt;li&gt;&lt;code&gt;BUYER_CHOSEN&lt;/code&gt; &amp;mdash; The rate meets or exceeds the requirements of the buyer&#39;s preferred shipping option.&lt;/li&gt; &lt;li&gt;&lt;code&gt;CHEAPEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate is the cheapest rate available that will provide delivery within the seller&#39;s time frame commitment.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;EBAY_PLUS_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Plus program.&lt;/li&gt; &lt;li&gt;&lt;code&gt;FASTEST_ON_TIME&lt;/code&gt; &amp;mdash; The rate has the fastest shipping time, and will provide delivery within the seller&#39;s time frame commitment.&lt;/li&gt; &lt;li&gt;&lt;code&gt;GUARANTEED_DELIVERY_OK&lt;/code&gt; &amp;mdash; The rate complies with the shipping requirements of the eBay Guaranteed Delivery program.&lt;/li&gt;&lt;/ul&gt;
   * @return rateRecommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of reasons this rate is recommended. Available values are: <ul> <li><code>BUYER_CHOSEN</code> &mdash; The rate meets or exceeds the requirements of the buyer's preferred shipping option.</li> <li><code>CHEAPEST_ON_TIME</code> &mdash; The rate is the cheapest rate available that will provide delivery within the seller's time frame commitment.</li>  <li><code>EBAY_PLUS_OK</code> &mdash; The rate complies with the shipping requirements of the eBay Plus program.</li> <li><code>FASTEST_ON_TIME</code> &mdash; The rate has the fastest shipping time, and will provide delivery within the seller's time frame commitment.</li> <li><code>GUARANTEED_DELIVERY_OK</code> &mdash; The rate complies with the shipping requirements of the eBay Guaranteed Delivery program.</li></ul>")

  public List<String> getRateRecommendation() {
    return rateRecommendation;
  }


  public void setRateRecommendation(List<String> rateRecommendation) {
    this.rateRecommendation = rateRecommendation;
  }


  public Rate shippingCarrierCode(String shippingCarrierCode) {
    
    this.shippingCarrierCode = shippingCarrierCode;
    return this;
  }

   /**
   * The code name of the shipping carrier who will provide the service identified by &lt;b&gt;shippingServiceCode&lt;/b&gt;.
   * @return shippingCarrierCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code name of the shipping carrier who will provide the service identified by <b>shippingServiceCode</b>.")

  public String getShippingCarrierCode() {
    return shippingCarrierCode;
  }


  public void setShippingCarrierCode(String shippingCarrierCode) {
    this.shippingCarrierCode = shippingCarrierCode;
  }


  public Rate shippingCarrierName(String shippingCarrierName) {
    
    this.shippingCarrierName = shippingCarrierName;
    return this;
  }

   /**
   * The common name of the shipping carrier.
   * @return shippingCarrierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The common name of the shipping carrier.")

  public String getShippingCarrierName() {
    return shippingCarrierName;
  }


  public void setShippingCarrierName(String shippingCarrierName) {
    this.shippingCarrierName = shippingCarrierName;
  }


  public Rate shippingServiceCode(String shippingServiceCode) {
    
    this.shippingServiceCode = shippingServiceCode;
    return this;
  }

   /**
   * The code name of the shipping service to be provided by the carrier identified by &lt;b&gt;shippingCarrierCode&lt;/b&gt;.
   * @return shippingServiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code name of the shipping service to be provided by the carrier identified by <b>shippingCarrierCode</b>.")

  public String getShippingServiceCode() {
    return shippingServiceCode;
  }


  public void setShippingServiceCode(String shippingServiceCode) {
    this.shippingServiceCode = shippingServiceCode;
  }


  public Rate shippingServiceName(String shippingServiceName) {
    
    this.shippingServiceName = shippingServiceName;
    return this;
  }

   /**
   * The common name of the shipping service.
   * @return shippingServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The common name of the shipping service.")

  public String getShippingServiceName() {
    return shippingServiceName;
  }


  public void setShippingServiceName(String shippingServiceName) {
    this.shippingServiceName = shippingServiceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rate rate = (Rate) o;
    return Objects.equals(this.additionalOptions, rate.additionalOptions) &&
        Objects.equals(this.baseShippingCost, rate.baseShippingCost) &&
        Objects.equals(this.destinationTimeZone, rate.destinationTimeZone) &&
        Objects.equals(this.maxEstimatedDeliveryDate, rate.maxEstimatedDeliveryDate) &&
        Objects.equals(this.minEstimatedDeliveryDate, rate.minEstimatedDeliveryDate) &&
        Objects.equals(this.pickupNetworks, rate.pickupNetworks) &&
        Objects.equals(this.pickupSlots, rate.pickupSlots) &&
        Objects.equals(this.pickupType, rate.pickupType) &&
        Objects.equals(this.rateId, rate.rateId) &&
        Objects.equals(this.rateRecommendation, rate.rateRecommendation) &&
        Objects.equals(this.shippingCarrierCode, rate.shippingCarrierCode) &&
        Objects.equals(this.shippingCarrierName, rate.shippingCarrierName) &&
        Objects.equals(this.shippingServiceCode, rate.shippingServiceCode) &&
        Objects.equals(this.shippingServiceName, rate.shippingServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalOptions, baseShippingCost, destinationTimeZone, maxEstimatedDeliveryDate, minEstimatedDeliveryDate, pickupNetworks, pickupSlots, pickupType, rateId, rateRecommendation, shippingCarrierCode, shippingCarrierName, shippingServiceCode, shippingServiceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rate {\n");
    sb.append("    additionalOptions: ").append(toIndentedString(additionalOptions)).append("\n");
    sb.append("    baseShippingCost: ").append(toIndentedString(baseShippingCost)).append("\n");
    sb.append("    destinationTimeZone: ").append(toIndentedString(destinationTimeZone)).append("\n");
    sb.append("    maxEstimatedDeliveryDate: ").append(toIndentedString(maxEstimatedDeliveryDate)).append("\n");
    sb.append("    minEstimatedDeliveryDate: ").append(toIndentedString(minEstimatedDeliveryDate)).append("\n");
    sb.append("    pickupNetworks: ").append(toIndentedString(pickupNetworks)).append("\n");
    sb.append("    pickupSlots: ").append(toIndentedString(pickupSlots)).append("\n");
    sb.append("    pickupType: ").append(toIndentedString(pickupType)).append("\n");
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    rateRecommendation: ").append(toIndentedString(rateRecommendation)).append("\n");
    sb.append("    shippingCarrierCode: ").append(toIndentedString(shippingCarrierCode)).append("\n");
    sb.append("    shippingCarrierName: ").append(toIndentedString(shippingCarrierName)).append("\n");
    sb.append("    shippingServiceCode: ").append(toIndentedString(shippingServiceCode)).append("\n");
    sb.append("    shippingServiceName: ").append(toIndentedString(shippingServiceName)).append("\n");
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

