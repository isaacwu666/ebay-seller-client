# LogisticsApiShippingQuoteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createShippingQuote**](LogisticsApiShippingQuoteApi.md#createShippingQuote) | **POST** /shipping_quote | /shipping_quote
[**getShippingQuote**](LogisticsApiShippingQuoteApi.md#getShippingQuote) | **GET** /shipping_quote/{shippingQuoteId} | /shipping_quote/{shippingQuoteId}


<a name="createShippingQuote"></a>
# **createShippingQuote**
> ShippingQuote createShippingQuote(X_EBAY_C_MARKETPLACE_ID, shippingQuoteRequest)

/shipping_quote

The &lt;b&gt;createShippingQuote&lt;/b&gt; method returns a &lt;i&gt;shipping quote &lt;/i&gt; that contains a list of live \&quot;rates.\&quot;  &lt;br&gt;&lt;br&gt;Each rate represents an offer made by a shipping carrier for a specific service and each offer has a live quote for the base service cost. Rates have a time window in which they are \&quot;live,\&quot; and rates expire when their purchase window ends. If offered by the carrier, rates can include shipping options (and their associated prices), and users can add any offered shipping option to the base service should they desire.  Also, depending on the services required, rates can also include pickup and delivery windows.  &lt;br&gt;&lt;br&gt;Each rate is for a single package and is based on the following information: &lt;ul&gt;&lt;li&gt;The shipping origin&lt;/li&gt; &lt;li&gt;The shipping destination&lt;/li&gt; &lt;li&gt;The package size (weight and dimensions)&lt;/li&gt;&lt;/ul&gt;  Rates are identified by a unique eBay-assigned &lt;b&gt;rateId&lt;/b&gt; and rates are based on price points, pickup and delivery time frames, and other user requirements. Because each rate offered must be compliant with the eBay shipping program, all rates reflect eBay-negotiated prices.  &lt;br&gt;&lt;br&gt;The various rates returned in a shipping quote offer the user a choice from which they can choose a shipping service that best fits their needs. Select the rate for your shipment and using the associated &lt;b&gt;rateId&lt;/b&gt;, call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to create a shipment and generate a shipping label that you can use to ship the package.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.LogisticsApiShippingQuoteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LogisticsApiShippingQuoteApi apiInstance = new LogisticsApiShippingQuoteApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | This header parameter specifies the eBay marketplace for the shipping quote that is being created. For a list of valid values, refer to the section <a href=\"/api-docs/static/rest-request-components.html#marketpl\" target=\"_blank\">Marketplace ID Values</a> in the <b>Using eBay RESTful APIs</b> guide.
    ShippingQuoteRequest shippingQuoteRequest = new ShippingQuoteRequest(); // ShippingQuoteRequest | 
    try {
      ShippingQuote result = apiInstance.createShippingQuote(X_EBAY_C_MARKETPLACE_ID, shippingQuoteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogisticsApiShippingQuoteApi#createShippingQuote");
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
 **X_EBAY_C_MARKETPLACE_ID** | **String**| This header parameter specifies the eBay marketplace for the shipping quote that is being created. For a list of valid values, refer to the section &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Marketplace ID Values&lt;/a&gt; in the &lt;b&gt;Using eBay RESTful APIs&lt;/b&gt; guide. |
 **shippingQuoteRequest** | [**ShippingQuoteRequest**](ShippingQuoteRequest.md)|  | [optional]

### Return type

[**ShippingQuote**](ShippingQuote.md)

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
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="getShippingQuote"></a>
# **getShippingQuote**
> ShippingQuote getShippingQuote(shippingQuoteId)

/shipping_quote/{shippingQuoteId}

This method retrieves the complete details of the shipping quote associated with the specified &lt;b&gt;shippingQuoteId&lt;/b&gt; value.  &lt;br&gt;&lt;br&gt;A \&quot;shipping quote\&quot; pertains to a single specific package and contains a set of shipping \&quot;rates\&quot; that quote the cost to ship the package by different shipping carriers and services. The quotes are based on the package&#39;s origin, destination, and size.  &lt;br&gt;&lt;br&gt;Call &lt;b&gt;createShippingQuote&lt;/b&gt; to create a &lt;b&gt;shippingQuoteId&lt;/b&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.LogisticsApiShippingQuoteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LogisticsApiShippingQuoteApi apiInstance = new LogisticsApiShippingQuoteApi(defaultClient);
    String shippingQuoteId = "shippingQuoteId_example"; // String | This path parameter specifies the unique eBay-assigned ID of the shipping quote you want to retrieve. The <b>shippingQuoteId</b> value is generated and returned by a call to <b>createShippingQuote</b>.
    try {
      ShippingQuote result = apiInstance.getShippingQuote(shippingQuoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogisticsApiShippingQuoteApi#getShippingQuote");
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
 **shippingQuoteId** | **String**| This path parameter specifies the unique eBay-assigned ID of the shipping quote you want to retrieve. The &lt;b&gt;shippingQuoteId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createShippingQuote&lt;/b&gt;. |

### Return type

[**ShippingQuote**](ShippingQuote.md)

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

