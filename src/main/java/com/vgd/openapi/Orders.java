/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vgd.openapi.models.components.Order;
import com.vgd.openapi.models.errors.APIException;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.GetOrderByIdRequest;
import com.vgd.openapi.models.operations.GetOrderByIdRequestBuilder;
import com.vgd.openapi.models.operations.GetOrderByIdResponse;
import com.vgd.openapi.models.operations.SDKMethodInterfaces.*;
import com.vgd.openapi.utils.HTTPClient;
import com.vgd.openapi.utils.HTTPRequest;
import com.vgd.openapi.utils.Hook.AfterErrorContextImpl;
import com.vgd.openapi.utils.Hook.AfterSuccessContextImpl;
import com.vgd.openapi.utils.Hook.BeforeRequestContextImpl;
import com.vgd.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Orders implements
            MethodCallGetOrderById {

    private final SDKConfiguration sdkConfiguration;

    Orders(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;= 5 or &gt; 10. Other values will generate exceptions.
     * @return The call builder
     */
    public GetOrderByIdRequestBuilder get() {
        return new GetOrderByIdRequestBuilder(this);
    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;= 5 or &gt; 10. Other values will generate exceptions.
     * @param orderId ID of order that needs to be fetched
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetOrderByIdResponse get(
            long orderId) throws Exception {
        GetOrderByIdRequest request =
            GetOrderByIdRequest
                .builder()
                .orderId(orderId)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                GetOrderByIdRequest.class,
                _baseUrl,
                "/store/order/{orderId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getOrderById", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getOrderById",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getOrderById",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getOrderById",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetOrderByIdResponse.Builder _resBuilder = 
            GetOrderByIdResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetOrderByIdResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Order _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Order>() {});
                _res.withOrder(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ApiErrorInvalidInput _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApiErrorInvalidInput>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ApiErrorUnauthorized _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApiErrorUnauthorized>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ApiErrorNotFound _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApiErrorNotFound>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}