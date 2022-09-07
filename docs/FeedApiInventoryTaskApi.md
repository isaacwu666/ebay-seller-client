# FeedApiInventoryTaskApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInventoryTask**](FeedApiInventoryTaskApi.md#createInventoryTask) | **POST** /inventory_task | /inventory_task
[**getInventoryTask**](FeedApiInventoryTaskApi.md#getInventoryTask) | **GET** /inventory_task/{task_id} | /inventory_task/{task_id}
[**getInventoryTasks**](FeedApiInventoryTaskApi.md#getInventoryTasks) | **GET** /inventory_task | /inventory_task


<a name="createInventoryTask"></a>
# **createInventoryTask**
> Object createInventoryTask(X_EBAY_C_MARKETPLACE_ID, createInventoryTaskRequest)

/inventory_task

This method creates an inventory-related download task for a specified feed type with optional filter criteria. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt;. &lt;br/&gt;&lt;br/&gt;This method returns the location response header containing the &lt;strong&gt;getInventoryTask&lt;/strong&gt; call URI to retrieve the inventory task you just created. The URL includes the eBay-assigned task ID, which you can use to reference the inventory task.&lt;br/&gt;&lt;br/&gt;To retrieve the status of the task, use the &lt;strong&gt;getInventoryTask&lt;/strong&gt; method to retrieve a single task ID or the &lt;strong&gt;getInventoryTasks&lt;/strong&gt; method to retrieve multiple task IDs.&lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;Presently, this method supports Active Inventory Report. The &lt;strong&gt;ActiveInventoryReport&lt;/strong&gt; returns a report that contains price and quantity information for all of the active listings for a specific seller. A seller can use this information to maintain their inventory on eBay.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiInventoryTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiInventoryTaskApi apiInstance = new FeedApiInventoryTaskApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | The ID of the eBay marketplace where the item is hosted. <p> <span class=\"tablenote\"><strong>Note:</strong> This value is case sensitive.</span></p><p>For example:</p><p><code>X-EBAY-C-MARKETPLACE-ID:EBAY_US</code></p><p>This identifies the eBay marketplace that applies to this task. See <a href=\"/api-docs/sell/feed/types/bas:MarketplaceIdEnum\">MarketplaceIdEnum</a>.</p>
    CreateInventoryTaskRequest createInventoryTaskRequest = new CreateInventoryTaskRequest(); // CreateInventoryTaskRequest | 
    try {
      Object result = apiInstance.createInventoryTask(X_EBAY_C_MARKETPLACE_ID, createInventoryTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiInventoryTaskApi#createInventoryTask");
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
 **X_EBAY_C_MARKETPLACE_ID** | **String**| The ID of the eBay marketplace where the item is hosted. &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This value is case sensitive.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For example:&lt;/p&gt;&lt;p&gt;&lt;code&gt;X-EBAY-C-MARKETPLACE-ID:EBAY_US&lt;/code&gt;&lt;/p&gt;&lt;p&gt;This identifies the eBay marketplace that applies to this task. See &lt;a href&#x3D;\&quot;/api-docs/sell/feed/types/bas:MarketplaceIdEnum\&quot;&gt;MarketplaceIdEnum&lt;/a&gt;.&lt;/p&gt; | [optional]
 **createInventoryTaskRequest** | [**CreateInventoryTaskRequest**](CreateInventoryTaskRequest.md)|  | [optional]

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
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="getInventoryTask"></a>
# **getInventoryTask**
> InventoryTask getInventoryTask(taskId)

/inventory_task/{task_id}

This method retrieves the task details and status of the specified inventory-related task. The input is &lt;strong&gt;task_id&lt;/strong&gt;.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiInventoryTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiInventoryTaskApi apiInstance = new FeedApiInventoryTaskApi(defaultClient);
    String taskId = "taskId_example"; // String | The ID of the task. This ID was generated when the task was created by the <strong>createInventoryTask</strong> method
    try {
      InventoryTask result = apiInstance.getInventoryTask(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiInventoryTaskApi#getInventoryTask");
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
 **taskId** | **String**| The ID of the task. This ID was generated when the task was created by the &lt;strong&gt;createInventoryTask&lt;/strong&gt; method |

### Return type

[**InventoryTask**](InventoryTask.md)

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
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getInventoryTasks"></a>
# **getInventoryTasks**
> InventoryTaskCollection getInventoryTasks(feedType, scheduleId, lookBackDays, dateRange, limit, offset)

/inventory_task

This method searches for multiple tasks of a specific feed type, and includes date filters and pagination.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiInventoryTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiInventoryTaskApi apiInstance = new FeedApiInventoryTaskApi(defaultClient);
    String feedType = "feedType_example"; // String | The feed type associated with the inventory task. Either <strong>feed_type</strong> or <strong>schedule_id</strong> is required. Do not use with the <strong>schedule_id</strong> parameter. Presently, only one feed type is available:<ul><li><code>LMS_ACTIVE_INVENTORY_REPORT</code></li></ul>
    String scheduleId = "scheduleId_example"; // String | The ID of the schedule for which to retrieve the latest result file. This ID is generated when the schedule was created by the <strong>createSchedule</strong> method. Schedules apply to downloaded reports (<code>LMS_ACTIVE_INVENTORY_REPORT</code>). Either <strong>schedule_id</strong> or <strong>feed_type</strong> is  required. Do not use with the <strong>feed_type</strong> parameter.
    String lookBackDays = "lookBackDays_example"; // String | The number of previous days in which to search for tasks. Do not use with the <code>date_range</code> parameter. If both <code>date_range</code> and <code>look_back_days</code> are omitted, this parameter's default value is used.  <br /><br /><b>Default: </b> 7 <br /><br /><b>Range: </b> 1-90 (inclusive)
    String dateRange = "dateRange_example"; // String | Specifies the range of task creation dates used to filter the results. The results are filtered to include only tasks with a creation date that is equal to this date or is within specified range. <p> <span class=\"tablenote\"><strong>Note:</strong> Maximum date range window size is 90 days.</span></p><br /><b>Valid Format (UTC): </b><code>yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ</code><br /><br />For example: Tasks created on March 31, 2021<br /> <code>2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z</code><br /><br />
    String limit = "limit_example"; // String | The maximum number of tasks that can be returned on each page of the paginated response. Use this parameter in conjunction with the <strong>offset</strong> parameter to control the pagination of the output. <p> <span class=\"tablenote\"><strong>Note:</strong> This feature employs a zero-based list, where the first item in the list has an offset of <code>0</code>.</span></p><p>For example, if <strong>offset</strong> is set to 10 and <strong>limit</strong> is set to 10, the call retrieves tasks 11 thru 20 from the result set.</p><p>If this parameter is omitted, the default value is used. <br /><br /><b>Default: </b> 10 <br /><br /><b>Maximum: </b>500
    String offset = "offset_example"; // String | The number of tasks to skip in the result set before returning the first task in the paginated response. <p>Combine <strong>offset</strong> with the <strong>limit</strong> query parameter to control the items returned in the response. For example, if you supply an <strong>offset</strong> of <code>0</code> and a <strong>limit</strong> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <strong>offset</strong> is <code>10</code> and <strong>limit</strong> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set. If this query parameter is not set, the default value is used and the first page of records is returned. <br /><br /><b>Default: </b>0
    try {
      InventoryTaskCollection result = apiInstance.getInventoryTasks(feedType, scheduleId, lookBackDays, dateRange, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiInventoryTaskApi#getInventoryTasks");
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
 **feedType** | **String**| The feed type associated with the inventory task. Either &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;schedule_id&lt;/strong&gt; is required. Do not use with the &lt;strong&gt;schedule_id&lt;/strong&gt; parameter. Presently, only one feed type is available:&lt;ul&gt;&lt;li&gt;&lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; | [optional]
 **scheduleId** | **String**| The ID of the schedule for which to retrieve the latest result file. This ID is generated when the schedule was created by the &lt;strong&gt;createSchedule&lt;/strong&gt; method. Schedules apply to downloaded reports (&lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;). Either &lt;strong&gt;schedule_id&lt;/strong&gt; or &lt;strong&gt;feed_type&lt;/strong&gt; is  required. Do not use with the &lt;strong&gt;feed_type&lt;/strong&gt; parameter. | [optional]
 **lookBackDays** | **String**| The number of previous days in which to search for tasks. Do not use with the &lt;code&gt;date_range&lt;/code&gt; parameter. If both &lt;code&gt;date_range&lt;/code&gt; and &lt;code&gt;look_back_days&lt;/code&gt; are omitted, this parameter&#39;s default value is used.  &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt; 7 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Range: &lt;/b&gt; 1-90 (inclusive) | [optional]
 **dateRange** | **String**| Specifies the range of task creation dates used to filter the results. The results are filtered to include only tasks with a creation date that is equal to this date or is within specified range. &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Maximum date range window size is 90 days.&lt;/span&gt;&lt;/p&gt;&lt;br /&gt;&lt;b&gt;Valid Format (UTC): &lt;/b&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example: Tasks created on March 31, 2021&lt;br /&gt; &lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; | [optional]
 **limit** | **String**| The maximum number of tasks that can be returned on each page of the paginated response. Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to 10 and &lt;strong&gt;limit&lt;/strong&gt; is set to 10, the call retrieves tasks 11 thru 20 from the result set.&lt;/p&gt;&lt;p&gt;If this parameter is omitted, the default value is used. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt; 10 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;500 | [optional]
 **offset** | **String**| The number of tasks to skip in the result set before returning the first task in the paginated response. &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. If this query parameter is not set, the default value is used and the first page of records is returned. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt;0 | [optional]

### Return type

[**InventoryTaskCollection**](InventoryTaskCollection.md)

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
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

