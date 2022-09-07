

# CreateServiceMetricsTaskRequest

The type that defines the fields for the Customer Service Metric reports generated with the Feed API.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedType** | **String** | The &lt;strong&gt;feedType&lt;/strong&gt; specified for the task. The report lists the transaction details that contribute to the service metrics evaluation. Supported types include:&lt;p&gt;&lt;code&gt;CUSTOMER_SERVICE_METRICS_REPORT&lt;/code&gt;&lt;/p&gt; |  [optional]
**filterCriteria** | [**CustomerServiceMetricsFilterCriteria**](CustomerServiceMetricsFilterCriteria.md) |  |  [optional]
**schemaVersion** | **String** | The version number of the file format. &lt;p&gt;&lt;b&gt;Valid value: &lt;/b&gt;&lt;code&gt;1.0&lt;/code&gt;&lt;p&gt; |  [optional]


## Implemented Interfaces

* Serializable


