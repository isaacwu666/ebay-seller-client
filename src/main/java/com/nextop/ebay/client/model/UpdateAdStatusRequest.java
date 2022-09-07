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
 * A type that contains the fields for the &lt;b&gt;UpdateAdStatus&lt;/b&gt; request.
 */
@ApiModel(description = "A type that contains the fields for the <b>UpdateAdStatus</b> request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class UpdateAdStatusRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AD_ID = "adId";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private String adId;

  public static final String SERIALIZED_NAME_AD_STATUS = "adStatus";
  @SerializedName(SERIALIZED_NAME_AD_STATUS)
  private String adStatus;


  public UpdateAdStatusRequest adId(String adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * A unique eBay-assigned ID that is generated when the ad is created.
   * @return adId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique eBay-assigned ID that is generated when the ad is created.")

  public String getAdId() {
    return adId;
  }


  public void setAdId(String adId) {
    this.adId = adId;
  }


  public UpdateAdStatusRequest adStatus(String adStatus) {
    
    this.adStatus = adStatus;
    return this;
  }

   /**
   * An enumeration value representing the current status of the ad.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:AdStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return adStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An enumeration value representing the current status of the ad.<br /><br /><b>Valid Values:</b><ul><li><code>ACTIVE</code></li><li><code>PAUSED</code></li><li><code>ARCHIVED</code></li></ul> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/marketing/types/pls:AdStatusEnum'>eBay API documentation</a>")

  public String getAdStatus() {
    return adStatus;
  }


  public void setAdStatus(String adStatus) {
    this.adStatus = adStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAdStatusRequest updateAdStatusRequest = (UpdateAdStatusRequest) o;
    return Objects.equals(this.adId, updateAdStatusRequest.adId) &&
        Objects.equals(this.adStatus, updateAdStatusRequest.adStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAdStatusRequest {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adStatus: ").append(toIndentedString(adStatus)).append("\n");
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

