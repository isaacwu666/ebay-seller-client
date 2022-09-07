

# ListingDetails

This type is used by the <strong>listing</strong> container in the <strong>getOffer</strong> and <strong>getOffers</strong> calls to provide the eBay listing ID, the listing status, and quantity sold for the offer. The <strong>listing</strong> container is only returned for published offers, and is not returned for unpublished offers.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listingId** | **String** | The unique identifier of the eBay listing that is associated with the published offer.  |  [optional]
**listingStatus** | **String** | The enumeration value returned in this field indicates the status of the listing that is associated with the published offer. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/inventory/types/slr:ListingStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**soldQuantity** | **Integer** | This integer value indicates the quantity of the product that has been sold for the published offer. |  [optional]


## Implemented Interfaces

* Serializable


