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
import com.nextop.ebay.client.model.RefundItem;
import com.nextop.ebay.client.model.SimpleAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The base type used by the request payload of the &lt;b&gt;issueRefund&lt;/b&gt; method.
 */
@ApiModel(description = "The base type used by the request payload of the <b>issueRefund</b> method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class IssueRefundRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REASON_FOR_REFUND = "reasonForRefund";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_REFUND)
  private String reasonForRefund;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_REFUND_ITEMS = "refundItems";
  @SerializedName(SERIALIZED_NAME_REFUND_ITEMS)
  private List<RefundItem> refundItems = null;

  public static final String SERIALIZED_NAME_ORDER_LEVEL_REFUND_AMOUNT = "orderLevelRefundAmount";
  @SerializedName(SERIALIZED_NAME_ORDER_LEVEL_REFUND_AMOUNT)
  private SimpleAmount orderLevelRefundAmount;


  public IssueRefundRequest reasonForRefund(String reasonForRefund) {
    
    this.reasonForRefund = reasonForRefund;
    return this;
  }

   /**
   * The enumeration value passed into this field indicates the reason for the refund. One of the defined enumeration values in the &lt;b&gt;ReasonForRefundEnum&lt;/b&gt; type must be used.&lt;br/&gt;&lt;br/&gt;This field is required, and it is highly recommended that sellers use the correct refund reason, especially in the case of a buyer-requested cancellation or &#39;buyer remorse&#39; return to indicate that there was nothing wrong with the item(s) or with the shipment of the order.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If issuing refunds for more than one order line item, keep in mind that the refund reason must be the same for each of the order line items. If the refund reason is different for one or more order line items in an order, the seller would need to make separate &lt;b&gt;issueRefund&lt;/b&gt; calls, one for each refund reason. &lt;/span&gt; For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ReasonForRefundEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return reasonForRefund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The enumeration value passed into this field indicates the reason for the refund. One of the defined enumeration values in the <b>ReasonForRefundEnum</b> type must be used.<br/><br/>This field is required, and it is highly recommended that sellers use the correct refund reason, especially in the case of a buyer-requested cancellation or 'buyer remorse' return to indicate that there was nothing wrong with the item(s) or with the shipment of the order.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> If issuing refunds for more than one order line item, keep in mind that the refund reason must be the same for each of the order line items. If the refund reason is different for one or more order line items in an order, the seller would need to make separate <b>issueRefund</b> calls, one for each refund reason. </span> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ReasonForRefundEnum'>eBay API documentation</a>")

  public String getReasonForRefund() {
    return reasonForRefund;
  }


  public void setReasonForRefund(String reasonForRefund) {
    this.reasonForRefund = reasonForRefund;
  }


  public IssueRefundRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * This free-text field allows the seller to clarify why the refund is being issued to the buyer.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Max Length&lt;/b&gt;: 100
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This free-text field allows the seller to clarify why the refund is being issued to the buyer.<br/><br/><b>Max Length</b>: 100")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public IssueRefundRequest refundItems(List<RefundItem> refundItems) {
    
    this.refundItems = refundItems;
    return this;
  }

  public IssueRefundRequest addRefundItemsItem(RefundItem refundItemsItem) {
    if (this.refundItems == null) {
      this.refundItems = new ArrayList<RefundItem>();
    }
    this.refundItems.add(refundItemsItem);
    return this;
  }

   /**
   * The &lt;b&gt;refundItems&lt;/b&gt; array is only required if the seller is issuing a refund for one or more individual order line items in a multiple line item order. Otherwise, the seller just uses the &lt;b&gt;orderLevelRefundAmount&lt;/b&gt; container to specify the amount of the refund for the entire order.
   * @return refundItems
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "The <b>refundItems</b> array is only required if the seller is issuing a refund for one or more individual order line items in a multiple line item order. Otherwise, the seller just uses the <b>orderLevelRefundAmount</b> container to specify the amount of the refund for the entire order.")

  public List<RefundItem> getRefundItems() {
    return refundItems;
  }


  public void setRefundItems(List<RefundItem> refundItems) {
    this.refundItems = refundItems;
  }


  public IssueRefundRequest orderLevelRefundAmount(SimpleAmount orderLevelRefundAmount) {
    
    this.orderLevelRefundAmount = orderLevelRefundAmount;
    return this;
  }

   /**
   * Get orderLevelRefundAmount
   * @return orderLevelRefundAmount
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public SimpleAmount getOrderLevelRefundAmount() {
    return orderLevelRefundAmount;
  }


  public void setOrderLevelRefundAmount(SimpleAmount orderLevelRefundAmount) {
    this.orderLevelRefundAmount = orderLevelRefundAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueRefundRequest issueRefundRequest = (IssueRefundRequest) o;
    return Objects.equals(this.reasonForRefund, issueRefundRequest.reasonForRefund) &&
        Objects.equals(this.comment, issueRefundRequest.comment) &&
        Objects.equals(this.refundItems, issueRefundRequest.refundItems) &&
        Objects.equals(this.orderLevelRefundAmount, issueRefundRequest.orderLevelRefundAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonForRefund, comment, refundItems, orderLevelRefundAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueRefundRequest {\n");
    sb.append("    reasonForRefund: ").append(toIndentedString(reasonForRefund)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    refundItems: ").append(toIndentedString(refundItems)).append("\n");
    sb.append("    orderLevelRefundAmount: ").append(toIndentedString(orderLevelRefundAmount)).append("\n");
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

