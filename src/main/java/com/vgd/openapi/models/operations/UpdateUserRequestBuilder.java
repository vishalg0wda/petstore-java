/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi.models.operations;

import com.vgd.openapi.models.components.User;
import com.vgd.openapi.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateUserRequestBuilder {

    private String username;
    private Optional<? extends User> user = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateUser sdk;

    public UpdateUserRequestBuilder(SDKMethodInterfaces.MethodCallUpdateUser sdk) {
        this.sdk = sdk;
    }

    public UpdateUserRequestBuilder username(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }
                
    public UpdateUserRequestBuilder user(User user) {
        Utils.checkNotNull(user, "user");
        this.user = Optional.of(user);
        return this;
    }

    public UpdateUserRequestBuilder user(Optional<? extends User> user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
        return this;
    }

    public UpdateUserResponse call() throws Exception {

        return sdk.update(
            username,
            user);
    }
}
