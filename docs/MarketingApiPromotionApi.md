# MarketingApiPromotionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListingSet**](MarketingApiPromotionApi.md#getListingSet) | **GET** /promotion/{promotion_id}/get_listing_set | /promotion/{promotion_id}/get_listing_set
[**getPromotions**](MarketingApiPromotionApi.md#getPromotions) | **GET** /promotion | /promotion
[**pausePromotion**](MarketingApiPromotionApi.md#pausePromotion) | **POST** /promotion/{promotion_id}/pause | /promotion/{promotion_id}/pause
[**resumePromotion**](MarketingApiPromotionApi.md#resumePromotion) | **POST** /promotion/{promotion_id}/resume | /promotion/{promotion_id}/resume


<a name="getListingSet"></a>
# **getListingSet**
> ItemsPagedCollection getListingSet(promotionId, limit, offset, q, sort, status)

/promotion/{promotion_id}/get_listing_set

This method returns the set of listings associated with the &lt;b&gt;promotion_id&lt;/b&gt; specified in the path parameter. Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions\&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&#39;s promotions.  &lt;p&gt;The listing details are returned in a paginated set and you can control and results returned using the following query parameters: &lt;b&gt;limit&lt;/b&gt;, &lt;b&gt;offset&lt;/b&gt;, &lt;b&gt;q&lt;/b&gt;, &lt;b&gt;sort&lt;/b&gt;, and &lt;b&gt;status&lt;/b&gt;.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Maximum associated listings returned:&lt;/b&gt; 200&lt;/li&gt;  &lt;li&gt;&lt;b&gt;Default number of listings returned:&lt;/b&gt; 200&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiPromotionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiPromotionApi apiInstance = new MarketingApiPromotionApi(defaultClient);
    String promotionId = "promotionId_example"; // String | This path parameter takes a concatenation of the ID of the promotion you want to get plus the marketplace ID on which the promotion is hosted. Concatenate the two values by separating them with an \"at sign\" (<b>@</b>).  <br><br>The ID of the promotion (<b>promotionId</b>) is a unique eBay-assigned value that's generated when the promotion is created. The Marketplace ID is the ENUM value of eBay marketplace where the promotion is hosted. <br><br><b>Example:</b> <code>1********5@EBAY_US</code>
    String limit = "limit_example"; // String | Specifies the maximum number of promotions returned on a page from the result set. <br><br><b>Default:</b> 200<br><b>Maximum:</b> 200
    String offset = "offset_example"; // String | Specifies the number of promotions to skip in the result set before returning the first promotion in the paginated response.  <p>Combine <b>offset</b> with the <b>limit</b> query parameter to control the items returned in the response. For example, if you supply an <b>offset</b> of <code>0</code> and a <b>limit</b> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <b>offset</b> is <code>10</code> and <b>limit</b> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set.</p> <p><b>Default:</b> 0</p>
    String q = "q_example"; // String | Reserved for future use.
    String sort = "sort_example"; // String | Specifies the order in which to sort the associated listings in the response. If you precede the supplied value with a dash, the response is sorted in reverse order.  <br><br><b>Example:</b> <br>&nbsp;&nbsp;&nbsp;<code>sort=PRICE</code> - Sorts the associated listings by their current price in ascending order <br>&nbsp;&nbsp;&nbsp;<code>sort=-TITLE</code> - Sorts the associated listings by their title in descending alphabetical order (Z-Az-a)  <br><br><b>Valid values</b>:<ul class=\"compact\"><li>AVAILABLE</li> <li>PRICE</li> <li>TITLE</li></ul> For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/marketing/types/csb:SortField
    String status = "status_example"; // String | This query parameter applies only to markdown promotions. It filters the response based on the indicated status of the promotion. Currently, the only supported value for this parameter is <code>MARKED_DOWN</code>, which indicates active markdown promotions. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/marketing/types/sme:ItemMarkdownStatusEnum
    try {
      ItemsPagedCollection result = apiInstance.getListingSet(promotionId, limit, offset, q, sort, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiPromotionApi#getListingSet");
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
 **promotionId** | **String**| This path parameter takes a concatenation of the ID of the promotion you want to get plus the marketplace ID on which the promotion is hosted. Concatenate the two values by separating them with an \&quot;at sign\&quot; (&lt;b&gt;@&lt;/b&gt;).  &lt;br&gt;&lt;br&gt;The ID of the promotion (&lt;b&gt;promotionId&lt;/b&gt;) is a unique eBay-assigned value that&#39;s generated when the promotion is created. The Marketplace ID is the ENUM value of eBay marketplace where the promotion is hosted. &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;1********5@EBAY_US&lt;/code&gt; |
 **limit** | **String**| Specifies the maximum number of promotions returned on a page from the result set. &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 200&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 200 | [optional]
 **offset** | **String**| Specifies the number of promotions to skip in the result set before returning the first promotion in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; | [optional]
 **q** | **String**| Reserved for future use. | [optional]
 **sort** | **String**| Specifies the order in which to sort the associated listings in the response. If you precede the supplied value with a dash, the response is sorted in reverse order.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort&#x3D;PRICE&lt;/code&gt; - Sorts the associated listings by their current price in ascending order &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort&#x3D;-TITLE&lt;/code&gt; - Sorts the associated listings by their title in descending alphabetical order (Z-Az-a)  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul class&#x3D;\&quot;compact\&quot;&gt;&lt;li&gt;AVAILABLE&lt;/li&gt; &lt;li&gt;PRICE&lt;/li&gt; &lt;li&gt;TITLE&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/marketing/types/csb:SortField | [optional]
 **status** | **String**| This query parameter applies only to markdown promotions. It filters the response based on the indicated status of the promotion. Currently, the only supported value for this parameter is &lt;code&gt;MARKED_DOWN&lt;/code&gt;, which indicates active markdown promotions. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/marketing/types/sme:ItemMarkdownStatusEnum | [optional]

### Return type

[**ItemsPagedCollection**](ItemsPagedCollection.md)

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

<a name="getPromotions"></a>
# **getPromotions**
> PromotionsPagedCollection getPromotions(marketplaceId, limit, offset, promotionStatus, promotionType, q, sort)

/promotion

This method returns a list of a seller&#39;s undeleted promotions. &lt;p&gt;The call returns up to 200 currently-available promotions on the specified marketplace. While the response body does not include the promotion&#39;s &lt;b&gt;discountRules&lt;/b&gt; or &lt;b&gt;inventoryCriterion&lt;/b&gt; containers, it does include the &lt;b&gt;promotionHref&lt;/b&gt; (which you can use to retrieve the complete details of the promotion).&lt;/p&gt;  &lt;p&gt;Use query parameters to sort and filter the results by the number of promotions to return, the promotion state or type, and the eBay marketplace. You can also supply keywords to limit the response to the promotions that contain that keywords in the title of the promotion.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Maximum returned:&lt;/b&gt; 200&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiPromotionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiPromotionApi apiInstance = new MarketingApiPromotionApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | The eBay marketplace ID of the site where the promotion is hosted.  <p><b>Valid values:</b></p>  <ul><li><code>EBAY_AU</code> = Australia</li> <li><code>EBAY_DE</code> = Germany</li> <li><code>EBAY_ES</code> = Spain</li> <li><code>EBAY_FR</code> = France</li> <li><code>EBAY_GB</code> = Great Britain</li> <li><code>EBAY_IT</code> = Italy</li> <li><code>EBAY_US</code> = United States</li></ul>
    String limit = "limit_example"; // String | Specifies the maximum number of promotions returned on a page from the result set.  <br><br><b>Default:</b> 200 <br><b>Maximum:</b> 200
    String offset = "offset_example"; // String | Specifies the number of promotions to skip in the result set before returning the first promotion in the paginated response.  <p>Combine <b>offset</b> with the <b>limit</b> query parameter to control the items returned in the response. For example, if you supply an <b>offset</b> of <code>0</code> and a <b>limit</b> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <b>offset</b> is <code>10</code> and <b>limit</b> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set.</p> <p><b>Default:</b> 0</p>
    String promotionStatus = "promotionStatus_example"; // String | Specifies the promotion state by which you want to filter the results. The response contains only those promotions that match the state you specify.  <br><br><b>Valid values:</b> <ul><li><code>DRAFT</code></li> <li><code>SCHEDULED</code></li> <li><code>RUNNING</code></li> <li><code>PAUSED</code></li> <li><code>ENDED</code></li></ul><b>Maximum number of input values:</b> 1
    String promotionType = "promotionType_example"; // String | Filters the returned promotions based on their campaign promotion type. Specify one of the following values to indicate the promotion type you want returned: <ul><li><code>CODED_COUPON</code> &ndash; A coupon code promotion set with <b>createItemPromotion</b>.</li> <li><code>MARKDOWN_SALE</code> &ndash; A markdown promotion set with <b>createItemPriceMarkdownPromotion</b>.</li> <li><code>ORDER_DISCOUNT</code> &ndash; A threshold promotion set with <b>createItemPromotion</b>.</li> <li><code>VOLUME_DISCOUNT</code> &ndash; A volume pricing promotion set with <b>createItemPromotion</b>.</li></ul>
    String q = "q_example"; // String | A string consisting of one or more <i>keywords</i>. eBay filters the response by returning only the promotions that contain the supplied keywords in the promotion title.  <br><br><b>Example:</b> \"iPhone\" or \"Harry Potter.\"  <br><br>Commas that separate keywords are ignored. For example, a keyword string of \"iPhone, iPad\" equals \"iPhone iPad\", and each results in a response that contains promotions with both \"iPhone\" and \"iPad\" in the title.
    String sort = "sort_example"; // String | Specifies the order for how to sort the response. If you precede the supplied value with a dash, the response is sorted in reverse order.  <br><br><b>Example:</b> <br>&nbsp;&nbsp;&nbsp;<code>sort=END_DATE</code> &nbsp; Sorts the promotions in the response by their end dates in ascending order <br>&nbsp;&nbsp;&nbsp;<code>sort=-PROMOTION_NAME</code> &nbsp; Sorts the promotions by their promotion name in descending alphabetical order (Z-Az-a)  <br><br><b>Valid values</b>:<ul><li><code>START_DATE</code></li> <li><code>END_DATE</code></li> <li><code>PROMOTION_NAME</code></li></ul> For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/marketing/types/csb:SortField
    try {
      PromotionsPagedCollection result = apiInstance.getPromotions(marketplaceId, limit, offset, promotionStatus, promotionType, q, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiPromotionApi#getPromotions");
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
 **marketplaceId** | **String**| The eBay marketplace ID of the site where the promotion is hosted.  &lt;p&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;code&gt;EBAY_AU&lt;/code&gt; &#x3D; Australia&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_DE&lt;/code&gt; &#x3D; Germany&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_ES&lt;/code&gt; &#x3D; Spain&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_FR&lt;/code&gt; &#x3D; France&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_GB&lt;/code&gt; &#x3D; Great Britain&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_IT&lt;/code&gt; &#x3D; Italy&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_US&lt;/code&gt; &#x3D; United States&lt;/li&gt;&lt;/ul&gt; |
 **limit** | **String**| Specifies the maximum number of promotions returned on a page from the result set.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 200 &lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 200 | [optional]
 **offset** | **String**| Specifies the number of promotions to skip in the result set before returning the first promotion in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; | [optional]
 **promotionStatus** | **String**| Specifies the promotion state by which you want to filter the results. The response contains only those promotions that match the state you specify.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;ul&gt;&lt;li&gt;&lt;code&gt;DRAFT&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;SCHEDULED&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;RUNNING&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;ENDED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;Maximum number of input values:&lt;/b&gt; 1 | [optional]
 **promotionType** | **String**| Filters the returned promotions based on their campaign promotion type. Specify one of the following values to indicate the promotion type you want returned: &lt;ul&gt;&lt;li&gt;&lt;code&gt;CODED_COUPON&lt;/code&gt; &amp;ndash; A coupon code promotion set with &lt;b&gt;createItemPromotion&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;MARKDOWN_SALE&lt;/code&gt; &amp;ndash; A markdown promotion set with &lt;b&gt;createItemPriceMarkdownPromotion&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ORDER_DISCOUNT&lt;/code&gt; &amp;ndash; A threshold promotion set with &lt;b&gt;createItemPromotion&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;VOLUME_DISCOUNT&lt;/code&gt; &amp;ndash; A volume pricing promotion set with &lt;b&gt;createItemPromotion&lt;/b&gt;.&lt;/li&gt;&lt;/ul&gt; | [optional]
 **q** | **String**| A string consisting of one or more &lt;i&gt;keywords&lt;/i&gt;. eBay filters the response by returning only the promotions that contain the supplied keywords in the promotion title.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; \&quot;iPhone\&quot; or \&quot;Harry Potter.\&quot;  &lt;br&gt;&lt;br&gt;Commas that separate keywords are ignored. For example, a keyword string of \&quot;iPhone, iPad\&quot; equals \&quot;iPhone iPad\&quot;, and each results in a response that contains promotions with both \&quot;iPhone\&quot; and \&quot;iPad\&quot; in the title. | [optional]
 **sort** | **String**| Specifies the order for how to sort the response. If you precede the supplied value with a dash, the response is sorted in reverse order.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort&#x3D;END_DATE&lt;/code&gt; &amp;nbsp; Sorts the promotions in the response by their end dates in ascending order &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort&#x3D;-PROMOTION_NAME&lt;/code&gt; &amp;nbsp; Sorts the promotions by their promotion name in descending alphabetical order (Z-Az-a)  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;START_DATE&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;END_DATE&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;PROMOTION_NAME&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/marketing/types/csb:SortField | [optional]

### Return type

[**PromotionsPagedCollection**](PromotionsPagedCollection.md)

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

<a name="pausePromotion"></a>
# **pausePromotion**
> Object pausePromotion(promotionId)

/promotion/{promotion_id}/pause

This method pauses a currently-active (RUNNING) threshold promotion and changes the state of the promotion from &lt;code&gt;RUNNING&lt;/code&gt; to &lt;code&gt;PAUSED&lt;/code&gt;. Pausing a promotion makes the promotion temporarily unavailable to buyers and any currently-incomplete transactions will not receive the promotional offer until the promotion is resumed. Also, promotion teasers are not displayed when a promotion is paused.  &lt;br&gt;&lt;br&gt;Pass the ID of the promotion you want to pause using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions\&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of the seller&#39;s promotions. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; You can only pause threshold promotions (you cannot pause markdown promotions).

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiPromotionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiPromotionApi apiInstance = new MarketingApiPromotionApi(defaultClient);
    String promotionId = "promotionId_example"; // String | This path parameter takes a concatenation of the ID of the promotion you want to pause plus the marketplace ID on which the promotion is hosted. Concatenate the two values by separating them with an \"at sign\" (<b>@</b>).  <br><br>The ID of the promotion (<b>promotionId</b>) is a unique eBay-assigned value that's generated when the promotion is created. The Marketplace ID is the ENUM value of eBay marketplace where the promotion is hosted. <br><br><b>Example:</b> <code>1********5@EBAY_US</code>
    try {
      Object result = apiInstance.pausePromotion(promotionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiPromotionApi#pausePromotion");
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
 **promotionId** | **String**| This path parameter takes a concatenation of the ID of the promotion you want to pause plus the marketplace ID on which the promotion is hosted. Concatenate the two values by separating them with an \&quot;at sign\&quot; (&lt;b&gt;@&lt;/b&gt;).  &lt;br&gt;&lt;br&gt;The ID of the promotion (&lt;b&gt;promotionId&lt;/b&gt;) is a unique eBay-assigned value that&#39;s generated when the promotion is created. The Marketplace ID is the ENUM value of eBay marketplace where the promotion is hosted. &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;1********5@EBAY_US&lt;/code&gt; |

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
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="resumePromotion"></a>
# **resumePromotion**
> Object resumePromotion(promotionId)

/promotion/{promotion_id}/resume

This method restarts a threshold promotion that was previously paused and changes the state of the promotion from &lt;code&gt;PAUSED&lt;/code&gt; to &lt;code&gt;RUNNING&lt;/code&gt;. Only promotions that have been previously paused can be resumed. Resuming a promotion reinstates the promotional teasers and any transactions that were in motion before the promotion was paused will again be eligible for the promotion.  &lt;br&gt;&lt;br&gt;Pass the ID of the promotion you want to resume using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions\&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of the seller&#39;s promotions.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiPromotionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiPromotionApi apiInstance = new MarketingApiPromotionApi(defaultClient);
    String promotionId = "promotionId_example"; // String | This path parameter takes a concatenation of the ID of the promotion you want to resume plus the marketplace ID on which the promotion is hosted. Concatenate the two values by separating them with an \"at sign\" (<b>@</b>).  <br><br>The ID of the promotion (<b>promotionId</b>) is a unique eBay-assigned value that's generated when the promotion is created. The Marketplace ID is the ENUM value of eBay marketplace where the promotion is hosted. <br><br><b>Example:</b> <code>1********5@EBAY_US</code>
    try {
      Object result = apiInstance.resumePromotion(promotionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiPromotionApi#resumePromotion");
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
 **promotionId** | **String**| This path parameter takes a concatenation of the ID of the promotion you want to resume plus the marketplace ID on which the promotion is hosted. Concatenate the two values by separating them with an \&quot;at sign\&quot; (&lt;b&gt;@&lt;/b&gt;).  &lt;br&gt;&lt;br&gt;The ID of the promotion (&lt;b&gt;promotionId&lt;/b&gt;) is a unique eBay-assigned value that&#39;s generated when the promotion is created. The Marketplace ID is the ENUM value of eBay marketplace where the promotion is hosted. &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;1********5@EBAY_US&lt;/code&gt; |

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
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

