

# RateTableResponse

This type is the base response of the <b>getRateTables</b> method.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rateTables** | [**List&lt;RateTable&gt;**](RateTable.md) | An array of all shipping rate tables defined for a marketplace (or all marketplaces if no &lt;b&gt;country_code&lt;/b&gt; query parameter is used). This array will be returned as empty if the seller has no defined shipping rate tables for the specified marketplace. |  [optional]


## Implemented Interfaces

* Serializable


