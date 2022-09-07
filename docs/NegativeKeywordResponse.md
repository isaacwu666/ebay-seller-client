

# NegativeKeywordResponse

A type that defines the negative keyword response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | A unique identifier for an ad group that is generated when an ad group is first created and associated with a campaign. |  [optional]
**campaignId** | **String** | A unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created. |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | This container will be returned if there is an issue creating the corresponding negative keyword. |  [optional]
**href** | **String** | The URI for the negative keyword, which is used to retrieve the negative keyword. This URI will be returned for each successfully created negative keyword. |  [optional]
**negativeKeywordId** | **String** | A unique eBay-assigned ID for a negative keyword. This negative keyword ID will be generated for each successfully created negative keyword. |  [optional]
**negativeKeywordMatchType** | **String** | The match type for the negative keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#004680\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of negative keywords is not currently supported.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordMatchTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**negativeKeywordText** | **String** | The text for the negative keyword. |  [optional]
**statusCode** | **Integer** | The status of the request to create a negative keyword. This field indicates whether the process was successful or not. |  [optional]


## Implemented Interfaces

* Serializable


