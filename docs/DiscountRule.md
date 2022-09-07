

# DiscountRule

This complex type defines a promotion as being either a monetary amount or a percentage of a sales price that's subtracted from the price of an item or order. <p>Set the amount of the discount and the rules that govern when the discount triggers using the <b>discountBenefit</b> and <b>discountSpecification</b> fields.</p>  <p class=\"tablenote\"><b>Note:</b> In <b>volume pricing promotions</b>, you must configure at least two <b>discountRule</b> containers and at most four.</p>
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountBenefit** | [**DiscountBenefit**](DiscountBenefit.md) |  |  [optional]
**discountSpecification** | [**DiscountSpecification**](DiscountSpecification.md) |  |  [optional]
**maxDiscountAmount** | [**Amount**](Amount.md) |  |  [optional]
**ruleOrder** | **Integer** | This field indicates the order in which the &lt;b&gt;discountRules&lt;/b&gt; are presented. The value specified for this field must equal the associated &lt;b&gt;minQuantity&lt;/b&gt; value. &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; you are creating a volume pricing promotion. |  [optional]


## Implemented Interfaces

* Serializable


