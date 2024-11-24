# Sith
(*sith()*)

## Overview

### Available Operations

* [get](#get) - Sith endpoint

## get

Returns a message from a Sith

### Example Usage

```java
package hello.world;

import io.github.vishalg0wda.deathstar.Deathstar;
import io.github.vishalg0wda.deathstar.models.operations.GetSithResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Deathstar sdk = Deathstar.builder()
            .build();

        GetSithResponse res = sdk.sith().get()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetSithResponse](../../models/operations/GetSithResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |