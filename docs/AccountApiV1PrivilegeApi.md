# AccountApiV1PrivilegeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrivileges**](AccountApiV1PrivilegeApi.md#getPrivileges) | **GET** /privilege | /privilege


<a name="getPrivileges"></a>
# **getPrivileges**
> SellingPrivileges getPrivileges()

/privilege

This method retrieves the seller&#39;s current set of privileges, including whether or not the seller&#39;s eBay registration has been completed, as well as the details of their site-wide &lt;b&gt;sellingLimt&lt;/b&gt; (the amount and quantity they can sell on a given day).

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1PrivilegeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1PrivilegeApi apiInstance = new AccountApiV1PrivilegeApi(defaultClient);
    try {
      SellingPrivileges result = apiInstance.getPrivileges();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1PrivilegeApi#getPrivileges");
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

[**SellingPrivileges**](SellingPrivileges.md)

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

