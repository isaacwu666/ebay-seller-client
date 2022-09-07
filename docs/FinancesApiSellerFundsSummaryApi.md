# FinancesApiSellerFundsSummaryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSellerFundsSummary**](FinancesApiSellerFundsSummaryApi.md#getSellerFundsSummary) | **GET** /seller_funds_summary | /seller_funds_summary


<a name="getSellerFundsSummary"></a>
# **getSellerFundsSummary**
> SellerFundsSummaryResponse getSellerFundsSummary()

/seller_funds_summary

This method retrieves all pending funds that have not yet been distibuted through a seller payout.&lt;br&gt;&lt;br&gt;There are no input parameters for this method. The response payload includes available funds, funds being processed, funds on hold, and also an aggregate count of all three of these categories.&lt;br&gt;&lt;br&gt;If there are no funds that are pending, on hold, or being processed for the seller&#39;s account, no response payload is returned, and an http status code of &lt;code&gt;204 - No Content&lt;/code&gt; is returned instead.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FinancesApiSellerFundsSummaryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FinancesApiSellerFundsSummaryApi apiInstance = new FinancesApiSellerFundsSummaryApi(defaultClient);
    try {
      SellerFundsSummaryResponse result = apiInstance.getSellerFundsSummary();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FinancesApiSellerFundsSummaryApi#getSellerFundsSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SellerFundsSummaryResponse**](SellerFundsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**204** | No Content |  -  |
**500** | Internal Server Error |  -  |

