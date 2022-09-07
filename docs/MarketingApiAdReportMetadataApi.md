# MarketingApiAdReportMetadataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportMetadata**](MarketingApiAdReportMetadataApi.md#getReportMetadata) | **GET** /ad_report_metadata | /ad_report_metadata
[**getReportMetadataForReportType**](MarketingApiAdReportMetadataApi.md#getReportMetadataForReportType) | **GET** /ad_report_metadata/{report_type} | /ad_report_metadata/{report_type}


<a name="getReportMetadata"></a>
# **getReportMetadata**
> ReportMetadatas getReportMetadata()

/ad_report_metadata

This call retrieves information that details the fields used in each of the Promoted Listings reports. Use the returned information to configure the different types of Promoted Listings reports.&lt;/br&gt;&lt;/br&gt;The request for this method does not use a payload or any URI parameters.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdReportMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdReportMetadataApi apiInstance = new MarketingApiAdReportMetadataApi(defaultClient);
    try {
      ReportMetadatas result = apiInstance.getReportMetadata();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdReportMetadataApi#getReportMetadata");
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

[**ReportMetadatas**](ReportMetadatas.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Internal Server Error |  -  |

<a name="getReportMetadataForReportType"></a>
# **getReportMetadataForReportType**
> ReportMetadata getReportMetadataForReportType(reportType)

/ad_report_metadata/{report_type}

This call retrieves metadata that details the fields used by a specific Promoted Listings report type. Use the &lt;b&gt;report_type&lt;/b&gt; path parameter to indicate metadata to retrieve.&lt;br/&gt;&lt;br/&gt;This method does not use a request payload.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiAdReportMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiAdReportMetadataApi apiInstance = new MarketingApiAdReportMetadataApi(defaultClient);
    String reportType = "reportType_example"; // String | The name of the report type whose metadata you want to retrieve.<br /><br /><span class=\"tablenote\"><b>Tip:</b> For details about available report types and their descriptions, refer to the <a href=\"/api-docs/sell/marketing/types/plr:ReportTypeEnum\">ReportTypeEnum</a>.</span>
    try {
      ReportMetadata result = apiInstance.getReportMetadataForReportType(reportType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiAdReportMetadataApi#getReportMetadataForReportType");
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
 **reportType** | **String**| The name of the report type whose metadata you want to retrieve.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details about available report types and their descriptions, refer to the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/types/plr:ReportTypeEnum\&quot;&gt;ReportTypeEnum&lt;/a&gt;.&lt;/span&gt; |

### Return type

[**ReportMetadata**](ReportMetadata.md)

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

