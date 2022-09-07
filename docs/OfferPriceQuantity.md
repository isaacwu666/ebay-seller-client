

# OfferPriceQuantity

This type is used by the <strong>offers</strong> container in a <strong>Bulk Update Price and Quantity</strong> call to update the current price and/or quantity of one or more offers associated with a specific inventory item.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableQuantity** | **Integer** | This field is used if the seller wants to modify the current quantity of the inventory item that will be available for purchase in the offer (identified by the corresponding &lt;strong&gt;offerId&lt;/strong&gt; value). Either the &lt;strong&gt;availableQuantity&lt;/strong&gt; field or the &lt;strong&gt;price&lt;/strong&gt; container is required, but not necessarily both. |  [optional]
**offerId** | **String** | This field is the unique identifier of the offer. If an &lt;strong&gt;offers&lt;/strong&gt; container is used to update one or more offers associated to a specific inventory item, the &lt;strong&gt;offerId&lt;/strong&gt; value is required in order to identify the offer to update with a modified price and/or quantity.&lt;br/&gt;&lt;br/&gt;The seller can run a &lt;strong&gt;getOffers&lt;/strong&gt; call (passing in the correct SKU value as a query parameter) to retrieve &lt;strong&gt;offerId&lt;/strong&gt; values for offers associated with the SKU. |  [optional]
**price** | [**Amount**](Amount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


