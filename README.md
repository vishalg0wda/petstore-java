# openapi

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/deathstar/deathstar). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

Petstore - OpenAPI 3.1: This is a sample Pet Store Server based on the OpenAPI 3.1 specification.

Some useful links:
- [OpenAPI Reference](https://www.speakeasy.com/openapi)
- [The Pet Store repository](https://github.com/swagger-api/swagger-petstore)
- [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)

For more information about the API: [Find out more about Swagger](http://swagger.io)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
* [Authentication](#authentication)
<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.vgd:openapi:0.1.1'
```

Maven:
```xml
<dependency>
    <groupId>com.vgd</groupId>
    <artifactId>openapi</artifactId>
    <version>0.1.1</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.Category;
import com.vgd.openapi.models.components.Pet;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.UpdatePetResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        Pet req = Pet.builder()
                .name("doggie")
                .photoUrls(List.of(
                    "<value>"))
                .id(10L)
                .category(Category.builder()
                    .id(1L)
                    .name("Dogs")
                    .build())
                .build();

        UpdatePetResponse res = sdk.pet().update()
                .request(req)
                .call();

        if (res.pet().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [pet()](docs/sdks/pet/README.md)

* [update](docs/sdks/pet/README.md#update) - Update an existing pet
* [add](docs/sdks/pet/README.md#add) - Add a new pet to the store
* [findByStatus](docs/sdks/pet/README.md#findbystatus) - Finds Pets by status
* [findByTags](docs/sdks/pet/README.md#findbytags) - Finds Pets by tags
* [getById](docs/sdks/pet/README.md#getbyid) - Find pet by ID
* [delete](docs/sdks/pet/README.md#delete) - Deletes a pet
* [uploadFile](docs/sdks/pet/README.md#uploadfile) - uploads an image


### [store()](docs/sdks/store/README.md)

* [getInventory](docs/sdks/store/README.md#getinventory) - Returns pet inventories by status
* [placeOrder](docs/sdks/store/README.md#placeorder) - Place an order for a pet
* [deleteOrder](docs/sdks/store/README.md#deleteorder) - Delete purchase order by ID

#### [store().orders()](docs/sdks/orders/README.md)

* [get](docs/sdks/orders/README.md#get) - Find purchase order by ID

### [user()](docs/sdks/user/README.md)

* [create](docs/sdks/user/README.md#create) - Create user
* [createWithList](docs/sdks/user/README.md#createwithlist) - Creates list of users with given input array
* [login](docs/sdks/user/README.md#login) - Logs user into the system
* [logout](docs/sdks/user/README.md#logout) - Logs out current logged in user session
* [getByName](docs/sdks/user/README.md#getbyname) - Get user by user name
* [update](docs/sdks/user/README.md#update) - Update user
* [delete](docs/sdks/user/README.md#delete) - Delete user

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `update` method throws the following exceptions:

| Error Type                         | Status Code | Content Type     |
| ---------------------------------- | ----------- | ---------------- |
| models/errors/ApiErrorInvalidInput | 400         | application/json |
| models/errors/ApiErrorUnauthorized | 401         | application/json |
| models/errors/ApiErrorNotFound     | 404         | application/json |
| models/errors/APIException         | 4XX, 5XX    | \*/\*            |

### Example

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.Category;
import com.vgd.openapi.models.components.Pet;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.UpdatePetResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        Pet req = Pet.builder()
                .name("doggie")
                .photoUrls(List.of(
                    "<value>"))
                .id(10L)
                .category(Category.builder()
                    .id(1L)
                    .name("Dogs")
                    .build())
                .build();

        UpdatePetResponse res = sdk.pet().update()
                .request(req)
                .call();

        if (res.pet().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Server Variables

The default server `https://{environment}.petstore.io` contains variables and is set to `https://prod.petstore.io` by default. To override default values, the following builder methods are available when initializing the SDK client instance:
 * `environment(ServerEnvironment environment)`

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.Category;
import com.vgd.openapi.models.components.Pet;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.UpdatePetResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .serverURL("https://prod.petstore.io")
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        Pet req = Pet.builder()
                .name("doggie")
                .photoUrls(List.of(
                    "<value>"))
                .id(10L)
                .category(Category.builder()
                    .id(1L)
                    .name("Dogs")
                    .build())
                .build();

        UpdatePetResponse res = sdk.pet().update()
                .request(req)
                .call();

        if (res.pet().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name     | Type   | Scheme  |
| -------- | ------ | ------- |
| `apiKey` | apiKey | API key |

To authenticate with the API the `apiKey` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.Category;
import com.vgd.openapi.models.components.Pet;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.UpdatePetResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        Pet req = Pet.builder()
                .name("doggie")
                .photoUrls(List.of(
                    "<value>"))
                .id(10L)
                .category(Category.builder()
                    .id(1L)
                    .name("Dogs")
                    .build())
                .build();

        UpdatePetResponse res = sdk.pet().update()
                .request(req)
                .call();

        if (res.pet().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
