

# OfferKeysWithId

This type is used by the base request payload of the <strong>getListingFees</strong> call.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List&lt;OfferKeyWithId&gt;**](OfferKeyWithId.md) | This container is used to identify one or more (up to 250)unpublished offers for which expected listing fees will be retrieved. The user passes one or more &lt;strong&gt;offerId&lt;/strong&gt; values (maximum of 250) in to this container to identify the unpublished offers in which to retrieve expected listing fees. This call is only applicable for offers in the unpublished state. &lt;br/&gt;&lt;br/&gt; The call response gives aggregate fee amounts per eBay marketplace, and does not give fee information at the individual offer level. |  [optional]


## Implemented Interfaces

* Serializable


