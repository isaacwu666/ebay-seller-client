# FulfillmentApiPaymentDisputeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptPaymentDispute**](FulfillmentApiPaymentDisputeApi.md#acceptPaymentDispute) | **POST** /payment_dispute/{payment_dispute_id}/accept | Accept Payment Dispute
[**addEvidence**](FulfillmentApiPaymentDisputeApi.md#addEvidence) | **POST** /payment_dispute/{payment_dispute_id}/add_evidence | Add an Evidence File
[**contestPaymentDispute**](FulfillmentApiPaymentDisputeApi.md#contestPaymentDispute) | **POST** /payment_dispute/{payment_dispute_id}/contest | Contest Payment Dispute
[**fetchEvidenceContent**](FulfillmentApiPaymentDisputeApi.md#fetchEvidenceContent) | **GET** /payment_dispute/{payment_dispute_id}/fetch_evidence_content | Get Payment Dispute Evidence File
[**getActivities**](FulfillmentApiPaymentDisputeApi.md#getActivities) | **GET** /payment_dispute/{payment_dispute_id}/activity | Get Payment Dispute Activity
[**getPaymentDispute**](FulfillmentApiPaymentDisputeApi.md#getPaymentDispute) | **GET** /payment_dispute/{payment_dispute_id} | Get Payment Dispute Details
[**getPaymentDisputeSummaries**](FulfillmentApiPaymentDisputeApi.md#getPaymentDisputeSummaries) | **GET** /payment_dispute_summary | Search Payment Dispute by Filters
[**updateEvidence**](FulfillmentApiPaymentDisputeApi.md#updateEvidence) | **POST** /payment_dispute/{payment_dispute_id}/update_evidence | Update evidence
[**uploadEvidenceFile**](FulfillmentApiPaymentDisputeApi.md#uploadEvidenceFile) | **POST** /payment_dispute/{payment_dispute_id}/upload_evidence_file | Upload an Evidence File


<a name="acceptPaymentDispute"></a>
# **acceptPaymentDispute**
> Object acceptPaymentDispute(paymentDisputeId, acceptPaymentDisputeRequest)

Accept Payment Dispute

This method is used if the seller wishes to accept a payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to accept. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the <strong>paymentDisputeId</strong> field in the <strong>getPaymentDisputeSummaries</strong> response.<br><br>This path parameter is required, and the actual identifier value is passed in right after the <strong>payment_dispute</strong> resource. See the Resource URI above.
    AcceptPaymentDisputeRequest acceptPaymentDisputeRequest = new AcceptPaymentDisputeRequest(); // AcceptPaymentDisputeRequest | 
    try {
      Object result = apiInstance.acceptPaymentDispute(paymentDisputeId, acceptPaymentDisputeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#acceptPaymentDispute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to accept. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the &lt;strong&gt;paymentDisputeId&lt;/strong&gt; field in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response.&lt;br&gt;&lt;br&gt;This path parameter is required, and the actual identifier value is passed in right after the &lt;strong&gt;payment_dispute&lt;/strong&gt; resource. See the Resource URI above. |
 **acceptPaymentDisputeRequest** | [**AcceptPaymentDisputeRequest**](AcceptPaymentDisputeRequest.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="addEvidence"></a>
# **addEvidence**
> AddEvidencePaymentDisputeResponse addEvidence(paymentDisputeId, addEvidencePaymentDisputeRequest)

Add an Evidence File

This method is used by the seller to add one or more evidence files to address a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;The file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload.  Adding one or more new evidence files for a payment dispute triggers the creation of an evidence file, and the unique identifier for the new evidence file is automatically generated and returned in the &lt;strong&gt;evidenceId&lt;/strong&gt; field of the &lt;strong&gt;addEvidence&lt;/strong&gt; response payload upon a successful call.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field. All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an &lt;strong&gt;evidenceId&lt;/strong&gt; value is returned in the response. This indicates that a new evidence set has been created for the payment dispute, and this evidence set includes the evidence file(s) that were passed in to the &lt;strong&gt;fileId&lt;/strong&gt; array. The &lt;strong&gt;evidenceId&lt;/strong&gt; value will be needed if the seller wishes to add to the evidence set by using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method, or if they want to retrieve a specific evidence file within the evidence set by using the &lt;strong&gt;fetchEvidenceContent&lt;/strong&gt; method.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to add evidence for a contested payment dispute. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the <strong>paymentDisputeId</strong> field in the <strong>getPaymentDisputeSummaries</strong> response.<br><br>This path parameter is required, and the actual identifier value is passed in right after the <strong>payment_dispute</strong> resource. See the Resource URI above.
    AddEvidencePaymentDisputeRequest addEvidencePaymentDisputeRequest = new AddEvidencePaymentDisputeRequest(); // AddEvidencePaymentDisputeRequest | 
    try {
      AddEvidencePaymentDisputeResponse result = apiInstance.addEvidence(paymentDisputeId, addEvidencePaymentDisputeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#addEvidence");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to add evidence for a contested payment dispute. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the &lt;strong&gt;paymentDisputeId&lt;/strong&gt; field in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response.&lt;br&gt;&lt;br&gt;This path parameter is required, and the actual identifier value is passed in right after the &lt;strong&gt;payment_dispute&lt;/strong&gt; resource. See the Resource URI above. |
 **addEvidencePaymentDisputeRequest** | [**AddEvidencePaymentDisputeRequest**](AddEvidencePaymentDisputeRequest.md)|  | [optional]

### Return type

[**AddEvidencePaymentDisputeResponse**](AddEvidencePaymentDisputeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="contestPaymentDispute"></a>
# **contestPaymentDispute**
> Object contestPaymentDispute(paymentDisputeId, contestPaymentDisputeRequest)

Contest Payment Dispute

This method is used if the seller wishes to contest a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before contesting a payment dispute, the seller must upload all evidence files using the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt;), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;If a seller decides to contest a payment dispute, that seller should be prepared to provide evidential documents such as proof of delivery, proof of authentication, or other documents. The type of evidential documents that the seller will provide will depend on why the buyer initiated the payment dispute.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to contest. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the <strong>paymentDisputeId</strong> field in the <strong>getPaymentDisputeSummaries</strong> response.<br><br>This path parameter is required, and the actual identifier value is passed in right after the <strong>payment_dispute</strong> resource. See the Resource URI above.
    ContestPaymentDisputeRequest contestPaymentDisputeRequest = new ContestPaymentDisputeRequest(); // ContestPaymentDisputeRequest | 
    try {
      Object result = apiInstance.contestPaymentDispute(paymentDisputeId, contestPaymentDisputeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#contestPaymentDispute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to contest. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the &lt;strong&gt;paymentDisputeId&lt;/strong&gt; field in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response.&lt;br&gt;&lt;br&gt;This path parameter is required, and the actual identifier value is passed in right after the &lt;strong&gt;payment_dispute&lt;/strong&gt; resource. See the Resource URI above. |
 **contestPaymentDisputeRequest** | [**ContestPaymentDisputeRequest**](ContestPaymentDisputeRequest.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="fetchEvidenceContent"></a>
# **fetchEvidenceContent**
> Object fetchEvidenceContent(paymentDisputeId, evidenceId, fileId)

Get Payment Dispute Evidence File

This call retrieves a specific evidence file for a payment dispute. The following three identifying parameters are needed in the call URI:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;payment_dispute_id&lt;/strong&gt;: the identifier of the payment dispute. The identifier of each payment dispute is returned in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;evidence_id&lt;/strong&gt;: the identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;file_id&lt;/strong&gt;: the identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter. The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;An actual binary file is returned if the call is successful. An error will occur if any of three identifiers are invalid.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | The identifier of the payment dispute. The identifier of each payment dispute is returned in the <strong>getPaymentDisputeSummaries</strong> response. This identifier is passed in as a path parameter at the end of the call URI.
    String evidenceId = "evidenceId_example"; // String | The identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the <strong>evidence</strong> array in the <strong>getPaymentDispute</strong> response.<br><br>Below is an example of the syntax to use for this query parameter:<br/><br/><code>evidence_id=12345678</code>
    String fileId = "fileId_example"; // String | The identifier of an evidential file. This file must belong to the evidential file set identified through the <strong>evidence_id</strong> query parameter. The identifier of each evidential file is returned under the <strong>evidence.files</strong> array in the <strong>getPaymentDispute</strong> response. <br><br>Below is an example of the syntax to use for this query parameter:<br/><br/><code>file_id=12345678</code> 
    try {
      Object result = apiInstance.fetchEvidenceContent(paymentDisputeId, evidenceId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#fetchEvidenceContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| The identifier of the payment dispute. The identifier of each payment dispute is returned in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response. This identifier is passed in as a path parameter at the end of the call URI. |
 **evidenceId** | **String**| The identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response.&lt;br&gt;&lt;br&gt;Below is an example of the syntax to use for this query parameter:&lt;br/&gt;&lt;br/&gt;&lt;code&gt;evidence_id&#x3D;12345678&lt;/code&gt; |
 **fileId** | **String**| The identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter. The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response. &lt;br&gt;&lt;br&gt;Below is an example of the syntax to use for this query parameter:&lt;br/&gt;&lt;br/&gt;&lt;code&gt;file_id&#x3D;12345678&lt;/code&gt;  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Invalid Payment Dispute Id |  -  |
**500** | Internal Server Error |  -  |

<a name="getActivities"></a>
# **getActivities**
> PaymentDisputeActivityHistory getActivities(paymentDisputeId)

Get Payment Dispute Activity

This method retrieve a log of activity for a payment dispute. The identifier of the payment dispute is passed in as a path parameter. The output includes a timestamp for each action of the payment dispute, from creation to resolution, and all steps in between.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | This is the unique identifier of the payment dispute. This path parameter must be passed in at the end of the call URI to identify the payment dispute for which the user wishes to see all activity. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the <strong>paymentDisputeId</strong> field in the <strong>getPaymentDisputeSummaries</strong> response.<br><br>This path parameter is required, and the actual identifier value is passed in right after the <strong>payment_dispute</strong> resource. See the Resource URI above.
    try {
      PaymentDisputeActivityHistory result = apiInstance.getActivities(paymentDisputeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#getActivities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| This is the unique identifier of the payment dispute. This path parameter must be passed in at the end of the call URI to identify the payment dispute for which the user wishes to see all activity. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the &lt;strong&gt;paymentDisputeId&lt;/strong&gt; field in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response.&lt;br&gt;&lt;br&gt;This path parameter is required, and the actual identifier value is passed in right after the &lt;strong&gt;payment_dispute&lt;/strong&gt; resource. See the Resource URI above. |

### Return type

[**PaymentDisputeActivityHistory**](PaymentDisputeActivityHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Invalid Payment Dispute Id |  -  |
**500** | Internal Server Error |  -  |

<a name="getPaymentDispute"></a>
# **getPaymentDispute**
> PaymentDispute getPaymentDispute(paymentDisputeId)

Get Payment Dispute Details

This method retrieves detailed information on a specific payment dispute. The payment dispute identifier is passed in as path parameter at the end of the call URI.&lt;br/&gt;&lt;br/&gt;Below is a summary of the information that is retrieved:&lt;ul&gt;&lt;li&gt;Current status of payment dispute&lt;/li&gt;&lt;li&gt;Amount of the payment dispute&lt;/li&gt;&lt;li&gt;Reason the payment dispute was opened&lt;/li&gt;&lt;li&gt;Order and line items associated with the payment dispute&lt;/li&gt;&lt;li&gt;Seller response options if an action is currently required on the payment dispute&lt;/li&gt;&lt;li&gt;Details on the results of the payment dispute if it has been closed&lt;/li&gt;&lt;li&gt;Details on any evidence that was provided by the seller to fight the payment dispute&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | This is the unique identifier of the payment dispute. This path parameter must be passed in at the end of the call URI to identify the payment dispute to retrieve. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the <strong>paymentDisputeId</strong> field in the <strong>getPaymentDisputeSummaries</strong> response.
    try {
      PaymentDispute result = apiInstance.getPaymentDispute(paymentDisputeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#getPaymentDispute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| This is the unique identifier of the payment dispute. This path parameter must be passed in at the end of the call URI to identify the payment dispute to retrieve. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the &lt;strong&gt;paymentDisputeId&lt;/strong&gt; field in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response. |

### Return type

[**PaymentDispute**](PaymentDispute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Invalid Payment Dispute Id |  -  |
**500** | Internal Server Error |  -  |

<a name="getPaymentDisputeSummaries"></a>
# **getPaymentDisputeSummaries**
> DisputeSummaryResponse getPaymentDisputeSummaries(orderId, buyerUsername, openDateFrom, openDateTo, paymentDisputeStatus, limit, offset)

Search Payment Dispute by Filters

This method is used retrieve one or more payment disputes filed against the seller. These payment disputes can be open or recently closed. The following filter types are available in the request payload to control the payment disputes that are returned:&lt;ul&gt;&lt;li&gt;Dispute filed against a specific order (&lt;b&gt;order_id&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed by a specific buyer (&lt;b&gt;buyer_username&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed within a specific date range (&lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; parameters are used)&lt;/li&gt;&lt;li&gt;Disputes in a specific state (&lt;b&gt;payment_dispute_status&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;/ul&gt;More than one of these filter types can be used together. See the request payload request fields for more information about how each filter is used.&lt;br/&gt;&lt;br/&gt;If none of the filters are used, all open and recently closed payment disputes are returned.&lt;br/&gt;&lt;br/&gt;Pagination is also available. See the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; fields for more information on how pagination is used for this method.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String orderId = "orderId_example"; // String | This filter is used if the seller wishes to retrieve one or more payment disputes filed against a specific order. It is possible that there can be more than one dispute filed against an order if the order has multiple line items. If this filter is used, any other filters are ignored.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> The order identifier passed into this field must be an Order ID in the new format. The legacy APIs still support the old and new order ID format to identify orders, but only the new order ID format is supported in REST-based APIs. eBay rolled out a new Order ID format in June 2019.</span>
    String buyerUsername = "buyerUsername_example"; // String | This filter is used if the seller wishes to retrieve one or more payment disputes opened by a specific seller. The string that is passed in to this query parameter is the eBay user ID of the buyer.
    String openDateFrom = "openDateFrom_example"; // String | The <b>open_date_from</b> and/or <b>open_date_to</b> date filters are used if the seller wishes to retrieve payment disputes opened within a specific date range. A maximum date range that may be set with the <b>open_date_from</b> and/or <b>open_date_to</b> filters is 90 days. These date filters use the ISO-8601 24-hour date and time format, and time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu.<br><br>The <b>open_date_from</b> field sets the beginning date of the date range, and can be set as far back as 18 months from the present time. If a <b>open_date_from</b> field is used, but a <b>open_date_to</b> field is not used, the <b>open_date_to</b> value will default to 90 days after the date specified in the <b>open_date_from</b> field, or to the present time if less than 90 days in the past.<br/><br/>The ISO-8601 format looks like this: <em>yyyy-MM-ddThh:mm.ss.sssZ</em>. An example would be <code>2019-08-04T19:09:02.768Z</code>.
    String openDateTo = "openDateTo_example"; // String | The <b>open_date_from</b> and/or <b>open_date_to</b> date filters are used if the seller wishes to retrieve payment disputes opened within a specific date range. A maximum date range that may be set with the <b>open_date_from</b> and/or <b>open_date_to</b> filters is 90 days. These date filters use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu.<br><br>The <b>open_date_to</b> field sets the ending date of the date range, and can be set up to 90 days from the date set in the <b>open_date_from</b> field. <br/><br/>The ISO-8601 format looks like this: <em>yyyy-MM-ddThh:mm.ss.sssZ</em>. An example would be <code>2019-08-04T19:09:02.768Z</code>.
    String paymentDisputeStatus = "paymentDisputeStatus_example"; // String | This filter is used if the seller wishes to only retrieve payment disputes in a specific state. More than one value can be specified. If no <b>payment_dispute_status</b> filter is used, payment disputes in all states are returned in the response. See <strong>DisputeStateEnum</strong> type for supported values.
    String limit = "limit_example"; // String | The value passed in this query parameter sets the maximum number of payment disputes to return per page of data. The value passed in this field should be an integer from 1 to 200. If this query parameter is not set, up to 200 records will be returned on each page of results.<br><br><b>Min</b>: 1; <b>Max</b>: 200; <b>Default</b>: 200
    String offset = "offset_example"; // String | This field is used to specify the number of records to skip in the result set before returning the first payment dispute in the paginated response. A zero-based index is used, so if you set the <b>offset</b> value to <code>0</code> (default value), the first payment dispute in the result set appears at the top of the response. <br/><br/>Combine <b>offset</b> with the <b>limit</b> parameter to control the payment disputes returned in the response. For example, if you supply an <b>offset</b> value of <code>0</code> and a <b>limit</b> value of <code>10</code>, the response will contain the first 10 payment disputes from the result set that matches the input criteria. If you supply an <b>offset</b> value of <code>10</code> and a <b>limit</b> value of <code>20</code>, the response will contain payment disputes 11-30 from the result set that matches the input criteria.<br><br><b>Min</b>: 0; <b>Max</b>: total number of payment disputes - 1; <b>Default</b>: 0
    try {
      DisputeSummaryResponse result = apiInstance.getPaymentDisputeSummaries(orderId, buyerUsername, openDateFrom, openDateTo, paymentDisputeStatus, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#getPaymentDisputeSummaries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| This filter is used if the seller wishes to retrieve one or more payment disputes filed against a specific order. It is possible that there can be more than one dispute filed against an order if the order has multiple line items. If this filter is used, any other filters are ignored.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The order identifier passed into this field must be an Order ID in the new format. The legacy APIs still support the old and new order ID format to identify orders, but only the new order ID format is supported in REST-based APIs. eBay rolled out a new Order ID format in June 2019.&lt;/span&gt; | [optional]
 **buyerUsername** | **String**| This filter is used if the seller wishes to retrieve one or more payment disputes opened by a specific seller. The string that is passed in to this query parameter is the eBay user ID of the buyer. | [optional]
 **openDateFrom** | **String**| The &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; date filters are used if the seller wishes to retrieve payment disputes opened within a specific date range. A maximum date range that may be set with the &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; filters is 90 days. These date filters use the ISO-8601 24-hour date and time format, and time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu.&lt;br&gt;&lt;br&gt;The &lt;b&gt;open_date_from&lt;/b&gt; field sets the beginning date of the date range, and can be set as far back as 18 months from the present time. If a &lt;b&gt;open_date_from&lt;/b&gt; field is used, but a &lt;b&gt;open_date_to&lt;/b&gt; field is not used, the &lt;b&gt;open_date_to&lt;/b&gt; value will default to 90 days after the date specified in the &lt;b&gt;open_date_from&lt;/b&gt; field, or to the present time if less than 90 days in the past.&lt;br/&gt;&lt;br/&gt;The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;. | [optional]
 **openDateTo** | **String**| The &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; date filters are used if the seller wishes to retrieve payment disputes opened within a specific date range. A maximum date range that may be set with the &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; filters is 90 days. These date filters use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu.&lt;br&gt;&lt;br&gt;The &lt;b&gt;open_date_to&lt;/b&gt; field sets the ending date of the date range, and can be set up to 90 days from the date set in the &lt;b&gt;open_date_from&lt;/b&gt; field. &lt;br/&gt;&lt;br/&gt;The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;. | [optional]
 **paymentDisputeStatus** | **String**| This filter is used if the seller wishes to only retrieve payment disputes in a specific state. More than one value can be specified. If no &lt;b&gt;payment_dispute_status&lt;/b&gt; filter is used, payment disputes in all states are returned in the response. See &lt;strong&gt;DisputeStateEnum&lt;/strong&gt; type for supported values. | [optional]
 **limit** | **String**| The value passed in this query parameter sets the maximum number of payment disputes to return per page of data. The value passed in this field should be an integer from 1 to 200. If this query parameter is not set, up to 200 records will be returned on each page of results.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min&lt;/b&gt;: 1; &lt;b&gt;Max&lt;/b&gt;: 200; &lt;b&gt;Default&lt;/b&gt;: 200 | [optional]
 **offset** | **String**| This field is used to specify the number of records to skip in the result set before returning the first payment dispute in the paginated response. A zero-based index is used, so if you set the &lt;b&gt;offset&lt;/b&gt; value to &lt;code&gt;0&lt;/code&gt; (default value), the first payment dispute in the result set appears at the top of the response. &lt;br/&gt;&lt;br/&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; parameter to control the payment disputes returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; value of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; value of &lt;code&gt;10&lt;/code&gt;, the response will contain the first 10 payment disputes from the result set that matches the input criteria. If you supply an &lt;b&gt;offset&lt;/b&gt; value of &lt;code&gt;10&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; value of &lt;code&gt;20&lt;/code&gt;, the response will contain payment disputes 11-30 from the result set that matches the input criteria.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min&lt;/b&gt;: 0; &lt;b&gt;Max&lt;/b&gt;: total number of payment disputes - 1; &lt;b&gt;Default&lt;/b&gt;: 0 | [optional]

### Return type

[**DisputeSummaryResponse**](DisputeSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="updateEvidence"></a>
# **updateEvidence**
> Object updateEvidence(paymentDisputeId, updateEvidencePaymentDisputeRequest)

Update evidence

This method is used by the seller to update an existing evidence set for a payment dispute with one or more evidence files. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;The unique identifier of the evidence set to update is specified through the &lt;strong&gt;evidenceId&lt;/strong&gt; field, and the file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload. The unique identifier for an evidence file is automatically generated and returned in the &lt;strong&gt;fileId&lt;/strong&gt; field of the &lt;strong&gt;uploadEvidence&lt;/strong&gt; response payload upon a successful call. Sellers must make sure to capture the &lt;strong&gt;fileId&lt;/strong&gt; value for each evidence file that is uploaded with the &lt;strong&gt;uploadEvidence&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field.  All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an http status code of &lt;code&gt;204 Success&lt;/code&gt; is returned. There is no response payload unless an error occurs. To verify that a new file is a part of the evidence set, the seller can use the &lt;strong&gt;fetchEvidenceContent&lt;/strong&gt; method, passing in the proper &lt;strong&gt;evidenceId&lt;/strong&gt; and &lt;strong&gt;fileId&lt;/strong&gt; values.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to update the evidence set for a contested payment dispute. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the <strong>paymentDisputeId</strong> field in the <strong>getPaymentDisputeSummaries</strong> response.<br><br>This path parameter is required, and the actual identifier value is passed in right after the <strong>payment_dispute</strong> resource. See the Resource URI above.
    UpdateEvidencePaymentDisputeRequest updateEvidencePaymentDisputeRequest = new UpdateEvidencePaymentDisputeRequest(); // UpdateEvidencePaymentDisputeRequest | 
    try {
      Object result = apiInstance.updateEvidence(paymentDisputeId, updateEvidencePaymentDisputeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#updateEvidence");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to update the evidence set for a contested payment dispute. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the &lt;strong&gt;paymentDisputeId&lt;/strong&gt; field in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response.&lt;br&gt;&lt;br&gt;This path parameter is required, and the actual identifier value is passed in right after the &lt;strong&gt;payment_dispute&lt;/strong&gt; resource. See the Resource URI above. |
 **updateEvidencePaymentDisputeRequest** | [**UpdateEvidencePaymentDisputeRequest**](UpdateEvidencePaymentDisputeRequest.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="uploadEvidenceFile"></a>
# **uploadEvidenceFile**
> FileEvidence uploadEvidenceFile(paymentDisputeId)

Upload an Evidence File

This method is used to upload an evidence file for a contested payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;uploadEvidenceFile&lt;/strong&gt; only uploads an encrypted, binary image file (using &lt;strong&gt;multipart/form-data&lt;/strong&gt; HTTP request header), and does not have a JSON-based request payload.&lt;br&gt;&lt;br&gt;Use &#39;file&#39; as the name of the key that you use to upload the image file. The upload will not be successful if a different key name is used.&lt;br&gt;&lt;br&gt;The three image formats supported at this time are &lt;strong&gt;.JPEG&lt;/strong&gt;, &lt;strong&gt;.JPG&lt;/strong&gt;, and &lt;strong&gt;.PNG&lt;/strong&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;After the file is successfully uploaded, the seller will need to grab the &lt;strong&gt;fileId&lt;/strong&gt; value in the response payload to add this file to a new evidence set using the &lt;strong&gt;addEvidence&lt;/strong&gt; method, or to add this file to an existing evidence set using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiPaymentDisputeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiPaymentDisputeApi apiInstance = new FulfillmentApiPaymentDisputeApi(defaultClient);
    String paymentDisputeId = "paymentDisputeId_example"; // String | This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to upload an evidence file. This identifier is automatically created by eBay after the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the <strong>paymentDisputeId</strong> field in the <strong>getPaymentDisputeSummaries</strong> response.<br><br>This path parameter is required, and the actual identifier value is passed in right after the <strong>payment_dispute</strong> resource. See the Resource URI above.
    try {
      FileEvidence result = apiInstance.uploadEvidenceFile(paymentDisputeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiPaymentDisputeApi#uploadEvidenceFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDisputeId** | **String**| This is the unique identifier of the payment dispute. This path parameter must be passed into the call URI to identify the payment dispute for which the user plans to upload an evidence file. This identifier is automatically created by eBay after the payment dispute comes into the eBay system. The unique identifier for payment disputes is returned in the &lt;strong&gt;paymentDisputeId&lt;/strong&gt; field in the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; response.&lt;br&gt;&lt;br&gt;This path parameter is required, and the actual identifier value is passed in right after the &lt;strong&gt;payment_dispute&lt;/strong&gt; resource. See the Resource URI above. |

### Return type

[**FileEvidence**](FileEvidence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

