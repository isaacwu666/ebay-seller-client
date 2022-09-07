# LogisticsApiShipmentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelShipment**](LogisticsApiShipmentApi.md#cancelShipment) | **POST** /shipment/{shipmentId}/cancel | /shipment/{shipmentId}/cancel
[**createFromShippingQuote**](LogisticsApiShipmentApi.md#createFromShippingQuote) | **POST** /shipment/create_from_shipping_quote | /shipment/create_from_shipping_quote
[**downloadLabelFile**](LogisticsApiShipmentApi.md#downloadLabelFile) | **GET** /shipment/{shipmentId}/download_label_file | /shipment/{shipmentId}/download_label_file
[**getShipment**](LogisticsApiShipmentApi.md#getShipment) | **GET** /shipment/{shipmentId} | /shipment/{shipmentId}


<a name="cancelShipment"></a>
# **cancelShipment**
> Shipment cancelShipment(shipmentId)

/shipment/{shipmentId}/cancel

This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&#39;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.LogisticsApiShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LogisticsApiShipmentApi apiInstance = new LogisticsApiShipmentApi(defaultClient);
    String shipmentId = "shipmentId_example"; // String | This path parameter specifies the unique eBay-assigned ID of the shipment to be canceled. The <b>shipmentId</b> value is generated and returned by a call to <b>createFromShippingQuote</b>.
    try {
      Shipment result = apiInstance.cancelShipment(shipmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogisticsApiShipmentApi#cancelShipment");
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
 **shipmentId** | **String**| This path parameter specifies the unique eBay-assigned ID of the shipment to be canceled. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. |

### Return type

[**Shipment**](Shipment.md)

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

<a name="createFromShippingQuote"></a>
# **createFromShippingQuote**
> Shipment createFromShippingQuote(createShipmentFromQuoteRequest)

/shipment/create_from_shipping_quote

This method creates a \&quot;shipment\&quot; based on the &lt;b&gt;shippingQuoteId&lt;/b&gt; and &lt;b&gt;rateId&lt;/b&gt; values supplied in the request. The rate identified by the &lt;b&gt;rateId&lt;/b&gt; value specifies the carrier and service for the package shipment, and the rate ID must be contained in the shipping quote identified by the &lt;b&gt;shippingQuoteId&lt;/b&gt; value. Call &lt;b&gt;createShippingQuote&lt;/b&gt; to retrieve a set of live shipping rates.  &lt;br&gt;&lt;br&gt;When you create a shipment, eBay generates a shipping label that you can download and use to ship your package.  &lt;br&gt;&lt;br&gt;In a &lt;b&gt;createFromShippingQuote&lt;/b&gt; request, sellers can include a list of shipping options they want to add to the base service quoted in the selected rate. The list of available shipping options is specific to each quoted rate and if available, the options are listed in the rate container of the of the shipping quote.  &lt;br&gt;&lt;br&gt;In addition to a configurable return-to location and other details about the shipment, the response to this method includes:  &lt;ul&gt;&lt;li&gt;The shipping carrier and service to be used for the package shipment&lt;/li&gt; &lt;li&gt;A list of selected shipping options, if any&lt;/li&gt; &lt;li&gt;The shipment tracking number&lt;/li&gt; &lt;li&gt;The total shipping cost (the sum cost of the base shipping service and any added options)&lt;/li&gt;&lt;/ul&gt; When you create a shipment, your billing agreement account is charged the sum of the &lt;b&gt;baseShippingCost&lt;/b&gt; and the total cost of any additional shipping options you might have selected. Use the URL returned in &lt;b&gt;labelDownloadUrl&lt;/b&gt; field, or call &lt;b&gt;downloadLabelFile&lt;/b&gt; with the &lt;b&gt;shipmentId&lt;/b&gt; value from the response, to download a shipping label for your package. &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Sellers must set up their payment method with eBay before they can use this method to create a shipment and the associated shipping label.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.LogisticsApiShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LogisticsApiShipmentApi apiInstance = new LogisticsApiShipmentApi(defaultClient);
    CreateShipmentFromQuoteRequest createShipmentFromQuoteRequest = new CreateShipmentFromQuoteRequest(); // CreateShipmentFromQuoteRequest | 
    try {
      Shipment result = apiInstance.createFromShippingQuote(createShipmentFromQuoteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogisticsApiShipmentApi#createFromShippingQuote");
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
 **createShipmentFromQuoteRequest** | [**CreateShipmentFromQuoteRequest**](CreateShipmentFromQuoteRequest.md)|  | [optional]

### Return type

[**Shipment**](Shipment.md)

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

<a name="downloadLabelFile"></a>
# **downloadLabelFile**
> Object downloadLabelFile(shipmentId)

/shipment/{shipmentId}/download_label_file

This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.  &lt;br&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.LogisticsApiShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LogisticsApiShipmentApi apiInstance = new LogisticsApiShipmentApi(defaultClient);
    String shipmentId = "shipmentId_example"; // String | This path parameter specifies the unique eBay-assigned ID of the shipment associated with the shipping label you want to download. The <b>shipmentId</b> value is generated and returned by a call to <b>createFromShippingQuote</b>.
    try {
      Object result = apiInstance.downloadLabelFile(shipmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogisticsApiShipmentApi#downloadLabelFile");
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
 **shipmentId** | **String**| This path parameter specifies the unique eBay-assigned ID of the shipment associated with the shipping label you want to download. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. |

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
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getShipment"></a>
# **getShipment**
> Shipment getShipment(shipmentId)

/shipment/{shipmentId}

This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.LogisticsApiShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LogisticsApiShipmentApi apiInstance = new LogisticsApiShipmentApi(defaultClient);
    String shipmentId = "shipmentId_example"; // String | This path parameter specifies the unique eBay-assigned ID of the shipment you want to retrieve. The <b>shipmentId</b> value is generated and returned by a call to <b>createFromShippingQuote</b>.
    try {
      Shipment result = apiInstance.getShipment(shipmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogisticsApiShipmentApi#getShipment");
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
 **shipmentId** | **String**| This path parameter specifies the unique eBay-assigned ID of the shipment you want to retrieve. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. |

### Return type

[**Shipment**](Shipment.md)

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

