# User
(*user()*)

## Overview

Operations about user

### Available Operations

* [create](#create) - Create user
* [createWithList](#createwithlist) - Creates list of users with given input array
* [login](#login) - Logs user into the system
* [logout](#logout) - Logs out current logged in user session
* [getByName](#getbyname) - Get user by user name
* [update](#update) - Update user
* [delete](#delete) - Delete user

## create

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.User;
import com.vgd.openapi.models.operations.CreateUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        User req = User.builder()
                .id(10L)
                .username("theUser")
                .firstName("John")
                .lastName("James")
                .email("john@email.com")
                .password("12345")
                .phone("12345")
                .userStatus(1)
                .build();

        CreateUserResponse res = sdk.user().create()
                .request(req)
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [User](../../models/shared/User.md)        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[CreateUserResponse](../../models/operations/CreateUserResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createWithList

Creates list of users with given input array

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.User;
import com.vgd.openapi.models.operations.CreateUsersWithListInputResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        List<User> req = List.of(
                User.builder()
                    .id(10L)
                    .username("theUser")
                    .firstName("John")
                    .lastName("James")
                    .email("john@email.com")
                    .password("12345")
                    .phone("12345")
                    .userStatus(1)
                    .build());

        CreateUsersWithListInputResponse res = sdk.user().createWithList()
                .request(req)
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [List<User>](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[CreateUsersWithListInputResponse](../../models/operations/CreateUsersWithListInputResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## login

Logs user into the system

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.LoginUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        LoginUserResponse res = sdk.user().login()
                .username("Christelle69")
                .password("UVp3HFAKtBXVWPj")
                .call();

        if (res.string().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `username`                           | *Optional\<String>*                  | :heavy_minus_sign:                   | The user name for login              |
| `password`                           | *Optional\<String>*                  | :heavy_minus_sign:                   | The password for login in clear text |

### Response

**[LoginUserResponse](../../models/operations/LoginUserResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## logout

Logs out current logged in user session

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.operations.LogoutUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        LogoutUserResponse res = sdk.user().logout()
                .call();

        // handle response
    }
}
```

### Response

**[LogoutUserResponse](../../models/operations/LogoutUserResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getByName

Get user by user name

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.GetUserByNameResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        GetUserByNameResponse res = sdk.user().getByName()
                .username("Alexanne.Wisoky74")
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `username`                                                 | *String*                                                   | :heavy_check_mark:                                         | The name that needs to be fetched. Use user1 for testing.  |

### Response

**[GetUserByNameResponse](../../models/operations/GetUserByNameResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## update

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.User;
import com.vgd.openapi.models.operations.UpdateUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateUserResponse res = sdk.user().update()
                .username("Ruthe_Hegmann")
                .user(User.builder()
                    .id(10L)
                    .username("theUser")
                    .firstName("John")
                    .lastName("James")
                    .email("john@email.com")
                    .password("12345")
                    .phone("12345")
                    .userStatus(1)
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `username`                                         | *String*                                           | :heavy_check_mark:                                 | name that needs to be updated                      |
| `user`                                             | [Optional\<User>](../../models/components/User.md) | :heavy_minus_sign:                                 | Update an existent user in the store               |

### Response

**[UpdateUserResponse](../../models/operations/UpdateUserResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## delete

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.DeleteUserResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteUserResponse res = sdk.user().delete()
                .username("Karolann_Howe")
                .call();

        if (res.user().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                         | Type                              | Required                          | Description                       |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `username`                        | *String*                          | :heavy_check_mark:                | The name that needs to be deleted |

### Response

**[DeleteUserResponse](../../models/operations/DeleteUserResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |