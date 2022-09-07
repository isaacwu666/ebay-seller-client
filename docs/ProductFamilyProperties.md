

# ProductFamilyProperties

This type is used to specify the details of a motor vehicle that is compatible with the inventory item specified through the SKU value in the call URI.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engine** | **String** | This field indicates the specifications of the engine, including its size, block type, and fuel type. An example is &lt;code&gt;2.7L V6 gas DOHC naturally aspirated&lt;/code&gt;. This field is conditionally required, but should be supplied if known/applicable. |  [optional]
**make** | **String** | This field indicates the make of the vehicle (e.g. &lt;code&gt;Toyota&lt;/code&gt;). This field is always required to identify a motor vehicle. |  [optional]
**model** | **String** | This field indicates the model of the vehicle (e.g. &lt;code&gt;Camry&lt;/code&gt;). This field is always required to identify a motor vehicle. |  [optional]
**trim** | **String** | This field indicates the trim of the vehicle (e.g. &lt;code&gt;2-door Coupe&lt;/code&gt;). This field is conditionally required, but should be supplied if known/applicable. |  [optional]
**year** | **String** | This field indicates the year of the vehicle (e.g. &lt;code&gt;2016&lt;/code&gt;). This field is always required to identify a motor vehicle. |  [optional]


## Implemented Interfaces

* Serializable


