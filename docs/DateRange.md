

# DateRange

The type that defines the fields for a date range.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The beginning date in the range. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and/or the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format: &lt;/b&gt;UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; &lt;b&gt; For example: &lt;/b&gt; Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021  &lt;br /&gt;&lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;     |  [optional]
**to** | **String** | The end date for the date range, which is inclusive. If the parent type is included, both the &lt;strong&gt;from&lt;/strong&gt; and/or the &lt;strong&gt;to&lt;/strong&gt; fields become conditionally required.  &lt;br /&gt;&lt;br /&gt; &lt;b&gt; For example: &lt;/b&gt; &lt;br /&gt;&lt;br /&gt;Tasks within a range  &lt;br /&gt; &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ..yyyy-MM-ddThh:mm:ss.SSSZ &lt;/code&gt; &lt;br /&gt;&lt;br /&gt; Tasks created on March 31, 2021 &lt;br /&gt; &lt;code&gt;2021-03-31T00:00:00.000Z..2021-03-31T00:00:00.000Z&lt;/code&gt;   |  [optional]


## Implemented Interfaces

* Serializable


