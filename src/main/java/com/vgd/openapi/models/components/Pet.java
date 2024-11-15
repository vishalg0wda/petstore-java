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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Pet {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Long> id;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("category")
    private Optional<? extends Category> category;

    @JsonProperty("photoUrls")
    private List<String> photoUrls;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<Tag>> tags;

    /**
     * pet status in the store
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends Status> status;

    @JsonCreator
    public Pet(
            @JsonProperty("id") Optional<Long> id,
            @JsonProperty("name") String name,
            @JsonProperty("category") Optional<? extends Category> category,
            @JsonProperty("photoUrls") List<String> photoUrls,
            @JsonProperty("tags") Optional<? extends List<Tag>> tags,
            @JsonProperty("status") Optional<? extends Status> status) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(photoUrls, "photoUrls");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(status, "status");
        this.id = id;
        this.name = name;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }
    
    public Pet(
            String name,
            List<String> photoUrls) {
        this(Optional.empty(), name, Optional.empty(), photoUrls, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> id() {
        return id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Category> category() {
        return (Optional<Category>) category;
    }

    @JsonIgnore
    public List<String> photoUrls() {
        return photoUrls;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Tag>> tags() {
        return (Optional<List<Tag>>) tags;
    }

    /**
     * pet status in the store
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Status> status() {
        return (Optional<Status>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Pet withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Pet withId(Optional<Long> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Pet withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Pet withCategory(Category category) {
        Utils.checkNotNull(category, "category");
        this.category = Optional.ofNullable(category);
        return this;
    }

    public Pet withCategory(Optional<? extends Category> category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    public Pet withPhotoUrls(List<String> photoUrls) {
        Utils.checkNotNull(photoUrls, "photoUrls");
        this.photoUrls = photoUrls;
        return this;
    }

    public Pet withTags(List<Tag> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public Pet withTags(Optional<? extends List<Tag>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    /**
     * pet status in the store
     */
    public Pet withStatus(Status status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * pet status in the store
     */
    public Pet withStatus(Optional<? extends Status> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        Pet other = (Pet) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.category, other.category) &&
            Objects.deepEquals(this.photoUrls, other.photoUrls) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            category,
            photoUrls,
            tags,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Pet.class,
                "id", id,
                "name", name,
                "category", category,
                "photoUrls", photoUrls,
                "tags", tags,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<Long> id = Optional.empty();
 
        private String name;
 
        private Optional<? extends Category> category = Optional.empty();
 
        private List<String> photoUrls;
 
        private Optional<? extends List<Tag>> tags = Optional.empty();
 
        private Optional<? extends Status> status = Optional.empty();  
        
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
            this.name = name;
            return this;
        }

        public Builder category(Category category) {
            Utils.checkNotNull(category, "category");
            this.category = Optional.ofNullable(category);
            return this;
        }

        public Builder category(Optional<? extends Category> category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }

        public Builder photoUrls(List<String> photoUrls) {
            Utils.checkNotNull(photoUrls, "photoUrls");
            this.photoUrls = photoUrls;
            return this;
        }

        public Builder tags(List<Tag> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends List<Tag>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        /**
         * pet status in the store
         */
        public Builder status(Status status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * pet status in the store
         */
        public Builder status(Optional<? extends Status> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public Pet build() {
            return new Pet(
                id,
                name,
                category,
                photoUrls,
                tags,
                status);
        }
    }
}

