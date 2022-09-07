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
import com.nextop.ebay.client.model.SellerFundsSummaryResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FinancesApiSellerFundsSummaryApi
 */
@Ignore
public class FinancesApiSellerFundsSummaryApiTest {

    private final FinancesApiSellerFundsSummaryApi api = new FinancesApiSellerFundsSummaryApi();

    
    /**
     * /seller_funds_summary
     *
     * This method retrieves all pending funds that have not yet been distibuted through a seller payout.&lt;br&gt;&lt;br&gt;There are no input parameters for this method. The response payload includes available funds, funds being processed, funds on hold, and also an aggregate count of all three of these categories.&lt;br&gt;&lt;br&gt;If there are no funds that are pending, on hold, or being processed for the seller&#39;s account, no response payload is returned, and an http status code of &lt;code&gt;204 - No Content&lt;/code&gt; is returned instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSellerFundsSummaryTest() throws ApiException {
        SellerFundsSummaryResponse response = api.getSellerFundsSummary();

        // TODO: test validations
    }
    
}
