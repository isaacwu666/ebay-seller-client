/*
 * ebay官方api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.nextop.ebay.client.api;

import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.model.BulkEbayOfferDetailsWithKeys;
import com.nextop.ebay.client.model.BulkOffer;
import com.nextop.ebay.client.model.BulkOfferResponse;
import com.nextop.ebay.client.model.BulkPublishResponse;
import com.nextop.ebay.client.model.EbayOfferDetailsWithAll;
import com.nextop.ebay.client.model.EbayOfferDetailsWithId;
import com.nextop.ebay.client.model.EbayOfferDetailsWithKeys;
import com.nextop.ebay.client.model.FeesSummaryResponse;
import com.nextop.ebay.client.model.OfferKeysWithId;
import com.nextop.ebay.client.model.OfferResponse;
import com.nextop.ebay.client.model.Offers;
import com.nextop.ebay.client.model.PublishByInventoryItemGroupRequest;
import com.nextop.ebay.client.model.PublishResponse;
import com.nextop.ebay.client.model.WithdrawByInventoryItemGroupRequest;
import com.nextop.ebay.client.model.WithdrawResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryApiOfferApi
 */
@Ignore
public class InventoryApiOfferApiTest {

    private final InventoryApiOfferApi api = new InventoryApiOfferApi();

    
    /**
     * /bulk_create_offer
     *
     * This call creates multiple offers (up to 25) for specific inventory items on a specific eBay marketplace. Although it is not a requirement for the seller to create complete offers (with all necessary details) right from the start, eBay recommends that the seller provide all necessary details with this call since there is currently no bulk operation available to update multiple offers with one call. The following fields are always required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;. &lt;br&gt;&lt;br&gt;Other information that will be required before a offer can be published are highlighted below: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt;&lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;If the call is successful, unique &lt;strong&gt;offerId&lt;/strong&gt; values are returned in the response for each successfully created offer. The &lt;strong&gt;offerId&lt;/strong&gt; value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run either the &lt;strong&gt;publishOffer&lt;/strong&gt;, &lt;strong&gt;bulkPublishOffer&lt;/strong&gt;, or &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to convert offer(s) into an active single- or multiple-variation listing.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create a single offer per call, the &lt;strong&gt;createOffer&lt;/strong&gt; method can be used instead.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkCreateOfferTest() throws ApiException {
        BulkEbayOfferDetailsWithKeys bulkEbayOfferDetailsWithKeys = null;
        BulkOfferResponse response = api.bulkCreateOffer(bulkEbayOfferDetailsWithKeys);

        // TODO: test validations
    }
    
    /**
     * /bulk_publish_offer
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call is used to convert unpublished offers (up to 25) into  published offers, or live eBay listings. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) of each offer to publlish is passed into the request payload. It is possible that some unpublished offers will be successfully created into eBay listings, but others may fail. The response payload will show the results for each &lt;strong&gt;offerId&lt;/strong&gt; value that is passed into the request payload. The &lt;strong&gt;errors&lt;/strong&gt; and &lt;strong&gt;warnings&lt;/strong&gt; containers will be returned for an offer that had one or more issues being published. &lt;br/&gt;&lt;br/&gt;For those who prefer to publish one offer per call, the &lt;strong&gt;publishOffer&lt;/strong&gt; method can be used instead. In the case of a multiple-variation listing, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkPublishOfferTest() throws ApiException {
        BulkOffer bulkOffer = null;
        BulkPublishResponse response = api.bulkPublishOffer(bulkOffer);

        // TODO: test validations
    }
    
    /**
     * /offer
     *
     * This call creates an offer for a specific inventory item on a specific eBay marketplace. It is up to the sellers whether they want to create a complete offer (with all necessary details) right from the start, or sellers can provide only some information with the initial &lt;strong&gt;createOffer&lt;/strong&gt; call, and then make one or more subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; calls to complete the offer and prepare to publish the offer. Upon first creating an offer, the following fields are required in the request payload:  &lt;strong&gt;sku&lt;/strong&gt;, &lt;strong&gt;marketplaceId&lt;/strong&gt;, and (listing) &lt;strong&gt;format&lt;/strong&gt;. &lt;br&gt;&lt;br&gt;Other information that will be required before an offer can be published are highlighted below. These settings are either set with &lt;strong&gt;createOffer&lt;/strong&gt;, or they can be set with a subsequent &lt;strong&gt;updateOffer&lt;/strong&gt; call: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt; &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;If the call is successful, a unique &lt;strong&gt;offerId&lt;/strong&gt; value is returned in the response. This value will be required for many other offer-related calls. Note that this call only stages an offer for publishing. The seller must run the &lt;strong&gt;publishOffer&lt;/strong&gt; call to convert the offer to an active eBay listing.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;createOffer&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;&lt;p&gt;For those who prefer to create multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkCreateOffer&lt;/strong&gt; method can be used.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOfferTest() throws ApiException {
        String contentLanguage = null;
        EbayOfferDetailsWithKeys ebayOfferDetailsWithKeys = null;
        OfferResponse response = api.createOffer(contentLanguage, ebayOfferDetailsWithKeys);

        // TODO: test validations
    }
    
    /**
     * /offer/{offerId}
     *
     * If used against an unpublished offer, this call will permanently delete that offer. In the case of a published offer (or live eBay listing), a successful call will either end the single-variation listing associated with the offer, or it will remove that product variation from the eBay listing and also automatically remove that product variation from the inventory item group. In the case of a multiple-variation listing, the &lt;strong&gt;deleteOffer&lt;/strong&gt; will not remove the product variation from the listing if that variation has one or more sales. If that product variation has one or more sales, the seller can alternately just set the available quantity of that product variation to &lt;code&gt;0&lt;/code&gt;, so it is not available in the eBay search or View Item page, and then the seller can remove that product variation from the inventory item group at a later time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOfferTest() throws ApiException {
        String offerId = null;
        Object response = api.deleteOffer(offerId);

        // TODO: test validations
    }
    
    /**
     * /offer/get_listing_fees
     *
     * This call is used to retrieve the expected listing fees for up to 250 unpublished offers. An array of one or more &lt;strong&gt;offerId&lt;/strong&gt; values are passed in under the &lt;strong&gt;offers&lt;/strong&gt; container.&lt;br/&gt;&lt;br/&gt; In the response payload, all listing fees are grouped by eBay marketplace, and listing fees per offer are not shown. A &lt;strong&gt;fees&lt;/strong&gt; container will be returned for each eBay marketplace where the seller is selling the products associated with the specified offers. &lt;br/&gt;&lt;br/&gt; Errors will occur if the seller passes in &lt;strong&gt;offerIds&lt;/strong&gt; that represent published offers, so this call should be made before the seller publishes offers with the &lt;strong&gt;publishOffer&lt;/strong&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListingFeesTest() throws ApiException {
        OfferKeysWithId offerKeysWithId = null;
        FeesSummaryResponse response = api.getListingFees(offerKeysWithId);

        // TODO: test validations
    }
    
    /**
     * /offer/{offerId}
     *
     * This call retrieves a specific published or unpublished offer. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOfferTest() throws ApiException {
        String offerId = null;
        EbayOfferDetailsWithAll response = api.getOffer(offerId);

        // TODO: test validations
    }
    
    /**
     * /offer
     *
     * This call retrieves all existing offers for the specified SKU value. The seller has the option of limiting the offers that are retrieved to a specific eBay marketplace, or to a listing format.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; At this time, the same SKU value can not be offered across multiple eBay marketplaces, and the only supported listing format is fixed-price, so the &lt;strong&gt;marketplace_id&lt;/strong&gt; and &lt;strong&gt;format&lt;/strong&gt; query parameters currently do not have any practical use for this call.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; header is the only required HTTP header for this call. See the &lt;strong&gt;HTTP request headers&lt;/strong&gt; section for more information.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOffersTest() throws ApiException {
        String format = null;
        String limit = null;
        String marketplaceId = null;
        String offset = null;
        String sku = null;
        Offers response = api.getOffers(format, limit, marketplaceId, offset, sku);

        // TODO: test validations
    }
    
    /**
     * /offer/{offerId}/publish/
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call is used to convert an unpublished offer into a published offer, or live eBay listing. The unique identifier of the offer (&lt;strong&gt;offerId&lt;/strong&gt;) is passed in at the end of the call URI.&lt;br/&gt;&lt;br/&gt;For those who prefer to publish multiple offers (up to 25 at a time) with one call, the &lt;strong&gt;bulkPublishOffer&lt;/strong&gt; method can be used. In the case of a multiple-variation listing, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call should be used instead, as this call will convert all unpublished offers associated with an inventory item group into a multiple-variation listing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publishOfferTest() throws ApiException {
        String offerId = null;
        PublishResponse response = api.publishOffer(offerId);

        // TODO: test validations
    }
    
    /**
     * /offer/publish_by_inventory_item_group/
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Please note that any eBay listing created using the Inventory API cannot be revised or relisted using the Trading API calls.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;This call is used to convert all unpublished offers associated with an inventory item group into an active, multiple-variation listing.&lt;br/&gt;&lt;br/&gt; The unique identifier of the inventory item group (&lt;strong&gt;inventoryItemGroupKey&lt;/strong&gt;) is passed in the request payload. All inventory items and their corresponding offers in the inventory item group must be valid (meet all requirements) for the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call to be completely successful. For any inventory items in the group that are missing required data or have no corresponding offers, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; will create a new multiple-variation listing, but any inventory items with missing required data/offers will not be in the newly-created listing. If any inventory items in the group to be published have invalid data, or one or more of the inventory items have conflicting data with one another, the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; call will fail. Be sure to check for any error or warning messages in the call response for any applicable information about one or more inventory items/offers having issues.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publishOfferByInventoryItemGroupTest() throws ApiException {
        PublishByInventoryItemGroupRequest publishByInventoryItemGroupRequest = null;
        PublishResponse response = api.publishOfferByInventoryItemGroup(publishByInventoryItemGroupRequest);

        // TODO: test validations
    }
    
    /**
     * /offer/{offerId}
     *
     * This call updates an existing offer. An existing offer may be in published state (active eBay listing), or in an unpublished state and yet to be published with the &lt;strong&gt;publishOffer&lt;/strong&gt; call. The unique identifier (&lt;strong&gt;offerId&lt;/strong&gt;) for the offer to update is passed in at the end of the call URI. &lt;br/&gt;&lt;br/&gt; The &lt;strong&gt;updateOffer&lt;/strong&gt; call does a complete replacement of the existing offer object, so all fields that make up the current offer object are required, regardless of whether their values changed. &lt;br/&gt;&lt;br/&gt; Other information that is required before an unpublished offer can be published or before a published offer can be revised include: &lt;ul&gt;&lt;li&gt;Inventory location&lt;/li&gt; &lt;li&gt;Offer price&lt;/li&gt; &lt;li&gt;Available quantity&lt;/li&gt; &lt;li&gt;eBay listing category&lt;/li&gt;  &lt;li&gt;Referenced listing policy profiles to set payment, return, and fulfillment values/settings&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Though the &lt;strong&gt;includeCatalogProductDetails&lt;/strong&gt; parameter is not required to be submitted in the request, the parameter defaults to &lt;code&gt;true&lt;/code&gt; if omitted from both the &lt;strong&gt;updateOffer&lt;/strong&gt; and the &lt;strong&gt;createOffer&lt;/strong&gt; calls. If a value is specified in the &lt;strong&gt;updateOffer&lt;/strong&gt; call, this value will be used.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Each listing can be revised up to 250 times in one calendar day. If this revision threshold is reached, the seller will be blocked from revising the item until the next calendar day.&lt;/span&gt;&lt;/p&gt; &lt;p&gt;For published offers, the &lt;strong&gt;listingDescription&lt;/strong&gt; field is also required to update the offer/eBay listing. For unpublished offers, this field is not necessarily required unless it is already set for the unpublished offer.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the &lt;strong&gt;updateOffer&lt;/strong&gt; call also requires the &lt;code&gt;Content-Language&lt;/code&gt; header, that sets the natural language that will be used in the field values of the request payload. For US English, the code value passed in this header should be &lt;code&gt;en-US&lt;/code&gt;. To view other supported &lt;code&gt;Content-Language&lt;/code&gt; values, and to read more about all supported HTTP headers for eBay REST API calls, see the &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt; topic in the &lt;strong&gt;Using eBay RESTful APIs&lt;/strong&gt; document.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOfferTest() throws ApiException {
        String offerId = null;
        String contentLanguage = null;
        EbayOfferDetailsWithId ebayOfferDetailsWithId = null;
        OfferResponse response = api.updateOffer(offerId, contentLanguage, ebayOfferDetailsWithId);

        // TODO: test validations
    }
    
    /**
     * /offer/{offerId}/withdraw
     *
     * This call is used to end a single-variation listing that is associated with the specified offer. This call is used in place of the &lt;strong&gt;deleteOffer&lt;/strong&gt; call if the seller only wants to end the listing associated with the offer but does not want to delete the offer object. With this call, the offer object remains, but it goes into the unpublished state, and will require a &lt;strong&gt;publishOffer&lt;/strong&gt; call to relist the offer.&lt;br&gt;&lt;br&gt;To end a multiple-variation listing that is associated with an inventory item group, the &lt;strong&gt;withdrawOfferByInventoryItemGroup&lt;/strong&gt; method can be used. This call only ends the multiple-variation listing associated with an inventory item group but does not delete the inventory item group object, nor does it delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawOfferTest() throws ApiException {
        String offerId = null;
        WithdrawResponse response = api.withdrawOffer(offerId);

        // TODO: test validations
    }
    
    /**
     * /offer/withdraw_by_inventory_item_group
     *
     * This call is used to end a multiple-variation eBay listing that is associated with the specified inventory item group. This call only ends multiple-variation eBay listing associated with the inventory item group but does not delete the inventory item group object. Similarly, this call also does not delete any of the offers associated with the inventory item group, but instead all of these offers go into the unpublished state. If the seller wanted to relist the multiple-variation eBay listing, they could use the &lt;strong&gt;publishOfferByInventoryItemGroup&lt;/strong&gt; method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawOfferByInventoryItemGroupTest() throws ApiException {
        WithdrawByInventoryItemGroupRequest withdrawByInventoryItemGroupRequest = null;
        Object response = api.withdrawOfferByInventoryItemGroup(withdrawByInventoryItemGroupRequest);

        // TODO: test validations
    }
    
}
