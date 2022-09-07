# AccountApiV1FulfillmentPolicyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFulfillmentPolicy**](AccountApiV1FulfillmentPolicyApi.md#createFulfillmentPolicy) | **POST** /fulfillment_policy/ | /fulfillment_policy/
[**deleteFulfillmentPolicy**](AccountApiV1FulfillmentPolicyApi.md#deleteFulfillmentPolicy) | **DELETE** /fulfillment_policy/{fulfillmentPolicyId} | /fulfillment_policy/{fulfillmentPolicyId}
[**getFulfillmentPolicies**](AccountApiV1FulfillmentPolicyApi.md#getFulfillmentPolicies) | **GET** /fulfillment_policy | /fulfillment_policy
[**getFulfillmentPolicy**](AccountApiV1FulfillmentPolicyApi.md#getFulfillmentPolicy) | **GET** /fulfillment_policy/{fulfillmentPolicyId} | /fulfillment_policy/{fulfillmentPolicyId}
[**getFulfillmentPolicyByName**](AccountApiV1FulfillmentPolicyApi.md#getFulfillmentPolicyByName) | **GET** /fulfillment_policy/get_by_policy_name | /fulfillment_policy/get_by_policy_name
[**updateFulfillmentPolicy**](AccountApiV1FulfillmentPolicyApi.md#updateFulfillmentPolicy) | **PUT** /fulfillment_policy/{fulfillmentPolicyId} | /fulfillment_policy/{fulfillmentPolicyId}


<a name="createFulfillmentPolicy"></a>
# **createFulfillmentPolicy**
> SetFulfillmentPolicyResponse createFulfillmentPolicy(fulfillmentPolicyRequest)

/fulfillment_policy/

This method creates a new fulfillment policy where the policy encapsulates seller&#39;s terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and a category group type, and you can create multiple policies for each combination. &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getFulfillmentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Using the eBay standard envelope service (eSE)&lt;/b&gt;&lt;/p&gt;  &lt;p&gt;The eBay standard envelope service (eSE) is a domestic envelope service with tracking through eBay. This service applies to specific Trading Cards categories (not all categories are supported), and to Coins &amp; Paper Money, Postcards, and Stamps. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Using the eBay standard envelope (eSE) service&lt;/a&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1FulfillmentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1FulfillmentPolicyApi apiInstance = new AccountApiV1FulfillmentPolicyApi(defaultClient);
    FulfillmentPolicyRequest fulfillmentPolicyRequest = new FulfillmentPolicyRequest(); // FulfillmentPolicyRequest | 
    try {
      SetFulfillmentPolicyResponse result = apiInstance.createFulfillmentPolicy(fulfillmentPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1FulfillmentPolicyApi#createFulfillmentPolicy");
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
 **fulfillmentPolicyRequest** | [**FulfillmentPolicyRequest**](FulfillmentPolicyRequest.md)|  | [optional]

### Return type

[**SetFulfillmentPolicyResponse**](SetFulfillmentPolicyResponse.md)

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

<a name="deleteFulfillmentPolicy"></a>
# **deleteFulfillmentPolicy**
> Object deleteFulfillmentPolicy(fulfillmentPolicyId)

/fulfillment_policy/{fulfillmentPolicyId}

This method deletes a fulfillment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;fulfillmentPolicyId&lt;/b&gt; path parameter.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1FulfillmentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1FulfillmentPolicyApi apiInstance = new AccountApiV1FulfillmentPolicyApi(defaultClient);
    String fulfillmentPolicyId = "fulfillmentPolicyId_example"; // String | This path parameter specifies the ID of the fulfillment policy to delete.
    try {
      Object result = apiInstance.deleteFulfillmentPolicy(fulfillmentPolicyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1FulfillmentPolicyApi#deleteFulfillmentPolicy");
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
 **fulfillmentPolicyId** | **String**| This path parameter specifies the ID of the fulfillment policy to delete. |

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

<a name="getFulfillmentPolicies"></a>
# **getFulfillmentPolicies**
> FulfillmentPolicyResponse getFulfillmentPolicies(marketplaceId)

/fulfillment_policy

This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1FulfillmentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1FulfillmentPolicyApi apiInstance = new AccountApiV1FulfillmentPolicyApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    try {
      FulfillmentPolicyResponse result = apiInstance.getFulfillmentPolicies(marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1FulfillmentPolicyApi#getFulfillmentPolicies");
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

[**FulfillmentPolicyResponse**](FulfillmentPolicyResponse.md)

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

<a name="getFulfillmentPolicy"></a>
# **getFulfillmentPolicy**
> FulfillmentPolicy getFulfillmentPolicy(fulfillmentPolicyId)

/fulfillment_policy/{fulfillmentPolicyId}

This method retrieves the complete details of a fulfillment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;fulfillmentPolicyId&lt;/b&gt; path parameter.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1FulfillmentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1FulfillmentPolicyApi apiInstance = new AccountApiV1FulfillmentPolicyApi(defaultClient);
    String fulfillmentPolicyId = "fulfillmentPolicyId_example"; // String | This path parameter specifies the ID of the fulfillment policy you want to retrieve.
    try {
      FulfillmentPolicy result = apiInstance.getFulfillmentPolicy(fulfillmentPolicyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1FulfillmentPolicyApi#getFulfillmentPolicy");
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
 **fulfillmentPolicyId** | **String**| This path parameter specifies the ID of the fulfillment policy you want to retrieve. |

### Return type

[**FulfillmentPolicy**](FulfillmentPolicy.md)

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

<a name="getFulfillmentPolicyByName"></a>
# **getFulfillmentPolicyByName**
> FulfillmentPolicy getFulfillmentPolicyByName(marketplaceId, name)

/fulfillment_policy/get_by_policy_name

This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1FulfillmentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1FulfillmentPolicyApi apiInstance = new AccountApiV1FulfillmentPolicyApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    String name = "name_example"; // String | This query parameter specifies the seller-defined name of the fulfillment policy you want to retrieve.
    try {
      FulfillmentPolicy result = apiInstance.getFulfillmentPolicyByName(marketplaceId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1FulfillmentPolicyApi#getFulfillmentPolicyByName");
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
 **name** | **String**| This query parameter specifies the seller-defined name of the fulfillment policy you want to retrieve. |

### Return type

[**FulfillmentPolicy**](FulfillmentPolicy.md)

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

<a name="updateFulfillmentPolicy"></a>
# **updateFulfillmentPolicy**
> SetFulfillmentPolicyResponse updateFulfillmentPolicy(fulfillmentPolicyId, fulfillmentPolicyRequest)

/fulfillment_policy/{fulfillmentPolicyId}

This method updates an existing fulfillment policy. Specify the policy you want to update using the &lt;b&gt;fulfillment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1FulfillmentPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1FulfillmentPolicyApi apiInstance = new AccountApiV1FulfillmentPolicyApi(defaultClient);
    String fulfillmentPolicyId = "fulfillmentPolicyId_example"; // String | This path parameter specifies the ID of the fulfillment policy you want to update.
    FulfillmentPolicyRequest fulfillmentPolicyRequest = new FulfillmentPolicyRequest(); // FulfillmentPolicyRequest | 
    try {
      SetFulfillmentPolicyResponse result = apiInstance.updateFulfillmentPolicy(fulfillmentPolicyId, fulfillmentPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1FulfillmentPolicyApi#updateFulfillmentPolicy");
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
 **fulfillmentPolicyId** | **String**| This path parameter specifies the ID of the fulfillment policy you want to update. |
 **fulfillmentPolicyRequest** | [**FulfillmentPolicyRequest**](FulfillmentPolicyRequest.md)|  | [optional]

### Return type

[**SetFulfillmentPolicyResponse**](SetFulfillmentPolicyResponse.md)

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

