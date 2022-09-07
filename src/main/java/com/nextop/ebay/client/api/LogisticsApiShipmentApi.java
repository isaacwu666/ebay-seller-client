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

import com.nextop.ebay.client.model.CreateShipmentFromQuoteRequest;
import com.nextop.ebay.client.model.Shipment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogisticsApiShipmentApi {
    private ApiClient localVarApiClient;

    public LogisticsApiShipmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogisticsApiShipmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for cancelShipment
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment to be canceled. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelShipmentCall(String shipmentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shipment/{shipmentId}/cancel"
            .replaceAll("\\{" + "shipmentId" + "\\}", localVarApiClient.escapeString(shipmentId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelShipmentValidateBeforeCall(String shipmentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling cancelShipment(Async)");
        }
        

        okhttp3.Call localVarCall = cancelShipmentCall(shipmentId, _callback);
        return localVarCall;

    }

    /**
     * /shipment/{shipmentId}/cancel
     * This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&#39;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment to be canceled. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @return Shipment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Shipment cancelShipment(String shipmentId) throws ApiException {
        ApiResponse<Shipment> localVarResp = cancelShipmentWithHttpInfo(shipmentId);
        return localVarResp.getData();
    }

    /**
     * /shipment/{shipmentId}/cancel
     * This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&#39;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment to be canceled. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @return ApiResponse&lt;Shipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Shipment> cancelShipmentWithHttpInfo( @NotNull String shipmentId) throws ApiException {
        okhttp3.Call localVarCall = cancelShipmentValidateBeforeCall(shipmentId, null);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /shipment/{shipmentId}/cancel (asynchronously)
     * This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&#39;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment to be canceled. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelShipmentAsync(String shipmentId, final ApiCallback<Shipment> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelShipmentValidateBeforeCall(shipmentId, _callback);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createFromShippingQuote
     * @param createShipmentFromQuoteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFromShippingQuoteCall(CreateShipmentFromQuoteRequest createShipmentFromQuoteRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createShipmentFromQuoteRequest;

        // create path and map variables
        String localVarPath = "/shipment/create_from_shipping_quote";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createFromShippingQuoteValidateBeforeCall(CreateShipmentFromQuoteRequest createShipmentFromQuoteRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createFromShippingQuoteCall(createShipmentFromQuoteRequest, _callback);
        return localVarCall;

    }

    /**
     * /shipment/create_from_shipping_quote
     * This method creates a \&quot;shipment\&quot; based on the &lt;b&gt;shippingQuoteId&lt;/b&gt; and &lt;b&gt;rateId&lt;/b&gt; values supplied in the request. The rate identified by the &lt;b&gt;rateId&lt;/b&gt; value specifies the carrier and service for the package shipment, and the rate ID must be contained in the shipping quote identified by the &lt;b&gt;shippingQuoteId&lt;/b&gt; value. Call &lt;b&gt;createShippingQuote&lt;/b&gt; to retrieve a set of live shipping rates.  &lt;br&gt;&lt;br&gt;When you create a shipment, eBay generates a shipping label that you can download and use to ship your package.  &lt;br&gt;&lt;br&gt;In a &lt;b&gt;createFromShippingQuote&lt;/b&gt; request, sellers can include a list of shipping options they want to add to the base service quoted in the selected rate. The list of available shipping options is specific to each quoted rate and if available, the options are listed in the rate container of the of the shipping quote.  &lt;br&gt;&lt;br&gt;In addition to a configurable return-to location and other details about the shipment, the response to this method includes:  &lt;ul&gt;&lt;li&gt;The shipping carrier and service to be used for the package shipment&lt;/li&gt; &lt;li&gt;A list of selected shipping options, if any&lt;/li&gt; &lt;li&gt;The shipment tracking number&lt;/li&gt; &lt;li&gt;The total shipping cost (the sum cost of the base shipping service and any added options)&lt;/li&gt;&lt;/ul&gt; When you create a shipment, your billing agreement account is charged the sum of the &lt;b&gt;baseShippingCost&lt;/b&gt; and the total cost of any additional shipping options you might have selected. Use the URL returned in &lt;b&gt;labelDownloadUrl&lt;/b&gt; field, or call &lt;b&gt;downloadLabelFile&lt;/b&gt; with the &lt;b&gt;shipmentId&lt;/b&gt; value from the response, to download a shipping label for your package. &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Sellers must set up their payment method with eBay before they can use this method to create a shipment and the associated shipping label.&lt;/p&gt;
     * @param createShipmentFromQuoteRequest  (optional)
     * @return Shipment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Shipment createFromShippingQuote(CreateShipmentFromQuoteRequest createShipmentFromQuoteRequest) throws ApiException {
        ApiResponse<Shipment> localVarResp = createFromShippingQuoteWithHttpInfo(createShipmentFromQuoteRequest);
        return localVarResp.getData();
    }

    /**
     * /shipment/create_from_shipping_quote
     * This method creates a \&quot;shipment\&quot; based on the &lt;b&gt;shippingQuoteId&lt;/b&gt; and &lt;b&gt;rateId&lt;/b&gt; values supplied in the request. The rate identified by the &lt;b&gt;rateId&lt;/b&gt; value specifies the carrier and service for the package shipment, and the rate ID must be contained in the shipping quote identified by the &lt;b&gt;shippingQuoteId&lt;/b&gt; value. Call &lt;b&gt;createShippingQuote&lt;/b&gt; to retrieve a set of live shipping rates.  &lt;br&gt;&lt;br&gt;When you create a shipment, eBay generates a shipping label that you can download and use to ship your package.  &lt;br&gt;&lt;br&gt;In a &lt;b&gt;createFromShippingQuote&lt;/b&gt; request, sellers can include a list of shipping options they want to add to the base service quoted in the selected rate. The list of available shipping options is specific to each quoted rate and if available, the options are listed in the rate container of the of the shipping quote.  &lt;br&gt;&lt;br&gt;In addition to a configurable return-to location and other details about the shipment, the response to this method includes:  &lt;ul&gt;&lt;li&gt;The shipping carrier and service to be used for the package shipment&lt;/li&gt; &lt;li&gt;A list of selected shipping options, if any&lt;/li&gt; &lt;li&gt;The shipment tracking number&lt;/li&gt; &lt;li&gt;The total shipping cost (the sum cost of the base shipping service and any added options)&lt;/li&gt;&lt;/ul&gt; When you create a shipment, your billing agreement account is charged the sum of the &lt;b&gt;baseShippingCost&lt;/b&gt; and the total cost of any additional shipping options you might have selected. Use the URL returned in &lt;b&gt;labelDownloadUrl&lt;/b&gt; field, or call &lt;b&gt;downloadLabelFile&lt;/b&gt; with the &lt;b&gt;shipmentId&lt;/b&gt; value from the response, to download a shipping label for your package. &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Sellers must set up their payment method with eBay before they can use this method to create a shipment and the associated shipping label.&lt;/p&gt;
     * @param createShipmentFromQuoteRequest  (optional)
     * @return ApiResponse&lt;Shipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Shipment> createFromShippingQuoteWithHttpInfo( CreateShipmentFromQuoteRequest createShipmentFromQuoteRequest) throws ApiException {
        okhttp3.Call localVarCall = createFromShippingQuoteValidateBeforeCall(createShipmentFromQuoteRequest, null);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /shipment/create_from_shipping_quote (asynchronously)
     * This method creates a \&quot;shipment\&quot; based on the &lt;b&gt;shippingQuoteId&lt;/b&gt; and &lt;b&gt;rateId&lt;/b&gt; values supplied in the request. The rate identified by the &lt;b&gt;rateId&lt;/b&gt; value specifies the carrier and service for the package shipment, and the rate ID must be contained in the shipping quote identified by the &lt;b&gt;shippingQuoteId&lt;/b&gt; value. Call &lt;b&gt;createShippingQuote&lt;/b&gt; to retrieve a set of live shipping rates.  &lt;br&gt;&lt;br&gt;When you create a shipment, eBay generates a shipping label that you can download and use to ship your package.  &lt;br&gt;&lt;br&gt;In a &lt;b&gt;createFromShippingQuote&lt;/b&gt; request, sellers can include a list of shipping options they want to add to the base service quoted in the selected rate. The list of available shipping options is specific to each quoted rate and if available, the options are listed in the rate container of the of the shipping quote.  &lt;br&gt;&lt;br&gt;In addition to a configurable return-to location and other details about the shipment, the response to this method includes:  &lt;ul&gt;&lt;li&gt;The shipping carrier and service to be used for the package shipment&lt;/li&gt; &lt;li&gt;A list of selected shipping options, if any&lt;/li&gt; &lt;li&gt;The shipment tracking number&lt;/li&gt; &lt;li&gt;The total shipping cost (the sum cost of the base shipping service and any added options)&lt;/li&gt;&lt;/ul&gt; When you create a shipment, your billing agreement account is charged the sum of the &lt;b&gt;baseShippingCost&lt;/b&gt; and the total cost of any additional shipping options you might have selected. Use the URL returned in &lt;b&gt;labelDownloadUrl&lt;/b&gt; field, or call &lt;b&gt;downloadLabelFile&lt;/b&gt; with the &lt;b&gt;shipmentId&lt;/b&gt; value from the response, to download a shipping label for your package. &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Sellers must set up their payment method with eBay before they can use this method to create a shipment and the associated shipping label.&lt;/p&gt;
     * @param createShipmentFromQuoteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFromShippingQuoteAsync(CreateShipmentFromQuoteRequest createShipmentFromQuoteRequest, final ApiCallback<Shipment> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFromShippingQuoteValidateBeforeCall(createShipmentFromQuoteRequest, _callback);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for downloadLabelFile
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment associated with the shipping label you want to download. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
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
    public okhttp3.Call downloadLabelFileCall(String shipmentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shipment/{shipmentId}/download_label_file"
            .replaceAll("\\{" + "shipmentId" + "\\}", localVarApiClient.escapeString(shipmentId.toString()));

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
    private okhttp3.Call downloadLabelFileValidateBeforeCall(String shipmentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling downloadLabelFile(Async)");
        }
        

        okhttp3.Call localVarCall = downloadLabelFileCall(shipmentId, _callback);
        return localVarCall;

    }

    /**
     * /shipment/{shipmentId}/download_label_file
     * This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.  &lt;br&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment associated with the shipping label you want to download. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @return Object
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
    public Object downloadLabelFile(String shipmentId) throws ApiException {
        ApiResponse<Object> localVarResp = downloadLabelFileWithHttpInfo(shipmentId);
        return localVarResp.getData();
    }

    /**
     * /shipment/{shipmentId}/download_label_file
     * This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.  &lt;br&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment associated with the shipping label you want to download. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @return ApiResponse&lt;Object&gt;
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
    public ApiResponse<Object> downloadLabelFileWithHttpInfo( @NotNull String shipmentId) throws ApiException {
        okhttp3.Call localVarCall = downloadLabelFileValidateBeforeCall(shipmentId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /shipment/{shipmentId}/download_label_file (asynchronously)
     * This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.  &lt;br&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment associated with the shipping label you want to download. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
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
    public okhttp3.Call downloadLabelFileAsync(String shipmentId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadLabelFileValidateBeforeCall(shipmentId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getShipment
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment you want to retrieve. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
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
    public okhttp3.Call getShipmentCall(String shipmentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shipment/{shipmentId}"
            .replaceAll("\\{" + "shipmentId" + "\\}", localVarApiClient.escapeString(shipmentId.toString()));

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
    private okhttp3.Call getShipmentValidateBeforeCall(String shipmentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getShipment(Async)");
        }
        

        okhttp3.Call localVarCall = getShipmentCall(shipmentId, _callback);
        return localVarCall;

    }

    /**
     * /shipment/{shipmentId}
     * This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment you want to retrieve. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @return Shipment
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
    public Shipment getShipment(String shipmentId) throws ApiException {
        ApiResponse<Shipment> localVarResp = getShipmentWithHttpInfo(shipmentId);
        return localVarResp.getData();
    }

    /**
     * /shipment/{shipmentId}
     * This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment you want to retrieve. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
     * @return ApiResponse&lt;Shipment&gt;
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
    public ApiResponse<Shipment> getShipmentWithHttpInfo( @NotNull String shipmentId) throws ApiException {
        okhttp3.Call localVarCall = getShipmentValidateBeforeCall(shipmentId, null);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /shipment/{shipmentId} (asynchronously)
     * This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.
     * @param shipmentId This path parameter specifies the unique eBay-assigned ID of the shipment you want to retrieve. The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by a call to &lt;b&gt;createFromShippingQuote&lt;/b&gt;. (required)
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
    public okhttp3.Call getShipmentAsync(String shipmentId, final ApiCallback<Shipment> _callback) throws ApiException {

        okhttp3.Call localVarCall = getShipmentValidateBeforeCall(shipmentId, _callback);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
