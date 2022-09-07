

# PublishResponse

This type is used by the base response payload of the <strong>publishOffer</strong> and <strong>publishOfferByInventoryItemGroup</strong> calls.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listingId** | **String** | The unique identifier of the newly created eBay listing. This field is returned if the single offer (if &lt;strong&gt;publishOffer&lt;/strong&gt; call was used) or group of offers in an inventory item group (if &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call was used) was successfully converted into an eBay listing. |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | This container will contain an array of errors and/or warnings if any occur when a &lt;strong&gt;publishOffer&lt;/strong&gt; or &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call is made. |  [optional]


## Implemented Interfaces

* Serializable


