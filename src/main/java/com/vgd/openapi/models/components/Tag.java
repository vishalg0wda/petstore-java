/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.vgd.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vgd.openapi.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class Tag {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Long> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonCreator
    public Tag(
            @JsonProperty("id") Optional<Long> id,
            @JsonProperty("name") Optional<String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }
    
    public Tag() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Tag withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Tag withId(Optional<Long> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Tag withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public Tag withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        Tag other = (Tag) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Tag.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<Long> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<Long> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public Tag build() {
            return new Tag(
                id,
                name);
        }
    }
}
