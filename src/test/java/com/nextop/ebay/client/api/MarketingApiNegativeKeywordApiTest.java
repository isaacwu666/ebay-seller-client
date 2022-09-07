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
import com.nextop.ebay.client.model.BulkCreateNegativeKeywordRequest;
import com.nextop.ebay.client.model.BulkCreateNegativeKeywordResponse;
import com.nextop.ebay.client.model.BulkUpdateNegativeKeywordRequest;
import com.nextop.ebay.client.model.BulkUpdateNegativeKeywordResponse;
import com.nextop.ebay.client.model.CreateNegativeKeywordRequest;
import com.nextop.ebay.client.model.NegativeKeyword;
import com.nextop.ebay.client.model.NegativeKeywordPagedCollectionResponse;
import com.nextop.ebay.client.model.UpdateNegativeKeywordRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketingApiNegativeKeywordApi
 */
@Ignore
public class MarketingApiNegativeKeywordApiTest {

    private final MarketingApiNegativeKeywordApi api = new MarketingApiNegativeKeywordApi();

    
    /**
     * /bulk_create_negative_keyword
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method adds negative keywords, in bulk, to an existing ad group in a PLA campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkCreateNegativeKeywordTest() throws ApiException {
        BulkCreateNegativeKeywordRequest bulkCreateNegativeKeywordRequest = null;
        BulkCreateNegativeKeywordResponse response = api.bulkCreateNegativeKeyword(bulkCreateNegativeKeywordRequest);

        // TODO: test validations
    }
    
    /**
     * /bulk_update_negative_keyword
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method updates the statuses of existing negative keywords, in bulk.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negativeKeywordId&lt;/b&gt; and &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkUpdateNegativeKeywordTest() throws ApiException {
        BulkUpdateNegativeKeywordRequest bulkUpdateNegativeKeywordRequest = null;
        BulkUpdateNegativeKeywordResponse response = api.bulkUpdateNegativeKeyword(bulkUpdateNegativeKeywordRequest);

        // TODO: test validations
    }
    
    /**
     * /negative_keyword
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method adds a negative keyword to an existing ad group in a PLA campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNegativeKeywordTest() throws ApiException {
        CreateNegativeKeywordRequest createNegativeKeywordRequest = null;
        Object response = api.createNegativeKeyword(createNegativeKeywordRequest);

        // TODO: test validations
    }
    
    /**
     * /negative_keyword/{negative_keyword_id}
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method retrieves details on a specific negative keyword.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNegativeKeywordTest() throws ApiException {
        String negativeKeywordId = null;
        NegativeKeyword response = api.getNegativeKeyword(negativeKeywordId);

        // TODO: test validations
    }
    
    /**
     * /negative_keyword
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method can be used to retrieve all of the negative keywords for ad groups in PLA campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;The results can be filtered using the &lt;b&gt;campaign_ids&lt;/b&gt;, &lt;b&gt;ad_group_ids&lt;/b&gt;, and &lt;b&gt;negative_keyword_status&lt;/b&gt; query parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href&#x3D;\&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns\&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNegativeKeywordsTest() throws ApiException {
        String adGroupIds = null;
        String campaignIds = null;
        String limit = null;
        String negativeKeywordStatus = null;
        String offset = null;
        NegativeKeywordPagedCollectionResponse response = api.getNegativeKeywords(adGroupIds, campaignIds, limit, negativeKeywordStatus, offset);

        // TODO: test validations
    }
    
    /**
     * /negative_keyword/{negative_keyword_id}
     *
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This is a &lt;a href&#x3D;\&quot;/api-docs/static/versioning.html#limited \&quot; target&#x3D;\&quot;_blank\&quot;&gt;&lt;img src&#x3D;\&quot;/cms/img/docs/partners-api.svg\&quot; class&#x3D;\&quot;legend-icon partners-icon\&quot; title&#x3D;\&quot;Limited Release\&quot;  alt&#x3D;\&quot;Limited Release\&quot; /&gt;Limited Release&lt;/a&gt; API service that is available only to select partners who have been approved for the eBay Promoted Listings Advanced (PLA) program. For details about how to request access to this program, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests\&quot;&gt;Promoted Listings Advanced Access Requests&lt;/a&gt; in the Promoted Listings Playbook.&lt;/span&gt;&lt;br /&gt;This method updates the status of an existing negative keyword.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter, and specify the &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNegativeKeywordTest() throws ApiException {
        String negativeKeywordId = null;
        UpdateNegativeKeywordRequest updateNegativeKeywordRequest = null;
        Object response = api.updateNegativeKeyword(negativeKeywordId, updateNegativeKeywordRequest);

        // TODO: test validations
    }
    
}
