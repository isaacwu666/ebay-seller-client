

# Weight

This complex type contains information about the weight of an object such as a shipping package.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unit** | **String** | The unit of measurement used to specify the weight of a shipping package. Both the &lt;strong&gt;unit&lt;/strong&gt; and &lt;strong&gt;value&lt;/strong&gt; fields are required if the &lt;strong&gt;weight&lt;/strong&gt; container is used. If the English system of measurement is being used, the applicable values for weight units are &lt;code&gt;POUND&lt;/code&gt; and &lt;code&gt;OUNCE&lt;/CODE&gt;. If the metric system of measurement is being used, the applicable values for weight units are &lt;code&gt;KILOGRAM&lt;/code&gt; and &lt;code&gt;GRAM&lt;/code&gt;. The metric system is used by most countries outside of the US. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/logistics/types/api:WeightUnitOfMeasureEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**value** | **String** | The numeric value of the weight of the package, as measured by the value of &lt;b&gt;unit&lt;/b&gt;. |  [optional]


## Implemented Interfaces

* Serializable


