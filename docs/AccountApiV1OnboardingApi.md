# AccountApiV1OnboardingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentsProgramOnboarding**](AccountApiV1OnboardingApi.md#getPaymentsProgramOnboarding) | **GET** /payments_program/{marketplace_id}/{payments_program_type}/onboarding | /payments_program/{marketplace_id}/{payments_program_type}/onboarding


<a name="getPaymentsProgramOnboarding"></a>
# **getPaymentsProgramOnboarding**
> PaymentsProgramOnboardingResponse getPaymentsProgramOnboarding(marketplaceId, paymentsProgramType)

/payments_program/{marketplace_id}/{payments_program_type}/onboarding

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1OnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1OnboardingApi apiInstance = new AccountApiV1OnboardingApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | The eBay marketplace ID associated with the onboarding status to retrieve.
    String paymentsProgramType = "paymentsProgramType_example"; // String | The type of payments program whose status is returned by the method.
    try {
      PaymentsProgramOnboardingResponse result = apiInstance.getPaymentsProgramOnboarding(marketplaceId, paymentsProgramType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1OnboardingApi#getPaymentsProgramOnboarding");
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
 **marketplaceId** | **String**| The eBay marketplace ID associated with the onboarding status to retrieve. |
 **paymentsProgramType** | **String**| The type of payments program whose status is returned by the method. |

### Return type

[**PaymentsProgramOnboardingResponse**](PaymentsProgramOnboardingResponse.md)

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
**500** | Internal Server Error |  -  |

