/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi.models.operations;

import com.vgd.openapi.models.components.User;
import com.vgd.openapi.utils.Utils;
import java.util.Optional;

public class CreateUserRequestBuilder {

    private Optional<? extends User> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateUser sdk;

    public CreateUserRequestBuilder(SDKMethodInterfaces.MethodCallCreateUser sdk) {
        this.sdk = sdk;
    }
                
    public CreateUserRequestBuilder request(User request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateUserRequestBuilder request(Optional<? extends User> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateUserResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
