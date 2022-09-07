# MarketingApiCampaignApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneCampaign**](MarketingApiCampaignApi.md#cloneCampaign) | **POST** /ad_campaign/{campaign_id}/clone | /ad_campaign/{campaign_id}/clone
[**createCampaign**](MarketingApiCampaignApi.md#createCampaign) | **POST** /ad_campaign | /ad_campaign
[**deleteCampaign**](MarketingApiCampaignApi.md#deleteCampaign) | **DELETE** /ad_campaign/{campaign_id} | /ad_campaign/{campaign_id}
[**endCampaign**](MarketingApiCampaignApi.md#endCampaign) | **POST** /ad_campaign/{campaign_id}/end | /ad_campaign/{campaign_id}/end
[**findCampaignByAdReference**](MarketingApiCampaignApi.md#findCampaignByAdReference) | **GET** /ad_campaign/find_campaign_by_ad_reference | /ad_campaign/find_campaign_by_ad_reference
[**getCampaign**](MarketingApiCampaignApi.md#getCampaign) | **GET** /ad_campaign/{campaign_id} | /ad_campaign/{campaign_id}
[**getCampaignByName**](MarketingApiCampaignApi.md#getCampaignByName) | **GET** /ad_campaign/get_campaign_by_name | /ad_campaign/get_campaign_by_name
[**getCampaigns**](MarketingApiCampaignApi.md#getCampaigns) | **GET** /ad_campaign | /ad_campaign
[**pauseCampaign**](MarketingApiCampaignApi.md#pauseCampaign) | **POST** /ad_campaign/{campaign_id}/pause | /ad_campaign/{campaign_id}/pause
[**resumeCampaign**](MarketingApiCampaignApi.md#resumeCampaign) | **POST** /ad_campaign/{campaign_id}/resume | /ad_campaign/{campaign_id}/resume
[**suggestItems**](MarketingApiCampaignApi.md#suggestItems) | **GET** /ad_campaign/{campaign_id}/suggest_items | /ad_campaign/{campaign_id}/suggest_items
[**updateAdRateStrategy**](MarketingApiCampaignApi.md#updateAdRateStrategy) | **POST** /ad_campaign/{campaign_id}/update_ad_rate_strategy | /ad_campaign/{campaign_id}/update_ad_rate_strategy
[**updateCampaignBudget**](MarketingApiCampaignApi.md#updateCampaignBudget) | **POST** /ad_campaign/{campaign_id}/update_campaign_budget | /ad_campaign/{campaign_id}/update_campaign_budget
[**updateCampaignIdentification**](MarketingApiCampaignApi.md#updateCampaignIdentification) | **POST** /ad_campaign/{campaign_id}/update_campaign_identification | /ad_campaign/{campaign_id}/update_campaign_identification


<a name="cloneCampaign"></a>
# **cloneCampaign**
> Object cloneCampaign(campaignId, cloneCampaignRequest)

/ad_campaign/{campaign_id}/clone

This method clones (makes a copy of) the specified campaign&#39;s &lt;b&gt;campaign criterion&lt;/b&gt;. The &lt;b&gt;campaign criterion&lt;/b&gt; is a container for the fields that define the criteria for a rule-based campaign.&lt;p&gt;To clone a campaign, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter in your call. There is no request payload.&lt;/p&gt;  &lt;p&gt;The ID of the newly-cloned campaign is returned in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&#39;s current campaign IDs.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Requirement: &lt;/b&gt;In order to clone a campaign, the &lt;b&gt;campaignStatus&lt;/b&gt; must be &lt;code&gt;ENDED&lt;/code&gt; and the campaign must define a set of selection rules (it must be a rules-based campaign).&lt;/p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created. This ID is the campaign ID of the campaign being cloned.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    CloneCampaignRequest cloneCampaignRequest = new CloneCampaignRequest(); // CloneCampaignRequest | 
    try {
      Object result = apiInstance.cloneCampaign(campaignId, cloneCampaignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#cloneCampaign");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created. This ID is the campaign ID of the campaign being cloned.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **cloneCampaignRequest** | [**CloneCampaignRequest**](CloneCampaignRequest.md)|  | [optional]

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
**201** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="createCampaign"></a>
# **createCampaign**
> Object createCampaign(createCampaignRequest)

/ad_campaign

This method creates a Promoted Listings ad campaign. &lt;p&gt;A Promoted Listings &lt;i&gt;campaign&lt;/i&gt; is the structure into which you place the ads or ad group for the listings you want to promote.&lt;/p&gt;  &lt;p&gt;Identify the items you want to place into a campaign either by \&quot;key\&quot; or by \&quot;rule\&quot; as follows:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;b&gt;Rules-based campaigns&lt;/b&gt; &amp;ndash; A rules-based campaign adds items to the campaign according to the &lt;i&gt;criteria&lt;/i&gt; you specify in your call to &lt;b&gt;createCampaign&lt;/b&gt;. You can set the &lt;b&gt;autoSelectFutureInventory&lt;/b&gt; request field to &lt;code&gt;true&lt;/code&gt; so that after your campaign launches, eBay will regularly assess your new, revised, or newly-eligible listings to determine whether any should be added or removed from your campaign according to the rules you set. If there are, eBay will add or remove them automatically on a daily basis.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Key-based campaigns&lt;/b&gt; &amp;ndash; Add items to an existing campaign using either listing ID values or Inventory Reference values: &lt;ul&gt;&lt;li&gt;Add &lt;b&gt;listingId&lt;/b&gt; values to an existing campaign by calling either &lt;b&gt;createAdByListingID&lt;/b&gt; or &lt;b&gt;bulkCreateAdsByListingId&lt;/b&gt;.&lt;/li&gt;  &lt;li&gt;Add &lt;b&gt;inventoryReference&lt;/b&gt; values to an existing campaign by calling either &lt;b&gt;createAdByInventoryReference&lt;/b&gt; or &lt;b&gt;bulkCreateAdsByInventoryReference&lt;/b&gt;.&lt;/li&gt;&lt;li&gt;Add an &lt;b&gt;ad group&lt;/b&gt; to an existing campaign by calling &lt;b&gt;createAdGroup&lt;/b&gt;.&lt;/li&gt;&lt;/ul&gt;&lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; No matter how you add items to a Promoted Listings campaign, each campaign can contain ads for a maximum of 50,000 items. &lt;br&gt;&lt;br&gt;If a rules-based campaign identifies more than 50,000 items, ads are created for only the first 50,000 items identified by the specified criteria, and ads are not created for the remaining items.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Creating a campaign&lt;/b&gt;&lt;/p&gt; &lt;p&gt;To create a basic campaign, supply:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;The user-defined campaign name&lt;/li&gt; &lt;li&gt;The start date (and optionally the end date) of the campaign&lt;/li&gt; &lt;li&gt;The eBay marketplace on which the campaign is hosted&lt;/li&gt; &lt;li&gt;Details on the campaign funding model&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;The campaign funding model specifies how the Promoted Listings fee is calculated. Currently, the supported funding models are &lt;code&gt;COST_PER_SALE&lt;/code&gt; and &lt;code&gt;COST_PER_CLICK&lt;/code&gt;. For complete information on how the fee is calculated and when it applies, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#pl-fees\&quot;&gt;Promoted Listings fees&lt;/a&gt;.&lt;/p&gt;   &lt;p&gt;If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, campaign \&quot;ads\&quot; are created by \&quot;rule\&quot; for the listings that meet the criteria you specify, and these ads are associated with the newly created campaign.&lt;/p&gt;  &lt;p&gt;For details on creating Promoted Listings campaigns and how to select the items to be included in your campaigns, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-create-campaign.html\&quot;&gt;Promoted Listings campaign creation&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;For recommendations on which listings are prime for a Promoted Listings ad campaign and to get guidance on how to set the &lt;b&gt;bidPercentage&lt;/b&gt; field, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-reco-api.html\&quot;&gt;Using the Recommendation API to help configure campaigns&lt;/a&gt;.&lt;/p&gt;  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; See &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/static/overview.html#PL-requirements\&quot;&gt;Promoted Listings requirements and restrictions&lt;/a&gt; for the details on the marketplaces that support Promoted Listings via the API. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-restrictions\&quot;&gt;Promoted Listings restrictions&lt;/a&gt; for details about campaign limitations and restrictions.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    CreateCampaignRequest createCampaignRequest = new CreateCampaignRequest(); // CreateCampaignRequest | 
    try {
      Object result = apiInstance.createCampaign(createCampaignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#createCampaign");
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
 **createCampaignRequest** | [**CreateCampaignRequest**](CreateCampaignRequest.md)|  | [optional]

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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteCampaign"></a>
# **deleteCampaign**
> Object deleteCampaign(campaignId)

/ad_campaign/{campaign_id}

This method deletes the campaign specified by the &lt;code&gt;campaign_id&lt;/code&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; You can only delete campaigns that have ended.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&#39;s campaigns.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      Object result = apiInstance.deleteCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#deleteCampaign");
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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="endCampaign"></a>
# **endCampaign**
> Object endCampaign(campaignId)

/ad_campaign/{campaign_id}/end

This method ends an active (&lt;code&gt;RUNNING&lt;/code&gt;) or paused campaign. Specify the campaign you want to end by supplying its campaign ID in a query parameter.  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&#39;s campaigns.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      Object result = apiInstance.endCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#endCampaign");
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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="findCampaignByAdReference"></a>
# **findCampaignByAdReference**
> Campaigns findCampaignByAdReference(inventoryReferenceId, inventoryReferenceType, listingId)

/ad_campaign/find_campaign_by_ad_reference

This method retrieves the campaigns containing the listing that is specified using either a listing ID, or an inventory reference ID and inventory reference type pair. The request accepts either a &lt;b&gt;listing_id&lt;/b&gt;, &lt;i&gt;or&lt;/i&gt; an &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt; pair, as used in the Inventory API.&lt;br /&gt;&lt;br /&gt;eBay &lt;i&gt;listing IDs&lt;/i&gt; are generated by either the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot; title&#x3D;\&quot;Trading API Reference\&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot;&gt;Inventory API&lt;/a&gt; when you create a listing.&lt;br /&gt;&lt;br /&gt;An &lt;i&gt;inventory reference ID&lt;/i&gt; can be either a seller-defined &lt;b&gt;SKU&lt;/b&gt; or &lt;b&gt;inventoryItemGroupKey&lt;/b&gt;, as specified in the Inventory API.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String inventoryReferenceId = "inventoryReferenceId_example"; // String | The seller's inventory reference ID of the listing to be used to find the campaign in which it is associated.  This will either be a seller-defined <b>SKU</b> value or inventory item group ID, depending on the reference type specified. You must always pass in both  <b>inventory_reference_id</b> and <b>inventory_reference_type</b>.
    String inventoryReferenceType = "inventoryReferenceType_example"; // String | The type of the seller's inventory reference ID, which is a listing or group of items. You must always pass in both <b>inventory_reference_id</b> and <b>inventory_reference_type</b>.
    String listingId = "listingId_example"; // String | Identifier of the eBay listing associated with the ad.
    try {
      Campaigns result = apiInstance.findCampaignByAdReference(inventoryReferenceId, inventoryReferenceType, listingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#findCampaignByAdReference");
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
 **inventoryReferenceId** | **String**| The seller&#39;s inventory reference ID of the listing to be used to find the campaign in which it is associated.  This will either be a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or inventory item group ID, depending on the reference type specified. You must always pass in both  &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt;. | [optional]
 **inventoryReferenceType** | **String**| The type of the seller&#39;s inventory reference ID, which is a listing or group of items. You must always pass in both &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt;. | [optional]
 **listingId** | **String**| Identifier of the eBay listing associated with the ad. | [optional]

### Return type

[**Campaigns**](Campaigns.md)

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

<a name="getCampaign"></a>
# **getCampaign**
> Campaign getCampaign(campaignId)

/ad_campaign/{campaign_id}

This method retrieves the details of a single campaign, as specified with the &lt;b&gt;campaign_id&lt;/b&gt; query parameter.  &lt;p&gt;This method returns all the details of a campaign (including the campaign&#39;s the selection rules), except the for the listing IDs or inventory reference IDs included in the campaign. These IDs are returned by &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&#39;s campaign IDs.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      Campaign result = apiInstance.getCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#getCampaign");
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

### Return type

[**Campaign**](Campaign.md)

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

<a name="getCampaignByName"></a>
# **getCampaignByName**
> Campaign getCampaignByName(campaignName)

/ad_campaign/get_campaign_by_name

This method retrieves the details of a single campaign, as specified with the &lt;b&gt;campaign_name&lt;/b&gt; query parameter. Note that the campaign name you specify must be an exact, case-sensitive match of the name of the campaign you want to retrieve.&lt;/p&gt;&lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&#39;s campaign names.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignName = "campaignName_example"; // String | The name of the campaign.
    try {
      Campaign result = apiInstance.getCampaignByName(campaignName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#getCampaignByName");
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
 **campaignName** | **String**| The name of the campaign. |

### Return type

[**Campaign**](Campaign.md)

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

<a name="getCampaigns"></a>
# **getCampaigns**
> CampaignPagedCollectionResponse getCampaigns(campaignName, campaignStatus, endDateRange, fundingStrategy, limit, offset, startDateRange)

/ad_campaign

This method retrieves the details for all of the seller&#39;s defined campaigns. Request parameters can be used to retrieve a specific campaign, such as the campaign&#39;s name, the start and end date, the status, and the funding model (Cost Per Sale (CPS) or Cost Per Click (CPC). &lt;p&gt;You can filter the result set by a campaign name, end date range, start date range, or campaign status. You can also paginate the records returned from the result set using the &lt;b&gt;limit&lt;/b&gt; query parameter, and control which records to return using the  &lt;b&gt;offset&lt;/b&gt; parameter.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignName = "campaignName_example"; // String | Specifies the campaign name. The results are filtered to include only the campaign by the specified name.<br /><br /><b>Note: </b>The results might be null if other filters exclude the campaign with this name. <br /><br /><b>Maximum: </b> 1 campaign name
    String campaignStatus = "campaignStatus_example"; // String | Include this filter and input a specific campaign status to retrieve campaigns currently in that state. <br /><br /><b>Note: </b>The results might not include all the campaigns with this status if other filters exclude them. <br /><br /><b>Valid values:</b> See <a href=\"/api-docs/sell/marketing/types/pls:CampaignStatusEnum\">CampaignStatusEnum</a> <br /><br /><b>Maximum: </b> 1 status
    String endDateRange = "endDateRange_example"; // String | Specifies the range of a campaign's end date. The results are filtered to include only campaigns with an end date that is within specified range. <br><br><b>Valid format (UTC)</b>: <ul><li><code> yyyy-MM-ddThh:mm:ssZ..yyyy-MM-ddThh:mm:ssZ </code>  (campaign ends within this range)</li><li><code>yyyy-MM-ddThh:mm:ssZ..</code> (campaign ends on or after this date)</li><li><code>..yyyy-MM-ddThh:mm:ssZ </code> (campaign ends on or before this date)</li><li><code>2016-09-08T00:00.00.000Z..2016-09-09T00:00:00Z</code> (campaign ends on September 08, 2016)</li></ul> <br /><br /><b>Note: </b>The results might not include all the campaigns ending on this date if other filters exclude them.
    String fundingStrategy = "fundingStrategy_example"; // String | Specifies the funding strategy for the campaign.<br /><br />The results will be filtered to only include campaigns with the specified funding model. If not specified, all campaigns matching the other filter parameters will be returned. The results might not include these campaigns if other search conditions exclude them.<br /><br /><b>Valid Values:</b><ul><li><code>COST_PER_SALE</code></li><li><code>COST_PER_CLICK</code></li></ul>
    String limit = "limit_example"; // String | <p>Specifies the maximum number of campaigns to return on a page in the paginated response.</p>  <b>Default: </b>10 <br><b>Maximum: </b> 500
    String offset = "offset_example"; // String | Specifies the number of campaigns to skip in the result set before returning the first report in the paginated response.  <p>Combine <b>offset</b> with the <b>limit</b> query parameter to control the items returned in the response. For example, if you supply an <b>offset</b> of <code>0</code> and a <b>limit</b> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <b>offset</b> is <code>10</code> and <b>limit</b> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set.</p> <p><b>Default:</b> 0</p>
    String startDateRange = "startDateRange_example"; // String | Specifies the range of a campaign's start date in which to filter the results. The results are filtered to include only campaigns with a start date that is equal to this date or is within specified range.<br><br><b>Valid format (UTC): </b> <ul><li><code>yyyy-MM-ddThh:mm:ssZ..yyyy-MM-ddThh:mm:ssZ</code> (starts within this range)</li><li><code>yyyy-MM-ddThh:mm:ssZ</code> (campaign starts on or after this date)</li><li><code>..yyyy-MM-ddThh:mm:ssZ </code>(campaign starts on or before this date)</li><li><code>2016-09-08T00:00.00.000Z..2016-09-09T00:00:00Z</code> (campaign starts on September 08, 2016)</li></ul><br /><br /><b>Note: </b>The results might not include all the campaigns with this start date if other filters exclude them.
    try {
      CampaignPagedCollectionResponse result = apiInstance.getCampaigns(campaignName, campaignStatus, endDateRange, fundingStrategy, limit, offset, startDateRange);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#getCampaigns");
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
 **campaignName** | **String**| Specifies the campaign name. The results are filtered to include only the campaign by the specified name.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Note: &lt;/b&gt;The results might be null if other filters exclude the campaign with this name. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt; 1 campaign name | [optional]
 **campaignStatus** | **String**| Include this filter and input a specific campaign status to retrieve campaigns currently in that state. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Note: &lt;/b&gt;The results might not include all the campaigns with this status if other filters exclude them. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid values:&lt;/b&gt; See &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/types/pls:CampaignStatusEnum\&quot;&gt;CampaignStatusEnum&lt;/a&gt; &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt; 1 status | [optional]
 **endDateRange** | **String**| Specifies the range of a campaign&#39;s end date. The results are filtered to include only campaigns with an end date that is within specified range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid format (UTC)&lt;/b&gt;: &lt;ul&gt;&lt;li&gt;&lt;code&gt; yyyy-MM-ddThh:mm:ssZ..yyyy-MM-ddThh:mm:ssZ &lt;/code&gt;  (campaign ends within this range)&lt;/li&gt;&lt;li&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ssZ..&lt;/code&gt; (campaign ends on or after this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;..yyyy-MM-ddThh:mm:ssZ &lt;/code&gt; (campaign ends on or before this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;2016-09-08T00:00.00.000Z..2016-09-09T00:00:00Z&lt;/code&gt; (campaign ends on September 08, 2016)&lt;/li&gt;&lt;/ul&gt; &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Note: &lt;/b&gt;The results might not include all the campaigns ending on this date if other filters exclude them. | [optional]
 **fundingStrategy** | **String**| Specifies the funding strategy for the campaign.&lt;br /&gt;&lt;br /&gt;The results will be filtered to only include campaigns with the specified funding model. If not specified, all campaigns matching the other filter parameters will be returned. The results might not include these campaigns if other search conditions exclude them.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;COST_PER_SALE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;COST_PER_CLICK&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; | [optional]
 **limit** | **String**| &lt;p&gt;Specifies the maximum number of campaigns to return on a page in the paginated response.&lt;/p&gt;  &lt;b&gt;Default: &lt;/b&gt;10 &lt;br&gt;&lt;b&gt;Maximum: &lt;/b&gt; 500 | [optional]
 **offset** | **String**| Specifies the number of campaigns to skip in the result set before returning the first report in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; | [optional]
 **startDateRange** | **String**| Specifies the range of a campaign&#39;s start date in which to filter the results. The results are filtered to include only campaigns with a start date that is equal to this date or is within specified range.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid format (UTC): &lt;/b&gt; &lt;ul&gt;&lt;li&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ssZ..yyyy-MM-ddThh:mm:ssZ&lt;/code&gt; (starts within this range)&lt;/li&gt;&lt;li&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt; (campaign starts on or after this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;..yyyy-MM-ddThh:mm:ssZ &lt;/code&gt;(campaign starts on or before this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;2016-09-08T00:00.00.000Z..2016-09-09T00:00:00Z&lt;/code&gt; (campaign starts on September 08, 2016)&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Note: &lt;/b&gt;The results might not include all the campaigns with this start date if other filters exclude them. | [optional]

### Return type

[**CampaignPagedCollectionResponse**](CampaignPagedCollectionResponse.md)

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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="pauseCampaign"></a>
# **pauseCampaign**
> Object pauseCampaign(campaignId)

/ad_campaign/{campaign_id}/pause

This method pauses an active (RUNNING) campaign.  &lt;p&gt;You can restart the campaign by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/resumeCampaign\&quot;&gt;resumeCampaign&lt;/a&gt;, as long as the campaign&#39;s end date is in the future.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Note: &lt;/b&gt; The listings associated with a paused campaign cannot be added into another campaign.&lt;/p&gt;  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&#39;s campaigns.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      Object result = apiInstance.pauseCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#pauseCampaign");
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
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="resumeCampaign"></a>
# **resumeCampaign**
> Object resumeCampaign(campaignId)

/ad_campaign/{campaign_id}/resume

This method resumes a paused campaign, as long as its end date is in the future. Supply the &lt;b&gt;campaign_id&lt;/b&gt; for the campaign you want to restart as a query parameter in the request.  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&#39;s campaigns.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      Object result = apiInstance.resumeCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#resumeCampaign");
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
**204** | No content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="suggestItems"></a>
# **suggestItems**
> TargetedAdsPagedCollection suggestItems(campaignId, categoryIds, limit, offset)

/ad_campaign/{campaign_id}/suggest_items

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method allows sellers to obtain ideas for listings, which can be targeted for Promoted Listings campaigns.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    String categoryIds = "categoryIds_example"; // String | Specifies the category ID that is used to limit the results. This refers to an exact leaf category (the lowest level in that category and has no children). This field can have one category ID, or a comma-separated list of IDs. To return all category IDs, set to <code>null</code>. <br /><br /><b>Maximum: </b> 10 
    String limit = "limit_example"; // String | Specifies the maximum number of campaigns to return on a page in the paginated response. If no value is specified, the default value is used. <br /><br /><b>Default: </b>10 <br /><br /><b>Minimum: </b> 1<br /><br /><b>Maximum: </b> 1000
    String offset = "offset_example"; // String | Specifies the number of campaigns to skip in the result set before returning the first report in the paginated response.  <p>Combine <b>offset</b> with the <b>limit</b> query parameter to control the items returned in the response. For example, if you supply an <b>offset</b> of <code>0</code> and a <b>limit</b> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <b>offset</b> is <code>10</code> and <b>limit</b> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set.</p> <p><b>Default:</b> 0</p>
    try {
      TargetedAdsPagedCollection result = apiInstance.suggestItems(campaignId, categoryIds, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#suggestItems");
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
 **categoryIds** | **String**| Specifies the category ID that is used to limit the results. This refers to an exact leaf category (the lowest level in that category and has no children). This field can have one category ID, or a comma-separated list of IDs. To return all category IDs, set to &lt;code&gt;null&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt; 10  | [optional]
 **limit** | **String**| Specifies the maximum number of campaigns to return on a page in the paginated response. If no value is specified, the default value is used. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt;10 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Minimum: &lt;/b&gt; 1&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt; 1000 | [optional]
 **offset** | **String**| Specifies the number of campaigns to skip in the result set before returning the first report in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; | [optional]

### Return type

[**TargetedAdsPagedCollection**](TargetedAdsPagedCollection.md)

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
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="updateAdRateStrategy"></a>
# **updateAdRateStrategy**
> Object updateAdRateStrategy(campaignId, updateAdrateStrategyRequest)

/ad_campaign/{campaign_id}/update_ad_rate_strategy

This method updates the ad rate strategy for an existing Promoted Listings Standard (PLS) rules-based ad campaign that uses the Cost Per Sale (CPS) funding model.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the CPS funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    UpdateAdrateStrategyRequest updateAdrateStrategyRequest = new UpdateAdrateStrategyRequest(); // UpdateAdrateStrategyRequest | 
    try {
      Object result = apiInstance.updateAdRateStrategy(campaignId, updateAdrateStrategyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#updateAdRateStrategy");
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
 **updateAdrateStrategyRequest** | [**UpdateAdrateStrategyRequest**](UpdateAdrateStrategyRequest.md)|  | [optional]

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
**204** | No content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="updateCampaignBudget"></a>
# **updateCampaignBudget**
> Object updateCampaignBudget(campaignId, updateCampaignBudgetRequest)

/ad_campaign/{campaign_id}/update_campaign_budget

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method updates the daily budget for a PLA campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;A click occurs when an eBay user finds and clicks on the seller’s listing (within the search results) after using a keyword that the seller has created for the campaign. For each ad in an ad group in the campaign, each click triggers a cost, which gets subtracted from the campaign’s daily budget. If the cost of the clicks exceeds the daily budget, the Promoted Listings campaign will be paused until the next day.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    UpdateCampaignBudgetRequest updateCampaignBudgetRequest = new UpdateCampaignBudgetRequest(); // UpdateCampaignBudgetRequest | 
    try {
      Object result = apiInstance.updateCampaignBudget(campaignId, updateCampaignBudgetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#updateCampaignBudget");
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
 **updateCampaignBudgetRequest** | [**UpdateCampaignBudgetRequest**](UpdateCampaignBudgetRequest.md)|  | [optional]

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
**204** | No content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

<a name="updateCampaignIdentification"></a>
# **updateCampaignIdentification**
> Object updateCampaignIdentification(campaignId, updateCampaignIdentificationRequest)

/ad_campaign/{campaign_id}/update_campaign_identification

This method can be used to change the name of a campaign, as well as modify the start or end dates. &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;campaignName&lt;/b&gt; and &lt;b&gt;startDate&lt;/b&gt; in the request payload.  &lt;p&gt;If you want to change only the end date of the campaign, specify the current campaign name and set &lt;b&gt;startDate&lt;/b&gt; to the current date (you cannot use a start date that is in the past), and set the &lt;b&gt;endDate&lt;/b&gt; as desired. Note that if you do not set a new end date in this call, any current &lt;b&gt;endDate&lt;/b&gt; value will be set to &lt;code&gt;null&lt;/code&gt;. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&#39;s campaign details, including the campaign ID, campaign name, and the start and end dates of the campaign.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCampaignApi apiInstance = new MarketingApiCampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    UpdateCampaignIdentificationRequest updateCampaignIdentificationRequest = new UpdateCampaignIdentificationRequest(); // UpdateCampaignIdentificationRequest | 
    try {
      Object result = apiInstance.updateCampaignIdentification(campaignId, updateCampaignIdentificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCampaignApi#updateCampaignIdentification");
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
 **updateCampaignIdentificationRequest** | [**UpdateCampaignIdentificationRequest**](UpdateCampaignIdentificationRequest.md)|  | [optional]

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
**204** | No content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Business error |  -  |
**500** | Internal Server Error |  -  |

