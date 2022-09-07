

# BalanceAdjustment

This type is used by the <b>balanceAdjustment</b> container, which shows the seller payout balance that will be applied toward the charges outlined in the <b>charges</b> array.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adjustmentAmount** | [**Amount**](Amount.md) |  |  [optional]
**adjustmentType** | **String** | The enumeration value returned here indicates if the charge is a &lt;code&gt;DEBIT&lt;/code&gt; or a &lt;code&gt;CREDIT&lt;/code&gt; to the seller. Generally, all transfer transaction types are going to be &lt;code&gt;DEBIT&lt;/code&gt;, since the money is being tranferred from the seller to eBay. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


