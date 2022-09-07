

# ContactAddress

This complex type specifies the details of a geographical address.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressLine1** | **String** | The first line of the street address. |  [optional]
**addressLine2** | **String** | The second line of the street address. Use this field for additional address information, such as a suite or apartment number. |  [optional]
**city** | **String** | The city in which the address is located. |  [optional]
**countryCode** | **String** | The country of the address, represented as two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; country code. For example, &lt;code&gt;US&lt;/code&gt; represents the United States and &lt;code&gt;DE&lt;/code&gt; represents Germany. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/logistics/types/bas:CountryCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**county** | **String** | The county (not country) in which the address is located. Counties typically contain multiple cities or towns. |  [optional]
**postalCode** | **String** | The postal code of the address. |  [optional]
**stateOrProvince** | **String** | The state or province in which the address is located. States and provinces often contain multiple counties. |  [optional]


## Implemented Interfaces

* Serializable


