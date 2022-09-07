# FinancesApiTransferApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransfer**](FinancesApiTransferApi.md#getTransfer) | **GET** /transfer/{transfer_Id} | /transfer/{transfer_Id}


<a name="getTransfer"></a>
# **getTransfer**
> Transfer getTransfer(transferId)

/transfer/{transfer_Id}

This method retrieves detailed information regarding a &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. A &lt;code&gt;TRANSFER&lt;/code&gt; is a  monetary transaction type that involves a seller transferring money to eBay for reimbursement of one or more charges. For example, when a seller reimburses eBay for a buyer refund.&lt;br&gt;&lt;br&gt;If an ID is passed into the URI that is an identifier for another transaction type, this call will return an http status code of &lt;code&gt;404 Not found&lt;/code&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FinancesApiTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FinancesApiTransferApi apiInstance = new FinancesApiTransferApi(defaultClient);
    String transferId = "transferId_example"; // String | The unique identifier of the <code>TRANSFER</code> transaction type you wish to retrieve.
    try {
      Transfer result = apiInstance.getTransfer(transferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancesApiTransferApi#getTransfer");
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
 **transferId** | **String**| The unique identifier of the &lt;code&gt;TRANSFER&lt;/code&gt; transaction type you wish to retrieve. |

### Return type

[**Transfer**](Transfer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad Request |  -  |
**404** | Not found. |  -  |
**500** | Internal Server Error. |  -  |

