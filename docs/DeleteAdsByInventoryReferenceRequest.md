

# DeleteAdsByInventoryReferenceRequest

This type defines the fields needed to delete an ad by its inventory reference ID.  You must always supply both <b>inventory_reference_id</b> and <b>inventory_reference_type</b>.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inventoryReferenceId** | **String** | The inventory reference ID is a seller-defined SKU value for a single-item listing, or a seller-defined identifier for an inventory item group. Both of these values are defined when using the Inventory API, and an inventory item group is used to create a multiple-variation listing. |  [optional]
**inventoryReferenceType** | **String** | The enumeration value passed into this field indicates the type of value used for the corresponding &lt;b&gt;inventoryReferenceId&lt;/b&gt; value. The enumeration value used here will either be &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; (to delete the ad for a single SKU listing) or &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; (to delete the ad for a multiple-variation listing). For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


