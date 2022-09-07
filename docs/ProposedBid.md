

# ProposedBid

A type that defines the data for a payment amount, such as the sale price.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The base currency applied to the &lt;b&gt;value&lt;/b&gt; field to establish a monetary amount.  &lt;br&gt;&lt;br&gt;The currency is represented as a 3-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-4217-currency-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 4217&lt;/a&gt; currency code. For example, the code for the Canadian Dollar is &lt;code&gt;CAD&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; The default currency of the eBay marketplace that hosts the listing. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/ba:CurrencyCodeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**rangeEnd** | **String** | The end of the range specified for the bid. |  [optional]
**rangeStart** | **String** | The start of the range specified for the bid. |  [optional]
**value** | **String** | The value of the proposed bid. |  [optional]


## Implemented Interfaces

* Serializable


