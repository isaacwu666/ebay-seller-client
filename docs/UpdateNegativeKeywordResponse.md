

# UpdateNegativeKeywordResponse

A type that contains the fields for the <b>UpdateNegativeKeyword</b> response.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;Error&gt;**](Error.md) | A container that will be returned if there are one or more issues associated with modifying the corresponding negative keyword. |  [optional]
**negativeKeywordId** | **String** | A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword. |  [optional]
**statusCode** | **Integer** | An HTTP status code that indicates the success or failure of updating that negative keyword. |  [optional]


## Implemented Interfaces

* Serializable


