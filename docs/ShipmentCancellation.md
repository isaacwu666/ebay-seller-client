

# ShipmentCancellation

This type defines a shipment cancellation by the date and time the cancellation request was made and the current status of the request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancellationRequestedDate** | **String** | The time and date the request was made to cancel the shipment, formatted as an &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; title&#x3D;\&quot;https://www.iso.org\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601&lt;/a&gt; UTC string. |  [optional]
**cancellationStatus** | **String** | This enum specifies the current cancellation status of a shipment, if a cancellation request has been made. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/logistics/types/api:ShipmentCancellationStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]


## Implemented Interfaces

* Serializable


