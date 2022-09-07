

# ListingStructurePolicy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **String** | The category ID to which the listing-structure policy applies. |  [optional]
**categoryTreeId** | **String** | A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes. |  [optional]
**variationsSupported** | **Boolean** | This flag denotes whether or not the associated category supports listings with item variations. If set to &lt;code&gt;true&lt;/code&gt;, the category does support item variations. |  [optional]


## Implemented Interfaces

* Serializable


