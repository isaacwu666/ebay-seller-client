# FeedApiTaskApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTask**](FeedApiTaskApi.md#createTask) | **POST** /task | /task
[**getInputFile**](FeedApiTaskApi.md#getInputFile) | **GET** /task/{task_id}/download_input_file | /task/{task_id}/download_input_file
[**getResultFile**](FeedApiTaskApi.md#getResultFile) | **GET** /task/{task_id}/download_result_file | /task/{task_id}/download_result_file
[**getTask**](FeedApiTaskApi.md#getTask) | **GET** /task/{task_id} | /task/{task_id}
[**getTasks**](FeedApiTaskApi.md#getTasks) | **GET** /task | /task
[**uploadFile**](FeedApiTaskApi.md#uploadFile) | **POST** /task/{task_id}/upload_file | /task/{task_id}/upload_file


<a name="createTask"></a>
# **createTask**
> Object createTask(X_EBAY_C_MARKETPLACE_ID, createTaskRequest)

/task

This method creates an upload task or a download task without filter criteria. When using this method, specify the &lt;b&gt; feedType&lt;/b&gt; and the feed file &lt;b&gt; schemaVersion&lt;/b&gt;. The feed type specified sets the task as a download or an upload task.  &lt;p&gt;For details about the upload and download flows, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html\&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/p&gt;&lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The scope depends on the feed type. An error message results when an unsupported scope or feed type is specified.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;The following list contains this method&#39;s authorization scopes and their corresponding feed types:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.inventory: See &lt;a href&#x3D;\&quot;/api-docs/sell/static/lms-migration/lms-to-feed-feedtype.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.fulfillment: LMS_ORDER_ACK (specify for upload tasks). Also see &lt;a href&#x3D;\&quot;/api-docs/sell/static/lms-migration/lms-to-feed-feedtype.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;LMS FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/sell.marketing: None*&lt;/li&gt;&lt;li&gt;https://api.ebay.com/oauth/api_scope/commerce.catalog.readonly: None*&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;* Reserved for future release&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiTaskApi apiInstance = new FeedApiTaskApi(defaultClient);
    String X_EBAY_C_MARKETPLACE_ID = "X_EBAY_C_MARKETPLACE_ID_example"; // String | The ID of the eBay marketplace where the item is hosted. <p> <span class=\"tablenote\"><strong>Note:</strong> This value is case sensitive.</span></p><p>For example:</p><p><code>X-EBAY-C-MARKETPLACE-ID:EBAY_US</code></p><p>This identifies the eBay marketplace that applies to this task. See <a href=\"/api-docs/sell/feed/types/bas:MarketplaceIdEnum\">MarketplaceIdEnum</a>.</p>
    CreateTaskRequest createTaskRequest = new CreateTaskRequest(); // CreateTaskRequest | 
    try {
      Object result = apiInstance.createTask(X_EBAY_C_MARKETPLACE_ID, createTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiTaskApi#createTask");
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
 **createTaskRequest** | [**CreateTaskRequest**](CreateTaskRequest.md)|  | [optional]

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

<a name="getInputFile"></a>
# **getInputFile**
> Object getInputFile(taskId)

/task/{task_id}/download_input_file

This method downloads the file previously uploaded using &lt;strong&gt;uploadFile&lt;/strong&gt;. Specify the task_id from the &lt;strong&gt;uploadFile&lt;/strong&gt; call. &lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; With respect to LMS, this method applies to all feed types except &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; and &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/feed/lms-feeds.html\&quot;&gt;LMS API Feeds&lt;/a&gt; in the Selling Integration Guide.&lt;/span&gt;&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiTaskApi apiInstance = new FeedApiTaskApi(defaultClient);
    String taskId = "taskId_example"; // String | The task ID associated with the file to be downloaded.
    try {
      Object result = apiInstance.getInputFile(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiTaskApi#getInputFile");
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
 **taskId** | **String**| The task ID associated with the file to be downloaded. |

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
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getResultFile"></a>
# **getResultFile**
> Object getResultFile(taskId)

/task/{task_id}/download_result_file

This method retrieves the generated file that is associated with the specified task ID. The response of this call is a compressed or uncompressed CSV, XML, or JSON file, with the applicable file extension (for example: csv.gz). &lt;p&gt;For details about how this method is used, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html\&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. &lt;/p&gt;&lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The status of the task to retrieve must be in the COMPLETED or COMPLETED_WITH_ERROR state before this method can retrieve the file. You can use the getTask or getTasks method to retrieve the status of the task.&lt;/span&gt;&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiTaskApi apiInstance = new FeedApiTaskApi(defaultClient);
    String taskId = "taskId_example"; // String | The ID of the task associated with the file you want to download. This ID was generated when the task was created.
    try {
      Object result = apiInstance.getResultFile(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiTaskApi#getResultFile");
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
 **taskId** | **String**| The ID of the task associated with the file you want to download. This ID was generated when the task was created. |

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
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getTask"></a>
# **getTask**
> Task getTask(taskId)

/task/{task_id}

This method retrieves the details and status of the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;. &lt;br /&gt;&lt;br /&gt;For details of how this method is used, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html\&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. 

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiTaskApi apiInstance = new FeedApiTaskApi(defaultClient);
    String taskId = "taskId_example"; // String | The ID of the task. This ID was generated when the task was created.
    try {
      Task result = apiInstance.getTask(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiTaskApi#getTask");
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
 **taskId** | **String**| The ID of the task. This ID was generated when the task was created. |

### Return type

[**Task**](Task.md)

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

<a name="getTasks"></a>
# **getTasks**
> TaskCollection getTasks(dateRange, feedType, limit, lookBackDays, offset, scheduleId)

/task

This method returns the details and status for an array of tasks based on a specified &lt;strong&gt;feed_type&lt;/strong&gt; or &lt;strong&gt;scheduledId&lt;/strong&gt;. Specifying both &lt;strong&gt;feed_type&lt;/strong&gt; and &lt;strong&gt;scheduledId&lt;/strong&gt; results in an error. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;If specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, limit which tasks are returned by specifying filters, such as the creation date range or period of time using &lt;strong&gt;look_back_days&lt;/strong&gt;. Also, by specifying the &lt;strong&gt;feed_type&lt;/strong&gt;, both on-demand and scheduled reports are returned.&lt;br /&gt;&lt;br /&gt;If specifying a &lt;strong&gt;scheduledId&lt;/strong&gt;, the schedule template (that the schedule ID is based on) determines which tasks are returned (see &lt;strong&gt;schedule_id&lt;/strong&gt; for additional information). Each &lt;strong&gt;scheduledId&lt;/strong&gt; applies to one &lt;strong&gt;feed_type&lt;/strong&gt;. 

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiTaskApi apiInstance = new FeedApiTaskApi(defaultClient);
    String dateRange = "dateRange_example"; // String | Specifies the range of task creation dates used to filter the results. The results are filtered to include only tasks with a creation date that is equal to this date or is within specified range. Only tasks that are less than 90 days can be retrieved. <p> <span class=\"tablenote\"><strong>Note:</strong> Maximum date range window size is 90 days.</span></p> <br /><b>Valid Format (UTC):</b><code>yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ </code><br /><br />For example: Tasks created on September 8, 2019<br /> <code>2019-09-08T00:00:00.000Z..2019-09-09T00:00:00.000Z</code>
    String feedType = "feedType_example"; // String | The feed type associated with the tasks to be returned. Only use a <strong>feedType</strong> that is available for your API: <ul><li>Order Feeds: <code>LMS_ORDER_ACK, LMS_ORDER_REPORT</code></li><li>Large Merchant Services (LMS) Feeds: See <a href=\"/api-docs/sell/static/lms-migration/lms-to-feed-feedtype.html\" target=\"_blank\">Available FeedTypes</a></li></ul><br/>Do not use with the <strong>schedule_id</strong> parameter. Since schedules are based on feed types, you can specify a schedule (<strong>schedule_id</strong>) that returns the needed <strong>feed_type</strong>.
    String limit = "limit_example"; // String | The maximum number of tasks that can be returned on each page of the paginated response. Use this parameter in conjunction with the <strong>offset</strong> parameter to control the pagination of the output. <p> <span class=\"tablenote\"><strong>Note:</strong> This feature employs a zero-based list, where the first item in the list has an offset of <code>0</code>.</span></p><p>For example, if <strong>offset</strong> is set to 10 and <strong>limit</strong> is set to 10, the call retrieves tasks 11 thru 20 from the result set.</p><p>If this parameter is omitted, the default value is used. <br /><br /><b>Default: </b> 10 <br /><br /><b>Maximum: </b>500
    String lookBackDays = "lookBackDays_example"; // String | The number of previous days in which to search for tasks. Do not use with the <code>date_range</code> parameter. If both <code>date_range</code> and <code>look_back_days</code> are omitted, this parameter's default value is used.  <br /><br /><b>Default: </b> 7 <br /><br /><b>Range: </b> 1-90 (inclusive)
    String offset = "offset_example"; // String | The number of tasks to skip in the result set before returning the first task in the paginated response. <p>Combine <strong>offset</strong> with the <strong>limit</strong> query parameter to control the items returned in the response. For example, if you supply an <strong>offset</strong> of <code>0</code> and a <strong>limit</strong> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <strong>offset</strong> is <code>10</code> and <strong>limit</strong> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set. If this query parameter is not set, the default value is used and the first page of records is returned. <br /><br /><b>Default: </b>0
    String scheduleId = "scheduleId_example"; // String | The schedule ID associated with the task. A schedule periodically generates a report for the feed type specified by the schedule template (see <strong>scheduleTemplateId</strong> in <strong>createSchedule</strong>). Do not use with the <strong>feed_type</strong> parameter. Since schedules are based on feed types, you can specify a schedule (<strong>schedule_id</strong>) that returns the needed <strong>feed_type</strong>.
    try {
      TaskCollection result = apiInstance.getTasks(dateRange, feedType, limit, lookBackDays, offset, scheduleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiTaskApi#getTasks");
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
 **dateRange** | **String**| Specifies the range of task creation dates used to filter the results. The results are filtered to include only tasks with a creation date that is equal to this date or is within specified range. Only tasks that are less than 90 days can be retrieved. &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Maximum date range window size is 90 days.&lt;/span&gt;&lt;/p&gt; &lt;br /&gt;&lt;b&gt;Valid Format (UTC):&lt;/b&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example: Tasks created on September 8, 2019&lt;br /&gt; &lt;code&gt;2019-09-08T00:00:00.000Z..2019-09-09T00:00:00.000Z&lt;/code&gt; | [optional]
 **feedType** | **String**| The feed type associated with the tasks to be returned. Only use a &lt;strong&gt;feedType&lt;/strong&gt; that is available for your API: &lt;ul&gt;&lt;li&gt;Order Feeds: &lt;code&gt;LMS_ORDER_ACK, LMS_ORDER_REPORT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;Large Merchant Services (LMS) Feeds: See &lt;a href&#x3D;\&quot;/api-docs/sell/static/lms-migration/lms-to-feed-feedtype.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Available FeedTypes&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;Do not use with the &lt;strong&gt;schedule_id&lt;/strong&gt; parameter. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;. | [optional]
 **limit** | **String**| The maximum number of tasks that can be returned on each page of the paginated response. Use this parameter in conjunction with the &lt;strong&gt;offset&lt;/strong&gt; parameter to control the pagination of the output. &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to 10 and &lt;strong&gt;limit&lt;/strong&gt; is set to 10, the call retrieves tasks 11 thru 20 from the result set.&lt;/p&gt;&lt;p&gt;If this parameter is omitted, the default value is used. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt; 10 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;500 | [optional]
 **lookBackDays** | **String**| The number of previous days in which to search for tasks. Do not use with the &lt;code&gt;date_range&lt;/code&gt; parameter. If both &lt;code&gt;date_range&lt;/code&gt; and &lt;code&gt;look_back_days&lt;/code&gt; are omitted, this parameter&#39;s default value is used.  &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt; 7 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Range: &lt;/b&gt; 1-90 (inclusive) | [optional]
 **offset** | **String**| The number of tasks to skip in the result set before returning the first task in the paginated response. &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. If this query parameter is not set, the default value is used and the first page of records is returned. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt;0 | [optional]
 **scheduleId** | **String**| The schedule ID associated with the task. A schedule periodically generates a report for the feed type specified by the schedule template (see &lt;strong&gt;scheduleTemplateId&lt;/strong&gt; in &lt;strong&gt;createSchedule&lt;/strong&gt;). Do not use with the &lt;strong&gt;feed_type&lt;/strong&gt; parameter. Since schedules are based on feed types, you can specify a schedule (&lt;strong&gt;schedule_id&lt;/strong&gt;) that returns the needed &lt;strong&gt;feed_type&lt;/strong&gt;. | [optional]

### Return type

[**TaskCollection**](TaskCollection.md)

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

<a name="uploadFile"></a>
# **uploadFile**
> Object uploadFile(taskId, creationDate, fileName, modificationDate, name, parameters, readDate, size, type)

/task/{task_id}/upload_file

This method associates the specified file with the specified task ID and uploads the input file. After the file has been uploaded, the processing of the file begins. &lt;br /&gt;&lt;br /&gt;Reports often take time to generate and it&#39;s common for this method to return an HTTP status of 202, which indicates the report is being generated. Use the &lt;b&gt; getTask&lt;/b&gt; with the task ID or &lt;b&gt; getTasks&lt;/b&gt; to determine the status of a report. &lt;br /&gt;&lt;br /&gt;The status flow is &lt;code&gt;QUEUED&lt;/code&gt; &amp;gt; &lt;code&gt;IN_PROCESS&lt;/code&gt; &amp;gt; &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;. When the status is &lt;code&gt;COMPLETED&lt;/code&gt; or &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, this indicates the file has been processed and the order report can be downloaded. If there are errors, they will be indicated in the report file. &lt;br /&gt;&lt;br /&gt;For details of how this method is used in the upload flow, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/orders/generating-and-retrieving-order-reports.html\&quot;&gt;Working with Order Feeds&lt;/a&gt; in the Selling Integration Guide. &lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This method applies to all Seller Hub feed types and LMS feed types except &lt;code&gt;LMS_ORDER_REPORT&lt;/code&gt; and &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/feed/lms-feeds-quick-reference.html#Availabl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;LMS feed types&lt;/a&gt; and &lt;a href&#x3D;\&quot;/api-docs/sell/static/feed/fx-feeds-quick-reference.html#availabl\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Seller Hub feed types&lt;/a&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You must use a &lt;strong&gt;Content-Type&lt;/strong&gt; header with its value set to \&quot;&lt;strong&gt;multipart/form-data&lt;/strong&gt;\&quot;. See &lt;a href&#x3D;\&quot;/api-docs/sell/feed/resources/task/methods/uploadFile#h2-samples\&quot;&gt;Samples&lt;/a&gt; for information.&lt;/span&gt;&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiTaskApi apiInstance = new FeedApiTaskApi(defaultClient);
    String taskId = "taskId_example"; // String | The task_id associated with the file that will be uploaded. This ID was generated when the specified task was created.
    String creationDate = "creationDate_example"; // String | The file creation date. <br /><br /><b> Format: </b> UTC <code>yyyy-MM-ddThh:mm:ss.SSSZ</code><p><b>For example:</b><p>Created on September 8, 2019</p><p><code>2019-09-08T00:00:00.000Z</code></p>
    String fileName = "fileName_example"; // String | The name of the file including its extension (for example, xml or csv) to be uploaded.
    String modificationDate = "modificationDate_example"; // String | The file modified date. <br /><br /><b> Format: </b> UTC <code>yyyy-MM-ddThh:mm:ss.SSSZ</code><p><b>For example:</b><p>Created on September 9, 2019</p><p><code>2019-09-09T00:00:00.000Z</code></p>
    String name = "name_example"; // String | A content identifier. The only presently supported name is <code>file</code>.
    String parameters = "parameters_example"; // String | The parameters you want associated with the file.
    String readDate = "readDate_example"; // String | The date you read the file. <br /><br /><b> Format: </b> UTC <code>yyyy-MM-ddThh:mm:ss.SSSZ</code><p><b>For example:</b><p>Created on September 10, 2019</p><p><code>2019-09-10T00:00:00.000Z</code></p>
    Integer size = 56; // Integer | The size of the file.
    String type = "type_example"; // String | The file type. The only presently supported type is <code>form-data</code>.
    try {
      Object result = apiInstance.uploadFile(taskId, creationDate, fileName, modificationDate, name, parameters, readDate, size, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiTaskApi#uploadFile");
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
 **taskId** | **String**| The task_id associated with the file that will be uploaded. This ID was generated when the specified task was created. |
 **creationDate** | **String**| The file creation date. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Format: &lt;/b&gt; UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;p&gt;&lt;b&gt;For example:&lt;/b&gt;&lt;p&gt;Created on September 8, 2019&lt;/p&gt;&lt;p&gt;&lt;code&gt;2019-09-08T00:00:00.000Z&lt;/code&gt;&lt;/p&gt; | [optional]
 **fileName** | **String**| The name of the file including its extension (for example, xml or csv) to be uploaded. | [optional]
 **modificationDate** | **String**| The file modified date. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Format: &lt;/b&gt; UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;p&gt;&lt;b&gt;For example:&lt;/b&gt;&lt;p&gt;Created on September 9, 2019&lt;/p&gt;&lt;p&gt;&lt;code&gt;2019-09-09T00:00:00.000Z&lt;/code&gt;&lt;/p&gt; | [optional]
 **name** | **String**| A content identifier. The only presently supported name is &lt;code&gt;file&lt;/code&gt;. | [optional]
 **parameters** | **String**| The parameters you want associated with the file. | [optional]
 **readDate** | **String**| The date you read the file. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Format: &lt;/b&gt; UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;p&gt;&lt;b&gt;For example:&lt;/b&gt;&lt;p&gt;Created on September 10, 2019&lt;/p&gt;&lt;p&gt;&lt;code&gt;2019-09-10T00:00:00.000Z&lt;/code&gt;&lt;/p&gt; | [optional]
 **size** | **Integer**| The size of the file. | [optional]
 **type** | **String**| The file type. The only presently supported type is &lt;code&gt;form-data&lt;/code&gt;. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

