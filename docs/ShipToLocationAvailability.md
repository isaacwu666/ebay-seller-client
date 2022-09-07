

# ShipToLocationAvailability

This type is used to specify the total 'ship-to-home' quantity of the inventory item that will be available for purchase through one or more published offers.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityDistributions** | [**List&lt;AvailabilityDistribution&gt;**](AvailabilityDistribution.md) | This container is used to set the available quantity of the inventory item at one or more warehouse locations.&lt;br&gt;&lt;br&gt; This container will be returned if available quantity is set for one or more inventory locations. |  [optional]
**quantity** | **Integer** | This container is used to set the total &#39;ship-to-home&#39; quantity of the inventory item that will be available for purchase through one or more published offers. This container is not immediately required, but &#39;ship-to-home&#39; quantity must be set before an offer of the inventory item can be published.&lt;br/&gt;&lt;br/&gt;If an existing inventory item is being updated, and the &#39;ship-to-home&#39; quantity already exists for the inventory item record, this container should be included again, even if the value is not changing, or the available quantity data will be lost. |  [optional]


## Implemented Interfaces

* Serializable


