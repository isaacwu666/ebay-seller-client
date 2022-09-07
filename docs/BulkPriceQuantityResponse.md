

# BulkPriceQuantityResponse

This type is use by the base response payload of the <strong>bulkUpdatePriceQuantity</strong> call. The <strong>bulkUpdatePriceQuantity</strong> call response will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an <strong>errors</strong> and/or <strong>warnings</strong> container if any errors or warnings are triggered while trying to update those offers/inventory items.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responses** | [**List&lt;PriceQuantityResponse&gt;**](PriceQuantityResponse.md) | This container will return an HTTP status code, offer ID, and SKU value for each offer/inventory item being updated, as well as an &lt;strong&gt;errors&lt;/strong&gt; and/or &lt;strong&gt;warnings&lt;/strong&gt; container if any errors or warnings are triggered while trying to update those offers/inventory items. |  [optional]


## Implemented Interfaces

* Serializable


