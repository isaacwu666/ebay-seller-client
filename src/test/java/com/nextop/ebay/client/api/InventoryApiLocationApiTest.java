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
import com.nextop.ebay.client.model.InventoryLocation;
import com.nextop.ebay.client.model.InventoryLocationFull;
import com.nextop.ebay.client.model.InventoryLocationResponse;
import com.nextop.ebay.client.model.LocationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryApiLocationApi
 */
@Ignore
public class InventoryApiLocationApiTest {

    private final InventoryApiLocationApi api = new InventoryApiLocationApi();

    
    /**
     * /location/{merchantLocationKey}
     *
     * &lt;p&gt;Use this call to create a new inventory location. In order to create and publish an offer (and create an eBay listing), a seller must have at least one inventory location, as every offer must be associated with a location.&lt;/p&gt;&lt;p&gt;Upon first creating an inventory location, only a seller-defined location identifier and a physical location is required, and once set, these values can not be changed. The unique identifier value (&lt;i&gt;merchantLocationKey&lt;/i&gt;) is passed in at the end of the call URI. This &lt;i&gt;merchantLocationKey&lt;/i&gt; value will be used in other Inventory Location calls to identify the inventory location to perform an action against.&lt;/p&gt;&lt;p&gt;At this time, location types are either warehouse or store. Warehouse locations are used for traditional shipping, and store locations are generally used by US merchants selling products through the In-Store Pickup program, or used by UK, Australian, and German merchants selling products through the Click and Collect program. A full address is required for store inventory locations. However, for warehouse inventory locations, a full street address is not needed, but the city, state/province, and country of the location must be provided. &lt;/p&gt;&lt;p&gt;Note that all inventory locations are \&quot;enabled\&quot; by default when they are created, and you must specifically disable them (by passing in a value of &lt;code&gt;DISABLED&lt;/code&gt; in the &lt;strong&gt;merchantLocationStatus&lt;/strong&gt; field) if you want them to be set to the disabled state. The seller&#39;s inventory cannot be loaded to inventory locations in the disabled state.&lt;/p&gt; &lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the following table includes another request header that is mandatory for the &lt;strong&gt;createInventoryLocation&lt;/strong&gt; call, and two other request headers that are optional:&lt;/p&gt;&lt;br&gt; &lt;table&gt; &lt;tr&gt; &lt;th&gt;Header&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;th&gt;Required?&lt;/th&gt; &lt;th&gt;Applicable Values&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Accept&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Describes the response encoding, as required by the caller. Currently, the interfaces require payloads formatted in JSON, and JSON is the default.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Language&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Use this header to control the language that is used for any returned errors or warnings in the call response.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;en-US&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Type&lt;/code&gt;&lt;/td&gt; &lt;td&gt;The MIME type of the body of the request. Must be JSON.&lt;/td&gt; &lt;td&gt;Yes&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt;&lt;/p&gt;&lt;br/&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInventoryLocationTest() throws ApiException {
        String merchantLocationKey = null;
        InventoryLocationFull inventoryLocationFull = null;
        Object response = api.createInventoryLocation(merchantLocationKey, inventoryLocationFull);

        // TODO: test validations
    }
    
    /**
     * /location/{merchantLocationKey}
     *
     * &lt;p&gt;This call deletes the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Note that deleting a location will not affect any active eBay listings associated with the deleted location, but the seller will not be able modify the offers associated with the inventory location once it is deleted.&lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;Unless one or more errors and/or warnings occur with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInventoryLocationTest() throws ApiException {
        String merchantLocationKey = null;
        Object response = api.deleteInventoryLocation(merchantLocationKey);

        // TODO: test validations
    }
    
    /**
     * /location/{merchantLocationKey}/disable
     *
     * &lt;p&gt;This call disables the inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Sellers can not load/modify inventory to disabled inventory locations. Note that disabling an inventory location will not affect any active eBay listings associated with the disabled location, but the seller will not be able modify the offers associated with a disabled inventory location.&lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableInventoryLocationTest() throws ApiException {
        String merchantLocationKey = null;
        Object response = api.disableInventoryLocation(merchantLocationKey);

        // TODO: test validations
    }
    
    /**
     * /location/{merchantLocationKey}/enable
     *
     * &lt;p&gt;This call enables a disabled inventory location that is specified in the &lt;code&gt;merchantLocationKey&lt;/code&gt; path parameter. Once a disabled inventory location is enabled, sellers can start loading/modifying inventory to that inventory location. &lt;/p&gt;&lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call.&lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableInventoryLocationTest() throws ApiException {
        String merchantLocationKey = null;
        Object response = api.enableInventoryLocation(merchantLocationKey);

        // TODO: test validations
    }
    
    /**
     * /location/{merchantLocationKey}
     *
     * This call retrieves all defined details of the inventory location that is specified by the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInventoryLocationTest() throws ApiException {
        String merchantLocationKey = null;
        InventoryLocationResponse response = api.getInventoryLocation(merchantLocationKey);

        // TODO: test validations
    }
    
    /**
     * /location
     *
     * This call retrieves all defined details for every inventory location associated with the seller&#39;s account. There are no required parameters for this call and no request payload. However, there are two optional query parameters, &lt;strong&gt;limit&lt;/strong&gt; and &lt;strong&gt;offset&lt;/strong&gt;. The &lt;strong&gt;limit&lt;/strong&gt; query parameter sets the maximum number of inventory locations returned on one page of data, and the &lt;strong&gt;offset&lt;/strong&gt; query parameter specifies the page of data to return. These query parameters are discussed more in the &lt;strong&gt;URI parameters&lt;/strong&gt; table below. &lt;p&gt;The &lt;code&gt;authorization&lt;/code&gt; HTTP header is the only required request header for this call. &lt;/p&gt;&lt;p&gt;A successful call will return an HTTP status value of &lt;i&gt;200 OK&lt;/i&gt;.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInventoryLocationsTest() throws ApiException {
        String limit = null;
        String offset = null;
        LocationResponse response = api.getInventoryLocations(limit, offset);

        // TODO: test validations
    }
    
    /**
     * /location/{merchantLocationKey}/update_location_details
     *
     * &lt;p&gt;Use this call to update non-physical location details for an existing inventory location. Specify the inventory location you want to update using the &lt;b&gt;merchantLocationKey&lt;/b&gt; path parameter. &lt;br&gt;&lt;br&gt;You can update the following text-based fields: &lt;strong&gt;name&lt;/strong&gt;, &lt;strong&gt;phone&lt;/strong&gt;, &lt;strong&gt;locationWebUrl&lt;/strong&gt;, &lt;strong&gt;locationInstructions&lt;/strong&gt; and &lt;strong&gt;locationAdditionalInformation&lt;/strong&gt;. Whatever text is passed in for these fields in an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call will replace the current text strings defined for these fields. For store inventory locations, the operating hours and/or the special hours can also be updated. &lt;br&gt;&lt;br&gt; The merchant location key, the physical location of the store, and its geo-location coordinates can not be updated with an &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call &lt;/p&gt;&lt;p&gt;In addition to the &lt;code&gt;authorization&lt;/code&gt; header, which is required for all eBay REST API calls, the following table includes another request header that is mandatory for the &lt;strong&gt;updateInventoryLocation&lt;/strong&gt; call, and two other request headers that are optional:&lt;/p&gt;&lt;br&gt; &lt;table&gt; &lt;tr&gt; &lt;th&gt;Header&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;th&gt;Required?&lt;/th&gt; &lt;th&gt;Applicable Values&lt;/th&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Accept&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Describes the response encoding, as required by the caller. Currently, the interfaces require payloads formatted in JSON, and JSON is the default.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Language&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Use this header to control the language that is used for any returned errors or warnings in the call response.&lt;/td&gt; &lt;td&gt;No&lt;/td&gt; &lt;td&gt;&lt;code&gt;en-US&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;code&gt;Content-Type&lt;/code&gt;&lt;/td&gt; &lt;td&gt;The MIME type of the body of the request. Must be JSON.&lt;/td&gt; &lt;td&gt;Yes&lt;/td&gt; &lt;td&gt;&lt;code&gt;application/json&lt;/code&gt;&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt;&lt;br/&gt;&lt;p&gt;Unless one or more errors and/or warnings occurs with the call, there is no response payload for this call. A successful call will return an HTTP status value of &lt;i&gt;204 No Content&lt;/i&gt;.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInventoryLocationTest() throws ApiException {
        String merchantLocationKey = null;
        InventoryLocation inventoryLocation = null;
        Object response = api.updateInventoryLocation(merchantLocationKey, inventoryLocation);

        // TODO: test validations
    }
    
}
