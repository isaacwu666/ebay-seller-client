

# FeesSummaryResponse

This type is used by the base response payload for the <strong>getListingFees</strong> call. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeSummaries** | [**List&lt;FeeSummary&gt;**](FeeSummary.md) | This container consists of an array of one or more listing fees that the seller can expect to pay for unpublished offers specified in the call request. Many fee types will get returned even when they are &lt;code&gt;0.0&lt;/code&gt;. |  [optional]


## Implemented Interfaces

* Serializable


