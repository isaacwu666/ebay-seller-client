# InventoryApiProductCompatibilityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrReplaceProductCompatibility**](InventoryApiProductCompatibilityApi.md#createOrReplaceProductCompatibility) | **PUT** /inventory_item/{sku}/product_compatibility | /inventory_item/{sku}/product_compatibility
[**deleteProductCompatibility**](InventoryApiProductCompatibilityApi.md#deleteProductCompatibility) | **DELETE** /inventory_item/{sku}/product_compatibility | /inventory_item/{sku}/product_compatibility
[**getProductCompatibility**](InventoryApiProductCompatibilityApi.md#getProductCompatibility) | **GET** /inventory_item/{sku}/product_compatibility | /inventory_item/{sku}/product_compatibility


<a name="createOrReplaceProductCompatibility"></a>
# **createOrReplaceProductCompatibility**
> BaseResponse createOrReplaceProductCompatibility(sku, contentLanguage, compatibility)

/inventory_item/{sku}/product_compatibility

This call is used by the seller to create or replace a list of products that are compatible with the inventory item. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.&lt;br /&gt;&lt;br /&gt;&lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceProductCompatibility&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiProductCompatibilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiProductCompatibilityApi apiInstance = new InventoryApiProductCompatibilityApi(defaultClient);
    String sku = "sku_example"; // String | A SKU (stock keeping unit) is an unique identifier defined by a seller for a product
    String contentLanguage = "contentLanguage_example"; // String | This request header sets the natural language that will be provided in the field values of the request payload.
    Compatibility compatibility = new Compatibility(); // Compatibility | 
    try {
      BaseResponse result = apiInstance.createOrReplaceProductCompatibility(sku, contentLanguage, compatibility);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiProductCompatibilityApi#createOrReplaceProductCompatibility");
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
 **sku** | **String**| A SKU (stock keeping unit) is an unique identifier defined by a seller for a product |
 **contentLanguage** | **String**| This request header sets the natural language that will be provided in the field values of the request payload. |
 **compatibility** | [**Compatibility**](Compatibility.md)|  | [optional]

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**201** | Created |  -  |
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteProductCompatibility"></a>
# **deleteProductCompatibility**
> Object deleteProductCompatibility(sku)

/inventory_item/{sku}/product_compatibility

This call is used by the seller to delete the list of products that are compatible with the inventory item that is associated with the compatible product list. The inventory item is identified with a SKU value in the URI. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiProductCompatibilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiProductCompatibilityApi apiInstance = new InventoryApiProductCompatibilityApi(defaultClient);
    String sku = "sku_example"; // String | A SKU (stock keeping unit) is an unique identifier defined by a seller for a product
    try {
      Object result = apiInstance.deleteProductCompatibility(sku);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiProductCompatibilityApi#deleteProductCompatibility");
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
 **sku** | **String**| A SKU (stock keeping unit) is an unique identifier defined by a seller for a product |

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

<a name="getProductCompatibility"></a>
# **getProductCompatibility**
> Compatibility getProductCompatibility(sku)

/inventory_item/{sku}/product_compatibility

This call is used by the seller to retrieve the list of products that are compatible with the inventory item. The SKU value for the inventory item is passed into the call URI, and a successful call with return the compatible vehicle list associated with this inventory item. Product compatibility is currently only applicable to motor vehicle parts and accessory categories, but more categories may be supported in the future.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiProductCompatibilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiProductCompatibilityApi apiInstance = new InventoryApiProductCompatibilityApi(defaultClient);
    String sku = "sku_example"; // String | A SKU (stock keeping unit) is an unique identifier defined by a seller for a product
    try {
      Compatibility result = apiInstance.getProductCompatibility(sku);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiProductCompatibilityApi#getProductCompatibility");
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
 **sku** | **String**| A SKU (stock keeping unit) is an unique identifier defined by a seller for a product |

### Return type

[**Compatibility**](Compatibility.md)

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

