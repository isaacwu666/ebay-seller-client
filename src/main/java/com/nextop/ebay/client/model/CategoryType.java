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
 * The category type discerns whether the policy applies to motor vehicle listings, or to any other items except motor vehicle listings. &lt;br/&gt;&lt;br/&gt;Each business policy can be associated with either or both categories (&#39;MOTORS_VEHICLES&#39; and &#39;ALL_EXCLUDING_MOTORS_VEHICLES&#39;); however, return business policies are not applicable for motor vehicle listings.
 */
@ApiModel(description = "The category type discerns whether the policy applies to motor vehicle listings, or to any other items except motor vehicle listings. <br/><br/>Each business policy can be associated with either or both categories ('MOTORS_VEHICLES' and 'ALL_EXCLUDING_MOTORS_VEHICLES'); however, return business policies are not applicable for motor vehicle listings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class CategoryType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public CategoryType _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field has been deprecated and is no longer used.&lt;ul&gt;&lt;li&gt;Do not include this field in any &lt;b&gt;create&lt;/b&gt; or &lt;b&gt;update&lt;/b&gt; method.&lt;/li&gt;&lt;li&gt;This field may be returned within the payload of a &lt;b&gt;get&lt;/b&gt; method, but it can be ignored.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<span class=\"tablenote\"><strong>Note:</strong> This field has been deprecated and is no longer used.<ul><li>Do not include this field in any <b>create</b> or <b>update</b> method.</li><li>This field may be returned within the payload of a <b>get</b> method, but it can be ignored.</li></ul></span>")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public CategoryType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The category type to which the policy applies (motor vehicles or non-motor vehicles). &lt;br /&gt;&lt;br /&gt;The &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt; category type is not valid for return policies. eBay flows do not support the return of motor vehicles. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category type to which the policy applies (motor vehicles or non-motor vehicles). <br /><br />The <code>MOTORS_VEHICLES</code> category type is not valid for return policies. eBay flows do not support the return of motor vehicles. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum'>eBay API documentation</a>")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryType categoryType = (CategoryType) o;
    return Objects.equals(this._default, categoryType._default) &&
        Objects.equals(this.name, categoryType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryType {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

