

# OfferKeyWithId

This type is used by the <strong>getListingFees</strong> call to indicate the unpublished offer(s) for which expected listing fees will be retrieved. The user passes in one or more <strong>offerId</strong> values (a maximum of 250). See the <a href=\"https://pages.ebay.com/help/sell/fees.html\" target=\"_blank\">Standard selling fees</a> help page for more information on listing fees.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **String** | The unique identifier of an unpublished offer for which expected listing fees will be retrieved. One to 250 &lt;strong&gt;offerId&lt;/strong&gt; values can be passed in to the &lt;strong&gt;offers&lt;/strong&gt; container for one &lt;strong&gt;getListingFees&lt;/strong&gt; call. Errors will occur if &lt;strong&gt;offerId&lt;/strong&gt; values representing published offers are passed in. |  [optional]


## Implemented Interfaces

* Serializable


