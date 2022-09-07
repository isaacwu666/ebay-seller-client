

# AvailabilityWithAll

This type is used to specify the quantity of the inventory items that are available for purchase if the items will be shipped to the buyer, and the quantity of the inventory items that are available for In-Store Pickup at one or more of the merchant's physical stores.<br /><br />In-Store Pickup is only available to large merchants selling on the US, UK, Germany, and Australia sites.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pickupAtLocationAvailability** | [**List&lt;PickupAtLocationAvailability&gt;**](PickupAtLocationAvailability.md) | This container consists of an array of one or more of the merchant&#39;s physical stores where the inventory item is available for in-store pickup.&lt;br /&gt;&lt;br /&gt;The store ID, the quantity available, and the fulfillment time (how soon the item will be ready for pickup after the order occurs) are all returned in this container. |  [optional]
**shipToLocationAvailability** | [**ShipToLocationAvailabilityWithAll**](ShipToLocationAvailabilityWithAll.md) |  |  [optional]


## Implemented Interfaces

* Serializable


