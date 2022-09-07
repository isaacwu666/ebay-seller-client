

# PayoutInstrument

This type provides details about the seller's account that received (or is scheduled to receive) a payout.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountLastFourDigits** | **String** | This value is the last four digits of the account that the seller uses to receive the payout. This may be the last four digits of a bank account or of a payment processor account such as Payoneer. |  [optional]
**instrumentType** | **String** | This value indicates the type of account that received the payout. The value returned in this field is &lt;code&gt;BANK&lt;/code&gt; if the payout is going to a seller&#39;s bank account. Alternatively, the value can be the name of a digital wallet provider or payment processor such as &lt;code&gt;PAYONEER&lt;/code&gt;. |  [optional]
**nickname** | **String** | If the payout instrument type is a bank, this value is a seller-provided nickname that the seller uses to represent the bank account that receives the payout. If the payout instrument is a provider of digital wallet or payment processing services, the value returned is the name of the service provider (for example, &#39;PAYONEER&#39;). |  [optional]


## Implemented Interfaces

* Serializable


