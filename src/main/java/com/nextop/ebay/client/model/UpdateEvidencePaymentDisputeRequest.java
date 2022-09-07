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
import com.nextop.ebay.client.model.FileEvidence;
import com.nextop.ebay.client.model.OrderLineItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This type is used by the request payload of the &lt;strong&gt;updateEvidence&lt;/strong&gt; method. The &lt;strong&gt;updateEvidence&lt;/strong&gt; method is used to update an existing evidence set against a payment dispute with one or more evidence files.
 */
@ApiModel(description = "This type is used by the request payload of the <strong>updateEvidence</strong> method. The <strong>updateEvidence</strong> method is used to update an existing evidence set against a payment dispute with one or more evidence files.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class UpdateEvidencePaymentDisputeRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EVIDENCE_ID = "evidenceId";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_ID)
  private String evidenceId;

  public static final String SERIALIZED_NAME_EVIDENCE_TYPE = "evidenceType";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_TYPE)
  private String evidenceType;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<FileEvidence> files = null;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<OrderLineItems> lineItems = null;


  public UpdateEvidencePaymentDisputeRequest evidenceId(String evidenceId) {
    
    this.evidenceId = evidenceId;
    return this;
  }

   /**
   * The unique identifier of the evidence set that is being updated with new evidence files.
   * @return evidenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the evidence set that is being updated with new evidence files.")

  public String getEvidenceId() {
    return evidenceId;
  }


  public void setEvidenceId(String evidenceId) {
    this.evidenceId = evidenceId;
  }


  public UpdateEvidencePaymentDisputeRequest evidenceType(String evidenceType) {
    
    this.evidenceType = evidenceType;
    return this;
  }

   /**
   * This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field. See the &lt;strong&gt;EvidenceTypeEnum&lt;/strong&gt; type for the supported evidence types. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return evidenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field. See the <strong>EvidenceTypeEnum</strong> type for the supported evidence types. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum'>eBay API documentation</a>")

  public String getEvidenceType() {
    return evidenceType;
  }


  public void setEvidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
  }


  public UpdateEvidencePaymentDisputeRequest files(List<FileEvidence> files) {
    
    this.files = files;
    return this;
  }

  public UpdateEvidencePaymentDisputeRequest addFilesItem(FileEvidence filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<FileEvidence>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * This array is used to specify one or more evidence files that will be added to the evidence set associated with a payment dispute. At least one evidence file must be specified in the &lt;strong&gt;files&lt;/strong&gt; array.&lt;br&gt;&lt;br&gt; The unique identifier of an evidence file is returned in the response payload of the &lt;strong&gt;uploadEvidence&lt;/strong&gt; method.
   * @return files
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This array is used to specify one or more evidence files that will be added to the evidence set associated with a payment dispute. At least one evidence file must be specified in the <strong>files</strong> array.<br><br> The unique identifier of an evidence file is returned in the response payload of the <strong>uploadEvidence</strong> method.")

  public List<FileEvidence> getFiles() {
    return files;
  }


  public void setFiles(List<FileEvidence> files) {
    this.files = files;
  }


  public UpdateEvidencePaymentDisputeRequest lineItems(List<OrderLineItems> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public UpdateEvidencePaymentDisputeRequest addLineItemsItem(OrderLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<OrderLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This required array identifies the order line item(s) for which the evidence file(s) will be applicable. Both the &lt;strong&gt;itemId&lt;/strong&gt; and &lt;strong&gt;lineItemID&lt;/strong&gt; fields are needed to identify each order line item, and both of these values are returned under the &lt;strong&gt;evidenceRequests.lineItems&lt;/strong&gt; array in the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "This required array identifies the order line item(s) for which the evidence file(s) will be applicable. Both the <strong>itemId</strong> and <strong>lineItemID</strong> fields are needed to identify each order line item, and both of these values are returned under the <strong>evidenceRequests.lineItems</strong> array in the <strong>getPaymentDispute</strong> response.")

  public List<OrderLineItems> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<OrderLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEvidencePaymentDisputeRequest updateEvidencePaymentDisputeRequest = (UpdateEvidencePaymentDisputeRequest) o;
    return Objects.equals(this.evidenceId, updateEvidencePaymentDisputeRequest.evidenceId) &&
        Objects.equals(this.evidenceType, updateEvidencePaymentDisputeRequest.evidenceType) &&
        Objects.equals(this.files, updateEvidencePaymentDisputeRequest.files) &&
        Objects.equals(this.lineItems, updateEvidencePaymentDisputeRequest.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceId, evidenceType, files, lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEvidencePaymentDisputeRequest {\n");
    sb.append("    evidenceId: ").append(toIndentedString(evidenceId)).append("\n");
    sb.append("    evidenceType: ").append(toIndentedString(evidenceType)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

