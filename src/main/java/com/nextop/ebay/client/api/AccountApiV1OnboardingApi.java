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

import com.nextop.ebay.client.model.PaymentsProgramOnboardingResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountApiV1OnboardingApi {
    private ApiClient localVarApiClient;

    public AccountApiV1OnboardingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountApiV1OnboardingApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPaymentsProgramOnboarding
     * @param marketplaceId The eBay marketplace ID associated with the onboarding status to retrieve. (required)
     * @param paymentsProgramType The type of payments program whose status is returned by the method. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentsProgramOnboardingCall(String marketplaceId, String paymentsProgramType, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payments_program/{marketplace_id}/{payments_program_type}/onboarding"
            .replaceAll("\\{" + "marketplace_id" + "\\}", localVarApiClient.escapeString(marketplaceId.toString()))
            .replaceAll("\\{" + "payments_program_type" + "\\}", localVarApiClient.escapeString(paymentsProgramType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentsProgramOnboardingValidateBeforeCall(String marketplaceId, String paymentsProgramType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'marketplaceId' is set
        if (marketplaceId == null) {
            throw new ApiException("Missing the required parameter 'marketplaceId' when calling getPaymentsProgramOnboarding(Async)");
        }
        
        // verify the required parameter 'paymentsProgramType' is set
        if (paymentsProgramType == null) {
            throw new ApiException("Missing the required parameter 'paymentsProgramType' when calling getPaymentsProgramOnboarding(Async)");
        }
        

        okhttp3.Call localVarCall = getPaymentsProgramOnboardingCall(marketplaceId, paymentsProgramType, _callback);
        return localVarCall;

    }

    /**
     * /payments_program/{marketplace_id}/{payments_program_type}/onboarding
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.
     * @param marketplaceId The eBay marketplace ID associated with the onboarding status to retrieve. (required)
     * @param paymentsProgramType The type of payments program whose status is returned by the method. (required)
     * @return PaymentsProgramOnboardingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public PaymentsProgramOnboardingResponse getPaymentsProgramOnboarding(String marketplaceId, String paymentsProgramType) throws ApiException {
        ApiResponse<PaymentsProgramOnboardingResponse> localVarResp = getPaymentsProgramOnboardingWithHttpInfo(marketplaceId, paymentsProgramType);
        return localVarResp.getData();
    }

    /**
     * /payments_program/{marketplace_id}/{payments_program_type}/onboarding
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.
     * @param marketplaceId The eBay marketplace ID associated with the onboarding status to retrieve. (required)
     * @param paymentsProgramType The type of payments program whose status is returned by the method. (required)
     * @return ApiResponse&lt;PaymentsProgramOnboardingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentsProgramOnboardingResponse> getPaymentsProgramOnboardingWithHttpInfo( @NotNull String marketplaceId,  @NotNull String paymentsProgramType) throws ApiException {
        okhttp3.Call localVarCall = getPaymentsProgramOnboardingValidateBeforeCall(marketplaceId, paymentsProgramType, null);
        Type localVarReturnType = new TypeToken<PaymentsProgramOnboardingResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /payments_program/{marketplace_id}/{payments_program_type}/onboarding (asynchronously)
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.
     * @param marketplaceId The eBay marketplace ID associated with the onboarding status to retrieve. (required)
     * @param paymentsProgramType The type of payments program whose status is returned by the method. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentsProgramOnboardingAsync(String marketplaceId, String paymentsProgramType, final ApiCallback<PaymentsProgramOnboardingResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentsProgramOnboardingValidateBeforeCall(marketplaceId, paymentsProgramType, _callback);
        Type localVarReturnType = new TypeToken<PaymentsProgramOnboardingResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
