# AccountApiV1CustomPolicyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomPolicy**](AccountApiV1CustomPolicyApi.md#createCustomPolicy) | **POST** /custom_policy/ | /custom_policy/
[**getCustomPolicies**](AccountApiV1CustomPolicyApi.md#getCustomPolicies) | **GET** /custom_policy/ | /custom_policy/
[**getCustomPolicy**](AccountApiV1CustomPolicyApi.md#getCustomPolicy) | **GET** /custom_policy/{custom_policy_id} | /custom_policy/{custom_policy_id}
[**updateCustomPolicy**](AccountApiV1CustomPolicyApi.md#updateCustomPolicy) | **PUT** /custom_policy/{custom_policy_id} | /custom_policy/{custom_policy_id}


<a name="createCustomPolicy"></a>
# **createCustomPolicy**
> Object createCustomPolicy(X_EBAY_C_MARKETPLACE_ID, customPolicyCreateRequest)

/custom_policy/

This method creates a new custom policy in which a seller specifies their terms for complying with local governmental regulations. &lt;br/&gt;&lt;br/&gt;Two Custom Policy types are supported: &lt;ul&gt;&lt;li&gt;Product Compliance (PRODUCT_COMPLIANCE)&lt;/li&gt; &lt;li&gt;Takeback (TAKE_BACK)&lt;/li&gt;&lt;/ul&gt;Each Custom Policy targets a &lt;b&gt;policyType&lt;/b&gt; and &lt;b&gt;eBay marketplace&lt;/b&gt; combination. Multiple policies may be created as follows: &lt;ul&gt;&lt;li&gt;&lt;b&gt;Product Compliance&lt;/b&gt;: a maximum of 10 policies per eBay marketplace may be created&lt;/li&gt; &lt;li&gt;&lt;b&gt;Takeback&lt;/b&gt;: a maximum of 3 policies per eBay marketplace may be created&lt;/li&gt;&lt;/ul&gt;A successful create policy call returns an HTTP status code of &lt;b&gt;201 Created&lt;/b&gt; with the system-generated policy ID included in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Product Compliance Policy&lt;/b&gt;&lt;br/&gt;&lt;br/&gt;Product Compliance policies disclose product information as required for regulatory compliance.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 10 Product Compliance policies per eBay marketplace may be created.&lt;/span&gt; &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Takeback Policy&lt;/b&gt;&lt;br/&gt;&lt;br/&gt;Takeback policies describe the seller&#39;s legal obligation to take back a previously purchased item when the buyer purchases a new one.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A maximum of 3 Takeback policies per eBay marketplace may be created.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1CustomPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1CustomPolicyApi apiInstance = new AccountApiV1CustomPolicyApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span>
    CustomPolicyCreateRequest customPolicyCreateRequest = new CustomPolicyCreateRequest(); // CustomPolicyCreateRequest | 
    try {
      Object result = apiInstance.createCustomPolicy(X_EBAY_C_MARKETPLACE_ID, customPolicyCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1CustomPolicyApi#createCustomPolicy");
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
 **X_EBAY_C_MARKETPLACE_ID** | **String**| This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the &lt;a href&#x3D;\&quot;/api-docs/sell/account/types/ba:MarketplaceIdEnum\&quot; target&#x3D;\&quot;_blank\&quot;&gt;MarketplaceIdEnum&lt;/a&gt; type definition.&lt;br/&gt; &lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The following eBay marketplaces support Custom Policies: &lt;ul&gt;&lt;li&gt;Germany (EBAY_DE)&lt;/li&gt; &lt;li&gt;Canada (EBAY_CA)&lt;/li&gt; &lt;li&gt;Australia (EBAY_AU)&lt;/li&gt; &lt;li&gt;United States (EBAY_US)&lt;/li&gt; &lt;li&gt;France (EBAY_FR)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt; |
 **customPolicyCreateRequest** | [**CustomPolicyCreateRequest**](CustomPolicyCreateRequest.md)|  | [optional]

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
**201** | Created |  -  |
**400** | Bad Request |  -  |
**409** | Policy Name already used/ Maximum no of policies per site reached |  -  |
**500** | Internal Server Error |  -  |

<a name="getCustomPolicies"></a>
# **getCustomPolicies**
> CustomPolicyResponse getCustomPolicies(X_EBAY_C_MARKETPLACE_ID, policyTypes)

/custom_policy/

This method retrieves the list of custom policies specified by the &lt;b&gt;policy_types&lt;/b&gt; query parameter for the selected eBay marketplace.&lt;br/&gt; &lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The following eBay marketplaces support Custom Policies: &lt;ul&gt;&lt;li&gt;Germany (EBAY_DE)&lt;/li&gt; &lt;li&gt;Canada (EBAY_CA)&lt;/li&gt; &lt;li&gt;Australia (EBAY_AU)&lt;/li&gt; &lt;li&gt;United States (EBAY_US)&lt;/li&gt; &lt;li&gt;France (EBAY_FR)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1CustomPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1CustomPolicyApi apiInstance = new AccountApiV1CustomPolicyApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span>
    String policyTypes = "policyTypes_example"; // String | This query parameter specifies the type of custom policies to be returned.<br /><br />Multiple policy types may be requested in a single call by providing a comma-delimited set of all policy types to be returned.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> Omitting this query parameter from a request will also return policies of all policy types.</span><br/><br/>Two Custom Policy types are supported: <ul><li>Product Compliance (PRODUCT_COMPLIANCE)</li> <li>Takeback (TAKE_BACK)</li></ul>
    try {
      CustomPolicyResponse result = apiInstance.getCustomPolicies(X_EBAY_C_MARKETPLACE_ID, policyTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1CustomPolicyApi#getCustomPolicies");
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
 **X_EBAY_C_MARKETPLACE_ID** | **String**| This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the &lt;a href&#x3D;\&quot;/api-docs/sell/account/types/ba:MarketplaceIdEnum\&quot; target&#x3D;\&quot;_blank\&quot;&gt;MarketplaceIdEnum&lt;/a&gt; type definition.&lt;br/&gt; &lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The following eBay marketplaces support Custom Policies: &lt;ul&gt;&lt;li&gt;Germany (EBAY_DE)&lt;/li&gt; &lt;li&gt;Canada (EBAY_CA)&lt;/li&gt; &lt;li&gt;Australia (EBAY_AU)&lt;/li&gt; &lt;li&gt;United States (EBAY_US)&lt;/li&gt; &lt;li&gt;France (EBAY_FR)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt; |
 **policyTypes** | **String**| This query parameter specifies the type of custom policies to be returned.&lt;br /&gt;&lt;br /&gt;Multiple policy types may be requested in a single call by providing a comma-delimited set of all policy types to be returned.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Omitting this query parameter from a request will also return policies of all policy types.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;Two Custom Policy types are supported: &lt;ul&gt;&lt;li&gt;Product Compliance (PRODUCT_COMPLIANCE)&lt;/li&gt; &lt;li&gt;Takeback (TAKE_BACK)&lt;/li&gt;&lt;/ul&gt; | [optional]

### Return type

[**CustomPolicyResponse**](CustomPolicyResponse.md)

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

<a name="getCustomPolicy"></a>
# **getCustomPolicy**
> CustomPolicy getCustomPolicy(customPolicyId, X_EBAY_C_MARKETPLACE_ID)

/custom_policy/{custom_policy_id}

This method retrieves the custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter for the selected eBay marketplace.&lt;br/&gt; &lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The following eBay marketplaces support Custom Policies: &lt;ul&gt;&lt;li&gt;Germany (EBAY_DE)&lt;/li&gt; &lt;li&gt;Canada (EBAY_CA)&lt;/li&gt; &lt;li&gt;Australia (EBAY_AU)&lt;/li&gt; &lt;li&gt;United States (EBAY_US)&lt;/li&gt; &lt;li&gt;France (EBAY_FR)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1CustomPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1CustomPolicyApi apiInstance = new AccountApiV1CustomPolicyApi(defaultClient);
    String customPolicyId = "customPolicyId_example"; // String | This path parameter is the unique custom policy identifier for the policy to be returned.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> This value is automatically assigned by the system when the policy is created.</span>
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span>
    try {
      CustomPolicy result = apiInstance.getCustomPolicy(customPolicyId, X_EBAY_C_MARKETPLACE_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1CustomPolicyApi#getCustomPolicy");
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
 **customPolicyId** | **String**| This path parameter is the unique custom policy identifier for the policy to be returned.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This value is automatically assigned by the system when the policy is created.&lt;/span&gt; |
 **X_EBAY_C_MARKETPLACE_ID** | **String**| This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the &lt;a href&#x3D;\&quot;/api-docs/sell/account/types/ba:MarketplaceIdEnum\&quot; target&#x3D;\&quot;_blank\&quot;&gt;MarketplaceIdEnum&lt;/a&gt; type definition.&lt;br/&gt; &lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The following eBay marketplaces support Custom Policies: &lt;ul&gt;&lt;li&gt;Germany (EBAY_DE)&lt;/li&gt; &lt;li&gt;Canada (EBAY_CA)&lt;/li&gt; &lt;li&gt;Australia (EBAY_AU)&lt;/li&gt; &lt;li&gt;United States (EBAY_US)&lt;/li&gt; &lt;li&gt;France (EBAY_FR)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt; |

### Return type

[**CustomPolicy**](CustomPolicy.md)

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

<a name="updateCustomPolicy"></a>
# **updateCustomPolicy**
> Object updateCustomPolicy(customPolicyId, X_EBAY_C_MARKETPLACE_ID, customPolicyRequest)

/custom_policy/{custom_policy_id}

This method updates an existing custom policy specified by the &lt;b&gt;custom_policy_id&lt;/b&gt; path parameter for the selected marketplace. This method overwrites the policy&#39;s &lt;b&gt;Name&lt;/b&gt;, &lt;b&gt;Label&lt;/b&gt;, and &lt;b&gt;Description&lt;/b&gt; fields. Therefore, the complete, current text of all three policy fields must be included in the request payload even when one or two of these fields will not actually be updated.&lt;br/&gt; &lt;br/&gt;For example, the value for the &lt;b&gt;Label&lt;/b&gt; field is to be updated, but the &lt;b&gt;Name&lt;/b&gt; and &lt;b&gt;Description&lt;/b&gt; values will remain unchanged. The existing &lt;b&gt;Name&lt;/b&gt; and &lt;b&gt;Description&lt;/b&gt; values, as they are defined in the current policy, must also be passed in. &lt;br/&gt;&lt;br/&gt;A successful policy update call returns an HTTP status code of &lt;b&gt;204 No Content&lt;/b&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The following eBay marketplaces support Custom Policies: &lt;ul&gt;&lt;li&gt;Germany (EBAY_DE)&lt;/li&gt; &lt;li&gt;Canada (EBAY_CA)&lt;/li&gt; &lt;li&gt;Australia (EBAY_AU)&lt;/li&gt; &lt;li&gt;United States (EBAY_US)&lt;/li&gt; &lt;li&gt;France (EBAY_FR)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1CustomPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1CustomPolicyApi apiInstance = new AccountApiV1CustomPolicyApi(defaultClient);
    String customPolicyId = "customPolicyId_example"; // String | This path parameter is the unique custom policy identifier for the policy to be returned.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> This value is automatically assigned by the system when the policy is created.</span>
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span>
    CustomPolicyRequest customPolicyRequest = new CustomPolicyRequest(); // CustomPolicyRequest | 
    try {
      Object result = apiInstance.updateCustomPolicy(customPolicyId, X_EBAY_C_MARKETPLACE_ID, customPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1CustomPolicyApi#updateCustomPolicy");
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
 **customPolicyId** | **String**| This path parameter is the unique custom policy identifier for the policy to be returned.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This value is automatically assigned by the system when the policy is created.&lt;/span&gt; |
 **X_EBAY_C_MARKETPLACE_ID** | **String**| This header parameter specifies the eBay markeplace for the custom policy that is being created. Supported values for this header can be found in the &lt;a href&#x3D;\&quot;/api-docs/sell/account/types/ba:MarketplaceIdEnum\&quot; target&#x3D;\&quot;_blank\&quot;&gt;MarketplaceIdEnum&lt;/a&gt; type definition.&lt;br/&gt; &lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The following eBay marketplaces support Custom Policies: &lt;ul&gt;&lt;li&gt;Germany (EBAY_DE)&lt;/li&gt; &lt;li&gt;Canada (EBAY_CA)&lt;/li&gt; &lt;li&gt;Australia (EBAY_AU)&lt;/li&gt; &lt;li&gt;United States (EBAY_US)&lt;/li&gt; &lt;li&gt;France (EBAY_FR)&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt; |
 **customPolicyRequest** | [**CustomPolicyRequest**](CustomPolicyRequest.md)|  | [optional]

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
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Policy Name already used/ Maximum no of policies per site reached |  -  |
**500** | Internal Server Error |  -  |

