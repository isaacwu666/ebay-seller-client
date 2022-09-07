

# PaymentDisputeActivityHistory

This type is used by the base response of the <strong>getActivities</strong> method, and includes a log of all activities of a payment dispute, from creation to resolution.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity** | [**List&lt;PaymentDisputeActivity&gt;**](PaymentDisputeActivity.md) | This array holds all activities of a payment dispute, from creation to resolution. For each activity, the activity type, the actor, and a timestamp is shown. The &lt;strong&gt;getActivities&lt;/strong&gt; response is dynamic, and grows with each recorded activity. |  [optional]


## Implemented Interfaces

* Serializable


