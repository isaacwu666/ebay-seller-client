# InventoryApiOfferApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateOffer**](InventoryApiOfferApi.md#bulkCreateOffer) | **POST** /bulk_create_offer | /bulk_create_offer
[**bulkPublishOffer**](InventoryApiOfferApi.md#bulkPublishOffer) | **POST** /bulk_publish_offer | /bulk_publish_offer
[**createOffer**](InventoryApiOfferApi.md#createOffer) | **POST** /offer | /offer
[**deleteOffer**](InventoryApiOfferApi.md#deleteOffer) | **DELETE** /offer/{offerId} | /offer/{offerId}
[**getListingFees**](InventoryApiOfferApi.md#getListingFees) | **POST** /offer/get_listing_fees | /offer/get_listing_fees
[**getOffer**](InventoryApiOfferApi.md#getOffer) | **GET** /offer/{offerId} | /offer/{offerId}
[**getOffers**](InventoryApiOfferApi.md#getOffers) | **GET** /offer | /offer
[**publishOffer**](InventoryApiOfferApi.md#publishOffer) | **POST** /offer/{offerId}/publish/ | /offer/{offerId}/publish/
[**publishOfferByInventoryItemGroup**](InventoryApiOfferApi.md#publishOfferByInventoryItemGroup) | **POST** /offer/publish_by_inventory_item_group/ | /offer/publish_by_inventory_item_group/
[**updateOffer**](InventoryApiOfferApi.md#updateOffer) | **PUT** /offer/{offerId} | /offer/{offerId}
[**withdrawOffer**](InventoryApiOfferApi.md#withdrawOffer) | **POST** /offer/{offerId}/withdraw | /offer/{offerId}/withdraw
[**withdrawOfferByInventoryItemGroup**](InventoryApiOfferApi.md#withdrawOfferByInventoryItemGroup) | **POST** /offer/withdraw_by_inventory_item_group | /offer/withdraw_by_inventory_item_group


<a name="bulkCreateOffer"></a>
# **bulkCreateOffer**
> BulkOfferResponse bulkCreateOffer(bulkEbayOfferDetailsWithKeys)

/bulk_create_offer

This call creates multiple offers (up to 25) for specific inventory items on a specific eBay marketplace. Although it is not a requirement for the seller to create complete offers (with all necessary details) right from the start, eBay recommends that the seller provide all necessary details with this call since there is currently no bulk operation available to update multiple offers with one call. The following fields are always required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;. &lt;br&gt;&lt;br&gt;Other information that will be required before a offer can be published are highlighted below: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt;&lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;If the call is successful, unique &lt;strong&gt;offerId&lt;/strong&gt; values are returned in the response for each successfully created offer. The &lt;strong&gt;offerId&lt;/strong&gt; value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run either the &lt;strong&gt;publishOffer&lt;/strong&gt;, &lt;strong&gt;bulkPublishOffer&lt;/strong&gt;, or &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to convert offer(s) into an active single- or multiple-variation listing.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create a single offer per call, the &lt;strong&gt;createOffer&lt;/strong&gt; method can be used instead.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    BulkEbayOfferDetailsWithKeys bulkEbayOfferDetailsWithKeys = new BulkEbayOfferDetailsWithKeys(); // BulkEbayOfferDetailsWithKeys | 
    try {
      BulkOfferResponse result = apiInstance.bulkCreateOffer(bulkEbayOfferDetailsWithKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#bulkCreateOffer");
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
 **bulkEbayOfferDetailsWithKeys** | [**BulkEbayOfferDetailsWithKeys**](BulkEbayOfferDetailsWithKeys.md)|  | [optional]

### Return type

[**BulkOfferResponse**](BulkOfferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**207** | Multi-Status |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="bulkPublishOffer"></a>
# **bulkPublishOffer**
> BulkPublishResponse bulkPublishOffer(bulkOffer)

/bulk_publish_offer

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call is used to convert unpublished offers (up to 25) into  published offers, or live eBay listings. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) of each offer to publlish is passed into the request payload. It is possible that some unpublished offers will be successfully created into eBay listings, but others may fail. The response payload will show the results for each &lt;strong&gt;offerId&lt;/strong&gt; value that is passed into the request payload. The &lt;strong&gt;errors&lt;/strong&gt; and &lt;strong&gt;warnings&lt;/strong&gt; containers will be returned for an offer that had one or more issues being published. &lt;br/&gt;&lt;br/&gt;For those who prefer to publish one offer per call, the &lt;strong&gt;publishOffer&lt;/strong&gt; method can be used instead. In the case of a multiple-variation listing, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    BulkOffer bulkOffer = new BulkOffer(); // BulkOffer | 
    try {
      BulkPublishResponse result = apiInstance.bulkPublishOffer(bulkOffer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#bulkPublishOffer");
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
 **bulkOffer** | [**BulkOffer**](BulkOffer.md)|  | [optional]

### Return type

[**BulkPublishResponse**](BulkPublishResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**207** | Multi-Status |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="createOffer"></a>
# **createOffer**
> OfferResponse createOffer(contentLanguage, ebayOfferDetailsWithKeys)

/offer

This call creates an offer for a specific inventory item on a specific eBay marketplace. It is up to the sellers whether they want to create a complete offer (with all necessary details) right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOffer&lt;/strong&gt; call, and then make one or more subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; calls to complete the offer and prepare to publish the offer. Upon first creating an offer, the following fields are required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;. &lt;br&gt;&lt;br&gt;Other information that will be required before an offer can be published are highlighted below. These settings are either set with &lt;strong&gt;createOffer&lt;/strong&gt;, or they can be set with a subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; call: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;If the call is successful, a unique &lt;strong&gt;offerId&lt;/strong&gt; value is returned in the response. This value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run the &lt;strong&gt;publishOffer&lt;/strong&gt; call to convert the offer to an active eBay listing.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOffer&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; method can be used.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    String contentLanguage = "contentLanguage_example"; // String | This request header sets the natural language that will be provided in the field values of the request payload.
    EbayOfferDetailsWithKeys ebayOfferDetailsWithKeys = new EbayOfferDetailsWithKeys(); // EbayOfferDetailsWithKeys | 
    try {
      OfferResponse result = apiInstance.createOffer(contentLanguage, ebayOfferDetailsWithKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#createOffer");
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
 **contentLanguage** | **String**| This request header sets the natural language that will be provided in the field values of the request payload. |
 **ebayOfferDetailsWithKeys** | [**EbayOfferDetailsWithKeys**](EbayOfferDetailsWithKeys.md)|  | [optional]

### Return type

[**OfferResponse**](OfferResponse.md)

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

<a name="deleteOffer"></a>
# **deleteOffer**
> Object deleteOffer(offerId)

/offer/{offerId}

If used against an unpublished offer, this call will permanently delete that offer. In the case of a published offer (or live eBay listing), a successful call will either end the single-variation listing associated with the offer, or it will remove that product variation from the eBay listing and also automatically remove that product variation from the inventory item group. In the case of a multiple-variation listing, the &lt;strong&gt;deleteOffer&lt;/strong&gt; will not remove the product variation from the listing if that variation has one or more sales. If that product variation has one or more sales, the seller can alternately just set the available quantity of that product variation to &lt;code&gt;0&lt;/code&gt;, so it is not available in the eBay search or View Item page, and then the seller can remove that product variation from the inventory item group at a later time.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    String offerId = "offerId_example"; // String | The unique identifier of the offer to delete. The unique identifier of the offer (<strong>offerId</strong>) is passed in at the end of the call URI.
    try {
      Object result = apiInstance.deleteOffer(offerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#deleteOffer");
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
 **offerId** | **String**| The unique identifier of the offer to delete. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI. |

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
**500** | Internal Server Error |  -  |

<a name="getListingFees"></a>
# **getListingFees**
> FeesSummaryResponse getListingFees(offerKeysWithId)

/offer/get_listing_fees

This call is used to retrieve the expected listing fees for up to 250 unpublished offers. An array of one or more &lt;strong&gt;offerId&lt;/strong&gt; values are passed in under the &lt;strong&gt;offers&lt;/strong&gt; container.&lt;br/&gt;&lt;br/&gt; In the response payload, all listing fees are grouped by eBay marketplace, and listing fees per offer are not shown. A &lt;strong&gt;fees&lt;/strong&gt; container will be returned for each eBay marketplace where the seller is selling the products associated with the specified offers. &lt;br/&gt;&lt;br/&gt; Errors will occur if the seller passes in &lt;strong&gt;offerIds&lt;/strong&gt; that represent published offers, so this call should be made before the seller publishes offers with the &lt;strong&gt;publishOffer&lt;/strong&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    OfferKeysWithId offerKeysWithId = new OfferKeysWithId(); // OfferKeysWithId | 
    try {
      FeesSummaryResponse result = apiInstance.getListingFees(offerKeysWithId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#getListingFees");
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
 **offerKeysWithId** | [**OfferKeysWithId**](OfferKeysWithId.md)|  | [optional]

### Return type

[**FeesSummaryResponse**](FeesSummaryResponse.md)

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
**500** | Internal Server Error |  -  |

<a name="getOffer"></a>
# **getOffer**
> EbayOfferDetailsWithAll getOffer(offerId)

/offer/{offerId}

This call retrieves a specific published or unpublished offer. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    String offerId = "offerId_example"; // String | The unique identifier of the offer that is to be retrieved.
    try {
      EbayOfferDetailsWithAll result = apiInstance.getOffer(offerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#getOffer");
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
 **offerId** | **String**| The unique identifier of the offer that is to be retrieved. |

### Return type

[**EbayOfferDetailsWithAll**](EbayOfferDetailsWithAll.md)

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

<a name="getOffers"></a>
# **getOffers**
> Offers getOffers(format, limit, marketplaceId, offset, sku)

/offer

This call retrieves all existing offers for the specified SKU value. The seller has the option of limiting the offers that are retrieved to a specific eBay marketplace, or to a listing format.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, and the only supported listing format is fixed-price, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; and &lt;strong&gt;format&lt;/strong&gt; query parameters currently do not have any practical use for this call.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    String format = "format_example"; // String | This enumeration value sets the listing format for the offer. This query parameter will be passed in if the seller only wants to see offers in this specified listing format.
    String limit = "limit_example"; // String | The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be a positive integer value. If this query parameter is not set, up to 100 records will be returned on each page of results.
    String marketplaceId = "marketplaceId_example"; // String | The unique identifier of the eBay marketplace. This query parameter will be passed in if the seller only wants to see the product's offers on a specific eBay marketplace.<br /><br /><span class=\"tablenote\"><strong>Note:</strong> At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the <strong>marketplace_id</strong> query parameter currently does not have any practical use for this call.</span>
    String offset = "offset_example"; // String | The value passed in this query parameter sets the page number to retrieve. Although this field is a string, the value passed in this field should be a integer value equal to or greater than <code>0</code>. The first page of records has a value of <code>0</code>, the second page of records has a value of <code>1</code>, and so on. If this query parameter is not set, its value defaults to <code>0</code>, and the first page of records is returned.
    String sku = "sku_example"; // String | The seller-defined SKU value is passed in as a query parameter. All offers associated with this product are returned in the response.<br/><br/> <strong>Max length</strong>: 50.
    try {
      Offers result = apiInstance.getOffers(format, limit, marketplaceId, offset, sku);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#getOffers");
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
 **format** | **String**| This enumeration value sets the listing format for the offer. This query parameter will be passed in if the seller only wants to see offers in this specified listing format. | [optional]
 **limit** | **String**| The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be a positive integer value. If this query parameter is not set, up to 100 records will be returned on each page of results. | [optional]
 **marketplaceId** | **String**| The unique identifier of the eBay marketplace. This query parameter will be passed in if the seller only wants to see the product&#39;s offers on a specific eBay marketplace.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; query parameter currently does not have any practical use for this call.&lt;/span&gt; | [optional]
 **offset** | **String**| The value passed in this query parameter sets the page number to retrieve. Although this field is a string, the value passed in this field should be a integer value equal to or greater than &lt;code&gt;0&lt;/code&gt;. The first page of records has a value of &lt;code&gt;0&lt;/code&gt;, the second page of records has a value of &lt;code&gt;1&lt;/code&gt;, and so on. If this query parameter is not set, its value defaults to &lt;code&gt;0&lt;/code&gt;, and the first page of records is returned. | [optional]
 **sku** | **String**| The seller-defined SKU value is passed in as a query parameter. All offers associated with this product are returned in the response.&lt;br/&gt;&lt;br/&gt; &lt;strong&gt;Max length&lt;/strong&gt;: 50. | [optional]

### Return type

[**Offers**](Offers.md)

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

<a name="publishOffer"></a>
# **publishOffer**
> PublishResponse publishOffer(offerId)

/offer/{offerId}/publish/

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call is used to convert an unpublished offer into a published offer, or live eBay listing. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;br/&gt;&lt;br/&gt;For those who prefer to publish multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkPublishOffer&lt;/strong&gt; method can be used. In the case of a multiple-variation listing, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    String offerId = "offerId_example"; // String | The unique identifier of the offer that is to be published.
    try {
      PublishResponse result = apiInstance.publishOffer(offerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#publishOffer");
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
 **offerId** | **String**| The unique identifier of the offer that is to be published. |

### Return type

[**PublishResponse**](PublishResponse.md)

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

<a name="publishOfferByInventoryItemGroup"></a>
# **publishOfferByInventoryItemGroup**
> PublishResponse publishOfferByInventoryItemGroup(publishByInventoryItemGroupRequest)

/offer/publish_by_inventory_item_group/

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call is used to convert all unpublished offers associated with an inventory item group into an active, multiple-variation listing.&lt;br/&gt;&lt;br/&gt; The unique identifier of the inventory item group (&lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt;) is passed in the request payload. All inventory items and their corresponding offers in the inventory item group must be valid (meet all requirements) for the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to be completely successful. For any inventory items in the group that are missing required data or have no corresponding offers, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; will create a new multiple-variation listing, but any inventory items with missing required data/offers will not be in the newly-created listing. If any inventory items in the group to be published have invalid data, or one or more of the inventory items have conflicting data with one another, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call will fail. Be sure to check for any error or warning messages in the call response for any applicable information about one or more inventory items/offers having issues.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    PublishByInventoryItemGroupRequest publishByInventoryItemGroupRequest = new PublishByInventoryItemGroupRequest(); // PublishByInventoryItemGroupRequest | 
    try {
      PublishResponse result = apiInstance.publishOfferByInventoryItemGroup(publishByInventoryItemGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#publishOfferByInventoryItemGroup");
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
 **publishByInventoryItemGroupRequest** | [**PublishByInventoryItemGroupRequest**](PublishByInventoryItemGroupRequest.md)|  | [optional]

### Return type

[**PublishResponse**](PublishResponse.md)

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
**500** | Internal Server Error |  -  |

<a name="updateOffer"></a>
# **updateOffer**
> OfferResponse updateOffer(offerId, contentLanguage, ebayOfferDetailsWithId)

/offer/{offerId}

This call updates an existing offer. An existing offer may be in published state (active eBay listing), or in an unpublished state and yet to be published with the &lt;strong&gt;publishOffer&lt;/strong&gt; call. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) for the offer to update is passed in at the end of the call URI. &lt;br/&gt;&lt;br/&gt; The &lt;strong&gt;updateOffer&lt;/strong&gt; call does a complete replacement of the existing offer object, so all fields that make up the current offer object are required, regardless of whether their values changed. &lt;br/&gt;&lt;br/&gt; Other information that is required before an unpublished offer can be published or before a published offer can be revised include: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt;  &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted from both the &lt;strong&gt;updateOffer&lt;/strong&gt; and the &lt;strong&gt;createOffer&lt;/strong&gt; calls. If a value is specified in the &lt;strong&gt;updateOffer&lt;/strong&gt; call, this value will be used.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;For published offers, the &lt;strong&gt;listingDescription&lt;/strong&gt; field is also required to update the offer/eBay listing. For unpublished offers, this field is not necessarily required unless it is already set for the unpublished offer.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;updateOffer&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    String offerId = "offerId_example"; // String | The unique identifier of the offer that is being updated. This identifier is passed in at the end of the call URI.
    String contentLanguage = "contentLanguage_example"; // String | This request header sets the natural language that will be provided in the field values of the request payload.
    EbayOfferDetailsWithId ebayOfferDetailsWithId = new EbayOfferDetailsWithId(); // EbayOfferDetailsWithId | 
    try {
      OfferResponse result = apiInstance.updateOffer(offerId, contentLanguage, ebayOfferDetailsWithId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#updateOffer");
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
 **offerId** | **String**| The unique identifier of the offer that is being updated. This identifier is passed in at the end of the call URI. |
 **contentLanguage** | **String**| This request header sets the natural language that will be provided in the field values of the request payload. |
 **ebayOfferDetailsWithId** | [**EbayOfferDetailsWithId**](EbayOfferDetailsWithId.md)|  | [optional]

### Return type

[**OfferResponse**](OfferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="withdrawOffer"></a>
# **withdrawOffer**
> WithdrawResponse withdrawOffer(offerId)

/offer/{offerId}/withdraw

This call is used to end a single-variation listing that is associated with the specified offer. This call is used in place of the &lt;strong&gt;deleteOffer&lt;/strong&gt; call if the seller only wants to end the listing associated with the offer but does not want to delete the offer object. With this call, the offer object remains, but it goes into the unpublished state, and will require a &lt;strong&gt;publishOffer&lt;/strong&gt; call to relist the offer.&lt;br&gt;&lt;br&gt;To end a multiple-variation listing that is associated with an inventory item group, the &lt;strong&gt;withdrawOfferByInventoryItemGroup&lt;/strong&gt; method can be used. This call only ends the multiple-variation listing associated with an inventory item group but does not delete the inventory item group object, nor does it delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    String offerId = "offerId_example"; // String | The unique identifier of the offer that is to be withdrawn. This value is passed into the path of the call URI.
    try {
      WithdrawResponse result = apiInstance.withdrawOffer(offerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#withdrawOffer");
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
 **offerId** | **String**| The unique identifier of the offer that is to be withdrawn. This value is passed into the path of the call URI. |

### Return type

[**WithdrawResponse**](WithdrawResponse.md)

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

<a name="withdrawOfferByInventoryItemGroup"></a>
# **withdrawOfferByInventoryItemGroup**
> Object withdrawOfferByInventoryItemGroup(withdrawByInventoryItemGroupRequest)

/offer/withdraw_by_inventory_item_group

This call is used to end a multiple-variation eBay listing that is associated with the specified inventory item group. This call only ends multiple-variation eBay listing associated with the inventory item group but does not delete the inventory item group object. Similarly, this call also does not delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state. If the seller wanted to relist the multiple-variation eBay listing, they could use the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; method.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiOfferApi apiInstance = new InventoryApiOfferApi(defaultClient);
    WithdrawByInventoryItemGroupRequest withdrawByInventoryItemGroupRequest = new WithdrawByInventoryItemGroupRequest(); // WithdrawByInventoryItemGroupRequest | 
    try {
      Object result = apiInstance.withdrawOfferByInventoryItemGroup(withdrawByInventoryItemGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiOfferApi#withdrawOfferByInventoryItemGroup");
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
 **withdrawByInventoryItemGroupRequest** | [**WithdrawByInventoryItemGroupRequest**](WithdrawByInventoryItemGroupRequest.md)|  | [optional]

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
**500** | Internal Server Error |  -  |

