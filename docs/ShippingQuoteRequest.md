

# ShippingQuoteRequest

This complex type defines the request body for <b>createShippingQuote</b>. Sellers <i>request a quote</i> for a shipment by defining the \"To\" and \"From\" addresses for the package, plus the package's size.  <br><br>Carriers respond by offering up a \"rate\" for the service of theirs that best fits seller's needs.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orders** | [**List&lt;Order&gt;**](Order.md) | A seller-defined list that contains information about the orders in the package. This allows sellers to include information about the line items in the package with the shipment information.  &lt;br&gt;&lt;br&gt;A package can contain any number of line items from one or more orders, providing they all ship in the same package.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum list size:&lt;/b&gt; 10 |  [optional]
**packageSpecification** | [**PackageSpecification**](PackageSpecification.md) |  |  [optional]
**shipFrom** | [**Contact**](Contact.md) |  |  [optional]
**shipTo** | [**Contact**](Contact.md) |  |  [optional]


## Implemented Interfaces

* Serializable


