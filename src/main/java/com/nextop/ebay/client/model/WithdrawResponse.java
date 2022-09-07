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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The base response of the &lt;strong&gt;withdrawOffer&lt;/strong&gt; call.
 */
@ApiModel(description = "The base response of the <strong>withdrawOffer</strong> call.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class WithdrawResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LISTING_ID = "listingId";
  @SerializedName(SERIALIZED_NAME_LISTING_ID)
  private String listingId;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<Error> warnings = null;


  public WithdrawResponse listingId(String listingId) {
    
    this.listingId = listingId;
    return this;
  }

   /**
   * The unique identifier of the eBay listing associated with the offer that was withdrawn. This field will not be returned if the eBay listing was not successfully ended.
   * @return listingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the eBay listing associated with the offer that was withdrawn. This field will not be returned if the eBay listing was not successfully ended.")

  public String getListingId() {
    return listingId;
  }


  public void setListingId(String listingId) {
    this.listingId = listingId;
  }


  public WithdrawResponse warnings(List<Error> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public WithdrawResponse addWarningsItem(Error warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<Error>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * This container will be returned if there were one or more warnings associated with the attempt to withdraw the offer.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This container will be returned if there were one or more warnings associated with the attempt to withdraw the offer.")

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
    WithdrawResponse withdrawResponse = (WithdrawResponse) o;
    return Objects.equals(this.listingId, withdrawResponse.listingId) &&
        Objects.equals(this.warnings, withdrawResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawResponse {\n");
    sb.append("    listingId: ").append(toIndentedString(listingId)).append("\n");
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

