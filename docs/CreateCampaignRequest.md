

# CreateCampaignRequest

This type defines the fields needed to create a campaign. To create a campaign, you need to specify a name, start and end dates, funding, marketplace, and optionally the criterion (selection rules).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget** | [**CampaignBudgetRequest**](CampaignBudgetRequest.md) |  |  [optional]
**campaignCriterion** | [**CampaignCriterion**](CampaignCriterion.md) |  |  [optional]
**campaignName** | **String** | A seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters |  [optional]
**endDate** | **String** | The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign\&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date. |  [optional]
**fundingStrategy** | [**FundingStrategy**](FundingStrategy.md) |  |  [optional]
**marketplaceId** | **String** | The ID of the eBay marketplace where the campaign is hosted. See the &lt;b&gt;MarketplaceIdEnum&lt;/b&gt; type to get the appropriate enumeration value for the listing marketplace. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**startDate** | **String** | The date and time the campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;b&gt;getCampaign&lt;/b&gt; to check the status of the campaign.&lt;/p&gt; |  [optional]


## Implemented Interfaces

* Serializable


