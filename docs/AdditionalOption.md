

# AdditionalOption

This complex type contains information about a shipping option that can be purchased in addition to the base shipping cost of a recommended rate. Additional options for each rate are defined, named, and offered by the selected shipping carrier. Examples include shipping insurance or the requirement for a recipient signature.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalCost** | [**Amount**](Amount.md) |  |  [optional]
**optionType** | **String** | The name of a shipping option that can be purchased in addition to the base shipping cost of this rate. The value supplied in this field must match exactly the option name as supplied by the selected rate. |  [optional]


## Implemented Interfaces

* Serializable


