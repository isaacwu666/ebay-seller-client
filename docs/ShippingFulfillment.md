

# ShippingFulfillment

This type contains the complete details of an existing fulfillment for an order.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fulfillmentId** | **String** | The unique identifier of the fulfillment; for example, &lt;code&gt;9405509699937003457459&lt;/code&gt;. This eBay-generated value is created with a successful &lt;b&gt;createShippingFulfillment&lt;/b&gt; call. |  [optional]
**lineItems** | [**List&lt;LineItemReference&gt;**](LineItemReference.md) | This array contains a list of one or more line items (and purchased quantity) to which the fulfillment applies. |  [optional]
**shipmentTrackingNumber** | **String** | The tracking number provided by the shipping carrier for the package shipped in this fulfillment. This field is returned if available. |  [optional]
**shippedDate** | **String** | The date and time that the fulfillment package was shipped. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field should only be returned if the package has been shipped.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt; |  [optional]
**shippingCarrierCode** | **String** | The eBay code identifying the shipping carrier for this fulfillment. This field is returned if available. &lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&#39;s &lt;b&gt;ShippingCarrierCodeType&lt;/b&gt; enumeration type contains the most current list of eBay shipping carrier codes and the countries served by each carrier. See &lt;a href&#x3D;\&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/types/ShippingCarrierCodeType.html \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ShippingCarrierCodeType&lt;/a&gt;.&lt;/span&gt; |  [optional]


## Implemented Interfaces

* Serializable


