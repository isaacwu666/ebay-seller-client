

# ScheduleTemplateResponse

The type that defines the fields for a paginated result set of available schedule templates. The response consists of 0 or more sequenced <em> pages</em> where each page has 0 or more items.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedType** | **String** | The feed type of the schedule template. &lt;p&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When calling &lt;strong&gt;createSchedule&lt;/strong&gt; and &lt;strong&gt;updateSchedule&lt;/strong&gt; methods you must match the feed type specified by the schedule template (this feedType).&lt;/span&gt;&lt;/p&gt; |  [optional]
**frequency** | **String** | This field specifies how often the schedule is generated. If set to &lt;code&gt;HALF_HOUR&lt;/code&gt; or &lt;code&gt;ONE_HOUR&lt;/code&gt;, you cannot set a &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; using &lt;strong&gt;createSchedule&lt;/strong&gt; or &lt;strong&gt;updateSchedule&lt;/strong&gt;. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:FrequencyEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**name** | **String** | The template name provided by the template. |  [optional]
**scheduleTemplateId** | **String** | The ID of the template. Use this ID to create a schedule based on the properties of this schedule template. |  [optional]
**status** | **String** | The present status of the template. You cannot create or modify a schedule using a template with an &lt;code&gt;INACTIVE&lt;/code&gt; status.  For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:StatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**supportedConfigurations** | [**List&lt;SupportedConfiguration&gt;**](SupportedConfiguration.md) | An array of the configuration supported by this template. |  [optional]


## Implemented Interfaces

* Serializable


