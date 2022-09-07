

# BidPercentages

A complex type that returns data related to Promoted Listings bid percentages.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basis** | **String** | The basis by which the ad rate is calculated. Valid Values: ITEM and TRENDING For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/recommendation/types/api:Basis&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**value** | **String** | The bid percentage data is a single precision value, as calculated by the associated basis. In Promoted listings ad campaigns, the bid percentage (also known as the ad rate) is a user-defined value that sets the level that eBay raises the visibility of the listing in the marketplace. It is also the rate that is used to calculate the Promoted Listings fee. Minimum value: 1.0 &amp;nbsp; Maximum value: 100.0 |  [optional]


## Implemented Interfaces

* Serializable


