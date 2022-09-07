

# SummaryReportResponse

This type defines the fields in an Promotions Manager Summary report. Reports are formatted in JSON. For more details, see <a href=\"/api-docs/sell/static/marketing/pm-summary-reports.html\">Reading item promotion Summary reports</a>.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseSale** | [**Amount**](Amount.md) |  |  [optional]
**lastUpdated** | **String** | The date the report was generated. |  [optional]
**percentageSalesLift** | **String** | The percentage of the total dollar amount gained due to promotions. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;precentageSalesLift&lt;/b&gt; &#x3D; &lt;b&gt;promotionSale&lt;/b&gt; / (&lt;b&gt;baseSale&lt;/b&gt; + &lt;b&gt;promotionSale&lt;/b&gt;) |  [optional]
**promotionSale** | [**Amount**](Amount.md) |  |  [optional]
**totalSale** | [**Amount**](Amount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


