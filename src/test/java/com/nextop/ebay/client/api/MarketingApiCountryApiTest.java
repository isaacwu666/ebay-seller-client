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
import com.nextop.ebay.client.model.SalesTaxJurisdictions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketingApiCountryApi
 */
@Ignore
public class MarketingApiCountryApiTest {

    private final MarketingApiCountryApi api = new MarketingApiCountryApi();

    
    /**
     * /country/{countryCode}/sales_tax_jurisdiction
     *
     * This method retrieves all the sales tax jurisdictions for the country that you specify in the &lt;b&gt;countryCode&lt;/b&gt; path parameter. Countries with valid sales tax jurisdictions are Canada and the US.  &lt;br/&gt;&lt;br/&gt;The response from this call tells you the jurisdictions for which a seller can configure tax tables. Although setting up tax tables is optional, you can use the &lt;b&gt;createOrReplaceSalesTax&lt;/b&gt; in the &lt;b&gt;Account API&lt;/b&gt; call to configure the tax tables for the jurisdictions you sell to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSalesTaxJurisdictionsTest() throws ApiException {
        String countryCode = null;
        SalesTaxJurisdictions response = api.getSalesTaxJurisdictions(countryCode);

        // TODO: test validations
    }
    
}
