

# AdditionalInfoData

A type that defines the data produced for additional information about suggested keywords.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metricKey** | **String** | The metric used to provide additional information for the suggested keyword.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Values:&lt;/strong&gt; &lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE_SELLER_COUNT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SEARCH_VOLUME&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:MetricEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**value** | **String** | The data provided for the specified metric.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#004680\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; All metric data is compiled for the marketplace associated with the specified campaign ID.&lt;/span&gt; |  [optional]


## Implemented Interfaces

* Serializable


