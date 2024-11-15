/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi.models.operations;

import com.vgd.openapi.utils.Utils;
import java.lang.Long;

public class GetOrderByIdRequestBuilder {

    private Long orderId;
    private final SDKMethodInterfaces.MethodCallGetOrderById sdk;

    public GetOrderByIdRequestBuilder(SDKMethodInterfaces.MethodCallGetOrderById sdk) {
        this.sdk = sdk;
    }

    public GetOrderByIdRequestBuilder orderId(long orderId) {
        Utils.checkNotNull(orderId, "orderId");
        this.orderId = orderId;
        return this;
    }

    public GetOrderByIdResponse call() throws Exception {

        return sdk.get(
            orderId);
    }
}
