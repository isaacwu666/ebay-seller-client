

# PaymentDispute

This type is used by the base response of the <strong>getPaymentDispute</strong> method. The <strong>getPaymentDispute</strong> method retrieves detailed information on a specific payment dispute.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**SimpleAmount**](SimpleAmount.md) |  |  [optional]
**availableChoices** | **List&lt;String&gt;** | The value(s) returned in this array indicate the choices that the seller has when responding to the payment dispute. Once the seller has responded to the payment dispute, this field will no longer be shown, and instead, the &lt;strong&gt;sellerResponse&lt;/strong&gt; field will show the decision that the seller made. |  [optional]
**buyerProvided** | [**InfoFromBuyer**](InfoFromBuyer.md) |  |  [optional]
**buyerUsername** | **String** | This is the eBay user ID of the buyer that initiated the payment dispute. |  [optional]
**closedDate** | **String** | The timestamp in this field shows the date/time when the payment dispute was closed, so this field is only returned for payment disputes in the &lt;code&gt;CLOSED&lt;/code&gt; state.&lt;br/&gt;&lt;br/&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;. |  [optional]
**evidence** | [**List&lt;DisputeEvidence&gt;**](DisputeEvidence.md) | This container shows any evidence that has been provided by the seller to contest the payment dispute. Evidence may include shipment tracking information, proof of authentication documentation, image(s) to proof that an item is as described, or financial documentation/invoice.&lt;br&gt;&lt;br&gt;This container is only returned if the seller has provided at least one document used as evidence against the payment dispute. |  [optional]
**evidenceRequests** | [**List&lt;EvidenceRequest&gt;**](EvidenceRequest.md) | This container is returned if one or more evidence documents are being requested from the seller. |  [optional]
**lineItems** | [**List&lt;OrderLineItems&gt;**](OrderLineItems.md) | This array is used to identify one or more order line items associated with the payment dispute. There will always be at least one &lt;b&gt;itemId&lt;/b&gt;/&lt;b&gt;lineItemId&lt;/b&gt; pair returned in this array. |  [optional]
**monetaryTransactions** | [**List&lt;MonetaryTransaction&gt;**](MonetaryTransaction.md) | This array provide details about one or more monetary transactions that occur as part of a payment dispute. This array is only returned once one or more monetary transacations occur with a payment dispute. |  [optional]
**openDate** | **String** | The timestamp in this field shows the date/time when the payment dispute was opened. This field is returned for payment disputes in all states.&lt;br/&gt;&lt;br/&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;. |  [optional]
**orderId** | **String** | This is the unique identifier of the order involved in the payment dispute. &lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; eBay rolled out a new Order ID format in June 2019. The legacy APIs still support the old and new order ID format to identify orders, but only the new order ID format is returned in REST-based API responses. &lt;/span&gt; |  [optional]
**paymentDisputeId** | **String** | This is the unique identifier of the payment dispute. This is the same identifier that is passed in to the call URI. This identifier is automatically created by eBay once the payment dispute comes into the eBay system. |  [optional]
**paymentDisputeStatus** | **String** | The enumeration value in this field gives the current status of the payment dispute. The status of a payment dispute partially determines other fields that are returned in the response. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeStateEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**reason** | **String** | The enumeration value in this field gives the reason why the buyer initiated the payment dispute. See &lt;strong&gt;DisputeReasonEnum&lt;/strong&gt; type for a description of the supported reasons that buyers can give for initiating a payment dispute. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:DisputeReasonEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**resolution** | [**PaymentDisputeOutcomeDetail**](PaymentDisputeOutcomeDetail.md) |  |  [optional]
**respondByDate** | **String** | The timestamp in this field shows the date/time when the seller must response to a payment dispute, so this field is only returned for payment disputes in the &lt;code&gt;ACTION_NEEDED&lt;/code&gt; state. For payment disputes that currently require action by the seller, that same seller should look at the &lt;strong&gt;availableChoices&lt;/strong&gt; array to see the available actions.&lt;br/&gt;&lt;br/&gt;The timestamps returned here use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;. |  [optional]
**returnAddress** | [**ReturnAddress**](ReturnAddress.md) |  |  [optional]
**revision** | **Integer** | This integer value indicates the revision number of the payment dispute. Each time an action is taken against a payment dispute, this integer value increases by 1. |  [optional]
**sellerResponse** | **String** | The enumeration value returned in this field indicates how the seller has responded to the payment dispute. The seller has the option of accepting the payment dispute and agreeing to issue a refund, accepting the payment dispute and agreeing to issue a refund as long as the buyer returns the item, or contesting the payment dispute. This field is returned as soon as the seller makes an initial decision on the payment dispute. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:SellerResponseEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


