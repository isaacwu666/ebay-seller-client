# InventoryApiLocationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInventoryLocation**](InventoryApiLocationApi.md#createInventoryLocation) | **POST** /location/{merchantLocationKey} | /location/{merchantLocationKey}
[**deleteInventoryLocation**](InventoryApiLocationApi.md#deleteInventoryLocation) | **DELETE** /location/{merchantLocationKey} | /location/{merchantLocationKey}
[**disableInventoryLocation**](InventoryApiLocationApi.md#disableInventoryLocation) | **POST** /location/{merchantLocationKey}/disable | /location/{merchantLocationKey}/disable
[**enableInventoryLocation**](InventoryApiLocationApi.md#enableInventoryLocation) | **POST** /location/{merchantLocationKey}/enable | /location/{merchantLocationKey}/enable
[**getInventoryLocation**](InventoryApiLocationApi.md#getInventoryLocation) | **GET** /location/{merchantLocationKey} | /location/{merchantLocationKey}
[**getInventoryLocations**](InventoryApiLocationApi.md#getInventoryLocations) | **GET** /location | /location
[**updateInventoryLocation**](InventoryApiLocationApi.md#updateInventoryLocation) | **POST** /location/{merchantLocationKey}/update_location_details | /location/{merchantLocationKey}/update_location_details


<a name="createInventoryLocation"></a>
# **createInventoryLocation**
> Object createInventoryLocation(merchantLocationKey, inventoryLocationFull)

/location/{merchantLocationKey}

&lt;p&gt;Use this call to create a new inventory location. In order to create and publish an offer (and create an eBay listing), a seller must have at least one inventory location, as every offer must be associated with a location.&lt;/p&gt;&lt;p&gt;Upon first creating an inventory location, only a seller-defined location identifier and a physical location is required, and once set, these values can not be changed. The unique identifier value (&lt;i&gt;merchantLocationKey&lt;/i&gt;) is passed in at the end of the call URI. This &lt;i&gt;merchantLocationKey&lt;/i&gt; value will be used in other Inventory Location calls to identify the inventory location to perform an action against.&lt;/p&gt;&lt;p&gt;At this time, location types are either warehouse or store. Warehouse locations are used for traditional shipping, and store locations are generally used by US merchants selling products through the In-Store Pickup program, or used by UK, Australian, and German merchants selling products through the Click and Collect program. A full address is required for store inventory locations. However, for warehouse inventory locations, a full street address is not needed, but the city, state/province, and country of the location must be provided. &lt;/p&gt;&lt;p&gt;Note that all inventory locations are \&quot;enabled\&quot; by default when they are created, and you must specifically disable them (by passing in a value of &lt;code&gt;DISABLED&lt;/code&gt; in the &lt;strong&gt;merchantLocationStatus&lt;/strong&gt; field) if you want them to be set to the disabled state. The seller&#39;s inventory cannot be loaded to inventory locations in the disabled state.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the following table includes another request header that is mandatory for the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, and two other request headers that are optional:&lt;/p&gt;&lt;br&gt; &lt;table&gt; &lt;tr&gt; &lt;th&gt;Header&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;th&gt;Required?&lt;/th&gt; &lt;th&gt;Applicable Values&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Accept&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Describes the response encoding, as required by the caller. Currently, the interfaces require payloads formatted in JSON, and JSON is the default.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Language&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Use this header to control the language that is used for any returned errors or warnings in the call response.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;en-US&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Type&lt;/code&gt;&lt;/td&gt; &lt;td&gt;The MIME type of the body of the request. Must be JSON.&lt;/td&gt; &lt;td&gt;Yes&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt;&lt;/p&gt;&lt;br/&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiLocationApi apiInstance = new InventoryApiLocationApi(defaultClient);
    String merchantLocationKey = "merchantLocationKey_example"; // String | A unique, merchant-defined key (ID) for an inventory location. This unique identifier, or key, is used in other Inventory API calls to identify an inventory location. <br><br><b>Max length</b>: 36
    InventoryLocationFull inventoryLocationFull = new InventoryLocationFull(); // InventoryLocationFull | 
    try {
      Object result = apiInstance.createInventoryLocation(merchantLocationKey, inventoryLocationFull);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiLocationApi#createInventoryLocation");
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
 **merchantLocationKey** | **String**| A unique, merchant-defined key (ID) for an inventory location. This unique identifier, or key, is used in other Inventory API calls to identify an inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 |
 **inventoryLocationFull** | [**InventoryLocationFull**](InventoryLocationFull.md)|  | [optional]

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
**409** | Location Already Exists |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteInventoryLocation"></a>
# **deleteInventoryLocation**
> Object deleteInventoryLocation(merchantLocationKey)

/location/{merchantLocationKey}

&lt;p&gt;This call deletes the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Note that deleting a location will not affect any active eBay listings associated with the deleted location, but the seller will not be able modify the offers associated with the inventory location once it is deleted.&lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiLocationApi apiInstance = new InventoryApiLocationApi(defaultClient);
    String merchantLocationKey = "merchantLocationKey_example"; // String | A unique merchant-defined key (ID) for an inventory location. This value is passed in at the end of the call URI to indicate the inventory location to be deleted. <br><br><b>Max length</b>: 36
    try {
      Object result = apiInstance.deleteInventoryLocation(merchantLocationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiLocationApi#deleteInventoryLocation");
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
 **merchantLocationKey** | **String**| A unique merchant-defined key (ID) for an inventory location. This value is passed in at the end of the call URI to indicate the inventory location to be deleted. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 |

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

<a name="disableInventoryLocation"></a>
# **disableInventoryLocation**
> Object disableInventoryLocation(merchantLocationKey)

/location/{merchantLocationKey}/disable

&lt;p&gt;This call disables the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Sellers can not load/modify inventory to disabled inventory locations. Note that disabling an inventory location will not affect any active eBay listings associated with the disabled location, but the seller will not be able modify the offers associated with a disabled inventory location.&lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiLocationApi apiInstance = new InventoryApiLocationApi(defaultClient);
    String merchantLocationKey = "merchantLocationKey_example"; // String | A unique merchant-defined key (ID) for an inventory location. This value is passed in through the call URI to disable the specified inventory location. <br><br><b>Max length</b>: 36
    try {
      Object result = apiInstance.disableInventoryLocation(merchantLocationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiLocationApi#disableInventoryLocation");
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
 **merchantLocationKey** | **String**| A unique merchant-defined key (ID) for an inventory location. This value is passed in through the call URI to disable the specified inventory location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 |

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

<a name="enableInventoryLocation"></a>
# **enableInventoryLocation**
> Object enableInventoryLocation(merchantLocationKey)

/location/{merchantLocationKey}/enable

&lt;p&gt;This call enables a disabled inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Once a disabled inventory location is enabled, sellers can start loading/modifying inventory to that inventory location. &lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiLocationApi apiInstance = new InventoryApiLocationApi(defaultClient);
    String merchantLocationKey = "merchantLocationKey_example"; // String | A unique merchant-defined key (ID) for an inventory location. This value is passed in through the call URI to specify the disabled inventory location to enable. <br><br><b>Max length</b>: 36
    try {
      Object result = apiInstance.enableInventoryLocation(merchantLocationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiLocationApi#enableInventoryLocation");
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
 **merchantLocationKey** | **String**| A unique merchant-defined key (ID) for an inventory location. This value is passed in through the call URI to specify the disabled inventory location to enable. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 |

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

<a name="getInventoryLocation"></a>
# **getInventoryLocation**
> InventoryLocationResponse getInventoryLocation(merchantLocationKey)

/location/{merchantLocationKey}

This call retrieves all defined details of the inventory location that is specified by the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiLocationApi apiInstance = new InventoryApiLocationApi(defaultClient);
    String merchantLocationKey = "merchantLocationKey_example"; // String | A unique merchant-defined key (ID) for an inventory location. This value is passed in at the end of the call URI to specify the inventory location to retrieve. <br><br><b>Max length</b>: 36
    try {
      InventoryLocationResponse result = apiInstance.getInventoryLocation(merchantLocationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiLocationApi#getInventoryLocation");
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
 **merchantLocationKey** | **String**| A unique merchant-defined key (ID) for an inventory location. This value is passed in at the end of the call URI to specify the inventory location to retrieve. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 |

### Return type

[**InventoryLocationResponse**](InventoryLocationResponse.md)

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

<a name="getInventoryLocations"></a>
# **getInventoryLocations**
> LocationResponse getInventoryLocations(limit, offset)

/location

This call retrieves all defined details for every inventory location associated with the seller&#39;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of inventory locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiLocationApi apiInstance = new InventoryApiLocationApi(defaultClient);
    String limit = "limit_example"; // String | The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be a positive integer value. If this query parameter is not set, up to 100 records will be returned on each page of results. <br><br> <strong>Min</strong>: 1
    String offset = "offset_example"; // String | Specifies the number of locations to skip in the result set before returning the first location in the paginated response.  <p>Combine <b>offset</b> with the <b>limit</b> query parameter to control the items returned in the response. For example, if you supply an <b>offset</b> of <code>0</code> and a <b>limit</b> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <b>offset</b> is <code>10</code> and <b>limit</b> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set.</p> <p><b>Default:</b> 0</p>
    try {
      LocationResponse result = apiInstance.getInventoryLocations(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiLocationApi#getInventoryLocations");
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
 **limit** | **String**| The value passed in this query parameter sets the maximum number of records to return per page of data. Although this field is a string, the value passed in this field should be a positive integer value. If this query parameter is not set, up to 100 records will be returned on each page of results. &lt;br&gt;&lt;br&gt; &lt;strong&gt;Min&lt;/strong&gt;: 1 | [optional]
 **offset** | **String**| Specifies the number of locations to skip in the result set before returning the first location in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt; | [optional]

### Return type

[**LocationResponse**](LocationResponse.md)

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

<a name="updateInventoryLocation"></a>
# **updateInventoryLocation**
> Object updateInventoryLocation(merchantLocationKey, inventoryLocation)

/location/{merchantLocationKey}/update_location_details

&lt;p&gt;Use this call to update non-physical location details for an existing inventory location. Specify the inventory location you want to update using the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;br&gt;&lt;br&gt;You can update the following text-based fields: &lt;strong&gt;name&lt;/strong&gt;, &lt;strong&gt;phone&lt;/strong&gt;, &lt;strong&gt;locationWebUrl&lt;/strong&gt;, &lt;strong&gt;locationInstructions&lt;/strong&gt; and &lt;strong&gt;locationAdditionalInformation&lt;/strong&gt;. Whatever text is passed in for these fields in an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will replace the current text strings defined for these fields. For store inventory locations, the operating hours and/or the special hours can also be updated. &lt;br&gt;&lt;br&gt; The merchant location key, the physical location of the store, and its geo-location coordinates can not be updated with an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call &lt;/p&gt;&lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the following table includes another request header that is mandatory for the &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call, and two other request headers that are optional:&lt;/p&gt;&lt;br&gt; &lt;table&gt; &lt;tr&gt; &lt;th&gt;Header&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;th&gt;Required?&lt;/th&gt; &lt;th&gt;Applicable Values&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Accept&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Describes the response encoding, as required by the caller. Currently, the interfaces require payloads formatted in JSON, and JSON is the default.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Language&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Use this header to control the language that is used for any returned errors or warnings in the call response.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;en-US&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Type&lt;/code&gt;&lt;/td&gt; &lt;td&gt;The MIME type of the body of the request. Must be JSON.&lt;/td&gt; &lt;td&gt;Yes&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt;&lt;br/&gt;&lt;p&gt;Unless one or more errors and/or warnings occurs with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiLocationApi apiInstance = new InventoryApiLocationApi(defaultClient);
    String merchantLocationKey = "merchantLocationKey_example"; // String | A unique merchant-defined key (ID) for an inventory location. This value is passed in the call URI to indicate the inventory location to be updated. <br><br><b>Max length</b>: 36
    InventoryLocation inventoryLocation = new InventoryLocation(); // InventoryLocation | 
    try {
      Object result = apiInstance.updateInventoryLocation(merchantLocationKey, inventoryLocation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiLocationApi#updateInventoryLocation");
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
 **merchantLocationKey** | **String**| A unique merchant-defined key (ID) for an inventory location. This value is passed in the call URI to indicate the inventory location to be updated. &lt;br&gt;&lt;br&gt;&lt;b&gt;Max length&lt;/b&gt;: 36 |
 **inventoryLocation** | [**InventoryLocation**](InventoryLocation.md)|  | [optional]

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
**204** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

