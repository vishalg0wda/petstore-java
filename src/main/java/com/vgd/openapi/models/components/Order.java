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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class Order {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Long> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("petId")
    private Optional<Long> petId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quantity")
    private Optional<Integer> quantity;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipDate")
    private Optional<OffsetDateTime> shipDate;

    /**
     * Order Status
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends OrderStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("complete")
    private Optional<Boolean> complete;

    @JsonCreator
    public Order(
            @JsonProperty("id") Optional<Long> id,
            @JsonProperty("petId") Optional<Long> petId,
            @JsonProperty("quantity") Optional<Integer> quantity,
            @JsonProperty("shipDate") Optional<OffsetDateTime> shipDate,
            @JsonProperty("status") Optional<? extends OrderStatus> status,
            @JsonProperty("complete") Optional<Boolean> complete) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(petId, "petId");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(shipDate, "shipDate");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(complete, "complete");
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = complete;
    }
    
    public Order() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Long> petId() {
        return petId;
    }

    @JsonIgnore
    public Optional<Integer> quantity() {
        return quantity;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> shipDate() {
        return shipDate;
    }

    /**
     * Order Status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrderStatus> status() {
        return (Optional<OrderStatus>) status;
    }

    @JsonIgnore
    public Optional<Boolean> complete() {
        return complete;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Order withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Order withId(Optional<Long> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Order withPetId(long petId) {
        Utils.checkNotNull(petId, "petId");
        this.petId = Optional.ofNullable(petId);
        return this;
    }

    public Order withPetId(Optional<Long> petId) {
        Utils.checkNotNull(petId, "petId");
        this.petId = petId;
        return this;
    }

    public Order withQuantity(int quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = Optional.ofNullable(quantity);
        return this;
    }

    public Order withQuantity(Optional<Integer> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    public Order withShipDate(OffsetDateTime shipDate) {
        Utils.checkNotNull(shipDate, "shipDate");
        this.shipDate = Optional.ofNullable(shipDate);
        return this;
    }

    public Order withShipDate(Optional<OffsetDateTime> shipDate) {
        Utils.checkNotNull(shipDate, "shipDate");
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Order Status
     */
    public Order withStatus(OrderStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Order Status
     */
    public Order withStatus(Optional<? extends OrderStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Order withComplete(boolean complete) {
        Utils.checkNotNull(complete, "complete");
        this.complete = Optional.ofNullable(complete);
        return this;
    }

    public Order withComplete(Optional<Boolean> complete) {
        Utils.checkNotNull(complete, "complete");
        this.complete = complete;
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
        Order other = (Order) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.petId, other.petId) &&
            Objects.deepEquals(this.quantity, other.quantity) &&
            Objects.deepEquals(this.shipDate, other.shipDate) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.complete, other.complete);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            petId,
            quantity,
            shipDate,
            status,
            complete);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Order.class,
                "id", id,
                "petId", petId,
                "quantity", quantity,
                "shipDate", shipDate,
                "status", status,
                "complete", complete);
    }
    
    public final static class Builder {
 
        private Optional<Long> id = Optional.empty();
 
        private Optional<Long> petId = Optional.empty();
 
        private Optional<Integer> quantity = Optional.empty();
 
        private Optional<OffsetDateTime> shipDate = Optional.empty();
 
        private Optional<? extends OrderStatus> status = Optional.empty();
 
        private Optional<Boolean> complete = Optional.empty();  
        
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

        public Builder petId(long petId) {
            Utils.checkNotNull(petId, "petId");
            this.petId = Optional.ofNullable(petId);
            return this;
        }

        public Builder petId(Optional<Long> petId) {
            Utils.checkNotNull(petId, "petId");
            this.petId = petId;
            return this;
        }

        public Builder quantity(int quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = Optional.ofNullable(quantity);
            return this;
        }

        public Builder quantity(Optional<Integer> quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        public Builder shipDate(OffsetDateTime shipDate) {
            Utils.checkNotNull(shipDate, "shipDate");
            this.shipDate = Optional.ofNullable(shipDate);
            return this;
        }

        public Builder shipDate(Optional<OffsetDateTime> shipDate) {
            Utils.checkNotNull(shipDate, "shipDate");
            this.shipDate = shipDate;
            return this;
        }

        /**
         * Order Status
         */
        public Builder status(OrderStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Order Status
         */
        public Builder status(Optional<? extends OrderStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder complete(boolean complete) {
            Utils.checkNotNull(complete, "complete");
            this.complete = Optional.ofNullable(complete);
            return this;
        }

        public Builder complete(Optional<Boolean> complete) {
            Utils.checkNotNull(complete, "complete");
            this.complete = complete;
            return this;
        }
        
        public Order build() {
            return new Order(
                id,
                petId,
                quantity,
                shipDate,
                status,
                complete);
        }
    }
}

