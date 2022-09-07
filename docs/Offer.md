

# Offer

A complex type that defines an offer that a seller makes to eligible buyers.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowCounterOffer** | **Boolean** | If set to true, the buyer is allowed to make a counter-offer to the seller&#39;s offer. |  [optional]
**buyer** | [**User**](User.md) |  |  [optional]
**creationDate** | **String** | The date and time when the seller&#39;s offer was created. The returned timestamp is formatted as an ISO 8601 string, which is based on the 24-hour Coordinated Universal Time (UTC) clock. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2018-08-20T07:09:00.000Z |  [optional]
**initiatedBy** | **String** | The eBay UserName of the user (seller) who initiated the offer. |  [optional]
**lastModifiedDate** | **String** | The date and time when the offer was last modified. The returned timestamp is formatted as an ISO 8601 string. |  [optional]
**message** | **String** | A seller-defined message related to the offer being made. This message is sent to the list of &amp;quot;interested&amp;quot; buyers along with the offer message from eBay. |  [optional]
**offerDuration** | [**TimeDuration**](TimeDuration.md) |  |  [optional]
**offeredItems** | [**List&lt;OfferedItem&gt;**](OfferedItem.md) | The list of items associated with the offer. Currently, the offer list is restricted to a single offer. |  [optional]
**offerId** | **String** | A unique eBay-assigned identifier for the offer. |  [optional]
**offerStatus** | **String** | The current state, or status, of an offer. Status states include PENDING, COUNTERED, ACCEPTED, and DECLINED. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**offerType** | **String** | The type of offer being made. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/negotiation/types/api:OfferTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**revision** | **String** | A unique, eBay-assigned ID for the revision of the offer. |  [optional]


## Implemented Interfaces

* Serializable


