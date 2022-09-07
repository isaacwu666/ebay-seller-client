

# SellerFundsSummaryResponse

This type is used by the response payload of the <strong>getSellerFundsSummary</strong> method. All of the funds returned in  <strong>getSellerFundsSummary</strong> are funds that have not yet been paid to the seller through a seller payout. If there are no funds that are pending, on hold, or being processed for the seller's account, no response payload is returned, and an http status code of <code>204 - No Content</code> is returned instead.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableFunds** | [**Amount**](Amount.md) |  |  [optional]
**fundsOnHold** | [**Amount**](Amount.md) |  |  [optional]
**processingFunds** | [**Amount**](Amount.md) |  |  [optional]
**totalFunds** | [**Amount**](Amount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


