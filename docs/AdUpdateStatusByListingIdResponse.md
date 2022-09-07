

# AdUpdateStatusByListingIdResponse

A type that contains the fields for the ad update status by listing ID response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model. |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | A list of errors associated with the specified listing ID. |  [optional]
**href** | **String** | The URI for the ad, which can be used to retrieve the ad. |  [optional]
**listingId** | **String** | A unique eBay-assigned ID that is generated when the listing is created. |  [optional]
**statusCode** | **Integer** | An HTTP status code that indicates the response-status of the request. |  [optional]


## Implemented Interfaces

* Serializable


