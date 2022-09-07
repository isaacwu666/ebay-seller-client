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
import com.nextop.ebay.client.model.SellerEligibilityMultiProgramResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApiV1AdvertisingEligibilityApi
 */
@Ignore
public class AccountApiV1AdvertisingEligibilityApiTest {

    private final AccountApiV1AdvertisingEligibilityApi api = new AccountApiV1AdvertisingEligibilityApi();

    
    /**
     * /advertising_eligibility
     *
     * This method allows developers to check the seller eligibility status for eBay advertising programs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdvertisingEligibilityTest() throws ApiException {
        String X_EBAY_C_MARKETPLACE_ID = null;
        String programTypes = null;
        SellerEligibilityMultiProgramResponse response = api.getAdvertisingEligibility(X_EBAY_C_MARKETPLACE_ID, programTypes);

        // TODO: test validations
    }
    
}
