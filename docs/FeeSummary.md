

# FeeSummary

This type is used to display the expected listing fees for each unpublished offer specified in the request of the <strong>getListingFees</strong> call.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fees** | [**List&lt;Fee&gt;**](Fee.md) | This container is an array of listing fees that can be expected to be applied to an offer on the specified eBay marketplace (&lt;strong&gt;marketplaceId&lt;/strong&gt; value). Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;See the &lt;a href&#x3D;\&quot;https://pages.ebay.com/help/sell/fees.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Standard selling fees&lt;/a&gt; help page for more information on listing fees. |  [optional]
**marketplaceId** | **String** | This is the unique identifier of the eBay site for which  listing fees for the offer are applicable. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:MarketplaceEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur. |  [optional]


## Implemented Interfaces

* Serializable


