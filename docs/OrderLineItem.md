

# OrderLineItem

This type is used to show the fees that are deducted from a seller payout for each line item in an order.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeBasisAmount** | [**Amount**](Amount.md) |  |  [optional]
**lineItemId** | **String** | The unique identifier of an order line item. |  [optional]
**marketplaceFees** | [**List&lt;Fee&gt;**](Fee.md) | An array of all fees accrued for the order line item and deducted from a seller payout. |  [optional]


## Implemented Interfaces

* Serializable


