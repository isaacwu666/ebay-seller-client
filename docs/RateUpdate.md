

# RateUpdate

This container defines the updated shipping cost information for a rate object identified by <b>rateId</b>.<br/><br/>To view a list of all rate objects and corresponding <b>rateID</b> values, issue <b>getRateTable</b> for the rate table identified by <b>rateTableId</b>.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalCost** | [**Amount**](Amount.md) |  |  [optional]
**rateId** | **String** | The identifier for the rate object.&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This is a string automatically assigned by the system when the rate object is created. It cannot be changed or updated.&lt;/span&gt; |  [optional]
**shippingCost** | [**Amount**](Amount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


