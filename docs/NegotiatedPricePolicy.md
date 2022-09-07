

# NegotiatedPricePolicy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bestOfferAutoAcceptEnabled** | **Boolean** | This flag denotes whether or not the category supports the setting of a price at which best offers are automatically accepted. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic price for best-offers. |  [optional]
**bestOfferAutoDeclineEnabled** | **Boolean** | This flag denotes whether or not the category supports the setting of an auto-decline price for best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic-decline price for best-offers. |  [optional]
**bestOfferCounterEnabled** | **Boolean** | This flag denotes whether or not the category supports the setting for an automatic counter-offer on best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic counter-offer price for best-offers. |  [optional]
**categoryId** | **String** | The category ID to which the negotiated-price policies apply. |  [optional]
**categoryTreeId** | **String** | A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes. |  [optional]


## Implemented Interfaces

* Serializable


