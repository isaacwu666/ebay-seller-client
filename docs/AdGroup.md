

# AdGroup

A container for the details of an existing ad group.<br /><br />An ad group can be added to a campaign that uses the Cost Per Click (CPC) funding model. A campaign may have multiple ad groups. All listings that are promoted in the campaign are included in the ad group.<br /><br /><span class=\"tablenote\"><b>Note:</b> This type only applies to the CPC funding model; it does not apply to the Cost Per Sale (CPS) funding model.</span>
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model. |  [optional]
**adGroupStatus** | **String** | An enumeration value representing the current status of the ad group.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:AdGroupStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**defaultBid** | [**Amount**](Amount.md) |  |  [optional]
**name** | **String** | The seller-defined name of the ad group. |  [optional]


## Implemented Interfaces

* Serializable


