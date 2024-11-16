# Pet
(*pet()*)

## Overview

Everything about your Pets

Find out more
<http://swagger.io>

### Available Operations

* [update](#update) - Update an existing pet
* [add](#add) - Add a new pet to the store
* [findByStatus](#findbystatus) - Finds Pets by status
* [findByTags](#findbytags) - Finds Pets by tags
* [getById](#getbyid) - Find pet by ID
* [delete](#delete) - Deletes a pet
* [uploadFile](#uploadfile) - uploads an image

## update

Update an existing pet by Id

### Example Usage

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

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Pet](../../models/shared/Pet.md)          | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[UpdatePetResponse](../../models/operations/UpdatePetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## add

Add a new pet to the store

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.Category;
import com.vgd.openapi.models.components.Pet;
import com.vgd.openapi.models.operations.AddPetResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

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

        AddPetResponse res = sdk.pet().add()
                .request(req)
                .call();

        if (res.pet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Pet](../../models/shared/Pet.md)          | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[AddPetResponse](../../models/operations/AddPetResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## findByStatus

Multiple status values can be provided with comma separated strings

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.FindPetsByStatusResponse;
import com.vgd.openapi.models.operations.Status;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        FindPetsByStatusResponse res = sdk.pet().findByStatus()
                .status(Status.AVAILABLE)
                .call();

        if (res.pets().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `status`                                               | [Optional\<Status>](../../models/operations/Status.md) | :heavy_minus_sign:                                     | Status values that need to be considered for filter    |

### Response

**[FindPetsByStatusResponse](../../models/operations/FindPetsByStatusResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## findByTags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.FindPetsByTagsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        FindPetsByTagsResponse res = sdk.pet().findByTags()
                .tags(List.of(
                    "<value>"))
                .call();

        if (res.pets().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `tags`             | List\<*String*>    | :heavy_minus_sign: | Tags to filter by  |

### Response

**[FindPetsByTagsResponse](../../models/operations/FindPetsByTagsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## getById

Returns a single pet

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.GetPetByIdResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        GetPetByIdResponse res = sdk.pet().getById()
                .petId(276218L)
                .call();

        if (res.pet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `petId`             | *long*              | :heavy_check_mark:  | ID of pet to return |

### Response

**[GetPetByIdResponse](../../models/operations/GetPetByIdResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## delete

Deletes a pet

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.DeletePetResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        DeletePetResponse res = sdk.pet().delete()
                .apiKey("<value>")
                .petId(545907L)
                .call();

        if (res.pet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `apiKey`            | *Optional\<String>* | :heavy_minus_sign:  | N/A                 |
| `petId`             | *long*              | :heavy_check_mark:  | Pet id to delete    |

### Response

**[DeletePetResponse](../../models/operations/DeletePetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## uploadFile

uploads an image

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.operations.UploadFileResponse;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        UploadFileResponse res = sdk.pet().uploadFile()
                .petId(565380L)
                .additionalMetadata("<value>")
                .requestBody("0xcaF7dB59f9".getBytes(StandardCharsets.UTF_8))
                .call();

        if (res.apiResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `petId`              | *long*               | :heavy_check_mark:   | ID of pet to update  |
| `additionalMetadata` | *Optional\<String>*  | :heavy_minus_sign:   | Additional Metadata  |
| `requestBody`        | *Optional\<byte[]>*  | :heavy_minus_sign:   | N/A                  |

### Response

**[UploadFileResponse](../../models/operations/UploadFileResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |