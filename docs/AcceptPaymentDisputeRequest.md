

# AcceptPaymentDisputeRequest

This type is used by base request of the <strong>acceptPaymentDispute</strong> method.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnAddress** | [**ReturnAddress**](ReturnAddress.md) |  |  [optional]
**revision** | **Integer** | This integer value indicates the revision number of the payment dispute. This field is required. The current &lt;strong&gt;revision&lt;/strong&gt; number for a payment dispute can be retrieved with the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method. Each time an action is taken against a payment dispute, this integer value increases by 1. |  [optional]


## Implemented Interfaces

* Serializable


