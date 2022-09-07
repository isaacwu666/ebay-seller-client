# MarketingApiPromotionSummaryReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPromotionSummaryReport**](MarketingApiPromotionSummaryReportApi.md#getPromotionSummaryReport) | **GET** /promotion_summary_report | /promotion_summary_report


<a name="getPromotionSummaryReport"></a>
# **getPromotionSummaryReport**
> SummaryReportResponse getPromotionSummaryReport(marketplaceId)

/promotion_summary_report

This method generates a report that summarizes the seller&#39;s promotions for the specified eBay marketplace. The report returns information on &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt; promotions (deleted reports are not returned) and summarizes the seller&#39;s campaign performance for all promotions on a given site.  &lt;br&gt;&lt;br&gt;For information about summary reports, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pm-summary-report.html\&quot;&gt;Reading the item promotion Summary report&lt;/a&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiPromotionSummaryReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiPromotionSummaryReportApi apiInstance = new MarketingApiPromotionSummaryReportApi(defaultClient);
    String marketplaceId = "marketplaceId_example"; // String | The eBay marketplace ID of the site you for which you want a promotion summary report.  <p><b>Valid values:</b></p>  <ul><li><code>EBAY_AU</code> = Australia</li> <li><code>EBAY_DE</code> = Germany</li> <li><code>EBAY_ES</code> = Spain</li> <li><code>EBAY_FR</code> = France</li> <li><code>EBAY_GB</code> = Great Britain</li> <li><code>EBAY_IT</code> = Italy</li> <li><code>EBAY_US</code> = United States</li></ul>
    try {
      SummaryReportResponse result = apiInstance.getPromotionSummaryReport(marketplaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiPromotionSummaryReportApi#getPromotionSummaryReport");
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
 **marketplaceId** | **String**| The eBay marketplace ID of the site you for which you want a promotion summary report.  &lt;p&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;code&gt;EBAY_AU&lt;/code&gt; &#x3D; Australia&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_DE&lt;/code&gt; &#x3D; Germany&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_ES&lt;/code&gt; &#x3D; Spain&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_FR&lt;/code&gt; &#x3D; France&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_GB&lt;/code&gt; &#x3D; Great Britain&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_IT&lt;/code&gt; &#x3D; Italy&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_US&lt;/code&gt; &#x3D; United States&lt;/li&gt;&lt;/ul&gt; |

### Return type

[**SummaryReportResponse**](SummaryReportResponse.md)

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

