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

import com.nextop.ebay.client.ApiCallback;
import com.nextop.ebay.client.ApiClient;
import com.nextop.ebay.client.ApiException;
import com.nextop.ebay.client.ApiResponse;
import com.nextop.ebay.client.Configuration;
import com.nextop.ebay.client.Pair;
import com.nextop.ebay.client.ProgressRequestBody;
import com.nextop.ebay.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import javax.validation.constraints.*;

import com.nextop.ebay.client.model.FindListingRecommendationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendationApiListingRecommendationApi {
    private ApiClient localVarApiClient;

    public RecommendationApiListingRecommendationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecommendationApiListingRecommendationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for findListingRecommendations
     * @param X_EBAY_C_MARKETPLACE_ID Use this header to specify the eBay marketplace where you list the items for which you want to get recommendations. (required)
     * @param filter Provide a list of key-value pairs to specify the criteria you want to use to filter the response. In the list, separate each filter key from its associated value with a colon (&amp;quot;:&amp;quot;). Currently, the only supported filter value is recommendationTypes and it supports only the (&amp;quot;AD&amp;quot;) type. Follow the recommendationTypes specifier with the filter type(s) enclosed in curly braces (&amp;quot;{ }&amp;quot;), and separate multiple types with commas. Example: filter&#x3D;recommendationTypes:{AD} Default: recommendationTypes:{AD} (optional)
     * @param limit Use this query parameter to set the maximum number of ads to return on a page from the paginated response. Default: 10 Maximum: 500 (optional)
     * @param offset Specifies the number of ads to skip in the result set before returning the first ad in the paginated response. Combine offset with the limit query parameter to control the items returned in the response. For example, if you supply an offset of 0 and a limit of 10, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If offset is 10 and limit is 20, the first page of the response contains items 11-30 from the complete result set. Default: 0 (optional)
     * @param findListingRecommendationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findListingRecommendationsCall(String X_EBAY_C_MARKETPLACE_ID, String filter, String limit, String offset, FindListingRecommendationRequest findListingRecommendationRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = findListingRecommendationRequest;

        // create path and map variables
        String localVarPath = "/find";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_EBAY_C_MARKETPLACE_ID != null) {
            localVarHeaderParams.put("X-EBAY-C-MARKETPLACE-ID", localVarApiClient.parameterToString(X_EBAY_C_MARKETPLACE_ID));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findListingRecommendationsValidateBeforeCall(String X_EBAY_C_MARKETPLACE_ID, String filter, String limit, String offset, FindListingRecommendationRequest findListingRecommendationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_EBAY_C_MARKETPLACE_ID' is set
        if (X_EBAY_C_MARKETPLACE_ID == null) {
            throw new ApiException("Missing the required parameter 'X_EBAY_C_MARKETPLACE_ID' when calling findListingRecommendations(Async)");
        }
        

        okhttp3.Call localVarCall = findListingRecommendationsCall(X_EBAY_C_MARKETPLACE_ID, filter, limit, offset, findListingRecommendationRequest, _callback);
        return localVarCall;

    }

    /**
     * /find
     * The find method currently returns information for a single recommendation type (AD) which contains information that sellers can use to configure Promoted Listings ad campaigns. The response from this method includes an array of the seller&#39;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see Using the Recommendation API to help configure campaigns. The AD recommendation type The AD type contains two sets of information: The promoteWithAd indicator The promoteWithAd response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. The returned value is set to either RECOMMENDED or UNDETERMINED, where RECOMMENDED identifies the listings that will benefit the most from having them included in an ad campaign. The bid percentage Also known as the &amp;quot;ad rate,&amp;quot; the bidPercentage field provides the current trending bid percentage of similarly promoted items in the marketplace. The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item. Configuring the request You can configure a request to review all of a seller&#39;s currently active listings, or just a subset of them. All active listings &amp;ndash; If you leave the request body empty, the request targets all the items currently listed by the seller. Here, the response is filtered to contain only the items where promoteWithAd equals RECOMMENDED. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign. Selected listing IDs &amp;ndash; If you populate the request body with a set of listingIds, the response contains data for all the specified listing IDs. In this scenario, the response provides you with information on listings where the promoteWithAd can be either RECOMMENDED or UNDETERMINED. The paginated response Because the response can contain many listing IDs, the findListingRecommendations method paginates the response set. You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     * @param X_EBAY_C_MARKETPLACE_ID Use this header to specify the eBay marketplace where you list the items for which you want to get recommendations. (required)
     * @param filter Provide a list of key-value pairs to specify the criteria you want to use to filter the response. In the list, separate each filter key from its associated value with a colon (&amp;quot;:&amp;quot;). Currently, the only supported filter value is recommendationTypes and it supports only the (&amp;quot;AD&amp;quot;) type. Follow the recommendationTypes specifier with the filter type(s) enclosed in curly braces (&amp;quot;{ }&amp;quot;), and separate multiple types with commas. Example: filter&#x3D;recommendationTypes:{AD} Default: recommendationTypes:{AD} (optional)
     * @param limit Use this query parameter to set the maximum number of ads to return on a page from the paginated response. Default: 10 Maximum: 500 (optional)
     * @param offset Specifies the number of ads to skip in the result set before returning the first ad in the paginated response. Combine offset with the limit query parameter to control the items returned in the response. For example, if you supply an offset of 0 and a limit of 10, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If offset is 10 and limit is 20, the first page of the response contains items 11-30 from the complete result set. Default: 0 (optional)
     * @param findListingRecommendationRequest  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Object findListingRecommendations(String X_EBAY_C_MARKETPLACE_ID, String filter, String limit, String offset, FindListingRecommendationRequest findListingRecommendationRequest) throws ApiException {
        ApiResponse<Object> localVarResp = findListingRecommendationsWithHttpInfo(X_EBAY_C_MARKETPLACE_ID, filter, limit, offset, findListingRecommendationRequest);
        return localVarResp.getData();
    }

    /**
     * /find
     * The find method currently returns information for a single recommendation type (AD) which contains information that sellers can use to configure Promoted Listings ad campaigns. The response from this method includes an array of the seller&#39;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see Using the Recommendation API to help configure campaigns. The AD recommendation type The AD type contains two sets of information: The promoteWithAd indicator The promoteWithAd response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. The returned value is set to either RECOMMENDED or UNDETERMINED, where RECOMMENDED identifies the listings that will benefit the most from having them included in an ad campaign. The bid percentage Also known as the &amp;quot;ad rate,&amp;quot; the bidPercentage field provides the current trending bid percentage of similarly promoted items in the marketplace. The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item. Configuring the request You can configure a request to review all of a seller&#39;s currently active listings, or just a subset of them. All active listings &amp;ndash; If you leave the request body empty, the request targets all the items currently listed by the seller. Here, the response is filtered to contain only the items where promoteWithAd equals RECOMMENDED. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign. Selected listing IDs &amp;ndash; If you populate the request body with a set of listingIds, the response contains data for all the specified listing IDs. In this scenario, the response provides you with information on listings where the promoteWithAd can be either RECOMMENDED or UNDETERMINED. The paginated response Because the response can contain many listing IDs, the findListingRecommendations method paginates the response set. You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     * @param X_EBAY_C_MARKETPLACE_ID Use this header to specify the eBay marketplace where you list the items for which you want to get recommendations. (required)
     * @param filter Provide a list of key-value pairs to specify the criteria you want to use to filter the response. In the list, separate each filter key from its associated value with a colon (&amp;quot;:&amp;quot;). Currently, the only supported filter value is recommendationTypes and it supports only the (&amp;quot;AD&amp;quot;) type. Follow the recommendationTypes specifier with the filter type(s) enclosed in curly braces (&amp;quot;{ }&amp;quot;), and separate multiple types with commas. Example: filter&#x3D;recommendationTypes:{AD} Default: recommendationTypes:{AD} (optional)
     * @param limit Use this query parameter to set the maximum number of ads to return on a page from the paginated response. Default: 10 Maximum: 500 (optional)
     * @param offset Specifies the number of ads to skip in the result set before returning the first ad in the paginated response. Combine offset with the limit query parameter to control the items returned in the response. For example, if you supply an offset of 0 and a limit of 10, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If offset is 10 and limit is 20, the first page of the response contains items 11-30 from the complete result set. Default: 0 (optional)
     * @param findListingRecommendationRequest  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> findListingRecommendationsWithHttpInfo( @NotNull String X_EBAY_C_MARKETPLACE_ID,  String filter,  String limit,  String offset,  FindListingRecommendationRequest findListingRecommendationRequest) throws ApiException {
        okhttp3.Call localVarCall = findListingRecommendationsValidateBeforeCall(X_EBAY_C_MARKETPLACE_ID, filter, limit, offset, findListingRecommendationRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /find (asynchronously)
     * The find method currently returns information for a single recommendation type (AD) which contains information that sellers can use to configure Promoted Listings ad campaigns. The response from this method includes an array of the seller&#39;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see Using the Recommendation API to help configure campaigns. The AD recommendation type The AD type contains two sets of information: The promoteWithAd indicator The promoteWithAd response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. The returned value is set to either RECOMMENDED or UNDETERMINED, where RECOMMENDED identifies the listings that will benefit the most from having them included in an ad campaign. The bid percentage Also known as the &amp;quot;ad rate,&amp;quot; the bidPercentage field provides the current trending bid percentage of similarly promoted items in the marketplace. The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item. Configuring the request You can configure a request to review all of a seller&#39;s currently active listings, or just a subset of them. All active listings &amp;ndash; If you leave the request body empty, the request targets all the items currently listed by the seller. Here, the response is filtered to contain only the items where promoteWithAd equals RECOMMENDED. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign. Selected listing IDs &amp;ndash; If you populate the request body with a set of listingIds, the response contains data for all the specified listing IDs. In this scenario, the response provides you with information on listings where the promoteWithAd can be either RECOMMENDED or UNDETERMINED. The paginated response Because the response can contain many listing IDs, the findListingRecommendations method paginates the response set. You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     * @param X_EBAY_C_MARKETPLACE_ID Use this header to specify the eBay marketplace where you list the items for which you want to get recommendations. (required)
     * @param filter Provide a list of key-value pairs to specify the criteria you want to use to filter the response. In the list, separate each filter key from its associated value with a colon (&amp;quot;:&amp;quot;). Currently, the only supported filter value is recommendationTypes and it supports only the (&amp;quot;AD&amp;quot;) type. Follow the recommendationTypes specifier with the filter type(s) enclosed in curly braces (&amp;quot;{ }&amp;quot;), and separate multiple types with commas. Example: filter&#x3D;recommendationTypes:{AD} Default: recommendationTypes:{AD} (optional)
     * @param limit Use this query parameter to set the maximum number of ads to return on a page from the paginated response. Default: 10 Maximum: 500 (optional)
     * @param offset Specifies the number of ads to skip in the result set before returning the first ad in the paginated response. Combine offset with the limit query parameter to control the items returned in the response. For example, if you supply an offset of 0 and a limit of 10, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If offset is 10 and limit is 20, the first page of the response contains items 11-30 from the complete result set. Default: 0 (optional)
     * @param findListingRecommendationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findListingRecommendationsAsync(String X_EBAY_C_MARKETPLACE_ID, String filter, String limit, String offset, FindListingRecommendationRequest findListingRecommendationRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = findListingRecommendationsValidateBeforeCall(X_EBAY_C_MARKETPLACE_ID, filter, limit, offset, findListingRecommendationRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
