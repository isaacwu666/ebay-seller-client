

# InventoryCriterion

This type defines either the selections rules or the list of listing IDs for the promotion. The \"listing IDs\" are are either the seller's item IDs or the eBay listing IDs.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inventoryCriterionType** | **String** | Indicates how the items to include in the promotion are selected. You can include inventory by ID, using rules, or globally include all your inventory.  For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/sme:InventoryCriterionEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**inventoryItems** | [**List&lt;InventoryItem&gt;**](InventoryItem.md) | An array of containers for the seller&#39;s inventory reference IDs (also known as an \&quot;SKU\&quot; or \&quot;custom label\&quot;) to be added to the promotion.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;  &lt;br&gt;&lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; All listings in a promotion must offer an electronic payment method.  &lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 parent items  &lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;. |  [optional]
**listingIds** | **List&lt;String&gt;** | An array of eBay listing IDs to be added to the promotion.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;  &lt;br&gt;&lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; All listings in a promotion must offer an electronic payment method.  &lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 parent items  &lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;. |  [optional]
**ruleCriteria** | [**RuleCriteria**](RuleCriteria.md) |  |  [optional]


## Implemented Interfaces

* Serializable


