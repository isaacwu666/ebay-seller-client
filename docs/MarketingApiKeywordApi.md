# MarketingApiKeywordApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateKeyword**](MarketingApiKeywordApi.md#bulkCreateKeyword) | **POST** /ad_campaign/{campaign_id}/bulk_create_keyword | /ad_campaign/{campaign_id}/bulk_create_keyword
[**bulkUpdateKeyword**](MarketingApiKeywordApi.md#bulkUpdateKeyword) | **POST** /ad_campaign/{campaign_id}/bulk_update_keyword | /ad_campaign/{campaign_id}/bulk_update_keyword
[**createKeyword**](MarketingApiKeywordApi.md#createKeyword) | **POST** /ad_campaign/{campaign_id}/keyword | /ad_campaign/{campaign_id}/keyword
[**getKeyword**](MarketingApiKeywordApi.md#getKeyword) | **GET** /ad_campaign/{campaign_id}/keyword/{keyword_id} | /ad_campaign/{campaign_id}/keyword/{keyword_id}
[**getKeywords**](MarketingApiKeywordApi.md#getKeywords) | **GET** /ad_campaign/{campaign_id}/keyword | /ad_campaign/{campaign_id}/keyword
[**updateKeyword**](MarketingApiKeywordApi.md#updateKeyword) | **PUT** /ad_campaign/{campaign_id}/keyword/{keyword_id} | /ad_campaign/{campaign_id}/keyword/{keyword_id}


<a name="bulkCreateKeyword"></a>
# **bulkCreateKeyword**
> BulkCreateKeywordResponse bulkCreateKeyword(campaignId, bulkCreateKeywordRequest)

/ad_campaign/{campaign_id}/bulk_create_keyword

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method adds keywords, in bulk, to an existing PLA ad group in a campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;This method also sets the CPC rate for each keyword.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiKeywordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiKeywordApi apiInstance = new MarketingApiKeywordApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    BulkCreateKeywordRequest bulkCreateKeywordRequest = new BulkCreateKeywordRequest(); // BulkCreateKeywordRequest | 
    try {
      BulkCreateKeywordResponse result = apiInstance.bulkCreateKeyword(campaignId, bulkCreateKeywordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiKeywordApi#bulkCreateKeyword");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **bulkCreateKeywordRequest** | [**BulkCreateKeywordRequest**](BulkCreateKeywordRequest.md)|  | [optional]

### Return type

[**BulkCreateKeywordResponse**](BulkCreateKeywordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**207** | Multi Status |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="bulkUpdateKeyword"></a>
# **bulkUpdateKeyword**
> BulkUpdateKeywordResponse bulkUpdateKeyword(campaignId, bulkUpdateKeywordRequest)

/ad_campaign/{campaign_id}/bulk_update_keyword

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method updates the bids and statuses of keywords, in bulk, for an existing PLA campaign.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiKeywordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiKeywordApi apiInstance = new MarketingApiKeywordApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    BulkUpdateKeywordRequest bulkUpdateKeywordRequest = new BulkUpdateKeywordRequest(); // BulkUpdateKeywordRequest | 
    try {
      BulkUpdateKeywordResponse result = apiInstance.bulkUpdateKeyword(campaignId, bulkUpdateKeywordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiKeywordApi#bulkUpdateKeyword");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **bulkUpdateKeywordRequest** | [**BulkUpdateKeywordRequest**](BulkUpdateKeywordRequest.md)|  | [optional]

### Return type

[**BulkUpdateKeywordResponse**](BulkUpdateKeywordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**207** | Multi Status |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="createKeyword"></a>
# **createKeyword**
> Object createKeyword(campaignId, createKeywordRequest)

/ad_campaign/{campaign_id}/keyword

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method creates keywords using a specified campaign ID for an existing PLA campaign.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/suggestKeywords\&quot;&gt;suggestKeywords&lt;/a&gt; method to retrieve a list of keyword ideas to be targeted for PLA campaigns, and call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiKeywordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiKeywordApi apiInstance = new MarketingApiKeywordApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    CreateKeywordRequest createKeywordRequest = new CreateKeywordRequest(); // CreateKeywordRequest | 
    try {
      Object result = apiInstance.createKeyword(campaignId, createKeywordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiKeywordApi#createKeyword");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **createKeywordRequest** | [**CreateKeywordRequest**](CreateKeywordRequest.md)|  | [optional]

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
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="getKeyword"></a>
# **getKeyword**
> Keyword getKeyword(campaignId, keywordId)

/ad_campaign/{campaign_id}/keyword/{keyword_id}

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method retrieves details on a specific keyword from an ad group within a PLA campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords\&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiKeywordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiKeywordApi apiInstance = new MarketingApiKeywordApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    String keywordId = "keywordId_example"; // String | This path parameter is used to identify the keyword to retrieve.
    try {
      Keyword result = apiInstance.getKeyword(campaignId, keywordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiKeywordApi#getKeyword");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **keywordId** | **String**| This path parameter is used to identify the keyword to retrieve. |

### Return type

[**Keyword**](Keyword.md)

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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="getKeywords"></a>
# **getKeywords**
> KeywordPagedCollectionResponse getKeywords(campaignId, adGroupIds, keywordStatus, limit, offset)

/ad_campaign/{campaign_id}/keyword

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method can be used to retrieve all of the keywords for ad groups in PLA campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. If one or more &lt;b&gt;ad_group_ids&lt;/b&gt; are passed in the request body, the keywords for those ad groups will be returned. If &lt;b&gt;ad_group_ids&lt;/b&gt; are not passed in the response body, the call will return all the keywords in the campaign.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiKeywordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiKeywordApi apiInstance = new MarketingApiKeywordApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    String adGroupIds = "adGroupIds_example"; // String | A comma-separated list of ad group IDs. This query parameter is used if the seller wants to retrieve keywords from one or more specific ad groups. If this query parameter is not used, all keywords that are part of the CPC campaign are returned.<span class=\"tablenote\"><b>Note:</b>You can call the <a href=\"/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups\">getAdGroups</a>  method to retrieve the ad group IDs for a seller.</span>
    String keywordStatus = "keywordStatus_example"; // String | A comma-separated list of keyword statuses. The results will be filtered to only include the given statuses of the keyword. If none are provided, all keywords are returned.
    String limit = "limit_example"; // String | <p>Specifies the maximum number of results to return on a page in the paginated response.</p>  <b>Default: </b>10 <br><b>Maximum: </b> 500
    String offset = "offset_example"; // String | Specifies the number of results to skip in the result set before returning the first report in the paginated response.  <p>Combine <b>offset</b> with the <b>limit</b> query parameter to control the items returned in the response. For example, if you supply an <b>offset</b> of <code>0</code> and a <b>limit</b> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <b>offset</b> is <code>10</code> and <b>limit</b> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set.</p> <p><b>Default:</b> 0</p>
    try {
      KeywordPagedCollectionResponse result = apiInstance.getKeywords(campaignId, adGroupIds, keywordStatus, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiKeywordApi#getKeywords");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **adGroupIds** | **String**| A comma-separated list of ad group IDs. This query parameter is used if the seller wants to retrieve keywords from one or more specific ad groups. If this query parameter is not used, all keywords that are part of the CPC campaign are returned.&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;You can call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups\&quot;&gt;getAdGroups&lt;/a&gt;  method to retrieve the ad group IDs for a seller.&lt;/span&gt; | [optional]
 **keywordStatus** | **String**| A comma-separated list of keyword statuses. The results will be filtered to only include the given statuses of the keyword. If none are provided, all keywords are returned. | [optional]
 **limit** | **String**| &lt;p&gt;Specifies the maximum number of results to return on a page in the paginated response.&lt;/p&gt;  &lt;b&gt;Default: &lt;/b&gt;10 &lt;br&gt;&lt;b&gt;Maximum: &lt;/b&gt; 500 | [optional]
 **offset** | **String**| Specifies the number of results to skip in the result set before returning the first report in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; | [optional]

### Return type

[**KeywordPagedCollectionResponse**](KeywordPagedCollectionResponse.md)

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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="updateKeyword"></a>
# **updateKeyword**
> Object updateKeyword(campaignId, keywordId, updateKeywordRequest)

/ad_campaign/{campaign_id}/keyword/{keyword_id}

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method updates keywords using a campaign ID and keyword ID for an existing PLA campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords\&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiKeywordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiKeywordApi apiInstance = new MarketingApiKeywordApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    String keywordId = "keywordId_example"; // String | A unique eBay-assigned ID that is generated when a keyword is created.
    UpdateKeywordRequest updateKeywordRequest = new UpdateKeywordRequest(); // UpdateKeywordRequest | 
    try {
      Object result = apiInstance.updateKeyword(campaignId, keywordId, updateKeywordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiKeywordApi#updateKeyword");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **keywordId** | **String**| A unique eBay-assigned ID that is generated when a keyword is created. |
 **updateKeywordRequest** | [**UpdateKeywordRequest**](UpdateKeywordRequest.md)|  | [optional]

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
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

