

# MetricBenchmark

This complex type defines the benchmark data, which includes the average value of the metric for the group (the benchmark) and the seller's overall rating when compared to the benchmark.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adjustment** | **String** | If this field is present, it indicates that the rating given to the seller was &amp;quot;adjusted&amp;quot; for one reason or another. If eBay determines that the normal rating of a seller is impacted by circumstances beyond their control, they can issue an override to adjust the rating given to the seller. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/devzone/rest/api-ref/analytics/types/RatingAdjustmentTypeEnum.html&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**basis** | **String** | This field returns the &amp;quot;basis&amp;quot; by which the benchmark is calculated for the customer service metric type. Currently, the only supported basis is PEER_BENCHMARK. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/devzone/rest/api-ref/analytics/types/BenchmarkTypeEnum.html&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**metadata** | [**BenchmarkMetadata**](BenchmarkMetadata.md) |  |  [optional]
**rating** | **String** | This field returns seller&#39;s rating for the customer service metric. The rating is set to a value that equals the relative deviation between the seller&#39;s metric value and the benchmark value for the customer service metric. Deviation values range from LOW to VERY HIGH, and the lower the deviation, the better the seller rating. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/devzone/rest/api-ref/analytics/types/RatingTypeEnum.html&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


