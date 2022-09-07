

# InventoryFilterCriteria

The container for the filter fields. This container is used to set the filter criteria for the order report. A seller can set date range filters and/or can retrieve orders in a specific state.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationDateRange** | [**DateRange**](DateRange.md) |  |  [optional]
**modifiedDateRange** | [**DateRange**](DateRange.md) |  |  [optional]
**listingFormat** | **String** | The type of buying option for the order. Supports &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt;. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:ListingFormatEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**listingStatus** | **String** | The status of the listing (whether the listing was unsold or is active). The &lt;strong&gt;UNSOLD&lt;/strong&gt; value does not apply to &lt;code&gt;LMS_ACTIVE_INVENTORY_REPORT&lt;/code&gt; feed types. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:ListingStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


