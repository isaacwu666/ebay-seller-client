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
import com.nextop.ebay.client.model.AspectRecommendations;
import com.nextop.ebay.client.model.ProductRecommendation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type is used by the correctiveRecommendations container, which is returned if eBay has suggestions for how to correct the given violation.
 */
@ApiModel(description = "This type is used by the correctiveRecommendations container, which is returned if eBay has suggestions for how to correct the given violation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class CorrectiveRecommendations implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_RECOMMENDATION = "productRecommendation";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RECOMMENDATION)
  private ProductRecommendation productRecommendation;

  public static final String SERIALIZED_NAME_ASPECT_RECOMMENDATIONS = "aspectRecommendations";
  @SerializedName(SERIALIZED_NAME_ASPECT_RECOMMENDATIONS)
  private List<AspectRecommendations> aspectRecommendations = null;


  public CorrectiveRecommendations productRecommendation(ProductRecommendation productRecommendation) {
    
    this.productRecommendation = productRecommendation;
    return this;
  }

   /**
   * Get productRecommendation
   * @return productRecommendation
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public ProductRecommendation getProductRecommendation() {
    return productRecommendation;
  }


  public void setProductRecommendation(ProductRecommendation productRecommendation) {
    this.productRecommendation = productRecommendation;
  }


  public CorrectiveRecommendations aspectRecommendations(List<AspectRecommendations> aspectRecommendations) {
    
    this.aspectRecommendations = aspectRecommendations;
    return this;
  }

  public CorrectiveRecommendations addAspectRecommendationsItem(AspectRecommendations aspectRecommendationsItem) {
    if (this.aspectRecommendations == null) {
      this.aspectRecommendations = new ArrayList<AspectRecommendations>();
    }
    this.aspectRecommendations.add(aspectRecommendationsItem);
    return this;
  }

   /**
   * This container is returned for ASPECTS_ADOPTION violations if eBay has found one or more item aspect name-value pairs that may be appropriate for the seller&#39;s product. In many cases, the missing or invalid item aspect(s) shown under the corresponding violationData array, will also show up under this array with suggested value(s).
   * @return aspectRecommendations
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This container is returned for ASPECTS_ADOPTION violations if eBay has found one or more item aspect name-value pairs that may be appropriate for the seller's product. In many cases, the missing or invalid item aspect(s) shown under the corresponding violationData array, will also show up under this array with suggested value(s).")

  public List<AspectRecommendations> getAspectRecommendations() {
    return aspectRecommendations;
  }


  public void setAspectRecommendations(List<AspectRecommendations> aspectRecommendations) {
    this.aspectRecommendations = aspectRecommendations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrectiveRecommendations correctiveRecommendations = (CorrectiveRecommendations) o;
    return Objects.equals(this.productRecommendation, correctiveRecommendations.productRecommendation) &&
        Objects.equals(this.aspectRecommendations, correctiveRecommendations.aspectRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productRecommendation, aspectRecommendations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectiveRecommendations {\n");
    sb.append("    productRecommendation: ").append(toIndentedString(productRecommendation)).append("\n");
    sb.append("    aspectRecommendations: ").append(toIndentedString(aspectRecommendations)).append("\n");
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

