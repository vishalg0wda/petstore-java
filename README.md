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

Star Wars API: An API inspired by the Star Wars universe
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [openapi](#openapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'io.github.vishalg0wda:deathstar:0.5.0'
```

Maven:
```xml
<dependency>
    <groupId>io.github.vishalg0wda</groupId>
    <artifactId>deathstar</artifactId>
    <version>0.5.0</version>
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

import io.github.vishalg0wda.deathstar.Deathstar;
import io.github.vishalg0wda.deathstar.models.operations.GetJediResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Deathstar sdk = Deathstar.builder()
            .build();

        GetJediResponse res = sdk.jedi().get()
                .call();

        if (res.object().isPresent()) {
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


### [jedi()](docs/sdks/jedi/README.md)

* [get](docs/sdks/jedi/README.md#get) - Jedi endpoint

### [sith()](docs/sdks/sith/README.md)

* [get](docs/sdks/sith/README.md#get) - Sith endpoint

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `get` method throws the following exceptions:

| Error Type                 | Status Code | Content Type |
| -------------------------- | ----------- | ------------ |
| models/errors/APIException | 4XX, 5XX    | \*/\*        |

### Example

```java
package hello.world;

import io.github.vishalg0wda.deathstar.Deathstar;
import io.github.vishalg0wda.deathstar.models.operations.GetJediResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Deathstar sdk = Deathstar.builder()
            .build();

        GetJediResponse res = sdk.jedi().get()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import io.github.vishalg0wda.deathstar.Deathstar;
import io.github.vishalg0wda.deathstar.models.operations.GetJediResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Deathstar sdk = Deathstar.builder()
                .serverURL("http://localhost:8080")
            .build();

        GetJediResponse res = sdk.jedi().get()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->


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
