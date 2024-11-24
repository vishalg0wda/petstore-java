/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.vishalg0wda.deathstar;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.vishalg0wda.deathstar.models.errors.APIException;
import io.github.vishalg0wda.deathstar.models.operations.GetSithRequestBuilder;
import io.github.vishalg0wda.deathstar.models.operations.GetSithResponse;
import io.github.vishalg0wda.deathstar.models.operations.GetSithResponseBody;
import io.github.vishalg0wda.deathstar.models.operations.SDKMethodInterfaces.*;
import io.github.vishalg0wda.deathstar.utils.HTTPClient;
import io.github.vishalg0wda.deathstar.utils.HTTPRequest;
import io.github.vishalg0wda.deathstar.utils.Hook.AfterErrorContextImpl;
import io.github.vishalg0wda.deathstar.utils.Hook.AfterSuccessContextImpl;
import io.github.vishalg0wda.deathstar.utils.Hook.BeforeRequestContextImpl;
import io.github.vishalg0wda.deathstar.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Sith implements
            MethodCallGetSith {

    private final SDKConfiguration sdkConfiguration;

    Sith(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Sith endpoint
     * Returns a message from a Sith
     * @return The call builder
     */
    public GetSithRequestBuilder get() {
        return new GetSithRequestBuilder(this);
    }

    /**
     * Sith endpoint
     * Returns a message from a Sith
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetSithResponse getDirect() throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/sith");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "get_/sith", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get_/sith",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get_/sith",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get_/sith",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetSithResponse.Builder _resBuilder = 
            GetSithResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetSithResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetSithResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetSithResponseBody>() {});
                _res.withObject(Optional.ofNullable(_out));
                return _res;
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