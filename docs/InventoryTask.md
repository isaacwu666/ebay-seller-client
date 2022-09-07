

# InventoryTask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **String** | The ID of the task. This ID is generated when the task was created by the &lt;strong&gt;createInventoryTask&lt;/strong&gt; method. |  [optional]
**status** | **String** | The status of the task. Users must wait until status is complete before moving on to the next step (such as uploading/downloading a file). For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:FeedStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**feedType** | **String** | The feed type associated with the inventory task. |  [optional]
**creationDate** | **String** | The date the task was created. |  [optional]
**completionDate** | **String** | The timestamp when the task &lt;strong&gt;status&lt;/strong&gt; went into the &lt;code&gt;COMPLETED&lt;/code&gt;, &lt;code&gt;COMPLETED_WITH_ERROR&lt;/code&gt;, or &lt;code&gt;PARTIALLY_PROCESSED&lt;/code&gt; state. This field is only returned if the status is one of the three completed values. |  [optional]
**schemaVersion** | **String** | The schema version number associated with the task. |  [optional]
**detailHref** | **String** | The path to the call URI used to retrieve the task. This field points to the &lt;strong&gt;getInventoryTask&lt;/strong&gt; URI. |  [optional]
**uploadSummary** | [**UploadSummary**](UploadSummary.md) |  |  [optional]
**filterCriteria** | [**InventoryFilterCriteria**](InventoryFilterCriteria.md) |  |  [optional]
**inventoryFileTemplate** | **String** | The inventory file template used to return specific types of inventory tasks, if set in the &lt;strong&gt;createInventoryTask&lt;/strong&gt; method. This field does not apply to &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt; feed types. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:InventoryFileTemplateEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


