

# SpecialHours

This type is used to express the special operating hours of a store location on a specific date. A <strong>specialHours</strong> container is needed when the store's opening hours on a specific date are different than the normal operating hours on that particular day of the week.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **String** | A &lt;strong&gt;date&lt;/strong&gt; value is required for each specific date that the store location has special operating hours.  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-04T07:09:00.000Z&lt;/code&gt; &lt;br&gt;&lt;br&gt;This field is returned if set for the store location. |  [optional]
**intervals** | [**List&lt;Interval&gt;**](Interval.md) | This container is used to define the opening and closing times of a store on a specific date (defined in the &lt;strong&gt;date&lt;/strong&gt; field). An &lt;strong&gt;intervals&lt;/strong&gt; container is needed for each specific date that the store has special operating hours. These special operating hours on the specific date override the normal operating hours for the specific day of the week. If a store location closes for lunch (or any other period during the day) and then reopens, multiple &lt;strong&gt;open&lt;/strong&gt; and &lt;strong&gt;close&lt;/strong&gt; pairs are needed. &lt;br&gt;&lt;br&gt;This container is returned if set for the store location. |  [optional]


## Implemented Interfaces

* Serializable


