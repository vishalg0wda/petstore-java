/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vgd.openapi.utils.SpeakeasyMetadata;
import com.vgd.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetUserByNameRequest {

    /**
     * The name that needs to be fetched. Use user1 for testing. 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=username")
    private String username;

    @JsonCreator
    public GetUserByNameRequest(
            String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
    }

    /**
     * The name that needs to be fetched. Use user1 for testing. 
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name that needs to be fetched. Use user1 for testing. 
     */
    public GetUserByNameRequest withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetUserByNameRequest other = (GetUserByNameRequest) o;
        return 
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUserByNameRequest.class,
                "username", username);
    }
    
    public final static class Builder {
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name that needs to be fetched. Use user1 for testing. 
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public GetUserByNameRequest build() {
            return new GetUserByNameRequest(
                username);
        }
    }
}
