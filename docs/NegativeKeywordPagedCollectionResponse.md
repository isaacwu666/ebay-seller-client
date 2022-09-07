

# NegativeKeywordPagedCollectionResponse

A type that defines the negative keywords, returned in a paged collection.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The URI of the current page of results from the result set. |  [optional]
**limit** | **Integer** | The number of items returned on a single page from the result set. This value can be set in the request with the &lt;b&gt;limit&lt;/b&gt; query parameter. |  [optional]
**negativeKeywords** | [**List&lt;NegativeKeyword&gt;**](NegativeKeyword.md) | A list of negative keywords returned in the paginated collection. |  [optional]
**next** | **String** | The call URI that can be used to retrieve the next page in the result set. This value is returned only if there is an additional page of results to display from the result set. |  [optional]
**offset** | **Integer** | The number of results skipped in the result set before listing the first returned result. This value can be set in the request with the &lt;b&gt;offset&lt;/b&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;The items in a paginated result set use a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; |  [optional]
**prev** | **String** | The call URI that can be used to retrieve the previous page in the result set. Basically, all of the request parameters will remain the same except the offset value, which will be decreased to retrieve the previous page of results. |  [optional]
**total** | **Integer** | The total number of result sets in the paginated collection. |  [optional]


## Implemented Interfaces

* Serializable


