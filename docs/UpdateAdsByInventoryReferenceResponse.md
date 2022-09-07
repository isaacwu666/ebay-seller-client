

# UpdateAdsByInventoryReferenceResponse

A type that contains the response fields used by the <b>UpdateAdsByInventoryReference</b> method.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ads** | [**List&lt;AdReference&gt;**](AdReference.md) | A list of ad IDs and links to retrieve them. |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | A container for all of the errors associated with the specified inventory reference ID. |  [optional]
**inventoryReferenceId** | **String** | The reference ID associated with the ad. The reference ID could be a SKU number or Inventory Item Group, depending on value of &lt;code&gt;inventoryReferenceType&lt;/code&gt;. |  [optional]
**inventoryReferenceType** | **String** | The inventory reference type associated with the ad. The inventory reference type could be a SKU number or Inventory Item Group. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; |  [optional]
**statusCode** | **Integer** | An HTTP status code that indicates whether or not the CPS ad was successfully updated. |  [optional]


## Implemented Interfaces

* Serializable


