/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi.models.operations;


public class GetInventoryRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetInventory sdk;

    public GetInventoryRequestBuilder(SDKMethodInterfaces.MethodCallGetInventory sdk) {
        this.sdk = sdk;
    }

    public GetInventoryResponse call() throws Exception {

        return sdk.getInventoryDirect();
    }
}
