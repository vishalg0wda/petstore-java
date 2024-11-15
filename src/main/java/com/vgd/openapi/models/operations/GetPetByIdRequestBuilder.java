/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi.models.operations;

import com.vgd.openapi.utils.Utils;
import java.lang.Long;

public class GetPetByIdRequestBuilder {

    private Long petId;
    private final SDKMethodInterfaces.MethodCallGetPetById sdk;

    public GetPetByIdRequestBuilder(SDKMethodInterfaces.MethodCallGetPetById sdk) {
        this.sdk = sdk;
    }

    public GetPetByIdRequestBuilder petId(long petId) {
        Utils.checkNotNull(petId, "petId");
        this.petId = petId;
        return this;
    }

    public GetPetByIdResponse call() throws Exception {

        return sdk.getById(
            petId);
    }
}
