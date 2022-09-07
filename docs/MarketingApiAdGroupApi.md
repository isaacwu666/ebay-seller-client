# MarketingApiAdGroupApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdGroup**](MarketingApiAdGroupApi.md#createAdGroup) | **POST** /ad_campaign/{campaign_id}/ad_group | /ad_campaign/{campaign_id}/ad_group
[**getAdGroup**](MarketingApiAdGroupApi.md#getAdGroup) | **GET** /ad_campaign/{campaign_id}/ad_group/{ad_group_id} | /ad_campaign/{campaign_id}/ad_group/{ad_group_id}
[**getAdGroups**](MarketingApiAdGroupApi.md#getAdGroups) | **GET** /ad_campaign/{campaign_id}/ad_group | /ad_campaign/{campaign_id}/ad_group
[**suggestBids**](MarketingApiAdGroupApi.md#suggestBids) | **POST** /ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_bids | /ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_bids
[**suggestKeywords**](MarketingApiAdGroupApi.md#suggestKeywords) | **POST** /ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_keywords | /ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_keywords
[**updateAdGroup**](MarketingApiAdGroupApi.md#updateAdGroup) | **PUT** /ad_campaign/{campaign_id}/ad_group/{ad_group_id} | /ad_campaign/{campaign_id}/ad_group/{ad_group_id}


<a name="createAdGroup"></a>
# **createAdGroup**
> Object createAdGroup(campaignId, createAdGroupRequest)

/ad_campaign/{campaign_id}/ad_group

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method adds an ad group to an existing PLA campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdGroupApi apiInstance = new MarketingApiAdGroupApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    CreateAdGroupRequest createAdGroupRequest = new CreateAdGroupRequest(); // CreateAdGroupRequest | 
    try {
      Object result = apiInstance.createAdGroup(campaignId, createAdGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdGroupApi#createAdGroup");
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
 **createAdGroupRequest** | [**CreateAdGroupRequest**](CreateAdGroupRequest.md)|  | [optional]

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

<a name="getAdGroup"></a>
# **getAdGroup**
> AdGroup getAdGroup(adGroupId, campaignId)

/ad_campaign/{campaign_id}/ad_group/{ad_group_id}

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method retrieves the details of a specified ad group, such as the ad group’s default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups\&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdGroupApi apiInstance = new MarketingApiAdGroupApi(defaultClient);
    String adGroupId = "adGroupId_example"; // String | The ID of the ad group that shall be retrieved.
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      AdGroup result = apiInstance.getAdGroup(adGroupId, campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdGroupApi#getAdGroup");
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
 **adGroupId** | **String**| The ID of the ad group that shall be retrieved. |
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |

### Return type

[**AdGroup**](AdGroup.md)

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

<a name="getAdGroups"></a>
# **getAdGroups**
> AdGroupPagedCollectionResponse getAdGroups(campaignId, adGroupStatus, limit, offset)

/ad_campaign/{campaign_id}/ad_group

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method retrieves ad groups for the specified campaigns.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_ids&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdGroupApi apiInstance = new MarketingApiAdGroupApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    String adGroupStatus = "adGroupStatus_example"; // String | A comma-separated list of ad group statuses. The results will be filtered to only include the given statuses of the ad group.<br /><br />The results might not include these ad groups if other search conditions exclude them.
    String limit = "limit_example"; // String | The number of results, from the current result set, to be returned in a single page.
    String offset = "offset_example"; // String | The number of results that will be skipped in the result set. This is used with the <b>limit</b> field to control the pagination of the output.<br /><br />For example, if the <b>offset</b> is set to <code>0</code> and the <b>limit</b> is set to <code>10</code>, the method will retrieve items 1 through 10 from the list of items returned. If the <b>offset</b> is set to <code>10</code> and the <b>limit</b> is set to <code>10</code>, the method will retrieve items 11 through 20 from the list of items returned.<br><br><b>Default</b>: <code>0</code>
    try {
      AdGroupPagedCollectionResponse result = apiInstance.getAdGroups(campaignId, adGroupStatus, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdGroupApi#getAdGroups");
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
 **adGroupStatus** | **String**| A comma-separated list of ad group statuses. The results will be filtered to only include the given statuses of the ad group.&lt;br /&gt;&lt;br /&gt;The results might not include these ad groups if other search conditions exclude them. | [optional]
 **limit** | **String**| The number of results, from the current result set, to be returned in a single page. | [optional]
 **offset** | **String**| The number of results that will be skipped in the result set. This is used with the &lt;b&gt;limit&lt;/b&gt; field to control the pagination of the output.&lt;br /&gt;&lt;br /&gt;For example, if the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;0&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 1 through 10 from the list of items returned. If the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 11 through 20 from the list of items returned.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;0&lt;/code&gt; | [optional]

### Return type

[**AdGroupPagedCollectionResponse**](AdGroupPagedCollectionResponse.md)

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

<a name="suggestBids"></a>
# **suggestBids**
> TargetedBidsPagedCollection suggestBids(adGroupId, campaignId, targetedBidRequest)

/ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_bids

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method allows sellers to retrieve the suggested bids for input keywords and match type.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdGroupApi apiInstance = new MarketingApiAdGroupApi(defaultClient);
    String adGroupId = "adGroupId_example"; // String | The ID of the ad group containing the keywords for which the bid suggestions will be provided.
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    TargetedBidRequest targetedBidRequest = new TargetedBidRequest(); // TargetedBidRequest | 
    try {
      TargetedBidsPagedCollection result = apiInstance.suggestBids(adGroupId, campaignId, targetedBidRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdGroupApi#suggestBids");
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
 **adGroupId** | **String**| The ID of the ad group containing the keywords for which the bid suggestions will be provided. |
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **targetedBidRequest** | [**TargetedBidRequest**](TargetedBidRequest.md)|  | [optional]

### Return type

[**TargetedBidsPagedCollection**](TargetedBidsPagedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="suggestKeywords"></a>
# **suggestKeywords**
> TargetedKeywordsPagedCollection suggestKeywords(adGroupId, campaignId, targetedKeywordRequest)

/ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_keywords

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method allows sellers to retrieve a list of keyword ideas to be targeted for Promoted Listings campaigns.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdGroupApi apiInstance = new MarketingApiAdGroupApi(defaultClient);
    String adGroupId = "adGroupId_example"; // String | The ID of the ad group for which the keyword suggestions will be provided.
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    TargetedKeywordRequest targetedKeywordRequest = new TargetedKeywordRequest(); // TargetedKeywordRequest | 
    try {
      TargetedKeywordsPagedCollection result = apiInstance.suggestKeywords(adGroupId, campaignId, targetedKeywordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdGroupApi#suggestKeywords");
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
 **adGroupId** | **String**| The ID of the ad group for which the keyword suggestions will be provided. |
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **targetedKeywordRequest** | [**TargetedKeywordRequest**](TargetedKeywordRequest.md)|  | [optional]

### Return type

[**TargetedKeywordsPagedCollection**](TargetedKeywordsPagedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="updateAdGroup"></a>
# **updateAdGroup**
> Object updateAdGroup(adGroupId, campaignId, updateAdGroupRequest)

/ad_campaign/{campaign_id}/ad_group/{ad_group_id}

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroup\&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdGroupApi apiInstance = new MarketingApiAdGroupApi(defaultClient);
    String adGroupId = "adGroupId_example"; // String | The ID of the ad group that shall be updated.
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    UpdateAdGroupRequest updateAdGroupRequest = new UpdateAdGroupRequest(); // UpdateAdGroupRequest | 
    try {
      Object result = apiInstance.updateAdGroup(adGroupId, campaignId, updateAdGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdGroupApi#updateAdGroup");
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
 **adGroupId** | **String**| The ID of the ad group that shall be updated. |
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **updateAdGroupRequest** | [**UpdateAdGroupRequest**](UpdateAdGroupRequest.md)|  | [optional]

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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

