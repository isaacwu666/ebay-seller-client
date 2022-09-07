# AccountApiV1AdvertisingEligibilityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdvertisingEligibility**](AccountApiV1AdvertisingEligibilityApi.md#getAdvertisingEligibility) | **GET** /advertising_eligibility | /advertising_eligibility


<a name="getAdvertisingEligibility"></a>
# **getAdvertisingEligibility**
> SellerEligibilityMultiProgramResponse getAdvertisingEligibility(X_EBAY_C_MARKETPLACE_ID, programTypes)

/advertising_eligibility

This method allows developers to check the seller eligibility status for eBay advertising programs.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1AdvertisingEligibilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1AdvertisingEligibilityApi apiInstance = new AccountApiV1AdvertisingEligibilityApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | The unique identifier of the eBay marketplace for which the seller eligibility status shall be checked.<br /><br /><span class=\"tablenote\"><b>Note:</b> This value is case-sensitive.</span>
    String programTypes = "programTypes_example"; // String | A comma-separated list of eBay advertising programs.<br /><br /><span class=\"tablenote\"><b>Tip:</b> See the <a href=\"/api-docs/sell/account/types/plser:AdvertisingProgramEnum\"> AdvertisingProgramEnum</a> type for possible values.</span><br /><br />If no programs are specified, the results will be returned for all programs.
    try {
      SellerEligibilityMultiProgramResponse result = apiInstance.getAdvertisingEligibility(X_EBAY_C_MARKETPLACE_ID, programTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1AdvertisingEligibilityApi#getAdvertisingEligibility");
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
 **X_EBAY_C_MARKETPLACE_ID** | **String**| The unique identifier of the eBay marketplace for which the seller eligibility status shall be checked.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This value is case-sensitive.&lt;/span&gt; |
 **programTypes** | **String**| A comma-separated list of eBay advertising programs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; See the &lt;a href&#x3D;\&quot;/api-docs/sell/account/types/plser:AdvertisingProgramEnum\&quot;&gt; AdvertisingProgramEnum&lt;/a&gt; type for possible values.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;If no programs are specified, the results will be returned for all programs. | [optional]

### Return type

[**SellerEligibilityMultiProgramResponse**](SellerEligibilityMultiProgramResponse.md)

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

