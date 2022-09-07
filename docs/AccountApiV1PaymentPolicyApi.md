# AccountApiV1PaymentPolicyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentPolicy**](AccountApiV1PaymentPolicyApi.md#createPaymentPolicy) | **POST** /payment_policy | /payment_policy
[**deletePaymentPolicy**](AccountApiV1PaymentPolicyApi.md#deletePaymentPolicy) | **DELETE** /payment_policy/{payment_policy_id} | /payment_policy/{payment_policy_id}
[**getPaymentPolicies**](AccountApiV1PaymentPolicyApi.md#getPaymentPolicies) | **GET** /payment_policy | /payment_policy
[**getPaymentPolicy**](AccountApiV1PaymentPolicyApi.md#getPaymentPolicy) | **GET** /payment_policy/{payment_policy_id} | /payment_policy/{payment_policy_id}
[**getPaymentPolicyByName**](AccountApiV1PaymentPolicyApi.md#getPaymentPolicyByName) | **GET** /payment_policy/get_by_policy_name | /payment_policy/get_by_policy_name
[**updatePaymentPolicy**](AccountApiV1PaymentPolicyApi.md#updatePaymentPolicy) | **PUT** /payment_policy/{payment_policy_id} | /payment_policy/{payment_policy_id}


<a name="createPaymentPolicy"></a>
# **createPaymentPolicy**
> SetPaymentPolicyResponse createPaymentPolicy(paymentPolicyRequest)

/payment_policy

This method creates a new payment policy where the policy encapsulates seller&#39;s terms for order payments.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and category group, and you can create multiple policies for each combination.  &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1PaymentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1PaymentPolicyApi apiInstance = new AccountApiV1PaymentPolicyApi(defaultClient);
    PaymentPolicyRequest paymentPolicyRequest = new PaymentPolicyRequest(); // PaymentPolicyRequest | 
    try {
      SetPaymentPolicyResponse result = apiInstance.createPaymentPolicy(paymentPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1PaymentPolicyApi#createPaymentPolicy");
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
 **paymentPolicyRequest** | [**PaymentPolicyRequest**](PaymentPolicyRequest.md)|  | [optional]

### Return type

[**SetPaymentPolicyResponse**](SetPaymentPolicyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="deletePaymentPolicy"></a>
# **deletePaymentPolicy**
> Object deletePaymentPolicy(paymentPolicyId)

/payment_policy/{payment_policy_id}

This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. 

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1PaymentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1PaymentPolicyApi apiInstance = new AccountApiV1PaymentPolicyApi(defaultClient);
    String paymentPolicyId = "paymentPolicyId_example"; // String | This path parameter specifies the ID of the payment policy you want to delete.
    try {
      Object result = apiInstance.deletePaymentPolicy(paymentPolicyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1PaymentPolicyApi#deletePaymentPolicy");
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
 **paymentPolicyId** | **String**| This path parameter specifies the ID of the payment policy you want to delete. |

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
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="getPaymentPolicies"></a>
# **getPaymentPolicies**
> PaymentPolicyResponse getPaymentPolicies(marketplaceId)

/payment_policy

This method retrieves all the payment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1PaymentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1PaymentPolicyApi apiInstance = new AccountApiV1PaymentPolicyApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    try {
      PaymentPolicyResponse result = apiInstance.getPaymentPolicies(marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1PaymentPolicyApi#getPaymentPolicies");
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
 **marketplaceId** | **String**| This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |

### Return type

[**PaymentPolicyResponse**](PaymentPolicyResponse.md)

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

<a name="getPaymentPolicy"></a>
# **getPaymentPolicy**
> PaymentPolicy getPaymentPolicy(paymentPolicyId)

/payment_policy/{payment_policy_id}

This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1PaymentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1PaymentPolicyApi apiInstance = new AccountApiV1PaymentPolicyApi(defaultClient);
    String paymentPolicyId = "paymentPolicyId_example"; // String | This path parameter specifies the ID of the payment policy you want to retrieve.
    try {
      PaymentPolicy result = apiInstance.getPaymentPolicy(paymentPolicyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1PaymentPolicyApi#getPaymentPolicy");
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
 **paymentPolicyId** | **String**| This path parameter specifies the ID of the payment policy you want to retrieve. |

### Return type

[**PaymentPolicy**](PaymentPolicy.md)

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

<a name="getPaymentPolicyByName"></a>
# **getPaymentPolicyByName**
> PaymentPolicy getPaymentPolicyByName(marketplaceId, name)

/payment_policy/get_by_policy_name

This method retrieves the details of a specific payment policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1PaymentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1PaymentPolicyApi apiInstance = new AccountApiV1PaymentPolicyApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    String name = "name_example"; // String | This query parameter specifies the seller-defined name of the payment policy you want to retrieve.
    try {
      PaymentPolicy result = apiInstance.getPaymentPolicyByName(marketplaceId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1PaymentPolicyApi#getPaymentPolicyByName");
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
 **marketplaceId** | **String**| This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |
 **name** | **String**| This query parameter specifies the seller-defined name of the payment policy you want to retrieve. |

### Return type

[**PaymentPolicy**](PaymentPolicy.md)

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

<a name="updatePaymentPolicy"></a>
# **updatePaymentPolicy**
> SetPaymentPolicyResponse updatePaymentPolicy(paymentPolicyId, paymentPolicyRequest)

/payment_policy/{payment_policy_id}

This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1PaymentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1PaymentPolicyApi apiInstance = new AccountApiV1PaymentPolicyApi(defaultClient);
    String paymentPolicyId = "paymentPolicyId_example"; // String | This path parameter specifies the ID of the payment policy you want to update.
    PaymentPolicyRequest paymentPolicyRequest = new PaymentPolicyRequest(); // PaymentPolicyRequest | 
    try {
      SetPaymentPolicyResponse result = apiInstance.updatePaymentPolicy(paymentPolicyId, paymentPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1PaymentPolicyApi#updatePaymentPolicy");
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
 **paymentPolicyId** | **String**| This path parameter specifies the ID of the payment policy you want to update. |
 **paymentPolicyRequest** | [**PaymentPolicyRequest**](PaymentPolicyRequest.md)|  | [optional]

### Return type

[**SetPaymentPolicyResponse**](SetPaymentPolicyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

