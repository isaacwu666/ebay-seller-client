

# WithdrawResponse

The base response of the <strong>withdrawOffer</strong> call.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listingId** | **String** | The unique identifier of the eBay listing associated with the offer that was withdrawn. This field will not be returned if the eBay listing was not successfully ended. |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | This container will be returned if there were one or more warnings associated with the attempt to withdraw the offer. |  [optional]


## Implemented Interfaces

* Serializable


