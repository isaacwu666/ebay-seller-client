

# FormDataContentDisposition

The metadata for the file.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationDate** | **String** | The file creation date. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Format: &lt;/b&gt; UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;p&gt;&lt;b&gt;For example:&lt;/b&gt;&lt;p&gt;Created on September 8, 2019&lt;/p&gt;&lt;p&gt;&lt;code&gt;2019-09-08T00:00:00.000Z&lt;/code&gt;&lt;/p&gt; |  [optional]
**fileName** | **String** | The name of the file including its extension (for example, xml or csv) to be uploaded. |  [optional]
**modificationDate** | **String** | The file modified date. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Format: &lt;/b&gt; UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;p&gt;&lt;b&gt;For example:&lt;/b&gt;&lt;p&gt;Created on September 9, 2019&lt;/p&gt;&lt;p&gt;&lt;code&gt;2019-09-09T00:00:00.000Z&lt;/code&gt;&lt;/p&gt; |  [optional]
**name** | **String** | A content identifier. The only presently supported name is &lt;code&gt;file&lt;/code&gt;. |  [optional]
**parameters** | **Map&lt;String, String&gt;** | The parameters you want associated with the file. |  [optional]
**readDate** | **String** | The date you read the file. &lt;br /&gt;&lt;br /&gt;&lt;b&gt; Format: &lt;/b&gt; UTC &lt;code&gt;yyyy-MM-ddThh:mm:ss.SSSZ&lt;/code&gt;&lt;p&gt;&lt;b&gt;For example:&lt;/b&gt;&lt;p&gt;Created on September 10, 2019&lt;/p&gt;&lt;p&gt;&lt;code&gt;2019-09-10T00:00:00.000Z&lt;/code&gt;&lt;/p&gt; |  [optional]
**size** | **Integer** | The size of the file. |  [optional]
**type** | **String** | The file type. The only presently supported type is &lt;code&gt;form-data&lt;/code&gt;. |  [optional]


## Implemented Interfaces

* Serializable


