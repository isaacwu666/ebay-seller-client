# InventoryApiInventoryItemGroupApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrReplaceInventoryItemGroup**](InventoryApiInventoryItemGroupApi.md#createOrReplaceInventoryItemGroup) | **PUT** /inventory_item_group/{inventoryItemGroupKey} | /inventory_item_group/{inventoryItemGroupKey}
[**deleteInventoryItemGroup**](InventoryApiInventoryItemGroupApi.md#deleteInventoryItemGroup) | **DELETE** /inventory_item_group/{inventoryItemGroupKey} | /inventory_item_group/{inventoryItemGroupKey}
[**getInventoryItemGroup**](InventoryApiInventoryItemGroupApi.md#getInventoryItemGroup) | **GET** /inventory_item_group/{inventoryItemGroupKey} | /inventory_item_group/{inventoryItemGroupKey}


<a name="createOrReplaceInventoryItemGroup"></a>
# **createOrReplaceInventoryItemGroup**
> BaseResponse createOrReplaceInventoryItemGroup(inventoryItemGroupKey, contentLanguage, inventoryItemGroup)

/inventory_item_group/{inventoryItemGroupKey}

&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call creates a new inventory item group or updates an existing inventory item group. It is up to sellers whether they want to create a complete inventory item group record right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call, and then make one or more additional &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; calls to complete the inventory item group record. Upon first creating an inventory item group record, the only required elements are  the &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; identifier in the call URI, and the members of the inventory item group specified through the &lt;strong&gt;variantSKUs&lt;/strong&gt; array in the request payload. &lt;br&gt;&lt;br&gt;In the case of updating/replacing an existing inventory item group, this call does a complete replacement of the existing inventory item group record, so all fields (including the member SKUs) that make up the inventory item group are required, regardless of whether their values changed. So, when replacing/updating an inventory item group record, it is advised that the seller run a &lt;strong&gt;getInventoryItemGroup&lt;/strong&gt; call for that inventory item group to see all of its current values/settings/members before attempting to update the record. And if changes are made to an inventory item group that is part of a live, multiple-variation eBay listing, these changes automatically update the eBay listing. For example, if a SKU value is removed from the inventory item group, the corresponding product variation will be removed from the eBay listing as well.&lt;br/&gt;&lt;br/&gt; In addition to the required inventory item group identifier and member SKUs, other key information that is set with this call include: &lt;ul&gt; &lt;li&gt;Title and description of the inventory item group. The string values provided in these fields will actually become the listing title and listing description of the listing once the first SKU of the inventory item group is published successfully&lt;/li&gt; &lt;li&gt;Common aspects that inventory items in the qroup share&lt;/li&gt; &lt;li&gt;Product aspects that vary within each product variation&lt;/li&gt; &lt;li&gt;Links to images demonstrating the variations of the product, and these images should correspond to the product aspect that is set with the &lt;strong&gt;variesBy.aspectsImageVariesBy&lt;/strong&gt; field&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOrReplaceInventoryItemGroup&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiInventoryItemGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiInventoryItemGroupApi apiInstance = new InventoryApiInventoryItemGroupApi(defaultClient);
    String inventoryItemGroupKey = "inventoryItemGroupKey_example"; // String | Unique identifier of the inventory item group. This identifier is supplied by the seller. The <strong>inventoryItemGroupKey</strong> value for the inventory item group to create/update is passed in at the end of the call URI. This value cannot be changed once it is set.
    String contentLanguage = "contentLanguage_example"; // String | This request header sets the natural language that will be provided in the field values of the request payload.
    InventoryItemGroup inventoryItemGroup = new InventoryItemGroup(); // InventoryItemGroup | 
    try {
      BaseResponse result = apiInstance.createOrReplaceInventoryItemGroup(inventoryItemGroupKey, contentLanguage, inventoryItemGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiInventoryItemGroupApi#createOrReplaceInventoryItemGroup");
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
 **inventoryItemGroupKey** | **String**| Unique identifier of the inventory item group. This identifier is supplied by the seller. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value for the inventory item group to create/update is passed in at the end of the call URI. This value cannot be changed once it is set. |
 **contentLanguage** | **String**| This request header sets the natural language that will be provided in the field values of the request payload. |
 **inventoryItemGroup** | [**InventoryItemGroup**](InventoryItemGroup.md)|  | [optional]

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

<a name="deleteInventoryItemGroup"></a>
# **deleteInventoryItemGroup**
> Object deleteInventoryItemGroup(inventoryItemGroupKey)

/inventory_item_group/{inventoryItemGroupKey}

This call deletes the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiInventoryItemGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiInventoryItemGroupApi apiInstance = new InventoryApiInventoryItemGroupApi(defaultClient);
    String inventoryItemGroupKey = "inventoryItemGroupKey_example"; // String | The unique identifier of an inventory item group. This value is assigned by the seller when an inventory item group is created. The <strong>inventoryItemGroupKey</strong> value for the inventory item group to delete is passed in at the end of the call URI.
    try {
      Object result = apiInstance.deleteInventoryItemGroup(inventoryItemGroupKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiInventoryItemGroupApi#deleteInventoryItemGroup");
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
 **inventoryItemGroupKey** | **String**| The unique identifier of an inventory item group. This value is assigned by the seller when an inventory item group is created. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value for the inventory item group to delete is passed in at the end of the call URI. |

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

<a name="getInventoryItemGroup"></a>
# **getInventoryItemGroup**
> InventoryItemGroup getInventoryItemGroup(inventoryItemGroupKey)

/inventory_item_group/{inventoryItemGroupKey}

This call retrieves the inventory item group for a given &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value is passed in at the end of the call URI.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.InventoryApiInventoryItemGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    InventoryApiInventoryItemGroupApi apiInstance = new InventoryApiInventoryItemGroupApi(defaultClient);
    String inventoryItemGroupKey = "inventoryItemGroupKey_example"; // String | The unique identifier of an inventory item group. This value is assigned by the seller when an inventory item group is created. The <strong>inventoryItemGroupKey</strong> value for the inventory item group to retrieve is passed in at the end of the call URI.
    try {
      InventoryItemGroup result = apiInstance.getInventoryItemGroup(inventoryItemGroupKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApiInventoryItemGroupApi#getInventoryItemGroup");
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
 **inventoryItemGroupKey** | **String**| The unique identifier of an inventory item group. This value is assigned by the seller when an inventory item group is created. The &lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt; value for the inventory item group to retrieve is passed in at the end of the call URI. |

### Return type

[**InventoryItemGroup**](InventoryItemGroup.md)

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

