# NegotiationApiOfferApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findEligibleItems**](NegotiationApiOfferApi.md#findEligibleItems) | **GET** /find_eligible_items | /find_eligible_items
[**sendOfferToInterestedBuyers**](NegotiationApiOfferApi.md#sendOfferToInterestedBuyers) | **POST** /send_offer_to_interested_buyers | /send_offer_to_interested_buyers


<a name="findEligibleItems"></a>
# **findEligibleItems**
> PagedEligibleItemCollection findEligibleItems(X_EBAY_C_MARKETPLACE_ID, limit, offset)

/find_eligible_items

This method evaluates a seller&#39;s current listings and returns the set of IDs that are eligible for a seller-initiated discount offer to a buyer. A listing ID is returned only when one or more buyers have shown an &amp;quot;interest&amp;quot; in the listing. If any buyers have shown interest in a listing, the seller can initiate a &amp;quot;negotiation&amp;quot; with them by calling sendOfferToInterestedBuyers, which sends all interested buyers a message that offers the listing at a discount. For details about how to create seller offers to buyers, see Sending offers to buyers.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.NegotiationApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NegotiationApiOfferApi apiInstance = new NegotiationApiOfferApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | The eBay marketplace on which you want to search for eligible listings. For a complete list of supported marketplaces, see Negotiation API requirements and restrictions.
    String limit = "limit_example"; // String | This query parameter specifies the maximum number of items to return from the result set on a page in the paginated response. Minimum: 1 &nbsp; &nbsp;Maximum: 200 Default: 10
    String offset = "offset_example"; // String | This query parameter specifies the number of results to skip in the result set before returning the first result in the paginated response. Combine offset with the limit query parameter to control the items returned in the response. For example, if you supply an offset of 0 and a limit of 10, the first page of the response contains the first 10 results from the complete list of items retrieved by the call. If offset is 10 and limit is 20, the first page of the response contains items 11-30 from the complete result set. Default: 0
    try {
      PagedEligibleItemCollection result = apiInstance.findEligibleItems(X_EBAY_C_MARKETPLACE_ID, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NegotiationApiOfferApi#findEligibleItems");
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
 **X_EBAY_C_MARKETPLACE_ID** | **String**| The eBay marketplace on which you want to search for eligible listings. For a complete list of supported marketplaces, see Negotiation API requirements and restrictions. |
 **limit** | **String**| This query parameter specifies the maximum number of items to return from the result set on a page in the paginated response. Minimum: 1 &amp;nbsp; &amp;nbsp;Maximum: 200 Default: 10 | [optional]
 **offset** | **String**| This query parameter specifies the number of results to skip in the result set before returning the first result in the paginated response. Combine offset with the limit query parameter to control the items returned in the response. For example, if you supply an offset of 0 and a limit of 10, the first page of the response contains the first 10 results from the complete list of items retrieved by the call. If offset is 10 and limit is 20, the first page of the response contains items 11-30 from the complete result set. Default: 0 | [optional]

### Return type

[**PagedEligibleItemCollection**](PagedEligibleItemCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="sendOfferToInterestedBuyers"></a>
# **sendOfferToInterestedBuyers**
> SendOfferToInterestedBuyersCollectionResponse sendOfferToInterestedBuyers(X_EBAY_C_MARKETPLACE_ID, createOffersRequest)

/send_offer_to_interested_buyers

This method sends eligible buyers offers to purchase items in a listing at a discount. When a buyer has shown interest in a listing, they become &amp;quot;eligible&amp;quot; to receive a seller-initiated offer to purchase the item(s). Sellers use findEligibleItems to get the set of listings that have interested buyers. If a listing has interested buyers, sellers can use this method (sendOfferToInterestedBuyers) to send an offer to the buyers who are interested in the listing. The offer gives buyers the ability to purchase the associated listings at a discounted price. For details about how to create seller offers to buyers, see Sending offers to buyers.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.NegotiationApiOfferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    NegotiationApiOfferApi apiInstance = new NegotiationApiOfferApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | The eBay marketplace on which your listings with &quot;eligible&quot; buyers appear. For a complete list of supported marketplaces, see Negotiation API requirements and restrictions.
    CreateOffersRequest createOffersRequest = new CreateOffersRequest(); // CreateOffersRequest | 
    try {
      SendOfferToInterestedBuyersCollectionResponse result = apiInstance.sendOfferToInterestedBuyers(X_EBAY_C_MARKETPLACE_ID, createOffersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NegotiationApiOfferApi#sendOfferToInterestedBuyers");
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
 **X_EBAY_C_MARKETPLACE_ID** | **String**| The eBay marketplace on which your listings with &amp;quot;eligible&amp;quot; buyers appear. For a complete list of supported marketplaces, see Negotiation API requirements and restrictions. |
 **createOffersRequest** | [**CreateOffersRequest**](CreateOffersRequest.md)|  | [optional]

### Return type

[**SendOfferToInterestedBuyersCollectionResponse**](SendOfferToInterestedBuyersCollectionResponse.md)

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
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

