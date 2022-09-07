

# PickupSlot

This complex type defines a time window for the pickup of a package.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pickupSlotEndTime** | **String** | The date and time the pickup slot ends, formatted as an &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[HH]:[MM]:[SS].[SSS]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt; |  [optional]
**pickupSlotId** | **String** | Seller-defined name for the pickup slot. &lt;!-- Max characters? --&gt; |  [optional]
**pickupSlotStartTime** | **String** | The date and time the pickup slot begins, formatted as an &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601&lt;/a&gt; UTC string. |  [optional]
**pickupSlotTimeZone** | **String** | The time zone of the pickup location, returned as &lt;a href&#x3D;\&quot;https://www.iana.org/time-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Time Zone Database&lt;/a&gt; ID (also know as an Olson time zone ID). |  [optional]


## Implemented Interfaces

* Serializable


