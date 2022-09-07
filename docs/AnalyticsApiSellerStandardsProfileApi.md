# AnalyticsApiSellerStandardsProfileApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findSellerStandardsProfiles**](AnalyticsApiSellerStandardsProfileApi.md#findSellerStandardsProfiles) | **GET** /seller_standards_profile | /seller_standards_profile
[**getSellerStandardsProfile**](AnalyticsApiSellerStandardsProfileApi.md#getSellerStandardsProfile) | **GET** /seller_standards_profile/{program}/{cycle} | /seller_standards_profile/{program}/{cycle}


<a name="findSellerStandardsProfiles"></a>
# **findSellerStandardsProfiles**
> FindSellerStandardsProfilesResponse findSellerStandardsProfiles()

/seller_standards_profile

This call retrieves all the standards profiles for the associated seller. A standards profile is a set of eBay seller metrics and the seller&#39;s associated compliance values (either TOP_RATED, ABOVE_STANDARD, or BELOW_STANDARD). A seller&#39;s multiple profiles are distinguished by two criteria, a &amp;quot;program&amp;quot; and a &amp;quot;cycle.&amp;quot; A profile&#39;s program is one of three regions where the seller may have done business, or PROGRAM_GLOBAL to indicate all marketplaces where the seller has done business. The cycle value specifies whether the standards compliance values were determined at the last official eBay evaluation or at the time of the request.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AnalyticsApiSellerStandardsProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AnalyticsApiSellerStandardsProfileApi apiInstance = new AnalyticsApiSellerStandardsProfileApi(defaultClient);
    try {
      FindSellerStandardsProfilesResponse result = apiInstance.findSellerStandardsProfiles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApiSellerStandardsProfileApi#findSellerStandardsProfiles");
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

[**FindSellerStandardsProfilesResponse**](FindSellerStandardsProfilesResponse.md)

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

<a name="getSellerStandardsProfile"></a>
# **getSellerStandardsProfile**
> StandardsProfile getSellerStandardsProfile(cycle, program)

/seller_standards_profile/{program}/{cycle}

This call retrieves a single standards profile for the associated seller. A standards profile is a set of eBay seller metrics and the seller&#39;s associated compliance values (either TOP_RATED, ABOVE_STANDARD, or BELOW_STANDARD). A seller can have multiple profiles distinguished by two criteria, a &amp;quot;program&amp;quot; and a &amp;quot;cycle.&amp;quot; A profile&#39;s program is one of three regions where the seller may have done business, or PROGRAM_GLOBAL to indicate all marketplaces where the seller has done business. The cycle value specifies whether the standards compliance values were determined at the last official eBay evaluation (CURRENT) or at the time of the request (PROJECTED). Both cycle and a program values are required URI parameters for this method.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AnalyticsApiSellerStandardsProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AnalyticsApiSellerStandardsProfileApi apiInstance = new AnalyticsApiSellerStandardsProfileApi(defaultClient);
    String cycle = "cycle_example"; // String | The period covered by the returned standards profile evaluation. Supply one of two values, CURRENT means the response reflects eBay's most recent monthly standards evaluation and PROJECTED means the response reflect the seller's projected monthly evaluation, as calculated at the time of the request.
    String program = "program_example"; // String | This input value specifies the region used to determine the seller's standards profile. Supply one of the four following values, PROGRAM_DE, PROGRAM_UK, PROGRAM_US, or PROGRAM_GLOBAL.
    try {
      StandardsProfile result = apiInstance.getSellerStandardsProfile(cycle, program);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApiSellerStandardsProfileApi#getSellerStandardsProfile");
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
 **cycle** | **String**| The period covered by the returned standards profile evaluation. Supply one of two values, CURRENT means the response reflects eBay&#39;s most recent monthly standards evaluation and PROJECTED means the response reflect the seller&#39;s projected monthly evaluation, as calculated at the time of the request. |
 **program** | **String**| This input value specifies the region used to determine the seller&#39;s standards profile. Supply one of the four following values, PROGRAM_DE, PROGRAM_UK, PROGRAM_US, or PROGRAM_GLOBAL. |

### Return type

[**StandardsProfile**](StandardsProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**204** | No content |  -  |
**400** | Bad Request |  -  |
**404** | Resource not found |  -  |
**500** | Internal Server Error |  -  |

