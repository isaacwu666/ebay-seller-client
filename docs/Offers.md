

# Offers

This type is used by the base response of the <strong>getOffers</strong> call, and it is an array of one or more of the seller's offers, along with pagination data.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | This is the URL to the current page of offers. |  [optional]
**limit** | **Integer** | This integer value is the number of offers that will be displayed on each results page. |  [optional]
**next** | **String** | This is the URL to the next page of offers. This field will only be returned if there are additional offers to view. |  [optional]
**offers** | [**List&lt;EbayOfferDetailsWithAll&gt;**](EbayOfferDetailsWithAll.md) | This container is an array of one or more of the seller&#39;s offers for the SKU value that is passed in through the required &lt;strong&gt;sku&lt;/strong&gt; query parameter.&lt;br/&gt;&lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently, the Inventory API does not support the same SKU across multiple eBay marketplaces, so the &lt;strong&gt;getOffers&lt;/strong&gt; call will only return one offer.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Max Occurs:&lt;/strong&gt; 25 |  [optional]
**prev** | **String** | This is the URL to the previous page of offers. This field will only be returned if there are previous offers to view. |  [optional]
**size** | **Integer** | This integer value indicates the number of offers being displayed on the current page of results. This number will generally be the same as the &lt;strong&gt;limit&lt;/strong&gt; value if there are additional pages of results to view.&lt;br/&gt;&lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently, the Inventory API does not support the same SKU across multiple eBay marketplaces, so the &lt;strong&gt;Get Offers&lt;/strong&gt; call will only return one offer, so this value should always be &lt;code&gt;1&lt;/code&gt;.&lt;/span&gt; |  [optional]
**total** | **Integer** | This integer value is the total number of offers that exist for the specified SKU value. Based on this number and on the &lt;strong&gt;limit&lt;/strong&gt; value, the seller may have to toggle through multiple pages to view all offers.&lt;br/&gt;&lt;br/&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently, the Inventory API does not support the same SKU across multiple eBay marketplaces, so the &lt;strong&gt;Get Offers&lt;/strong&gt; call will only return one offer, so this value should always be &lt;code&gt;1&lt;/code&gt;.&lt;/span&gt; |  [optional]


## Implemented Interfaces

* Serializable


