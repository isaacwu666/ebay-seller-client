

# EbayCollectAndRemitTax

This type contains information about the type and amount of tax that eBay will collect and remit to the state, province, country, or other taxing authority in the buyer's location, as required by that taxing authority.<br/><br/>'Collect and Remit' tax includes:<ul><li>US state-mandated sales tax</li><li>Federal and Provincial Sales Tax in Canada</li><li>'Goods and Services' tax in Canada, Australia, and New Zealand</li><li>VAT collected for the UK and EU countries</li></ul>
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  |  [optional]
**ebayReference** | [**EbayTaxReference**](EbayTaxReference.md) |  |  [optional]
**taxType** | **String** | The type of tax and fees that eBay will collect and remit to the taxing or fee authority. See the &lt;strong&gt;TaxTypeEnum&lt;/strong&gt; type definition for more information about each tax or fee type. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:TaxTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**collectionMethod** | **String** | This field indicates the collection method used to collect the &#39;Collect and Remit&#39; tax for the order. This field is always returned for orders subject to &#39;Collect and Remit&#39; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &#39;Collect and Remit&#39; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt; For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/sel:CollectionMethodEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


