# AccountApiV1RateTableApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRateTables**](AccountApiV1RateTableApi.md#getRateTables) | **GET** /rate_table | /rate_table


<a name="getRateTables"></a>
# **getRateTables**
> RateTableResponse getRateTables(countryCode)

/rate_table

This method retrieves a seller&#39;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&#39;s shipping rate tables.  &lt;br/&gt;&lt;br/&gt;The method&#39;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&#39;s domestic or international shipping options. &lt;br/&gt;&lt;br/&gt;This call currently supports getting rate tables related to the following marketplaces:&lt;ul&gt;&lt;li&gt;&lt;code&gt;EBAY_AU&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_CA&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_DE&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_ES&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_FR&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_GB&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_IT&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_US&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br/&gt;&lt;br/&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href&#x3D;\&quot;https://www.ebay.com/ship/rt\&quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.AccountApiV1RateTableApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountApiV1RateTableApi apiInstance = new AccountApiV1RateTableApi(defaultClient);
    String countryCode = "countryCode_example"; // String | This query parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html\" title=\"https://www.iso.org\" target=\"_blank\">ISO 3166</a> code of country for which you want shipping rate table information. If you do not specify a country code, the request returns all of the seller's defined shipping rate tables for all eBay marketplaces. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum
    try {
      RateTableResponse result = apiInstance.getRateTables(countryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApiV1RateTableApi#getRateTables");
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
 **countryCode** | **String**| This query parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code of country for which you want shipping rate table information. If you do not specify a country code, the request returns all of the seller&#39;s defined shipping rate tables for all eBay marketplaces. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum | [optional]

### Return type

[**RateTableResponse**](RateTableResponse.md)

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

