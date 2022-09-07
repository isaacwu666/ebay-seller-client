# MarketingApiAdApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateAdsByInventoryReference**](MarketingApiAdApi.md#bulkCreateAdsByInventoryReference) | **POST** /ad_campaign/{campaign_id}/bulk_create_ads_by_inventory_reference | /ad_campaign/{campaign_id}/bulk_create_ads_by_inventory_reference
[**bulkCreateAdsByListingId**](MarketingApiAdApi.md#bulkCreateAdsByListingId) | **POST** /ad_campaign/{campaign_id}/bulk_create_ads_by_listing_id | /ad_campaign/{campaign_id}/bulk_create_ads_by_listing_id
[**bulkDeleteAdsByInventoryReference**](MarketingApiAdApi.md#bulkDeleteAdsByInventoryReference) | **POST** /ad_campaign/{campaign_id}/bulk_delete_ads_by_inventory_reference | /ad_campaign/{campaign_id}/bulk_delete_ads_by_inventory_reference
[**bulkDeleteAdsByListingId**](MarketingApiAdApi.md#bulkDeleteAdsByListingId) | **POST** /ad_campaign/{campaign_id}/bulk_delete_ads_by_listing_id | /ad_campaign/{campaign_id}/bulk_delete_ads_by_listing_id
[**bulkUpdateAdsBidByInventoryReference**](MarketingApiAdApi.md#bulkUpdateAdsBidByInventoryReference) | **POST** /ad_campaign/{campaign_id}/bulk_update_ads_bid_by_inventory_reference | /ad_campaign/{campaign_id}/bulk_update_ads_bid_by_inventory_reference
[**bulkUpdateAdsBidByListingId**](MarketingApiAdApi.md#bulkUpdateAdsBidByListingId) | **POST** /ad_campaign/{campaign_id}/bulk_update_ads_bid_by_listing_id | /ad_campaign/{campaign_id}/bulk_update_ads_bid_by_listing_id
[**bulkUpdateAdsStatus**](MarketingApiAdApi.md#bulkUpdateAdsStatus) | **POST** /ad_campaign/{campaign_id}/bulk_update_ads_status | /ad_campaign/{campaign_id}/bulk_update_ads_status
[**bulkUpdateAdsStatusByListingId**](MarketingApiAdApi.md#bulkUpdateAdsStatusByListingId) | **POST** /ad_campaign/{campaign_id}/bulk_update_ads_status_by_listing_id | /ad_campaign/{campaign_id}/bulk_update_ads_status_by_listing_id
[**createAdByListingId**](MarketingApiAdApi.md#createAdByListingId) | **POST** /ad_campaign/{campaign_id}/ad | /ad_campaign/{campaign_id}/ad
[**createAdsByInventoryReference**](MarketingApiAdApi.md#createAdsByInventoryReference) | **POST** /ad_campaign/{campaign_id}/create_ads_by_inventory_reference | /ad_campaign/{campaign_id}/create_ads_by_inventory_reference
[**deleteAd**](MarketingApiAdApi.md#deleteAd) | **DELETE** /ad_campaign/{campaign_id}/ad/{ad_id} | /ad_campaign/{campaign_id}/ad/{ad_id}
[**deleteAdsByInventoryReference**](MarketingApiAdApi.md#deleteAdsByInventoryReference) | **POST** /ad_campaign/{campaign_id}/delete_ads_by_inventory_reference | /ad_campaign/{campaign_id}/delete_ads_by_inventory_reference
[**getAd**](MarketingApiAdApi.md#getAd) | **GET** /ad_campaign/{campaign_id}/ad/{ad_id} | /ad_campaign/{campaign_id}/ad/{ad_id}
[**getAds**](MarketingApiAdApi.md#getAds) | **GET** /ad_campaign/{campaign_id}/ad | /ad_campaign/{campaign_id}/ad
[**getAdsByInventoryReference**](MarketingApiAdApi.md#getAdsByInventoryReference) | **GET** /ad_campaign/{campaign_id}/get_ads_by_inventory_reference | /ad_campaign/{campaign_id}/get_ads_by_inventory_reference
[**updateBid**](MarketingApiAdApi.md#updateBid) | **POST** /ad_campaign/{campaign_id}/ad/{ad_id}/update_bid | /ad_campaign/{campaign_id}/ad/{ad_id}/update_bid


<a name="bulkCreateAdsByInventoryReference"></a>
# **bulkCreateAdsByInventoryReference**
> BulkCreateAdsByInventoryReferenceResponse bulkCreateAdsByInventoryReference(campaignId, bulkCreateAdsByInventoryReferenceRequest)

/ad_campaign/{campaign_id}/bulk_create_ads_by_inventory_reference

This method adds multiple listings that are managed with the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt; to an existing Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;For Promoted Listings Standard (PLS) campaigns using the Cost Per Sale (CPS) model, bulk ads may be directly created for the listing.&lt;br /&gt;&lt;br /&gt;For each listing specified in the request, this method:&lt;br /&gt;&lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ads created.&lt;/li&gt; &lt;li&gt;Associates the ads created with the specified campaign.&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;To create ads for a listing, specify their &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to which you want to associate the ads using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;Use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign\&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created. Get a seller's campaign IDs by calling <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a>.
    BulkCreateAdsByInventoryReferenceRequest bulkCreateAdsByInventoryReferenceRequest = new BulkCreateAdsByInventoryReferenceRequest(); // BulkCreateAdsByInventoryReferenceRequest | 
    try {
      BulkCreateAdsByInventoryReferenceResponse result = apiInstance.bulkCreateAdsByInventoryReference(campaignId, bulkCreateAdsByInventoryReferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkCreateAdsByInventoryReference");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created. Get a seller&#39;s campaign IDs by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt;. |
 **bulkCreateAdsByInventoryReferenceRequest** | [**BulkCreateAdsByInventoryReferenceRequest**](BulkCreateAdsByInventoryReferenceRequest.md)|  | [optional]

### Return type

[**BulkCreateAdsByInventoryReferenceResponse**](BulkCreateAdsByInventoryReferenceResponse.md)

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

<a name="bulkCreateAdsByListingId"></a>
# **bulkCreateAdsByListingId**
> BulkAdResponse bulkCreateAdsByListingId(campaignId, bulkCreateAdRequest)

/ad_campaign/{campaign_id}/bulk_create_ads_by_listing_id

This method adds multiple listings to an existing Promoted Listings campaign using &lt;b&gt;listingId&lt;/b&gt; values generated by the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot; title&#x3D;\&quot;Trading API Reference\&quot;&gt;Trading API&lt;/a&gt; or &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;, or using values generated by an ad group ID.&lt;p&gt;For Promoted Listings Standard (PLS) campaigns using the Cost Per Sale (CPS) funding model, bulk ads may be directly created for the listing.&lt;/p&gt;&lt;p&gt;For each listing ID specified in the request, this method:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ad.&lt;/li&gt; &lt;li&gt;Associates the ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;To create an ad for a listing, specify its &lt;b&gt;listingId&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ads with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Listing IDs are generated by eBay when a seller creates listings with the Trading API.&lt;/p&gt;&lt;p&gt;You can specify a maximum of &lt;b&gt;500 listings per call&lt;/b&gt; and each campaign can have ads for a maximum of 50,000 items. Be aware when using this call that each variation in a multiple-variation listing creates an individual ad.&lt;/p&gt;&lt;p&gt;For Promoted Listings Advanced (PLA) campaigns using the Cost Per Click (CPC) funding model, an ad group must be created first. If no ad group has been created for the campaign, ads cannot be created.&lt;/p&gt;&lt;p&gt;For the ad group specified in the request, this method associates the ad with the specified ad group.&lt;/p&gt;&lt;p&gt;To create an ad for an ad group, specify the name of the ad group plus the &lt;b&gt;defaultBid&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ads with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Ad groups are generated using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/adgroup/methods/createAdGroup\&quot;&gt;createAdGroup&lt;/a&gt;  method.&lt;/p&gt; &lt;p&gt;You can specify one or more ad groups per campaign.&lt;/p&gt;&lt;p&gt;Use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign\&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that's generated when a campaign is created. Get a seller's campaign IDs by calling <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a>.
    BulkCreateAdRequest bulkCreateAdRequest = new BulkCreateAdRequest(); // BulkCreateAdRequest | 
    try {
      BulkAdResponse result = apiInstance.bulkCreateAdsByListingId(campaignId, bulkCreateAdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkCreateAdsByListingId");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that&#39;s generated when a campaign is created. Get a seller&#39;s campaign IDs by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt;. |
 **bulkCreateAdRequest** | [**BulkCreateAdRequest**](BulkCreateAdRequest.md)|  | [optional]

### Return type

[**BulkAdResponse**](BulkAdResponse.md)

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

<a name="bulkDeleteAdsByInventoryReference"></a>
# **bulkDeleteAdsByInventoryReference**
> BulkDeleteAdsByInventoryReferenceResponse bulkDeleteAdsByInventoryReference(campaignId, bulkDeleteAdsByInventoryReferenceRequest)

/ad_campaign/{campaign_id}/bulk_delete_ads_by_inventory_reference

This method works with listings created with the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method deletes a set of ads, as specified by a list of inventory reference IDs, from the specified campaign. &lt;i&gt;Inventory reference IDs&lt;/i&gt; are seller-defined IDs that are used with the Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;Pass the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and populate the payload with a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs that you want to delete.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&#39;s inventory reference IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that's generated when a campaign is created. Get a seller's campaign IDs by calling <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a>.
    BulkDeleteAdsByInventoryReferenceRequest bulkDeleteAdsByInventoryReferenceRequest = new BulkDeleteAdsByInventoryReferenceRequest(); // BulkDeleteAdsByInventoryReferenceRequest | 
    try {
      BulkDeleteAdsByInventoryReferenceResponse result = apiInstance.bulkDeleteAdsByInventoryReference(campaignId, bulkDeleteAdsByInventoryReferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkDeleteAdsByInventoryReference");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that&#39;s generated when a campaign is created. Get a seller&#39;s campaign IDs by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt;. |
 **bulkDeleteAdsByInventoryReferenceRequest** | [**BulkDeleteAdsByInventoryReferenceRequest**](BulkDeleteAdsByInventoryReferenceRequest.md)|  | [optional]

### Return type

[**BulkDeleteAdsByInventoryReferenceResponse**](BulkDeleteAdsByInventoryReferenceResponse.md)

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

<a name="bulkDeleteAdsByListingId"></a>
# **bulkDeleteAdsByListingId**
> BulkDeleteAdResponse bulkDeleteAdsByListingId(campaignId, bulkDeleteAdRequest)

/ad_campaign/{campaign_id}/bulk_delete_ads_by_listing_id

This method works with listing IDs created with either the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot; title&#x3D;\&quot;Trading API Reference\&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method deletes a set of ads, as specified by a list of &lt;b&gt;listingID&lt;/b&gt; values from a Promoted Listings campaign. A listing ID value is generated by eBay when a seller creates a listing with either the Trading API and Inventory API.&lt;br /&gt;&lt;br /&gt;Pass the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and populate the payload with the set of listing IDs that you want to delete.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&#39;s inventory reference IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/bulkUpdateAdsStatusByListingId\&quot;&gt;bulkUpdateAdsStatusByListingId&lt;/a&gt; method to change the status of ads to ARCHIVED.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that's generated when a campaign is created. Get a seller's campaign IDs by calling <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a>.
    BulkDeleteAdRequest bulkDeleteAdRequest = new BulkDeleteAdRequest(); // BulkDeleteAdRequest | 
    try {
      BulkDeleteAdResponse result = apiInstance.bulkDeleteAdsByListingId(campaignId, bulkDeleteAdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkDeleteAdsByListingId");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that&#39;s generated when a campaign is created. Get a seller&#39;s campaign IDs by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt;. |
 **bulkDeleteAdRequest** | [**BulkDeleteAdRequest**](BulkDeleteAdRequest.md)|  | [optional]

### Return type

[**BulkDeleteAdResponse**](BulkDeleteAdResponse.md)

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

<a name="bulkUpdateAdsBidByInventoryReference"></a>
# **bulkUpdateAdsBidByInventoryReference**
> BulkUpdateAdsByInventoryReferenceResponse bulkUpdateAdsBidByInventoryReference(campaignId, bulkCreateAdsByInventoryReferenceRequest)

/ad_campaign/{campaign_id}/bulk_update_ads_bid_by_inventory_reference

This method works with listings created with either the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot; title&#x3D;\&quot;Trading API Reference\&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method updates the &lt;b&gt;bidPercentage&lt;/b&gt; values for a set of ads associated with the specified campaign.&lt;/p&gt;  &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their associated updated &lt;b&gt;bidPercentage&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;/p&gt;  &lt;p&gt;Get the campaign IDs for a seller by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&#39;s inventory reference IDs.&lt;/p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that's generated when a campaign is created. Get a seller's campaign IDs by calling <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a>.
    BulkCreateAdsByInventoryReferenceRequest bulkCreateAdsByInventoryReferenceRequest = new BulkCreateAdsByInventoryReferenceRequest(); // BulkCreateAdsByInventoryReferenceRequest | 
    try {
      BulkUpdateAdsByInventoryReferenceResponse result = apiInstance.bulkUpdateAdsBidByInventoryReference(campaignId, bulkCreateAdsByInventoryReferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkUpdateAdsBidByInventoryReference");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that&#39;s generated when a campaign is created. Get a seller&#39;s campaign IDs by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt;. |
 **bulkCreateAdsByInventoryReferenceRequest** | [**BulkCreateAdsByInventoryReferenceRequest**](BulkCreateAdsByInventoryReferenceRequest.md)|  | [optional]

### Return type

[**BulkUpdateAdsByInventoryReferenceResponse**](BulkUpdateAdsByInventoryReferenceResponse.md)

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

<a name="bulkUpdateAdsBidByListingId"></a>
# **bulkUpdateAdsBidByListingId**
> BulkAdUpdateResponse bulkUpdateAdsBidByListingId(campaignId, bulkCreateAdRequest)

/ad_campaign/{campaign_id}/bulk_update_ads_bid_by_listing_id

This method works with listings created with either the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot; title&#x3D;\&quot;Trading API Reference\&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method updates the &lt;b&gt;bidPercentage&lt;/b&gt; values for a set of ads associated with the specified campaign.&lt;/p&gt;  &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their associated updated &lt;b&gt;bidPercentage&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;/p&gt;  &lt;p&gt;Get the campaign IDs for a seller by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&#39;s inventory reference IDs.&lt;/p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that's generated when a campaign is created. Get a seller's campaign IDs by calling <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a>.
    BulkCreateAdRequest bulkCreateAdRequest = new BulkCreateAdRequest(); // BulkCreateAdRequest | 
    try {
      BulkAdUpdateResponse result = apiInstance.bulkUpdateAdsBidByListingId(campaignId, bulkCreateAdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkUpdateAdsBidByListingId");
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
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that&#39;s generated when a campaign is created. Get a seller&#39;s campaign IDs by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt;. |
 **bulkCreateAdRequest** | [**BulkCreateAdRequest**](BulkCreateAdRequest.md)|  | [optional]

### Return type

[**BulkAdUpdateResponse**](BulkAdUpdateResponse.md)

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

<a name="bulkUpdateAdsStatus"></a>
# **bulkUpdateAdsStatus**
> BulkAdUpdateStatusResponse bulkUpdateAdsStatus(campaignId, bulkUpdateAdStatusRequest)

/ad_campaign/{campaign_id}/bulk_update_ads_status

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt; &lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method works with listings created with either the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;This method updates the status of ads in bulk.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; in the request payload.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    BulkUpdateAdStatusRequest bulkUpdateAdStatusRequest = new BulkUpdateAdStatusRequest(); // BulkUpdateAdStatusRequest | 
    try {
      BulkAdUpdateStatusResponse result = apiInstance.bulkUpdateAdsStatus(campaignId, bulkUpdateAdStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkUpdateAdsStatus");
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
 **bulkUpdateAdStatusRequest** | [**BulkUpdateAdStatusRequest**](BulkUpdateAdStatusRequest.md)|  | [optional]

### Return type

[**BulkAdUpdateStatusResponse**](BulkAdUpdateStatusResponse.md)

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

<a name="bulkUpdateAdsStatusByListingId"></a>
# **bulkUpdateAdsStatusByListingId**
> BulkAdUpdateStatusByListingIdResponse bulkUpdateAdsStatusByListingId(campaignId, bulkUpdateAdStatusByListingIdRequest)

/ad_campaign/{campaign_id}/bulk_update_ads_status_by_listing_id

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt; &lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method works with listings created with either the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method updates the status of ads in bulk, based on listing ID values.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their updated &lt;b&gt;adStatus&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt; to retrieve a list of seller inventory reference IDs.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    BulkUpdateAdStatusByListingIdRequest bulkUpdateAdStatusByListingIdRequest = new BulkUpdateAdStatusByListingIdRequest(); // BulkUpdateAdStatusByListingIdRequest | 
    try {
      BulkAdUpdateStatusByListingIdResponse result = apiInstance.bulkUpdateAdsStatusByListingId(campaignId, bulkUpdateAdStatusByListingIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#bulkUpdateAdsStatusByListingId");
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
 **bulkUpdateAdStatusByListingIdRequest** | [**BulkUpdateAdStatusByListingIdRequest**](BulkUpdateAdStatusByListingIdRequest.md)|  | [optional]

### Return type

[**BulkAdUpdateStatusByListingIdResponse**](BulkAdUpdateStatusByListingIdResponse.md)

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

<a name="createAdByListingId"></a>
# **createAdByListingId**
> Object createAdByListingId(campaignId, createAdRequest)

/ad_campaign/{campaign_id}/ad

This method adds a listing to an existing Promoted Listings campaign using a &lt;b&gt;listingId&lt;/b&gt; value generated by the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot; title&#x3D;\&quot;Trading API Reference\&quot;&gt;Trading API&lt;/a&gt; or &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;, or using a value generated by an ad group ID. &lt;p&gt;For Promoted Listings Standard (PLS) campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;/p&gt;&lt;p&gt;For the listing ID specified in the request, this method:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ad.&lt;/li&gt; &lt;li&gt;Associates the ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;To create an ad for a listing, specify its &lt;b&gt;listingId&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Listing IDs are generated by eBay when a seller creates listings with the Trading API.&lt;/p&gt;&lt;p&gt;For Promoted Listings Advanced (PLA) campaigns using the Cost Per Click (CPC) funding model, an ad group must be created first. If no ad group has been created for the campaign, an ad cannot be created.&lt;/p&gt;&lt;p&gt;For the ad group specified in the request, this method associates the ad with the specified ad group.&lt;/p&gt;&lt;p&gt;To create an ad for an ad group, specify the name of the ad group in the payload of the request. Specify the campaign to associate the ads with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Ad groups are generated using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/adgroup/methods/createAdGroup\&quot;&gt;createAdGroup&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;You can specify one or more ad groups per campaign.&lt;/p&gt;&lt;p&gt;Use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign\&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.&lt;/p&gt;&lt;p&gt;This call has no response payload. If the ad is successfully created, a &lt;code&gt;201 Created&lt;/code&gt; HTTP status code and the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAd\&quot;&gt;getAd&lt;/a&gt; URI of the ad are returned in the location header.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    CreateAdRequest createAdRequest = new CreateAdRequest(); // CreateAdRequest | 
    try {
      Object result = apiInstance.createAdByListingId(campaignId, createAdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#createAdByListingId");
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
 **createAdRequest** | [**CreateAdRequest**](CreateAdRequest.md)|  | [optional]

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

<a name="createAdsByInventoryReference"></a>
# **createAdsByInventoryReference**
> AdReferences createAdsByInventoryReference(campaignId, createAdsByInventoryReferenceRequest)

/ad_campaign/{campaign_id}/create_ads_by_inventory_reference

This method adds a listing that is managed with the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt; to an existing Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;For Promoted Listings Standard (PLS) campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;br /&gt;&lt;br /&gt;For each listing specified in the request, this method:&lt;br /&gt;&lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ads created.&lt;/li&gt; &lt;li&gt;Associates the created ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;To create an ad for a listing, specify its &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;Use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign\&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    CreateAdsByInventoryReferenceRequest createAdsByInventoryReferenceRequest = new CreateAdsByInventoryReferenceRequest(); // CreateAdsByInventoryReferenceRequest | 
    try {
      AdReferences result = apiInstance.createAdsByInventoryReference(campaignId, createAdsByInventoryReferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#createAdsByInventoryReference");
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
 **createAdsByInventoryReferenceRequest** | [**CreateAdsByInventoryReferenceRequest**](CreateAdsByInventoryReferenceRequest.md)|  | [optional]

### Return type

[**AdReferences**](AdReferences.md)

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

<a name="deleteAd"></a>
# **deleteAd**
> Object deleteAd(adId, campaignId)

/ad_campaign/{campaign_id}/ad/{ad_id}

This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&#39;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;b&gt;bulkUpdateAdsStatusByListingId&lt;/b&gt; method to change the status of ads to ARCHIVED.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String adId = "adId_example"; // String | Identifier of an ad. This ID was generated when the ad was created.
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      Object result = apiInstance.deleteAd(adId, campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#deleteAd");
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
 **adId** | **String**| Identifier of an ad. This ID was generated when the ad was created. |
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

<a name="deleteAdsByInventoryReference"></a>
# **deleteAdsByInventoryReference**
> AdIds deleteAdsByInventoryReference(campaignId, deleteAdsByInventoryReferenceRequest)

/ad_campaign/{campaign_id}/delete_ads_by_inventory_reference

This method works with listings that are managed with the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method deletes ads using a list of seller-defined inventory reference IDs, used with the Inventory API, that are associated with the specified campaign ID.&lt;/p&gt; &lt;p&gt;Specify the campaign ID (as a path parameter) and a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs to be deleted.&lt;/p&gt;  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to get a list of the seller&#39;s current campaign IDs.&lt;/p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When using the CPC funding model, use the bulkUpdateAdsStatusByInventoryReference method to change the status of ads to ARCHIVED.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    DeleteAdsByInventoryReferenceRequest deleteAdsByInventoryReferenceRequest = new DeleteAdsByInventoryReferenceRequest(); // DeleteAdsByInventoryReferenceRequest | 
    try {
      AdIds result = apiInstance.deleteAdsByInventoryReference(campaignId, deleteAdsByInventoryReferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#deleteAdsByInventoryReference");
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
 **deleteAdsByInventoryReferenceRequest** | [**DeleteAdsByInventoryReferenceRequest**](DeleteAdsByInventoryReferenceRequest.md)|  | [optional]

### Return type

[**AdIds**](AdIds.md)

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

<a name="getAd"></a>
# **getAd**
> Ad getAd(adId, campaignId)

/ad_campaign/{campaign_id}/ad/{ad_id}

This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt; &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&#39;s current campaign IDs and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String adId = "adId_example"; // String | A unique identifier for an ad. This ID is generated when the ad is created.
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    try {
      Ad result = apiInstance.getAd(adId, campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#getAd");
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
 **adId** | **String**| A unique identifier for an ad. This ID is generated when the ad is created. |
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |

### Return type

[**Ad**](Ad.md)

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

<a name="getAds"></a>
# **getAds**
> AdPagedCollectionResponse getAds(campaignId, adGroupIds, adStatus, limit, listingIds, offset)

/ad_campaign/{campaign_id}/ad

This method retrieves Promoted Listings ads that are associated with listings created with either the &lt;a href&#x3D;\&quot;/Devzone/XML/docs/Reference/eBay/index.html\&quot; title&#x3D;\&quot;Trading API Reference\&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The method retrieves ads related to the specified campaign. Specify the Promoted Listings campaign to target with the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;/p&gt;  &lt;p&gt;Because of the large number of possible results, you can use query parameters to paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many ads to return on each page of the response. You can also specify how many ads to skip in the result set before returning the first result using the &lt;b&gt;offset&lt;/b&gt; path parameter.&lt;/p&gt;  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the current campaign IDs for the seller.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    String adGroupIds = "adGroupIds_example"; // String | A comma-separated list of ad group IDs. The results will be filtered to only include active ads for these ad groups. Call <a href=\"/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups\">getAdGroups</a> to retrieve the ad group ID for the ad group.<br /><br /><span class=\"tablenote\"><b>Note:</b> This field only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model.</span>
    String adStatus = "adStatus_example"; // String | A comma-separated list of ad statuses. The results will be filtered to only include the given statuses of the ad. If none are provided, all ads are returned.
    String limit = "limit_example"; // String | Specifies the maximum number of ads to return on a page in the paginated response. <p><b>Default: </b>10 <br><b>Maximum:</b> 500</p>
    String listingIds = "listingIds_example"; // String | A comma-separated list of listing IDs. The response includes only active ads (ads associated with a RUNNING campaign). The results do not include listing IDs that are excluded by other conditions.
    String offset = "offset_example"; // String | Specifies the number of ads to skip in the result set before returning the first ad in the paginated response.  <p>Combine <b>offset</b> with the <b>limit</b> query parameter to control the items returned in the response. For example, if you supply an <b>offset</b> of <code>0</code> and a <b>limit</b> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <b>offset</b> is <code>10</code> and <b>limit</b> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set.</p> <p><b>Default:</b> 0</p>
    try {
      AdPagedCollectionResponse result = apiInstance.getAds(campaignId, adGroupIds, adStatus, limit, listingIds, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#getAds");
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
 **adGroupIds** | **String**| A comma-separated list of ad group IDs. The results will be filtered to only include active ads for these ad groups. Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups\&quot;&gt;getAdGroups&lt;/a&gt; to retrieve the ad group ID for the ad group.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt; | [optional]
 **adStatus** | **String**| A comma-separated list of ad statuses. The results will be filtered to only include the given statuses of the ad. If none are provided, all ads are returned. | [optional]
 **limit** | **String**| Specifies the maximum number of ads to return on a page in the paginated response. &lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;10 &lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500&lt;/p&gt; | [optional]
 **listingIds** | **String**| A comma-separated list of listing IDs. The response includes only active ads (ads associated with a RUNNING campaign). The results do not include listing IDs that are excluded by other conditions. | [optional]
 **offset** | **String**| Specifies the number of ads to skip in the result set before returning the first ad in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; | [optional]

### Return type

[**AdPagedCollectionResponse**](AdPagedCollectionResponse.md)

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

<a name="getAdsByInventoryReference"></a>
# **getAdsByInventoryReference**
> Ads getAdsByInventoryReference(campaignId, inventoryReferenceId, inventoryReferenceType)

/ad_campaign/{campaign_id}/get_ads_by_inventory_reference

This method retrieves Promoted Listings ads associated with listings that are managed with the &lt;a href&#x3D;\&quot;/api-docs/sell/inventory/resources/methods\&quot; title&#x3D;\&quot;Inventory API Reference\&quot;&gt;Inventory API&lt;/a&gt; from the specified campaign.&lt;br /&gt;&lt;br /&gt;Supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and use query parameters to specify the &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt; pairs.&lt;br /&gt;&lt;br /&gt;In the Inventory API, an &lt;i&gt;inventory reference ID&lt;/i&gt; is either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; (a seller-defined ID for an inventory item group, which is an entity that&#39;s used in the Inventory API to create a multiple-variation listing). To indicate a listing managed by the Inventory API, you must always specify both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and the associated &lt;b&gt;inventory_reference_type&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve all of the seller&#39;s the current campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    String inventoryReferenceId = "inventoryReferenceId_example"; // String | The inventory reference ID associated with the ad you want returned. A seller's inventory reference ID is the ID of either a listing or the ID of an inventory item group (the parent of a multi-variation listing, such as a shirt that is available in multiple sizes and colors). You must always supply in both an <b>inventory_reference_id</b> and an <b>inventory_reference_type</b>.
    String inventoryReferenceType = "inventoryReferenceType_example"; // String | The type of the inventory reference ID. Set this value to either <code>INVENTORY_ITEM</CODE> (a single listing) or <code>INVENTORY_ITEM_GROUP</CODE> (a multi-variation listing). You must always pass in both an <b>inventory_reference_id</b> and an <b>inventory_reference_type</b>. 
    try {
      Ads result = apiInstance.getAdsByInventoryReference(campaignId, inventoryReferenceId, inventoryReferenceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#getAdsByInventoryReference");
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
 **inventoryReferenceId** | **String**| The inventory reference ID associated with the ad you want returned. A seller&#39;s inventory reference ID is the ID of either a listing or the ID of an inventory item group (the parent of a multi-variation listing, such as a shirt that is available in multiple sizes and colors). You must always supply in both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and an &lt;b&gt;inventory_reference_type&lt;/b&gt;. |
 **inventoryReferenceType** | **String**| The type of the inventory reference ID. Set this value to either &lt;code&gt;INVENTORY_ITEM&lt;/CODE&gt; (a single listing) or &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/CODE&gt; (a multi-variation listing). You must always pass in both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and an &lt;b&gt;inventory_reference_type&lt;/b&gt;.  |

### Return type

[**Ads**](Ads.md)

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

<a name="updateBid"></a>
# **updateBid**
> Object updateBid(adId, campaignId, updateBidPercentageRequest)

/ad_campaign/{campaign_id}/ad/{ad_id}/update_bid

This method updates the bid percentage (also known as the \&quot;ad rate\&quot;) for the specified ad in the specified campaign. &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters, and supply the new &lt;b&gt;bidPercentage&lt;/b&gt; value in the payload of the call.&lt;/p&gt;  &lt;p&gt;Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&#39;s current campaign IDs and call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/ad/methods/getAds\&quot;&gt;getAds&lt;/a&gt; to get their ad IDs.&lt;/p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model\&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdApi apiInstance = new MarketingApiAdApi(defaultClient);
    String adId = "adId_example"; // String | A unique eBay-assigned ID for an ad that's generated when an ad is created.
    String campaignId = "campaignId_example"; // String | A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.<br /><br /><span class=\"tablenote\"><b>Note:</b> You can retrieve the campaign IDs for a specified seller using the <a href=\"/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\">getCampaigns</a> method.</span>
    UpdateBidPercentageRequest updateBidPercentageRequest = new UpdateBidPercentageRequest(); // UpdateBidPercentageRequest | 
    try {
      Object result = apiInstance.updateBid(adId, campaignId, updateBidPercentageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdApi#updateBid");
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
 **adId** | **String**| A unique eBay-assigned ID for an ad that&#39;s generated when an ad is created. |
 **campaignId** | **String**| A unique eBay-assigned ID for an ad campaign that is generated when a campaign is created.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can retrieve the campaign IDs for a specified seller using the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;/span&gt; |
 **updateBidPercentageRequest** | [**UpdateBidPercentageRequest**](UpdateBidPercentageRequest.md)|  | [optional]

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

