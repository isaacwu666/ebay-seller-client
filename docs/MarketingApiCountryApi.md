# MarketingApiCountryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSalesTaxJurisdictions**](MarketingApiCountryApi.md#getSalesTaxJurisdictions) | **GET** /country/{countryCode}/sales_tax_jurisdiction | /country/{countryCode}/sales_tax_jurisdiction


<a name="getSalesTaxJurisdictions"></a>
# **getSalesTaxJurisdictions**
> SalesTaxJurisdictions getSalesTaxJurisdictions(countryCode)

/country/{countryCode}/sales_tax_jurisdiction

This method retrieves all the sales tax jurisdictions for the country that you specify in the &lt;b&gt;countryCode&lt;/b&gt; path parameter. Countries with valid sales tax jurisdictions are Canada and the US.  &lt;br/&gt;&lt;br/&gt;The response from this call tells you the jurisdictions for which a seller can configure tax tables. Although setting up tax tables is optional, you can use the &lt;b&gt;createOrReplaceSalesTax&lt;/b&gt; in the &lt;b&gt;Account API&lt;/b&gt; call to configure the tax tables for the jurisdictions you sell to.

### Example
```java
// Import classes:
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.models.*;
import com.nextop.ebay.client.api.MarketingApiCountryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MarketingApiCountryApi apiInstance = new MarketingApiCountryApi(defaultClient);
    String countryCode = "countryCode_example"; // String | This path parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html\" title=\"https://www.iso.org\" target=\"_blank\">ISO 3166</a> country code for the country whose jurisdictions you want to retrieve. eBay provides sales tax jurisdiction information for Canada and the United States.Valid values for this path parameter are <code>CA</code> and <code>US</code>.
    try {
      SalesTaxJurisdictions result = apiInstance.getSalesTaxJurisdictions(countryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketingApiCountryApi#getSalesTaxJurisdictions");
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
 **countryCode** | **String**| This path parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; country code for the country whose jurisdictions you want to retrieve. eBay provides sales tax jurisdiction information for Canada and the United States.Valid values for this path parameter are &lt;code&gt;CA&lt;/code&gt; and &lt;code&gt;US&lt;/code&gt;. |

### Return type

[**SalesTaxJurisdictions**](SalesTaxJurisdictions.md)

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

