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
import com.nextop.ebay.client.model.CreateOffersRequest;
import com.nextop.ebay.client.model.PagedEligibleItemCollection;
import com.nextop.ebay.client.model.SendOfferToInterestedBuyersCollectionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NegotiationApiOfferApi
 */
@Ignore
public class NegotiationApiOfferApiTest {

    private final NegotiationApiOfferApi api = new NegotiationApiOfferApi();

    
    /**
     * /find_eligible_items
     *
     * This method evaluates a seller&#39;s current listings and returns the set of IDs that are eligible for a seller-initiated discount offer to a buyer. A listing ID is returned only when one or more buyers have shown an &amp;quot;interest&amp;quot; in the listing. If any buyers have shown interest in a listing, the seller can initiate a &amp;quot;negotiation&amp;quot; with them by calling sendOfferToInterestedBuyers, which sends all interested buyers a message that offers the listing at a discount. For details about how to create seller offers to buyers, see Sending offers to buyers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findEligibleItemsTest() throws ApiException {
        String X_EBAY_C_MARKETPLACE_ID = null;
        String limit = null;
        String offset = null;
        PagedEligibleItemCollection response = api.findEligibleItems(X_EBAY_C_MARKETPLACE_ID, limit, offset);

        // TODO: test validations
    }
    
    /**
     * /send_offer_to_interested_buyers
     *
     * This method sends eligible buyers offers to purchase items in a listing at a discount. When a buyer has shown interest in a listing, they become &amp;quot;eligible&amp;quot; to receive a seller-initiated offer to purchase the item(s). Sellers use findEligibleItems to get the set of listings that have interested buyers. If a listing has interested buyers, sellers can use this method (sendOfferToInterestedBuyers) to send an offer to the buyers who are interested in the listing. The offer gives buyers the ability to purchase the associated listings at a discounted price. For details about how to create seller offers to buyers, see Sending offers to buyers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendOfferToInterestedBuyersTest() throws ApiException {
        String X_EBAY_C_MARKETPLACE_ID = null;
        CreateOffersRequest createOffersRequest = null;
        SendOfferToInterestedBuyersCollectionResponse response = api.sendOfferToInterestedBuyers(X_EBAY_C_MARKETPLACE_ID, createOffersRequest);

        // TODO: test validations
    }
    
}
