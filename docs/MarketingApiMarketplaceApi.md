# MarketingApiMarketplaceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAutomotivePartsCompatibilityPolicies**](MarketingApiMarketplaceApi.md#getAutomotivePartsCompatibilityPolicies) | **GET** /marketplace/{marketplace_id}/get_automotive_parts_compatibility_policies | /marketplace/{marketplace_id}/get_automotive_parts_compatibility_policies
[**getExtendedProducerResponsibilityPolicies**](MarketingApiMarketplaceApi.md#getExtendedProducerResponsibilityPolicies) | **GET** /marketplace/{marketplace_id}/get_extended_producer_responsibility_policies | /marketplace/{marketplace_id}/get_extended_producer_responsibility_policies
[**getItemConditionPolicies**](MarketingApiMarketplaceApi.md#getItemConditionPolicies) | **GET** /marketplace/{marketplace_id}/get_item_condition_policies | /marketplace/{marketplace_id}/get_item_condition_policies
[**getListingStructurePolicies**](MarketingApiMarketplaceApi.md#getListingStructurePolicies) | **GET** /marketplace/{marketplace_id}/get_listing_structure_policies | /marketplace/{marketplace_id}/get_listing_structure_policies
[**getNegotiatedPricePolicies**](MarketingApiMarketplaceApi.md#getNegotiatedPricePolicies) | **GET** /marketplace/{marketplace_id}/get_negotiated_price_policies | /marketplace/{marketplace_id}/get_negotiated_price_policies
[**getReturnPolicies**](MarketingApiMarketplaceApi.md#getReturnPolicies) | **GET** /marketplace/{marketplace_id}/get_return_policies | /marketplace/{marketplace_id}/get_return_policies


<a name="getAutomotivePartsCompatibilityPolicies"></a>
# **getAutomotivePartsCompatibilityPolicies**
> AutomotivePartsCompatibilityPolicyResponse getAutomotivePartsCompatibilityPolicies(marketplaceId, filter)

/marketplace/{marketplace_id}/get_automotive_parts_compatibility_policies

This method returns the eBay policies that define how to list automotive-parts-compatibility items in the categories of a specific marketplace.  &lt;br&gt;&lt;br&gt;By default, this method returns the entire category tree for the specified marketplace. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#478415\&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;application/gzip&lt;/code&gt;.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiMarketplaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiMarketplaceApi apiInstance = new MarketingApiMarketplaceApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This path parameter specifies the eBay marketplace for which policy information is retrieved.  <br><br><b>Note:</b> Only the following eBay marketplaces support automotive parts compatibility: <ul> <li>EBAY_US</li> <li>EBAY_AU</li> <li>EBAY_CA</li> <li>EBAY_DE</li> <li>EBAY_ES</li> <li>EBAY_FR</li> <li>EBAY_GB</li> <li>EBAY_IT</li><ul>
    String filter = "filter_example"; // String | This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply <b>categoryId</b> values for the sections of the tree you want returned.  <br><br>When you specify a <b>categoryId</b> value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  <br><br>The parameter takes a list of <b>categoryId</b> values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character ('|'). If you specify more than 50 <code>categoryId</code> values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  <br><br><b>Example:</b> <code>filter=categoryIds:{100|101|102}</code>  <br><br>Note that you must URL-encode the parameter list, which results in the following filter for the above example: <br><br> &nbsp;&nbsp;<code>filter=categoryIds%3A%7B100%7C101%7C102%7D</code>
    try {
      AutomotivePartsCompatibilityPolicyResponse result = apiInstance.getAutomotivePartsCompatibilityPolicies(marketplaceId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiMarketplaceApi#getAutomotivePartsCompatibilityPolicies");
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
 **marketplaceId** | **String**| This path parameter specifies the eBay marketplace for which policy information is retrieved.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; Only the following eBay marketplaces support automotive parts compatibility: &lt;ul&gt; &lt;li&gt;EBAY_US&lt;/li&gt; &lt;li&gt;EBAY_AU&lt;/li&gt; &lt;li&gt;EBAY_CA&lt;/li&gt; &lt;li&gt;EBAY_DE&lt;/li&gt; &lt;li&gt;EBAY_ES&lt;/li&gt; &lt;li&gt;EBAY_FR&lt;/li&gt; &lt;li&gt;EBAY_GB&lt;/li&gt; &lt;li&gt;EBAY_IT&lt;/li&gt;&lt;ul&gt; |
 **filter** | **String**| This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree you want returned.  &lt;br&gt;&lt;br&gt;When you specify a &lt;b&gt;categoryId&lt;/b&gt; value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  &lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&#39;|&#39;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter&#x3D;categoryIds:{100|101|102}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;Note that you must URL-encode the parameter list, which results in the following filter for the above example: &lt;br&gt;&lt;br&gt; &amp;nbsp;&amp;nbsp;&lt;code&gt;filter&#x3D;categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt; | [optional]

### Return type

[**AutomotivePartsCompatibilityPolicyResponse**](AutomotivePartsCompatibilityPolicyResponse.md)

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
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

<a name="getExtendedProducerResponsibilityPolicies"></a>
# **getExtendedProducerResponsibilityPolicies**
> ExtendedProducerResponsibilityPolicyResponse getExtendedProducerResponsibilityPolicies(marketplaceId, filter)

/marketplace/{marketplace_id}/get_extended_producer_responsibility_policies

This method returns the Extended Producer Responsibility policies for one, multiple, or all eBay categories in an eBay marketplace.&lt;br /&gt;&lt;br /&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the filter query parameter, this method will return metadata on every applicable category for the specified marketplace.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#004680\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Currently, the Extended Producer Responsibility policies are only applicable to a limited number of categories, and only in the EBAY_FR marketplace.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#478415\&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;application/gzip&lt;/code&gt;.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiMarketplaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiMarketplaceApi apiInstance = new MarketingApiMarketplaceApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | A path parameter that specifies the eBay marketplace for which policy information shall be retrieved.<br /><br /><span class=\"tablenote\"><span style=\"color:#478415\"><strong>Tip:</strong></span> See <a href=\"/api-docs/static/rest-request-components.html#marketpl\" target=\"_blank\">Request components</a> for a list of valid eBay marketplace IDs.</span>
    String filter = "filter_example"; // String | A query parameter that can be used to limit the response by returning policy information for only the selected sections of the category tree. Supply <b>categoryId</b> values for the sections of the tree that should be returned.<br /><br />When a <b>categoryId</b> value is specified, the returned category tree includes the policies for that parent node, as well as the policies for any child nodes below that parent node.<br /><br />Pass in the <b>categoryId</b> values using a URL-encoded, pipe-separated ('|') list. For example:<br /><br /><code>filter=categoryIds%3A%7B100%7C101%7C102%7D</code><br /><br /><b>Maximum:</b> 50
    try {
      ExtendedProducerResponsibilityPolicyResponse result = apiInstance.getExtendedProducerResponsibilityPolicies(marketplaceId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiMarketplaceApi#getExtendedProducerResponsibilityPolicies");
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
 **marketplaceId** | **String**| A path parameter that specifies the eBay marketplace for which policy information shall be retrieved.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#478415\&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; See &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Request components&lt;/a&gt; for a list of valid eBay marketplace IDs.&lt;/span&gt; |
 **filter** | **String**| A query parameter that can be used to limit the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree that should be returned.&lt;br /&gt;&lt;br /&gt;When a &lt;b&gt;categoryId&lt;/b&gt; value is specified, the returned category tree includes the policies for that parent node, as well as the policies for any child nodes below that parent node.&lt;br /&gt;&lt;br /&gt;Pass in the &lt;b&gt;categoryId&lt;/b&gt; values using a URL-encoded, pipe-separated (&#39;|&#39;) list. For example:&lt;br /&gt;&lt;br /&gt;&lt;code&gt;filter&#x3D;categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 50 | [optional]

### Return type

[**ExtendedProducerResponsibilityPolicyResponse**](ExtendedProducerResponsibilityPolicyResponse.md)

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
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

<a name="getItemConditionPolicies"></a>
# **getItemConditionPolicies**
> ItemConditionPolicyResponse getItemConditionPolicies(marketplaceId, filter)

/marketplace/{marketplace_id}/get_item_condition_policies

This method returns item condition metadata on one, multiple, or all eBay categories on an eBay marketplace. This metadata consists of the different item conditions (with IDs) that an eBay category supports, and a boolean to indicate if an eBay category requires an item condition. &lt;br&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the &lt;b&gt;filter&lt;/b&gt; query parameter, this method will return metadata on every single category for the specified marketplace. If you only want to view item condition metadata for one eBay category or a select group of eBay categories, you can pass in up to 50 eBay category ID through the &lt;b&gt;filter&lt;/b&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#FF0000\&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; &lt;b&gt;Certified - Refurbished&lt;/b&gt;-eligible sellers, and sellers who are eligible to list with the new values (EXCELLENT_REFURBISHED, VERY_GOOD_REFURBISHED, and GOOD_REFURBISHED) must use an OAuth token created with the &lt;a href&#x3D;\&quot;/api-docs/static/oauth-authorization-code-grant.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;authorization code grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope/sell.inventory&lt;/b&gt; scope in order to retrieve the refurbished conditions for the relevant categories.&lt;br/&gt;&lt;br/&gt;See the &lt;a href&#x3D;\&quot;/api-docs/sell/static/metadata/condition-id-values.html#Category \&quot; target&#x3D;\&quot;_blank\&quot;&gt;eBay Refurbished Program - Category and marketplace support&lt;/a&gt; topic for the categories and marketplaces that support these refurbished conditions&lt;br/&gt;&lt;br/&gt;These restricted item conditions will not be returned if an OAuth token created with the &lt;a href&#x3D;\&quot;/api-docs/static/oauth-client-credentials-grant.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client credentials grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope&lt;/b&gt; scope is used, or if any seller is not eligible to list with that item condition. &lt;br/&gt;&lt;br/&gt; See the &lt;a href&#x3D;\&quot;/api-docs/static/oauth-scopes.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Specifying OAuth scopes&lt;/a&gt; topic for more information about specifying scopes.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#478415\&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;application/gzip&lt;/code&gt;.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiMarketplaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiMarketplaceApi apiInstance = new MarketingApiMarketplaceApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: <a href=\"/api-docs/static/rest-request-components.html#marketpl\" target=\"_blank\">Request components</a>.
    String filter = "filter_example"; // String | This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply <b>categoryId</b> values for the sections of the tree you want returned.  <br><br>When you specify a <b>categoryId</b> value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  <br><br>The parameter takes a list of <b>categoryId</b> values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character ('|'). If you specify more than 50 <code>categoryId</code> values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  <br><br><b>Example:</b> <code>filter=categoryIds:{100|101|102}</code>  <br><br>Note that you must URL-encode the parameter list, which results in the following filter for the above example: <br><br> &nbsp;&nbsp;<code>filter=categoryIds%3A%7B100%7C101%7C102%7D</code>
    try {
      ItemConditionPolicyResponse result = apiInstance.getItemConditionPolicies(marketplaceId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiMarketplaceApi#getItemConditionPolicies");
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
 **marketplaceId** | **String**| This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Request components&lt;/a&gt;. |
 **filter** | **String**| This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree you want returned.  &lt;br&gt;&lt;br&gt;When you specify a &lt;b&gt;categoryId&lt;/b&gt; value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  &lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&#39;|&#39;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter&#x3D;categoryIds:{100|101|102}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;Note that you must URL-encode the parameter list, which results in the following filter for the above example: &lt;br&gt;&lt;br&gt; &amp;nbsp;&amp;nbsp;&lt;code&gt;filter&#x3D;categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt; | [optional]

### Return type

[**ItemConditionPolicyResponse**](ItemConditionPolicyResponse.md)

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
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

<a name="getListingStructurePolicies"></a>
# **getListingStructurePolicies**
> ListingStructurePolicyResponse getListingStructurePolicies(marketplaceId, filter)

/marketplace/{marketplace_id}/get_listing_structure_policies

This method returns the eBay policies that define the allowed listing structures for the categories of a specific marketplace. The listing-structure policies currently pertain to whether or not you can list items with variations.  &lt;br&gt;&lt;br&gt;By default, this method returns the entire category tree for the specified marketplace. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#478415\&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;application/gzip&lt;/code&gt;.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiMarketplaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiMarketplaceApi apiInstance = new MarketingApiMarketplaceApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: <a href=\"/api-docs/static/rest-request-components.html#marketpl\" target=\"_blank\">Request components</a>.
    String filter = "filter_example"; // String | This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply <b>categoryId</b> values for the sections of the tree you want returned.  <br><br>When you specify a <b>categoryId</b> value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  <br><br>The parameter takes a list of <b>categoryId</b> values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character ('|'). If you specify more than 50 <code>categoryId</code> values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  <br><br><b>Example:</b> <code>filter=categoryIds:{100|101|102}</code>  <br><br>Note that you must URL-encode the parameter list, which results in the following filter for the above example: <br><br> &nbsp;&nbsp;<code>filter=categoryIds%3A%7B100%7C101%7C102%7D</code>
    try {
      ListingStructurePolicyResponse result = apiInstance.getListingStructurePolicies(marketplaceId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiMarketplaceApi#getListingStructurePolicies");
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
 **marketplaceId** | **String**| This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Request components&lt;/a&gt;. |
 **filter** | **String**| This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree you want returned.  &lt;br&gt;&lt;br&gt;When you specify a &lt;b&gt;categoryId&lt;/b&gt; value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  &lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&#39;|&#39;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter&#x3D;categoryIds:{100|101|102}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;Note that you must URL-encode the parameter list, which results in the following filter for the above example: &lt;br&gt;&lt;br&gt; &amp;nbsp;&amp;nbsp;&lt;code&gt;filter&#x3D;categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt; | [optional]

### Return type

[**ListingStructurePolicyResponse**](ListingStructurePolicyResponse.md)

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
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

<a name="getNegotiatedPricePolicies"></a>
# **getNegotiatedPricePolicies**
> NegotiatedPricePolicyResponse getNegotiatedPricePolicies(marketplaceId, filter)

/marketplace/{marketplace_id}/get_negotiated_price_policies

This method returns the eBay policies that define the supported negotiated price features (like \&quot;best offer\&quot;) for the categories of a specific marketplace.  &lt;br&gt;&lt;br&gt;By default, this method returns the entire category tree for the specified marketplace. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#478415\&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;application/gzip&lt;/code&gt;.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiMarketplaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiMarketplaceApi apiInstance = new MarketingApiMarketplaceApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: <a href=\"/api-docs/static/rest-request-components.html#marketpl\" target=\"_blank\">Request components</a>.
    String filter = "filter_example"; // String | This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply <b>categoryId</b> values for the sections of the tree you want returned.  <br><br>When you specify a <b>categoryId</b> value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  <br><br>The parameter takes a list of <b>categoryId</b> values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character ('|'). If you specify more than 50 <code>categoryId</code> values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  <br><br><b>Example:</b> <code>filter=categoryIds:{100|101|102}</code>  <br><br>Note that you must URL-encode the parameter list, which results in the following filter for the above example: <br><br> &nbsp;&nbsp;<code>filter=categoryIds%3A%7B100%7C101%7C102%7D</code>
    try {
      NegotiatedPricePolicyResponse result = apiInstance.getNegotiatedPricePolicies(marketplaceId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiMarketplaceApi#getNegotiatedPricePolicies");
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
 **marketplaceId** | **String**| This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Request components&lt;/a&gt;. |
 **filter** | **String**| This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree you want returned.  &lt;br&gt;&lt;br&gt;When you specify a &lt;b&gt;categoryId&lt;/b&gt; value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  &lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&#39;|&#39;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter&#x3D;categoryIds:{100|101|102}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;Note that you must URL-encode the parameter list, which results in the following filter for the above example: &lt;br&gt;&lt;br&gt; &amp;nbsp;&amp;nbsp;&lt;code&gt;filter&#x3D;categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt; | [optional]

### Return type

[**NegotiatedPricePolicyResponse**](NegotiatedPricePolicyResponse.md)

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
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

<a name="getReturnPolicies"></a>
# **getReturnPolicies**
> ReturnPolicyResponse getReturnPolicies(marketplaceId, filter)

/marketplace/{marketplace_id}/get_return_policies

This method returns the eBay policies that define whether or not you must include a return policy for the items you list in the categories of a specific marketplace, plus the guidelines for creating domestic and international return policies in the different eBay categories.  &lt;br&gt;&lt;br&gt;By default, this method returns the entire category tree for the specified marketplace. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#478415\&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;application/gzip&lt;/code&gt;.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiMarketplaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiMarketplaceApi apiInstance = new MarketingApiMarketplaceApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: <a href=\"/api-docs/static/rest-request-components.html#marketpl\" target=\"_blank\">Request components</a>.
    String filter = "filter_example"; // String | This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply <b>categoryId</b> values for the sections of the tree you want returned.  <br><br>When you specify a <b>categoryId</b> value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  <br><br>The parameter takes a list of <b>categoryId</b> values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character ('|'). If you specify more than 50 <code>categoryId</code> values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  <br><br><b>Example:</b> <code>filter=categoryIds:{100|101|102}</code>  <br><br>Note that you must URL-encode the parameter list, which results in the following filter for the above example: <br><br> &nbsp;&nbsp;<code>filter=categoryIds%3A%7B100%7C101%7C102%7D</code>
    try {
      ReturnPolicyResponse result = apiInstance.getReturnPolicies(marketplaceId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiMarketplaceApi#getReturnPolicies");
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
 **marketplaceId** | **String**| This path parameter specifies the eBay marketplace for which policy information is retrieved. See the following page for a list of valid eBay marketplace IDs: &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Request components&lt;/a&gt;. |
 **filter** | **String**| This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree you want returned.  &lt;br&gt;&lt;br&gt;When you specify a &lt;b&gt;categoryId&lt;/b&gt; value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  &lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&#39;|&#39;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter&#x3D;categoryIds:{100|101|102}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;Note that you must URL-encode the parameter list, which results in the following filter for the above example: &lt;br&gt;&lt;br&gt; &amp;nbsp;&amp;nbsp;&lt;code&gt;filter&#x3D;categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt; | [optional]

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
**204** | No content |  -  |
**400** | Bad Request |  -  |
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

