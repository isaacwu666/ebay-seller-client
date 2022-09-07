

# OfferResponse

This type is used by the response payload of the <strong>createOffer</strong> and <strong>updateOffer</strong> calls. The <strong>offerId</strong> field contains the unique identifier for the offer if the offer is successfully created by the <strong>createOffer</strong> call. The <strong>warnings</strong> field contains any errors and/or warnings that may have been triggered by the call. <p> <span class=\"tablenote\"><strong>Note:</strong> The <strong>offerId</strong> value is only returned with a successful <strong>createOffer</strong> call. This field will not be returned in the <strong>updateOffer </strong> response.</span></p>
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **String** | The unique identifier of the offer that was just created with a &lt;strong&gt;createOffer&lt;/strong&gt; call. It is not returned if the &lt;strong&gt;createOffer&lt;/strong&gt; call fails to create an offer. This identifier will be needed for many offer-related calls. &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;offerId&lt;/strong&gt; value is only returned with a successful &lt;strong&gt;createOffer&lt;/strong&gt; call. This field will not be returned in the &lt;strong&gt;updateOffer &lt;/strong&gt; response.&lt;/span&gt;&lt;/p&gt; |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | This container will contain an array of errors and/or warnings when a call is made, and errors and/or warnings occur. |  [optional]


## Implemented Interfaces

* Serializable


