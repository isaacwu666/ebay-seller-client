

# Report

The complex type that defines that defines the report.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensionMetadata** | [**List&lt;Metadata&gt;**](Metadata.md) | A complex type containing the header of the report and the type of data containted in the rows of the report. |  [optional]
**endDate** | **String** | The time stamp is formatted as an ISO 8601 string, which is based on the 24-hour Universal Coordinated Time (UTC) clock. If you specify an end date that is beyond the lastUpdatedDate value, eBay returns a report that contains data only up to the lastUpdateDate date. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2018-08-20T07:09:00.000Z |  [optional]
**header** | [**Header**](Header.md) |  |  [optional]
**lastUpdatedDate** | **String** | The date and time, in ISO 8601 format, that indicates the last time the data returned in the report was updated. |  [optional]
**records** | [**List&lt;Record&gt;**](Record.md) | A complex type containing the individual data records for the traffic report. |  [optional]
**startDate** | **String** | The start date of the date range used to calculate the report, in ISO 8601 format. |  [optional]
**warnings** | [**List&lt;Error&gt;**](Error.md) | An array of any process errors or warnings that were generated during the processing of the call processing. |  [optional]


## Implemented Interfaces

* Serializable


