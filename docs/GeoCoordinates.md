

# GeoCoordinates

This type is used to express the Global Positioning System (GPS) latitude and longitude coordinates of an inventory location.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | [**BigDecimal**](BigDecimal.md) | The latitude (North-South) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used. &lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the inventory location. |  [optional]
**longitude** | [**BigDecimal**](BigDecimal.md) | The longitude (East-West) component of the geographic coordinate. This field is required if a &lt;strong&gt;geoCoordinates&lt;/strong&gt; container is used. &lt;br&gt;&lt;br&gt;This field is returned if geographical coordinates are set for the inventory location. |  [optional]


## Implemented Interfaces

* Serializable


