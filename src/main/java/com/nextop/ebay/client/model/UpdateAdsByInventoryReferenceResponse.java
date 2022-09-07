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
import com.nextop.ebay.client.model.AdReference;
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
 * A type that contains the response fields used by the &lt;b&gt;UpdateAdsByInventoryReference&lt;/b&gt; method.
 */
@ApiModel(description = "A type that contains the response fields used by the <b>UpdateAdsByInventoryReference</b> method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class UpdateAdsByInventoryReferenceResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADS = "ads";
  @SerializedName(SERIALIZED_NAME_ADS)
  private List<AdReference> ads = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_INVENTORY_REFERENCE_ID = "inventoryReferenceId";
  @SerializedName(SERIALIZED_NAME_INVENTORY_REFERENCE_ID)
  private String inventoryReferenceId;

  public static final String SERIALIZED_NAME_INVENTORY_REFERENCE_TYPE = "inventoryReferenceType";
  @SerializedName(SERIALIZED_NAME_INVENTORY_REFERENCE_TYPE)
  private String inventoryReferenceType;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;


  public UpdateAdsByInventoryReferenceResponse ads(List<AdReference> ads) {
    
    this.ads = ads;
    return this;
  }

  public UpdateAdsByInventoryReferenceResponse addAdsItem(AdReference adsItem) {
    if (this.ads == null) {
      this.ads = new ArrayList<AdReference>();
    }
    this.ads.add(adsItem);
    return this;
  }

   /**
   * A list of ad IDs and links to retrieve them.
   * @return ads
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "A list of ad IDs and links to retrieve them.")

  public List<AdReference> getAds() {
    return ads;
  }


  public void setAds(List<AdReference> ads) {
    this.ads = ads;
  }


  public UpdateAdsByInventoryReferenceResponse errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public UpdateAdsByInventoryReferenceResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A container for all of the errors associated with the specified inventory reference ID.
   * @return errors
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "A container for all of the errors associated with the specified inventory reference ID.")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public UpdateAdsByInventoryReferenceResponse inventoryReferenceId(String inventoryReferenceId) {
    
    this.inventoryReferenceId = inventoryReferenceId;
    return this;
  }

   /**
   * The reference ID associated with the ad. The reference ID could be a SKU number or Inventory Item Group, depending on value of &lt;code&gt;inventoryReferenceType&lt;/code&gt;.
   * @return inventoryReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference ID associated with the ad. The reference ID could be a SKU number or Inventory Item Group, depending on value of <code>inventoryReferenceType</code>.")

  public String getInventoryReferenceId() {
    return inventoryReferenceId;
  }


  public void setInventoryReferenceId(String inventoryReferenceId) {
    this.inventoryReferenceId = inventoryReferenceId;
  }


  public UpdateAdsByInventoryReferenceResponse inventoryReferenceType(String inventoryReferenceType) {
    
    this.inventoryReferenceType = inventoryReferenceType;
    return this;
  }

   /**
   * The inventory reference type associated with the ad. The inventory reference type could be a SKU number or Inventory Item Group. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return inventoryReferenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The inventory reference type associated with the ad. The inventory reference type could be a SKU number or Inventory Item Group. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum'>eBay API documentation</a>")

  public String getInventoryReferenceType() {
    return inventoryReferenceType;
  }


  public void setInventoryReferenceType(String inventoryReferenceType) {
    this.inventoryReferenceType = inventoryReferenceType;
  }


  public UpdateAdsByInventoryReferenceResponse statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * An HTTP status code that indicates whether or not the CPS ad was successfully updated.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An HTTP status code that indicates whether or not the CPS ad was successfully updated.")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAdsByInventoryReferenceResponse updateAdsByInventoryReferenceResponse = (UpdateAdsByInventoryReferenceResponse) o;
    return Objects.equals(this.ads, updateAdsByInventoryReferenceResponse.ads) &&
        Objects.equals(this.errors, updateAdsByInventoryReferenceResponse.errors) &&
        Objects.equals(this.inventoryReferenceId, updateAdsByInventoryReferenceResponse.inventoryReferenceId) &&
        Objects.equals(this.inventoryReferenceType, updateAdsByInventoryReferenceResponse.inventoryReferenceType) &&
        Objects.equals(this.statusCode, updateAdsByInventoryReferenceResponse.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ads, errors, inventoryReferenceId, inventoryReferenceType, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAdsByInventoryReferenceResponse {\n");
    sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    inventoryReferenceId: ").append(toIndentedString(inventoryReferenceId)).append("\n");
    sb.append("    inventoryReferenceType: ").append(toIndentedString(inventoryReferenceType)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

