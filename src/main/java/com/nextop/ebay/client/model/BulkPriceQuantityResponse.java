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
import com.nextop.ebay.client.model.PriceQuantityResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type is use by the base response payload of the &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call. The &lt;strong&gt;bulkUpdatePriceQuantity&lt;/strong&gt; call response will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an &lt;strong&gt;errors&lt;/strong&gt; and/or &lt;strong&gt;warnings&lt;/strong&gt; container if any errors or warnings are triggered while trying to update those offers/inventory items.
 */
@ApiModel(description = "This type is use by the base response payload of the <strong>bulkUpdatePriceQuantity</strong> call. The <strong>bulkUpdatePriceQuantity</strong> call response will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an <strong>errors</strong> and/or <strong>warnings</strong> container if any errors or warnings are triggered while trying to update those offers/inventory items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class BulkPriceQuantityResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<PriceQuantityResponse> responses = null;


  public BulkPriceQuantityResponse responses(List<PriceQuantityResponse> responses) {
    
    this.responses = responses;
    return this;
  }

  public BulkPriceQuantityResponse addResponsesItem(PriceQuantityResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<PriceQuantityResponse>();
    }
    this.responses.add(responsesItem);
    return this;
  }

   /**
   * This container will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an &lt;strong&gt;errors&lt;/strong&gt; and/or &lt;strong&gt;warnings&lt;/strong&gt; container if any errors or warnings are triggered while trying to update those offers/inventory items.
   * @return responses
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This container will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an <strong>errors</strong> and/or <strong>warnings</strong> container if any errors or warnings are triggered while trying to update those offers/inventory items.")

  public List<PriceQuantityResponse> getResponses() {
    return responses;
  }


  public void setResponses(List<PriceQuantityResponse> responses) {
    this.responses = responses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPriceQuantityResponse bulkPriceQuantityResponse = (BulkPriceQuantityResponse) o;
    return Objects.equals(this.responses, bulkPriceQuantityResponse.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPriceQuantityResponse {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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

