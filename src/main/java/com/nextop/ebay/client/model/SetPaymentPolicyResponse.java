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
import com.nextop.ebay.client.model.CategoryType;
import com.nextop.ebay.client.model.Deposit;
import com.nextop.ebay.client.model.Error;
import com.nextop.ebay.client.model.PaymentMethod;
import com.nextop.ebay.client.model.TimeDuration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Complex type that that gets populated with a response containing a payment policy.
 */
@ApiModel(description = "Complex type that that gets populated with a response containing a payment policy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class SetPaymentPolicyResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CATEGORY_TYPES = "categoryTypes";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TYPES)
  private List<CategoryType> categoryTypes = null;

  public static final String SERIALIZED_NAME_DEPOSIT = "deposit";
  @SerializedName(SERIALIZED_NAME_DEPOSIT)
  private Deposit deposit;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FULL_PAYMENT_DUE_IN = "fullPaymentDueIn";
  @SerializedName(SERIALIZED_NAME_FULL_PAYMENT_DUE_IN)
  private TimeDuration fullPaymentDueIn;

  public static final String SERIALIZED_NAME_IMMEDIATE_PAY = "immediatePay";
  @SerializedName(SERIALIZED_NAME_IMMEDIATE_PAY)
  private Boolean immediatePay;

  public static final String SERIALIZED_NAME_MARKETPLACE_ID = "marketplaceId";
  @SerializedName(SERIALIZED_NAME_MARKETPLACE_ID)
  private String marketplaceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUCTIONS = "paymentInstructions";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUCTIONS)
  private String paymentInstructions;

  public static final String SERIALIZED_NAME_PAYMENT_METHODS = "paymentMethods";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHODS)
  private List<PaymentMethod> paymentMethods = null;

  public static final String SERIALIZED_NAME_PAYMENT_POLICY_ID = "paymentPolicyId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_POLICY_ID)
  private String paymentPolicyId;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<Error> warnings = null;


  public SetPaymentPolicyResponse categoryTypes(List<CategoryType> categoryTypes) {
    
    this.categoryTypes = categoryTypes;
    return this;
  }

  public SetPaymentPolicyResponse addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<CategoryType>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

   /**
   * This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
   * @return categoryTypes
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.")

  public List<CategoryType> getCategoryTypes() {
    return categoryTypes;
  }


  public void setCategoryTypes(List<CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }


  public SetPaymentPolicyResponse deposit(Deposit deposit) {
    
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public Deposit getDeposit() {
    return deposit;
  }


  public void setDeposit(Deposit deposit) {
    this.deposit = deposit;
  }


  public SetPaymentPolicyResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A seller-defined description of the payment business policy. This description is only for the seller&#39;s use, and is not exposed on any eBay pages. This field is returned if set for the policy. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max length&lt;/b&gt;: 250
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A seller-defined description of the payment business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SetPaymentPolicyResponse fullPaymentDueIn(TimeDuration fullPaymentDueIn) {
    
    this.fullPaymentDueIn = fullPaymentDueIn;
    return this;
  }

   /**
   * Get fullPaymentDueIn
   * @return fullPaymentDueIn
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public TimeDuration getFullPaymentDueIn() {
    return fullPaymentDueIn;
  }


  public void setFullPaymentDueIn(TimeDuration fullPaymentDueIn) {
    this.fullPaymentDueIn = fullPaymentDueIn;
  }


  public SetPaymentPolicyResponse immediatePay(Boolean immediatePay) {
    
    this.immediatePay = immediatePay;
    return this;
  }

   /**
   * The value returned in this field will reflect the value set by the seller in the &lt;b&gt;immediatePay&lt;/b&gt; request field. A value of &lt;code&gt;true&lt;/code&gt; indicates that immediate payment is required from the buyer for: &lt;ul&gt;&lt;li&gt;A fixed-price item&lt;/li&gt;&lt;li&gt;An auction item where the buyer is using the &#39;Buy it Now&#39; option&lt;/li&gt;&lt;li&gt;A deposit for a motor vehicle listing&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;It is possible for the seller to set this field as &lt;code&gt;true&lt;/code&gt; in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
   * @return immediatePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value returned in this field will reflect the value set by the seller in the <b>immediatePay</b> request field. A value of <code>true</code> indicates that immediate payment is required from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer is using the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br />It is possible for the seller to set this field as <code>true</code> in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.")

  public Boolean getImmediatePay() {
    return immediatePay;
  }


  public void setImmediatePay(Boolean immediatePay) {
    this.immediatePay = immediatePay;
  }


  public SetPaymentPolicyResponse marketplaceId(String marketplaceId) {
    
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return marketplaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>")

  public String getMarketplaceId() {
    return marketplaceId;
  }


  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }


  public SetPaymentPolicyResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Max length:&lt;/b&gt; 64
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SetPaymentPolicyResponse paymentInstructions(String paymentInstructions) {
    
    this.paymentInstructions = paymentInstructions;
    return this;
  }

   /**
   * &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.&lt;/p&gt;A free-form string field that allows sellers to add detailed payment instructions to their listings.
   * @return paymentInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<p class=\"tablenote\"><b>Note:</b> NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.</p>A free-form string field that allows sellers to add detailed payment instructions to their listings.")

  public String getPaymentInstructions() {
    return paymentInstructions;
  }


  public void setPaymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }


  public SetPaymentPolicyResponse paymentMethods(List<PaymentMethod> paymentMethods) {
    
    this.paymentMethods = paymentMethods;
    return this;
  }

  public SetPaymentPolicyResponse addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<PaymentMethod>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * This array shows the available payment methods that the seller has set for the payment business policy.&lt;br /&gt;&lt;br /&gt;Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.
   * @return paymentMethods
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This array shows the available payment methods that the seller has set for the payment business policy.<br /><br />Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.")

  public List<PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }


  public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  public SetPaymentPolicyResponse paymentPolicyId(String paymentPolicyId) {
    
    this.paymentPolicyId = paymentPolicyId;
    return this;
  }

   /**
   * A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.
   * @return paymentPolicyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.")

  public String getPaymentPolicyId() {
    return paymentPolicyId;
  }


  public void setPaymentPolicyId(String paymentPolicyId) {
    this.paymentPolicyId = paymentPolicyId;
  }


  public SetPaymentPolicyResponse warnings(List<Error> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public SetPaymentPolicyResponse addWarningsItem(Error warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<Error>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.")

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
    SetPaymentPolicyResponse setPaymentPolicyResponse = (SetPaymentPolicyResponse) o;
    return Objects.equals(this.categoryTypes, setPaymentPolicyResponse.categoryTypes) &&
        Objects.equals(this.deposit, setPaymentPolicyResponse.deposit) &&
        Objects.equals(this.description, setPaymentPolicyResponse.description) &&
        Objects.equals(this.fullPaymentDueIn, setPaymentPolicyResponse.fullPaymentDueIn) &&
        Objects.equals(this.immediatePay, setPaymentPolicyResponse.immediatePay) &&
        Objects.equals(this.marketplaceId, setPaymentPolicyResponse.marketplaceId) &&
        Objects.equals(this.name, setPaymentPolicyResponse.name) &&
        Objects.equals(this.paymentInstructions, setPaymentPolicyResponse.paymentInstructions) &&
        Objects.equals(this.paymentMethods, setPaymentPolicyResponse.paymentMethods) &&
        Objects.equals(this.paymentPolicyId, setPaymentPolicyResponse.paymentPolicyId) &&
        Objects.equals(this.warnings, setPaymentPolicyResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, deposit, description, fullPaymentDueIn, immediatePay, marketplaceId, name, paymentInstructions, paymentMethods, paymentPolicyId, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPaymentPolicyResponse {\n");
    sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullPaymentDueIn: ").append(toIndentedString(fullPaymentDueIn)).append("\n");
    sb.append("    immediatePay: ").append(toIndentedString(immediatePay)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    paymentPolicyId: ").append(toIndentedString(paymentPolicyId)).append("\n");
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

