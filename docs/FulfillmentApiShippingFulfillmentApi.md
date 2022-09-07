# FulfillmentApiShippingFulfillmentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createShippingFulfillment**](FulfillmentApiShippingFulfillmentApi.md#createShippingFulfillment) | **POST** /order/{orderId}/shipping_fulfillment | /order/{orderId}/shipping_fulfillment
[**getShippingFulfillment**](FulfillmentApiShippingFulfillmentApi.md#getShippingFulfillment) | **GET** /order/{orderId}/shipping_fulfillment/{fulfillmentId} | /order/{orderId}/shipping_fulfillment/{fulfillmentId}
[**getShippingFulfillments**](FulfillmentApiShippingFulfillmentApi.md#getShippingFulfillments) | **GET** /order/{orderId}/shipping_fulfillment | /order/{orderId}/shipping_fulfillment


<a name="createShippingFulfillment"></a>
# **createShippingFulfillment**
> Object createShippingFulfillment(orderId, shippingFulfillmentDetails)

/order/{orderId}/shipping_fulfillment

When you group an order&#39;s line items into one or more packages, each package requires a corresponding plan for handling, addressing, and shipping; this is a &lt;i&gt;shipping fulfillment&lt;/i&gt;. For each package, execute this call once to generate a shipping fulfillment associated with that package. &lt;br /&gt;&lt;br /&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A single line item in an order can consist of multiple units of a purchased item, and one unit can consist of multiple parts or components. Although these components might be provided by the manufacturer in separate packaging, the seller must include all components of a given line item in the same package.&lt;/span&gt; &lt;br /&gt;&lt;br /&gt;Before using this call for a given package, you must determine which line items are in the package. If the package has been shipped, you should provide the date of shipment in the request. If not provided, it will default to the current date and time.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiShippingFulfillmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiShippingFulfillmentApi apiInstance = new FulfillmentApiShippingFulfillmentApi(defaultClient);
    String orderId = "orderId_example"; // String | The unique identifier of the order. Order ID values are shown in My eBay/Seller Hub, and are also returned by the <b>getOrders</b> method in the <b>orders.orderId</b> field. <br/><br/><span class=\"tablenote\"><strong>Note:</strong> A new order ID format was introduced to all eBay APIs (legacy and REST) in June 2019. In REST APIs that return Order IDs, including the Fulfillment API, all order IDs are returned in the new format, but the <strong>createShippingFulfillment</strong> method will accept both the legacy and new format order ID. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers will be automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support. </span>
    ShippingFulfillmentDetails shippingFulfillmentDetails = new ShippingFulfillmentDetails(); // ShippingFulfillmentDetails | 
    try {
      Object result = apiInstance.createShippingFulfillment(orderId, shippingFulfillmentDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiShippingFulfillmentApi#createShippingFulfillment");
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
 **orderId** | **String**| The unique identifier of the order. Order ID values are shown in My eBay/Seller Hub, and are also returned by the &lt;b&gt;getOrders&lt;/b&gt; method in the &lt;b&gt;orders.orderId&lt;/b&gt; field. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A new order ID format was introduced to all eBay APIs (legacy and REST) in June 2019. In REST APIs that return Order IDs, including the Fulfillment API, all order IDs are returned in the new format, but the &lt;strong&gt;createShippingFulfillment&lt;/strong&gt; method will accept both the legacy and new format order ID. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers will be automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support. &lt;/span&gt; |
 **shippingFulfillmentDetails** | [**ShippingFulfillmentDetails**](ShippingFulfillmentDetails.md)|  | [optional]

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
**201** | Created. The call also returns the following location code: &lt;br /&gt;&lt;br /&gt;&lt;code&gt;{ENV}/sell/fulfillment/v1/order/{ORDERID}/shipping_fulfillment/{FULFILLMENTID}&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;The &lt;code&gt;ENV&lt;/code&gt; string is the HTTPS path to the same eBay supported enviro |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getShippingFulfillment"></a>
# **getShippingFulfillment**
> ShippingFulfillment getShippingFulfillment(fulfillmentId, orderId)

/order/{orderId}/shipping_fulfillment/{fulfillmentId}

Use this call to retrieve the contents of a fulfillment based on its unique identifier, &lt;b&gt;fulfillmentId&lt;/b&gt; (combined with the associated order&#39;s &lt;b&gt;orderId&lt;/b&gt;). The &lt;b&gt;fulfillmentId&lt;/b&gt; value was originally generated by the &lt;b&gt;createShippingFulfillment&lt;/b&gt; call, and is returned by the &lt;b&gt;getShippingFulfillments&lt;/b&gt; call in the &lt;b&gt;members.fulfillmentId&lt;/b&gt; field.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiShippingFulfillmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiShippingFulfillmentApi apiInstance = new FulfillmentApiShippingFulfillmentApi(defaultClient);
    String fulfillmentId = "fulfillmentId_example"; // String | The unique identifier of the fulfillment. This eBay-generated value was created by the <b>Create Shipping Fulfillment</b> call, and returned by the <b>getShippingFulfillments</b> call in the <b>fulfillments.fulfillmentId</b> field; for example, <code>9405509699937003457459</code>.
    String orderId = "orderId_example"; // String | The unique identifier of the order. Order ID values are shown in My eBay/Seller Hub, and are also returned by the <b>getOrders</b> method in the <b>orders.orderId</b> field. <br/><br/><span class=\"tablenote\"><strong>Note:</strong> A new order ID format was introduced to all eBay APIs (legacy and REST) in June 2019. In REST APIs that return Order IDs, including the Fulfillment API, all order IDs are returned in the new format, but the <strong>getShippingFulfillment</strong> method will accept both the legacy and new format order ID. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers will be automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support. </span>
    try {
      ShippingFulfillment result = apiInstance.getShippingFulfillment(fulfillmentId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiShippingFulfillmentApi#getShippingFulfillment");
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
 **fulfillmentId** | **String**| The unique identifier of the fulfillment. This eBay-generated value was created by the &lt;b&gt;Create Shipping Fulfillment&lt;/b&gt; call, and returned by the &lt;b&gt;getShippingFulfillments&lt;/b&gt; call in the &lt;b&gt;fulfillments.fulfillmentId&lt;/b&gt; field; for example, &lt;code&gt;9405509699937003457459&lt;/code&gt;. |
 **orderId** | **String**| The unique identifier of the order. Order ID values are shown in My eBay/Seller Hub, and are also returned by the &lt;b&gt;getOrders&lt;/b&gt; method in the &lt;b&gt;orders.orderId&lt;/b&gt; field. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A new order ID format was introduced to all eBay APIs (legacy and REST) in June 2019. In REST APIs that return Order IDs, including the Fulfillment API, all order IDs are returned in the new format, but the &lt;strong&gt;getShippingFulfillment&lt;/strong&gt; method will accept both the legacy and new format order ID. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers will be automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support. &lt;/span&gt; |

### Return type

[**ShippingFulfillment**](ShippingFulfillment.md)

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

<a name="getShippingFulfillments"></a>
# **getShippingFulfillments**
> ShippingFulfillmentPagedCollection getShippingFulfillments(orderId)

/order/{orderId}/shipping_fulfillment

Use this call to retrieve the contents of all fulfillments currently defined for a specified order based on the order&#39;s unique identifier, &lt;b&gt;orderId&lt;/b&gt;. This value is returned in the &lt;b&gt;getOrders&lt;/b&gt; call&#39;s &lt;b&gt;members.orderId&lt;/b&gt; field when you search for orders by creation date or shipment status.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FulfillmentApiShippingFulfillmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FulfillmentApiShippingFulfillmentApi apiInstance = new FulfillmentApiShippingFulfillmentApi(defaultClient);
    String orderId = "orderId_example"; // String | The unique identifier of the order. Order ID values are shown in My eBay/Seller Hub, and are also returned by the <b>getOrders</b> method in the <b>orders.orderId</b> field. <br/><br/><span class=\"tablenote\"><strong>Note:</strong> A new order ID format was introduced to all eBay APIs (legacy and REST) in June 2019. In REST APIs that return Order IDs, including the Fulfillment API, all order IDs are returned in the new format, but the <strong>getShippingFulfillments</strong> method will accept both the legacy and new format order ID. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers will be automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support. </span>
    try {
      ShippingFulfillmentPagedCollection result = apiInstance.getShippingFulfillments(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApiShippingFulfillmentApi#getShippingFulfillments");
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
 **orderId** | **String**| The unique identifier of the order. Order ID values are shown in My eBay/Seller Hub, and are also returned by the &lt;b&gt;getOrders&lt;/b&gt; method in the &lt;b&gt;orders.orderId&lt;/b&gt; field. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; A new order ID format was introduced to all eBay APIs (legacy and REST) in June 2019. In REST APIs that return Order IDs, including the Fulfillment API, all order IDs are returned in the new format, but the &lt;strong&gt;getShippingFulfillments&lt;/strong&gt; method will accept both the legacy and new format order ID. The new format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. These order identifiers will be automatically generated after buyer payment, and unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support. &lt;/span&gt; |

### Return type

[**ShippingFulfillmentPagedCollection**](ShippingFulfillmentPagedCollection.md)

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

