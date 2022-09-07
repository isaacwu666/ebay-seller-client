

# AvailabilityDistribution

This type is used to set the available quantity of the inventory item at one or more warehouse locations.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fulfillmentTime** | [**TimeDuration**](TimeDuration.md) |  |  [optional]
**merchantLocationKey** | **String** | The unique identifier of an inventory location where quantity is available for the inventory item. This field is conditionally required to identify the inventory location that has quantity of the inventory item. |  [optional]
**quantity** | **Integer** | The integer value passed into this field indicates the quantity of the inventory item that is available at this inventory location. This field is conditionally required. |  [optional]


## Implemented Interfaces

* Serializable


