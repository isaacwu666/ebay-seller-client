

# SelectedInventoryDiscount

This type defines the fields that describe the discounts applied to a set of inventory items and the order in which the selection rules are applied.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountBenefit** | [**DiscountBenefit**](DiscountBenefit.md) |  |  [optional]
**discountId** | **String** | A unique, eBay-generated ID that you can use to identify the discount. This field is ignored in POST and PUT operations. |  [optional]
**inventoryCriterion** | [**InventoryCriterion**](InventoryCriterion.md) |  |  [optional]
**ruleOrder** | **Integer** | For markdown promotions, this field is reserved for future use. &lt;!--This field specifies the precedence of this set of inventory criteria, which is taken into account if an item is selected for multiple discounts by different sets of criteria. The criteria with the highest priority (lowest ruleOrder value) takes precedence over criteria with a lower precedence.--&gt; |  [optional]


## Implemented Interfaces

* Serializable


