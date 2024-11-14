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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class User {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Long> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private Optional<String> username;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstName")
    private Optional<String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private Optional<String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<String> phone;

    /**
     * User Status
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userStatus")
    private Optional<Integer> userStatus;

    @JsonCreator
    public User(
            @JsonProperty("id") Optional<Long> id,
            @JsonProperty("username") Optional<String> username,
            @JsonProperty("firstName") Optional<String> firstName,
            @JsonProperty("lastName") Optional<String> lastName,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("phone") Optional<String> phone,
            @JsonProperty("userStatus") Optional<Integer> userStatus) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(userStatus, "userStatus");
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
    }
    
    public User() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> username() {
        return username;
    }

    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public Optional<String> phone() {
        return phone;
    }

    /**
     * User Status
     */
    @JsonIgnore
    public Optional<Integer> userStatus() {
        return userStatus;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public User withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public User withId(Optional<Long> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public User withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = Optional.ofNullable(username);
        return this;
    }

    public User withUsername(Optional<String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    public User withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    public User withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public User withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public User withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public User withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public User withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public User withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public User withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public User withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    public User withPhone(Optional<String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * User Status
     */
    public User withUserStatus(int userStatus) {
        Utils.checkNotNull(userStatus, "userStatus");
        this.userStatus = Optional.ofNullable(userStatus);
        return this;
    }

    /**
     * User Status
     */
    public User withUserStatus(Optional<Integer> userStatus) {
        Utils.checkNotNull(userStatus, "userStatus");
        this.userStatus = userStatus;
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
        User other = (User) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.username, other.username) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.userStatus, other.userStatus);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            username,
            firstName,
            lastName,
            email,
            password,
            phone,
            userStatus);
    }
    
    @Override
    public String toString() {
        return Utils.toString(User.class,
                "id", id,
                "username", username,
                "firstName", firstName,
                "lastName", lastName,
                "email", email,
                "password", password,
                "phone", phone,
                "userStatus", userStatus);
    }
    
    public final static class Builder {
 
        private Optional<Long> id = Optional.empty();
 
        private Optional<String> username = Optional.empty();
 
        private Optional<String> firstName = Optional.empty();
 
        private Optional<String> lastName = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> password = Optional.empty();
 
        private Optional<String> phone = Optional.empty();
 
        private Optional<Integer> userStatus = Optional.empty();  
        
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

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = Optional.ofNullable(username);
            return this;
        }

        public Builder username(Optional<String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        public Builder phone(Optional<String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        /**
         * User Status
         */
        public Builder userStatus(int userStatus) {
            Utils.checkNotNull(userStatus, "userStatus");
            this.userStatus = Optional.ofNullable(userStatus);
            return this;
        }

        /**
         * User Status
         */
        public Builder userStatus(Optional<Integer> userStatus) {
            Utils.checkNotNull(userStatus, "userStatus");
            this.userStatus = userStatus;
            return this;
        }
        
        public User build() {
            return new User(
                id,
                username,
                firstName,
                lastName,
                email,
                password,
                phone,
                userStatus);
        }
    }
}
