

# TransferDetail

This type is used by the <b>transferDetail</b> container, which provides more details about the transfer and the charge(s) associated with the transfer.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balanceAdjustment** | [**BalanceAdjustment**](BalanceAdjustment.md) |  |  [optional]
**charges** | [**List&lt;Charge&gt;**](Charge.md) | This container is an array of one or more charges related to the transfer. Charges can be related to an order cancellation, order return, case, payment dispute, etc. |  [optional]
**totalChargeNetAmount** | [**Amount**](Amount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


