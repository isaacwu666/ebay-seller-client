

# Definition

A complex type that defines a dimension key and metrics in a traffic report.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataType** | **String** | Indicates the data type of the returned dimension. For example, if the dimension is day, the data type is DATE. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/devzone/rest/api-ref/analytics/types/DataTypeEnum.html&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**key** | **String** | The value the dimension or metric parameter as submitted in the request. |  [optional]
**localizedName** | **String** | The localized name of the metric or dimension (translated into the language specified in the Accept-Language HTTP request header). For example, if Accept-Language is set to de-DE, the value &amp;quot;day&amp;quot; in the dimension container is returned as &amp;quot;tag&amp;quot;, and a metric of TRANSACTION is returned as &amp;quot;Transaktionsanzahl&amp;quot;. |  [optional]


## Implemented Interfaces

* Serializable


