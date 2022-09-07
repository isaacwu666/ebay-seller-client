

# ExtendedProducerResponsibility

This type provides IDs for the producer or importer related to the new item, packaging, added documentation, or an eco-participation fee. In some markets, such as in France, this may be the importer of the item.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**producerProductId** | **String** | This ID is the Unique Identifier of the producer related to the item. For instance, if the seller is selling a cell phone, it is the ID related to the cell phone. |  [optional]
**productPackageId** | **String** | The Unique ID of the producer of any packaging related to the product added by the seller. This does not include package in which the product is shipped (see &lt;strong&gt;ShipmentPackageID&lt;/strong&gt;). For instance, if the seller adds bubble wrap, it is the ID related to the bubble wrap.  |  [optional]
**shipmentPackageId** | **String** | This ID is the Unique Identifier of the producer of any packaging used by the seller to ship the item. This does not include non-shipping packaging added to the product (see &lt;strong&gt;ProductPackageID&lt;/strong&gt;). This ID is required when the seller uses packaging to ship the item. For instance, if the seller uses a different box to ship the item, it is the ID related to the box. |  [optional]
**productDocumentationId** | **String** | This ID is the Unique Identifier of the producer of any paper added to the parcel of the item by the seller. For example, this ID concerns any notice, leaflet, or paper that the seller adds to a cell phone parcel. |  [optional]
**ecoParticipationFee** | [**Amount**](Amount.md) |  |  [optional]


## Implemented Interfaces

* Serializable


