# Orders
(*store().orders()*)

## Overview

### Available Operations

* [get](#get) - Find purchase order by ID

## get

For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions.

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.GetOrderByIdResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        GetOrderByIdResponse res = sdk.store().orders().get()
                .orderId(700347L)
                .call();

        if (res.order().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `orderId`                            | *long*                               | :heavy_check_mark:                   | ID of order that needs to be fetched |

### Response

**[GetOrderByIdResponse](../../models/operations/GetOrderByIdResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |