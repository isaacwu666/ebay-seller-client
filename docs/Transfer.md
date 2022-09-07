

# Transfer

This type is the base response type used by <code>TRANSFER</code> transaction type that is returned in the response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundingSource** | [**FundingSource**](FundingSource.md) |  |  [optional]
**transactionDate** | **String** | This timestamp indicates the date/time of the transfer. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2020-08-04T19:09:02.768Z&lt;/code&gt; |  [optional]
**transferAmount** | [**Amount**](Amount.md) |  |  [optional]
**transferDetail** | [**TransferDetail**](TransferDetail.md) |  |  [optional]
**transferId** | **String** | The unique identifier of the &lt;code&gt;TRANSFER&lt;/code&gt; transaction type. This is the same value that was passed into the end of the call URI. |  [optional]


## Implemented Interfaces

* Serializable


