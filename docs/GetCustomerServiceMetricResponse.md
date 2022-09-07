

# GetCustomerServiceMetricResponse

This complex data type defines the response data that is returned from a request to getCustomerServiceMetric. The dimensionMetrics object contains the details of the dimension being measured and the calculated customer service metric values. The evaluationCycle defines the period used to calculate the metric values. The marketplaceId is the eBay marketplace for which the metrics are being considered.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensionMetrics** | [**List&lt;DimensionMetric&gt;**](DimensionMetric.md) | This container provides a seller&#39;s customer service metric performance for a given dimension. In the getCustomerServiceMetric request, specify values for the following request parameters to control the returned dimension and the associated metric values: customer_service_metric_type evaluation_type evaluation_marketplace_id |  [optional]
**evaluationCycle** | [**EvaluationCycle**](EvaluationCycle.md) |  |  [optional]
**marketplaceId** | **String** | The eBay marketplace ID of the marketplace upon which the customer service metric evaluation is based. The customer_service_metric resource supports a limited set of marketplaces. For a complete list of the supported marketplaces, please see the Service metrics policy page. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/devzone/rest/api-ref/analytics/types/MarketplaceIdEnum.html&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


