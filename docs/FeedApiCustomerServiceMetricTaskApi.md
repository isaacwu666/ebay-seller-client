# FeedApiCustomerServiceMetricTaskApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerServiceMetricTask**](FeedApiCustomerServiceMetricTaskApi.md#createCustomerServiceMetricTask) | **POST** /customer_service_metric_task | /customer_service_metric_task
[**getCustomerServiceMetricTask**](FeedApiCustomerServiceMetricTaskApi.md#getCustomerServiceMetricTask) | **GET** /customer_service_metric_task/{task_id} | /customer_service_metric_task/{task_id}
[**getCustomerServiceMetricTasks**](FeedApiCustomerServiceMetricTaskApi.md#getCustomerServiceMetricTasks) | **GET** /customer_service_metric_task | /customer_service_metric_task


<a name="createCustomerServiceMetricTask"></a>
# **createCustomerServiceMetricTask**
> Object createCustomerServiceMetricTask(acceptLanguage, createServiceMetricsTaskRequest)

/customer_service_metric_task

&lt;p&gt;Use this method to create a customer service metrics download task with filter criteria for the customer service metrics report. When using this method, specify the &lt;strong&gt;feedType&lt;/strong&gt; and &lt;strong&gt;filterCriteria&lt;/strong&gt; including both &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; and &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; for the report. The method returns the location response header containing the call URI to use with &lt;strong&gt;getCustomerServiceMetricTask&lt;/strong&gt; to retrieve status and details on the task.&lt;/p&gt;&lt;p&gt;Only CURRENT Customer Service Metrics reports can be generated with the Sell Feed API. PROJECTED reports are not supported at this time. See the &lt;a href&#x3D;\&quot;/api-docs/sell/analytics/resources/customer_service_metric/methods/getCustomerServiceMetric\&quot;&gt;getCustomerServiceMetric&lt;/a&gt; method document in the Analytics API for more information about these two types of reports.&lt;/p&gt;&lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before calling this API, retrieve the summary of the seller&#39;s performance and rating for the customer service metric by calling &lt;strong&gt;getCustomerServiceMetric&lt;/strong&gt; (part of the &lt;a href&#x3D;\&quot;/api-docs/sell/analytics/resources/methods\&quot;&gt;Analytics API&lt;/a&gt;). You can then populate the create task request fields with the values from the response. This technique eliminates failed tasks that request a report for a &lt;strong&gt;customerServiceMetricType&lt;/strong&gt; and &lt;strong&gt;evaluationMarketplaceId&lt;/strong&gt; that are without evaluation.&lt;/span&gt;&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiCustomerServiceMetricTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiCustomerServiceMetricTaskApi apiInstance = new FeedApiCustomerServiceMetricTaskApi(defaultClient);
    String acceptLanguage = "acceptLanguage_example"; // String | Use this header to specify the natural language in which the authenticated user desires the response.
    CreateServiceMetricsTaskRequest createServiceMetricsTaskRequest = new CreateServiceMetricsTaskRequest(); // CreateServiceMetricsTaskRequest | 
    try {
      Object result = apiInstance.createCustomerServiceMetricTask(acceptLanguage, createServiceMetricsTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiCustomerServiceMetricTaskApi#createCustomerServiceMetricTask");
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
 **acceptLanguage** | **String**| Use this header to specify the natural language in which the authenticated user desires the response. |
 **createServiceMetricsTaskRequest** | [**CreateServiceMetricsTaskRequest**](CreateServiceMetricsTaskRequest.md)|  | [optional]

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
**500** | Internal Server Error |  -  |

<a name="getCustomerServiceMetricTask"></a>
# **getCustomerServiceMetricTask**
> ServiceMetricsTask getCustomerServiceMetricTask(taskId)

/customer_service_metric_task/{task_id}

&lt;p&gt;Use this method to retrieve customer service metric task details for the specified task. The input is &lt;strong&gt;task_id&lt;/strong&gt;.&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiCustomerServiceMetricTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiCustomerServiceMetricTaskApi apiInstance = new FeedApiCustomerServiceMetricTaskApi(defaultClient);
    String taskId = "taskId_example"; // String | Use this path parameter to specify the task ID value for the customer service metric task to retrieve.
    try {
      ServiceMetricsTask result = apiInstance.getCustomerServiceMetricTask(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiCustomerServiceMetricTaskApi#getCustomerServiceMetricTask");
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
 **taskId** | **String**| Use this path parameter to specify the task ID value for the customer service metric task to retrieve. |

### Return type

[**ServiceMetricsTask**](ServiceMetricsTask.md)

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

<a name="getCustomerServiceMetricTasks"></a>
# **getCustomerServiceMetricTasks**
> CustomerServiceMetricTaskCollection getCustomerServiceMetricTasks(dateRange, feedType, limit, lookBackDays, offset)

/customer_service_metric_task

Use this method to return an array of customer service metric tasks. You can limit the tasks returned by specifying a date range. &lt;/p&gt; &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; You can pass in either the &lt;code&gt;look_back_days &lt;/code&gt;or&lt;code&gt; date_range&lt;/code&gt;, but not both.&lt;/span&gt;&lt;/p&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.FeedApiCustomerServiceMetricTaskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FeedApiCustomerServiceMetricTaskApi apiInstance = new FeedApiCustomerServiceMetricTaskApi(defaultClient);
    String dateRange = "dateRange_example"; // String | The task creation date range. The results are filtered to include only tasks with a creation date that is equal to the dates specified or is within the specified range. Do not use with the <code>look_back_days</code> parameter.<p><strong>Format: </strong>UTC</p><p>For example, tasks within a range: </p><p><code>yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ </code></p><p>Tasks created on March 8, 2020</p><p><code>2020-03-08T00:00.00.000Z..2020-03-09T00:00:00.000Z</code></p><p><b>Maximum: </b>90 days</p>
    String feedType = "feedType_example"; // String | The feed type associated with the task. The only presently supported value is <code>CUSTOMER_SERVICE_METRICS_REPORT</code>.
    String limit = "limit_example"; // String | The number of customer service metric tasks to return per page of the result set. Use this parameter in conjunction with the offset parameter to control the pagination of the output. <p>For example, if <strong>offset</strong> is set to 10 and <strong>limit</strong> is set to 10, the call retrieves tasks 11 thru 20 from the result set.</p><p>If this parameter is omitted, the default value is used.</p><p> <span class=\"tablenote\"><strong>Note:</strong>This feature employs a zero-based list, where the first item in the list has an offset of <code>0</code>.</span></p><p><b>Default:</b> 10 <p><b>Maximum:</b> 500</p>
    String lookBackDays = "lookBackDays_example"; // String | The number of previous days in which to search for tasks. Do not use with the <code>date_range</code> parameter. If both <code>date_range</code> and <code>look_back_days</code> are omitted, this parameter's default value is used. <p><b>Default value:</b> 7</p><p><b>Range:</b> 1-90 (inclusive)</p>
    String offset = "offset_example"; // String | The number of customer service metric tasks to skip in the result set before returning the first task in the paginated response. <p>Combine <strong>offset</strong> with the <strong>limit</strong> query parameter to control the items returned in the response. For example, if you supply an <strong>offset</strong> of <code>0</code> and a <strong>limit</strong> of <code>10</code>, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If <strong>offset</strong> is <code>10</code> and <strong>limit</strong> is <code>20</code>, the first page of the response contains items 11-30 from the complete result set. <br /><br /><b>Default: </b>0
    try {
      CustomerServiceMetricTaskCollection result = apiInstance.getCustomerServiceMetricTasks(dateRange, feedType, limit, lookBackDays, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedApiCustomerServiceMetricTaskApi#getCustomerServiceMetricTasks");
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
 **dateRange** | **String**| The task creation date range. The results are filtered to include only tasks with a creation date that is equal to the dates specified or is within the specified range. Do not use with the &lt;code&gt;look_back_days&lt;/code&gt; parameter.&lt;p&gt;&lt;strong&gt;Format: &lt;/strong&gt;UTC&lt;/p&gt;&lt;p&gt;For example, tasks within a range: &lt;/p&gt;&lt;p&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt;&lt;/p&gt;&lt;p&gt;Tasks created on March 8, 2020&lt;/p&gt;&lt;p&gt;&lt;code&gt;2020-03-08T00:00.00.000Z..2020-03-09T00:00:00.000Z&lt;/code&gt;&lt;/p&gt;&lt;p&gt;&lt;b&gt;Maximum: &lt;/b&gt;90 days&lt;/p&gt; | [optional]
 **feedType** | **String**| The feed type associated with the task. The only presently supported value is &lt;code&gt;CUSTOMER_SERVICE_METRICS_REPORT&lt;/code&gt;. | [optional]
 **limit** | **String**| The number of customer service metric tasks to return per page of the result set. Use this parameter in conjunction with the offset parameter to control the pagination of the output. &lt;p&gt;For example, if &lt;strong&gt;offset&lt;/strong&gt; is set to 10 and &lt;strong&gt;limit&lt;/strong&gt; is set to 10, the call retrieves tasks 11 thru 20 from the result set.&lt;/p&gt;&lt;p&gt;If this parameter is omitted, the default value is used.&lt;/p&gt;&lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 10 &lt;p&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500&lt;/p&gt; | [optional]
 **lookBackDays** | **String**| The number of previous days in which to search for tasks. Do not use with the &lt;code&gt;date_range&lt;/code&gt; parameter. If both &lt;code&gt;date_range&lt;/code&gt; and &lt;code&gt;look_back_days&lt;/code&gt; are omitted, this parameter&#39;s default value is used. &lt;p&gt;&lt;b&gt;Default value:&lt;/b&gt; 7&lt;/p&gt;&lt;p&gt;&lt;b&gt;Range:&lt;/b&gt; 1-90 (inclusive)&lt;/p&gt; | [optional]
 **offset** | **String**| The number of customer service metric tasks to skip in the result set before returning the first task in the paginated response. &lt;p&gt;Combine &lt;strong&gt;offset&lt;/strong&gt; with the &lt;strong&gt;limit&lt;/strong&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;strong&gt;offset&lt;/strong&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;strong&gt;limit&lt;/strong&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;strong&gt;offset&lt;/strong&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;strong&gt;limit&lt;/strong&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default: &lt;/b&gt;0 | [optional]

### Return type

[**CustomerServiceMetricTaskCollection**](CustomerServiceMetricTaskCollection.md)

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

