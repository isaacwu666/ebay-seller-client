

# RuleCriteria

This type defines the fields for a set of inventory selection rules.  <br><br><b>Required:</b> When <b>inventoryCriterionType</b> is set to <code>INVENTORY_BY_RULE</code> or <code>INVENTORY_ANY</code>.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**excludeInventoryItems** | [**List&lt;InventoryItem&gt;**](InventoryItem.md) | A list of seller inventory reference IDs to exclude from the promotion.  &lt;br&gt;&lt;br&gt;&lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items &lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters |  [optional]
**excludeListingIds** | **List&lt;String&gt;** | A list of eBay listing IDs to exclude from the promotion.  &lt;br&gt;&lt;br&gt;&lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items &lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters |  [optional]
**markupInventoryItems** | [**List&lt;InventoryItem&gt;**](InventoryItem.md) | A list of SKUs to remove from a markdown promotion. The listed SKUs are &#39;marked up&#39; to their standard price after being part of the markdown promotion. |  [optional]
**markupListingIds** | **List&lt;String&gt;** | A list of listing IDs to remove from a markdown promotion. The listed items are &#39;marked up&#39; to their standard price after being part of the markdown promotion. |  [optional]
**selectionRules** | [**List&lt;SelectionRule&gt;**](SelectionRule.md) | The container for the rules that select the items to include in a promotion.  &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;. |  [optional]


## Implemented Interfaces

* Serializable


