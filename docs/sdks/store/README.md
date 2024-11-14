# Store
(*store()*)

## Overview

Access to Petstore orders

Find out more about our store
<http://swagger.io>

### Available Operations

* [getInventory](#getinventory) - Returns pet inventories by status
* [placeOrder](#placeorder) - Place an order for a pet
* [deleteOrder](#deleteorder) - Delete purchase order by ID

## getInventory

Returns a map of status codes to quantities

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.GetInventoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        GetInventoryResponse res = sdk.store().getInventory()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetInventoryResponse](../../models/operations/GetInventoryResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## placeOrder

Place a new order in the store

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.components.Order;
import com.vgd.openapi.models.components.OrderStatus;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.PlaceOrderResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        Order req = Order.builder()
                .id(10L)
                .petId(198772L)
                .quantity(7)
                .status(OrderStatus.APPROVED)
                .build();

        PlaceOrderResponse res = sdk.store().placeOrder()
                .request(req)
                .call();

        if (res.order().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Order](../../models/shared/Order.md)      | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[PlaceOrderResponse](../../models/operations/PlaceOrderResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## deleteOrder

For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

### Example Usage

```java
package hello.world;

import com.vgd.openapi.Petstore;
import com.vgd.openapi.models.errors.ApiErrorInvalidInput;
import com.vgd.openapi.models.errors.ApiErrorNotFound;
import com.vgd.openapi.models.errors.ApiErrorUnauthorized;
import com.vgd.openapi.models.operations.DeleteOrderResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorInvalidInput, ApiErrorUnauthorized, ApiErrorNotFound, Exception {

        Petstore sdk = Petstore.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteOrderResponse res = sdk.store().deleteOrder()
                .orderId(127902L)
                .call();

        if (res.order().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orderId`                                | *long*                                   | :heavy_check_mark:                       | ID of the order that needs to be deleted |

### Response

**[DeleteOrderResponse](../../models/operations/DeleteOrderResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ApiErrorInvalidInput | 400                                | application/json                   |
| models/errors/ApiErrorUnauthorized | 401                                | application/json                   |
| models/errors/ApiErrorNotFound     | 404                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |