

# ItemLocation

This type describes the physical location of an order.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryCode** | **String** | The two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code representing the country of the address. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/ba:CountryCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**location** | **String** | Indicates the geographical location of the item (along with the value in the &lt;strong&gt;countryCode&lt;/strong&gt; field). This field provides city, province, state, or similar information. |  [optional]
**postalCode** | **String** | The postal code of the address. |  [optional]


## Implemented Interfaces

* Serializable


