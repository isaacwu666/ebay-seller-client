

# CorrectiveRecommendations

This type is used by the correctiveRecommendations container, which is returned if eBay has suggestions for how to correct the given violation.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productRecommendation** | [**ProductRecommendation**](ProductRecommendation.md) |  |  [optional]
**aspectRecommendations** | [**List&lt;AspectRecommendations&gt;**](AspectRecommendations.md) | This container is returned for ASPECTS_ADOPTION violations if eBay has found one or more item aspect name-value pairs that may be appropriate for the seller&#39;s product. In many cases, the missing or invalid item aspect(s) shown under the corresponding violationData array, will also show up under this array with suggested value(s). |  [optional]


## Implemented Interfaces

* Serializable


