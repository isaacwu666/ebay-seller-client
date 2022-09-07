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
 * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
 */
@ApiModel(description = "This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class DisputeAmount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONVERTED_FROM_CURRENCY = "convertedFromCurrency";
  @SerializedName(SERIALIZED_NAME_CONVERTED_FROM_CURRENCY)
  private String convertedFromCurrency;

  public static final String SERIALIZED_NAME_CONVERTED_FROM_VALUE = "convertedFromValue";
  @SerializedName(SERIALIZED_NAME_CONVERTED_FROM_VALUE)
  private String convertedFromValue;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchangeRate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private String exchangeRate;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public DisputeAmount convertedFromCurrency(String convertedFromCurrency) {
    
    this.convertedFromCurrency = convertedFromCurrency;
    return this;
  }

   /**
   * The three-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-4217-currency-codes.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 4217&lt;/a&gt; code representing the currency of the amount in the &lt;b&gt; convertedFromValue&lt;/b&gt; field. This value is the pre-conversion currency.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CurrencyCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return convertedFromCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The three-letter <a href=\"https://www.iso.org/iso-4217-currency-codes.html\" target=\"_blank\">ISO 4217</a> code representing the currency of the amount in the <b> convertedFromValue</b> field. This value is the pre-conversion currency.<br><br>This field is only returned if/when currency conversion was applied by eBay. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CurrencyCodeEnum'>eBay API documentation</a>")

  public String getConvertedFromCurrency() {
    return convertedFromCurrency;
  }


  public void setConvertedFromCurrency(String convertedFromCurrency) {
    this.convertedFromCurrency = convertedFromCurrency;
  }


  public DisputeAmount convertedFromValue(String convertedFromValue) {
    
    this.convertedFromValue = convertedFromValue;
    return this;
  }

   /**
   * The monetary amount before any conversion is performed, in the currency specified by the &lt;b&gt; convertedFromCurrency&lt;/b&gt; field. This value is the pre-conversion amount. The &lt;b&gt; value&lt;/b&gt; field contains the converted amount of this value, in the currency specified by the &lt;b&gt; currency&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
   * @return convertedFromValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monetary amount before any conversion is performed, in the currency specified by the <b> convertedFromCurrency</b> field. This value is the pre-conversion amount. The <b> value</b> field contains the converted amount of this value, in the currency specified by the <b> currency</b> field.<br><br>This field is only returned if/when currency conversion was applied by eBay.")

  public String getConvertedFromValue() {
    return convertedFromValue;
  }


  public void setConvertedFromValue(String convertedFromValue) {
    this.convertedFromValue = convertedFromValue;
  }


  public DisputeAmount currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * A three-letter ISO 4217 code that indicates the currency of the amount in the &lt;b&gt;value&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default&lt;/b&gt;: The currency of the authenticated user&#39;s country. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CurrencyCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A three-letter ISO 4217 code that indicates the currency of the amount in the <b>value</b> field. This field is always returned with any container using <b>Amount</b> type. <br /><br /><b>Default</b>: The currency of the authenticated user's country. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CurrencyCodeEnum'>eBay API documentation</a>")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public DisputeAmount exchangeRate(String exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the &lt;b&gt;value&lt;/b&gt; field from the dollar value in the &lt;b&gt;convertedFromValue&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;This field is only returned if/when currency conversion was applied by eBay.
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The exchange rate used for the monetary conversion. This field shows the exchange rate used to convert the dollar value in the <b>value</b> field from the dollar value in the <b>convertedFromValue</b> field.<br><br>This field is only returned if/when currency conversion was applied by eBay.")

  public String getExchangeRate() {
    return exchangeRate;
  }


  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public DisputeAmount value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The monetary amount, in the currency specified by the &lt;b&gt;currency&lt;/b&gt; field. This field is always returned with any container using &lt;b&gt;Amount&lt;/b&gt; type.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monetary amount, in the currency specified by the <b>currency</b> field. This field is always returned with any container using <b>Amount</b> type.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeAmount disputeAmount = (DisputeAmount) o;
    return Objects.equals(this.convertedFromCurrency, disputeAmount.convertedFromCurrency) &&
        Objects.equals(this.convertedFromValue, disputeAmount.convertedFromValue) &&
        Objects.equals(this.currency, disputeAmount.currency) &&
        Objects.equals(this.exchangeRate, disputeAmount.exchangeRate) &&
        Objects.equals(this.value, disputeAmount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertedFromCurrency, convertedFromValue, currency, exchangeRate, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeAmount {\n");
    sb.append("    convertedFromCurrency: ").append(toIndentedString(convertedFromCurrency)).append("\n");
    sb.append("    convertedFromValue: ").append(toIndentedString(convertedFromValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

