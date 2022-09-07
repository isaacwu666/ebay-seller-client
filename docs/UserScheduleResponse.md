

# UserScheduleResponse

The type that defines the fields for a paginated result set of available schedules. The response consists of 0 or more sequenced <em> pages</em> where each page has 0 or more items.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | **String** | The ID of the schedule. This ID is generated when the schedule was created by the &lt;strong&gt;createSchedule&lt;/strong&gt; method. |  [optional]
**creationDate** | **String** | The creation date of the schedule in hours based on the 24-hour Coordinated Universal Time (UTC) clock. |  [optional]
**feedType** | **String** | The &lt;strong&gt;feedType&lt;/strong&gt; associated with the schedule. |  [optional]
**lastModifiedDate** | **String** | The date the schedule was last modified. |  [optional]
**preferredTriggerDayOfMonth** | **Integer** | The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the number of days in the month. |  [optional]
**preferredTriggerDayOfWeek** | **String** | The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**preferredTriggerHour** | **String** | The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;br /&gt;&lt;br /&gt;&lt;code&gt;11Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; |  [optional]
**scheduleEndDate** | **String** | The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;. |  [optional]
**scheduleName** | **String** | The schedule name assigned by the user for the created schedule. Users assign this name for their reference. |  [optional]
**scheduleStartDate** | **String** | The timestamp that indicates the start of the report generation. |  [optional]
**scheduleTemplateId** | **String** | The ID of the template used to create this schedule. |  [optional]
**schemaVersion** | **String** | The schema version of the feedType for the schedule. |  [optional]
**status** | **String** | The enumeration value that indicates the state of the schedule. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**statusReason** | **String** | The reason the schedule is inactive. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusReasonEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


