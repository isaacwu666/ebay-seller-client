

# ShippingQuote

This complex type describes a \"shipping quote,\" which contains the parameters for a package shipment. The shipping quote contains a list of \"live quotes\" or <i>rates</i> for the shipment. Rates are offerd by a carrier for a particular service, of set of services, for shipping the package. Included in the shipping quote are the package specifications, the shipment's origin and destination addresses, and the shipping parameters specified by the seller.  <br><br>Use the <b>rateId</b> value to select the specific service you want when you create a shipment by calling <b>createFromShippingQuote</b>.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationDate** | **String** | The date and time this quote was created, expressed as an ISO 8601 UTC string. |  [optional]
**expirationDate** | **String** | The last date and time that this quote will be honored, expressed as an ISO 8601 UTC string. After this time the quote expires and the expressed rates can no longer be purchased. |  [optional]
**orders** | [**List&lt;Order&gt;**](Order.md) | This list value is optionally assigned by the seller. When present, each element in the returned list contains seller-assigned information about an order (such as an order number). Because a package can contain all or part of one or more orders, this field provides a way for sellers to identify the packages that contain specific orders. |  [optional]
**packageSpecification** | [**PackageSpecification**](PackageSpecification.md) |  |  [optional]
**rates** | [**List&lt;Rate&gt;**](Rate.md) | A list of &lt;i&gt;rates&lt;/i&gt; where each rate, as identified by a &lt;b&gt;rateId&lt;/b&gt;, contains information about a specific shipping service offered by a carrier.  Rates include shipping carrier and service, the to and from locations, the pickup and delivery windows, the seller&#39;s shipping parameters, the service constraints, and the cost for the base service and a list of additional shipping options.  &lt;br&gt;&lt;br&gt;Each rate offered is supported by a label service where you can purchase the rate, and associated shipping label, via a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. |  [optional]
**shipFrom** | [**Contact**](Contact.md) |  |  [optional]
**shippingQuoteId** | **String** | The unique eBay-assigned ID for this shipping quote. The value of this field is associated with a specific package, based on its origin, destination, and size. |  [optional]
**shipTo** | [**Contact**](Contact.md) |  |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | A list of any warnings triggered by the request. |  [optional]


## Implemented Interfaces

* Serializable


