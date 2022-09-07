

# OrderFilterCriteria

The type that defines the fields for the order filters.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationDateRange** | [**DateRange**](DateRange.md) |  |  [optional]
**modifiedDateRange** | [**DateRange**](DateRange.md) |  |  [optional]
**orderStatus** | **String** | The order status of the orders returned. If the filter is omitted from createOrderTask call, orders that are in both &lt;code&gt;ACTIVE &lt;/code&gt;and&lt;code&gt; COMPLETED&lt;/code&gt; states are returned. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:OrderStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


