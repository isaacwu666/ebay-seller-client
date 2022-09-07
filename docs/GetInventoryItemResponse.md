

# GetInventoryItemResponse

This type is used by the response of the <strong>bulkGetInventoryItem</strong> method to give the status of each inventory item record that the user tried to retrieve.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | This container will be returned if there were one or more errors associated with retrieving the inventory item record. |  [optional]
**inventoryItem** | [**InventoryItemWithSkuLocaleGroupKeys**](InventoryItemWithSkuLocaleGroupKeys.md) |  |  [optional]
**sku** | **String** | The seller-defined Stock-Keeping Unit (SKU) of the inventory item. The seller should have a unique SKU value for every product that they sell. |  [optional]
**statusCode** | **Integer** | The HTTP status code returned in this field indicates the success or failure of retrieving the inventory item record for the inventory item specified in the &lt;strong&gt;sku&lt;/strong&gt; field. See the &lt;strong&gt;HTTP status codes&lt;/strong&gt; table to see which each status code indicates. |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | This container will be returned if there were one or more warnings associated with retrieving the inventory item record. |  [optional]


## Implemented Interfaces

* Serializable


