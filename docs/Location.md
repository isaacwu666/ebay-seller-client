

# Location

A complex type that is used to provide the physical address of a location, and it geo-coordinates.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**Address**](Address.md) |  |  [optional]
**geoCoordinates** | [**GeoCoordinates**](GeoCoordinates.md) |  |  [optional]
**locationId** | **String** | A unique eBay-assigned ID for the location. &lt;br&gt;&lt;br&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field should not be confused with the seller-defined &lt;b&gt;merchantLocationKey&lt;/b&gt; value. It is the &lt;b&gt;merchantLocationKey&lt;/b&gt; value which is used to identify an inventory location when working with inventory location API calls. The &lt;strong&gt;locationId&lt;/strong&gt; value is only used internally by eBay.&lt;/span&gt; |  [optional]


## Implemented Interfaces

* Serializable


