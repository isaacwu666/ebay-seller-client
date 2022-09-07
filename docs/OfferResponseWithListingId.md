

# OfferResponseWithListingId

This type is used to indicate the status of each offer that the user attempted to publish. If an offer is successfully published, an eBay listing ID (also known as an Item ID) is returned. If there is an issue publishing the offer and creating the new eBay listing, the information about why the listing failed should be returned in the <strong>errors</strong> and/or <strong>warnings</strong> containers.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | This container will be returned if there were one or more errors associated with publishing the offer. |  [optional]
**listingId** | **String** | The unique identifier of the newly-created eBay listing. This field is only returned if the seller successfully published the offer and created the new eBay listing. |  [optional]
**offerId** | **String** | The unique identifier of the offer that the seller published (or attempted to publish). |  [optional]
**statusCode** | **Integer** | The HTTP status code returned in this field indicates the success or failure of publishing the offer specified in the &lt;strong&gt;offerId&lt;/strong&gt; field. See the &lt;strong&gt;HTTP status codes&lt;/strong&gt; table to see which each status code indicates. |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | This container will be returned if there were one or more warnings associated with publishing the offer. |  [optional]


## Implemented Interfaces

* Serializable


