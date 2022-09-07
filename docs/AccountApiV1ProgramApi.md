# AccountApiV1ProgramApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptedInPrograms**](AccountApiV1ProgramApi.md#getOptedInPrograms) | **GET** /program/get_opted_in_programs | /program/get_opted_in_programs
[**optInToProgram**](AccountApiV1ProgramApi.md#optInToProgram) | **POST** /program/opt_in | /program/opt_in
[**optOutOfProgram**](AccountApiV1ProgramApi.md#optOutOfProgram) | **POST** /program/opt_out | /program/opt_out


<a name="getOptedInPrograms"></a>
# **getOptedInPrograms**
> Programs getOptedInPrograms()

/program/get_opted_in_programs

This method gets a list of the seller programs that the seller has opted-in to.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ProgramApi apiInstance = new AccountApiV1ProgramApi(defaultClient);
    try {
      Programs result = apiInstance.getOptedInPrograms();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ProgramApi#getOptedInPrograms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Programs**](Programs.md)

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

<a name="optInToProgram"></a>
# **optInToProgram**
> Object optInToProgram(program)

/program/opt_in

This method opts the seller in to an eBay seller program. Refer to the &lt;a href&#x3D;\&quot;/api-docs/sell/account/overview.html#opt-in\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Account API overview&lt;/a&gt; for information about available eBay seller programs.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; It can take up to 24-hours for eBay to process your request to opt-in to a Seller Program. Use the &lt;a href&#x3D;\&quot;/api-docs/sell/account/resources/program/methods/getOptedInPrograms\&quot; target&#x3D;\&quot;_blank\&quot;&gt;getOptedInPrograms&lt;/a&gt; call to check the status of your request after the processing period has passed.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ProgramApi apiInstance = new AccountApiV1ProgramApi(defaultClient);
    Program program = new Program(); // Program | 
    try {
      Object result = apiInstance.optInToProgram(program);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ProgramApi#optInToProgram");
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
 **program** | [**Program**](Program.md)|  | [optional]

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
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="optOutOfProgram"></a>
# **optOutOfProgram**
> Object optOutOfProgram(program)

/program/opt_out

This method opts the seller out of a seller program to which you have previously opted-in to. Get a list of the seller programs you have opted-in to using the &lt;b&gt;getOptedInPrograms&lt;/b&gt; call.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1ProgramApi apiInstance = new AccountApiV1ProgramApi(defaultClient);
    Program program = new Program(); // Program | 
    try {
      Object result = apiInstance.optOutOfProgram(program);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1ProgramApi#optOutOfProgram");
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
 **program** | [**Program**](Program.md)|  | [optional]

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
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

