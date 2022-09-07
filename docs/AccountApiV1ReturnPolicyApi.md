# AccountApiV1ReturnPolicyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReturnPolicy**](AccountApiV1ReturnPolicyApi.md#createReturnPolicy) | **POST** /return_policy | /return_policy
[**deleteReturnPolicy**](AccountApiV1ReturnPolicyApi.md#deleteReturnPolicy) | **DELETE** /return_policy/{return_policy_id} | /return_policy/{return_policy_id}
[**getReturnPolicies**](AccountApiV1ReturnPolicyApi.md#getReturnPolicies) | **GET** /return_policy | /return_policy
[**getReturnPolicy**](AccountApiV1ReturnPolicyApi.md#getReturnPolicy) | **GET** /return_policy/{return_policy_id} | /return_policy/{return_policy_id}
[**getReturnPolicyByName**](AccountApiV1ReturnPolicyApi.md#getReturnPolicyByName) | **GET** /return_policy/get_by_policy_name | /return_policy/get_by_policy_name
[**updateReturnPolicy**](AccountApiV1ReturnPolicyApi.md#updateReturnPolicy) | **PUT** /return_policy/{return_policy_id} | /return_policy/{return_policy_id}


<a name="createReturnPolicy"></a>
# **createReturnPolicy**
> SetReturnPolicyResponse createReturnPolicy(returnPolicyRequest)

/return_policy

This method creates a new return policy where the policy encapsulates seller&#39;s terms for returning items.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.&lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getReturnPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ReturnPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ReturnPolicyApi apiInstance = new AccountApiV1ReturnPolicyApi(defaultClient);
    ReturnPolicyRequest returnPolicyRequest = new ReturnPolicyRequest(); // ReturnPolicyRequest | 
    try {
      SetReturnPolicyResponse result = apiInstance.createReturnPolicy(returnPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ReturnPolicyApi#createReturnPolicy");
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
 **returnPolicyRequest** | [**ReturnPolicyRequest**](ReturnPolicyRequest.md)|  | [optional]

### Return type

[**SetReturnPolicyResponse**](SetReturnPolicyResponse.md)

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

<a name="deleteReturnPolicy"></a>
# **deleteReturnPolicy**
> Object deleteReturnPolicy(returnPolicyId)

/return_policy/{return_policy_id}

This method deletes a return policy. Supply the ID of the policy you want to delete in the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ReturnPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ReturnPolicyApi apiInstance = new AccountApiV1ReturnPolicyApi(defaultClient);
    String returnPolicyId = "returnPolicyId_example"; // String | This path parameter specifies the ID of the return policy you want to delete.
    try {
      Object result = apiInstance.deleteReturnPolicy(returnPolicyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ReturnPolicyApi#deleteReturnPolicy");
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
 **returnPolicyId** | **String**| This path parameter specifies the ID of the return policy you want to delete. |

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

<a name="getReturnPolicies"></a>
# **getReturnPolicies**
> ReturnPolicyResponse getReturnPolicies(marketplaceId)

/return_policy

This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ReturnPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ReturnPolicyApi apiInstance = new AccountApiV1ReturnPolicyApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    try {
      ReturnPolicyResponse result = apiInstance.getReturnPolicies(marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ReturnPolicyApi#getReturnPolicies");
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
 **marketplaceId** | **String**| This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |

### Return type

[**ReturnPolicyResponse**](ReturnPolicyResponse.md)

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

<a name="getReturnPolicy"></a>
# **getReturnPolicy**
> ReturnPolicy getReturnPolicy(returnPolicyId)

/return_policy/{return_policy_id}

This method retrieves the complete details of the return policy specified by the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ReturnPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ReturnPolicyApi apiInstance = new AccountApiV1ReturnPolicyApi(defaultClient);
    String returnPolicyId = "returnPolicyId_example"; // String | This path parameter specifies the of the return policy you want to retrieve.
    try {
      ReturnPolicy result = apiInstance.getReturnPolicy(returnPolicyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ReturnPolicyApi#getReturnPolicy");
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
 **returnPolicyId** | **String**| This path parameter specifies the of the return policy you want to retrieve. |

### Return type

[**ReturnPolicy**](ReturnPolicy.md)

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

<a name="getReturnPolicyByName"></a>
# **getReturnPolicyByName**
> ReturnPolicy getReturnPolicyByName(marketplaceId, name)

/return_policy/get_by_policy_name

This method retrieves the details of a specific return policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ReturnPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ReturnPolicyApi apiInstance = new AccountApiV1ReturnPolicyApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    String name = "name_example"; // String | This query parameter specifies the seller-defined name of the return policy you want to retrieve.
    try {
      ReturnPolicy result = apiInstance.getReturnPolicyByName(marketplaceId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ReturnPolicyApi#getReturnPolicyByName");
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
 **marketplaceId** | **String**| This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum |
 **name** | **String**| This query parameter specifies the seller-defined name of the return policy you want to retrieve. |

### Return type

[**ReturnPolicy**](ReturnPolicy.md)

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

<a name="updateReturnPolicy"></a>
# **updateReturnPolicy**
> SetReturnPolicyResponse updateReturnPolicy(returnPolicyId, returnPolicyRequest)

/return_policy/{return_policy_id}

This method updates an existing return policy. Specify the policy you want to update using the &lt;b&gt;return_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ReturnPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ReturnPolicyApi apiInstance = new AccountApiV1ReturnPolicyApi(defaultClient);
    String returnPolicyId = "returnPolicyId_example"; // String | This path parameter specifies the ID of the return policy you want to update.
    ReturnPolicyRequest returnPolicyRequest = new ReturnPolicyRequest(); // ReturnPolicyRequest | 
    try {
      SetReturnPolicyResponse result = apiInstance.updateReturnPolicy(returnPolicyId, returnPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ReturnPolicyApi#updateReturnPolicy");
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
 **returnPolicyId** | **String**| This path parameter specifies the ID of the return policy you want to update. |
 **returnPolicyRequest** | [**ReturnPolicyRequest**](ReturnPolicyRequest.md)|  | [optional]

### Return type

[**SetReturnPolicyResponse**](SetReturnPolicyResponse.md)

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

