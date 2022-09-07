

# ComplianceSummaryInfo

This type is used by each unique eBay marketplace and compliance type combination that is returned in the getListingViolationsSummary response to indicate the total number of listing violations in regards to that eBay marketplace and compliance type.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceType** | **String** | This enumeration value indicates the type of compliance. See ComplianceTypeEnum for more information on each compliance type. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/compliance/types/com:ComplianceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**marketplaceId** | **String** | This enumeration value indicates the eBay marketplace where the listing violations exist. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/compliance/types/bas:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**listingCount** | **Integer** | This integer value indicates the number of eBay listings that are currently violating the compliance type indicated in the complianceType field, for the eBay marketplace indicated in the marketplaceId field. |  [optional]


## Implemented Interfaces

* Serializable


