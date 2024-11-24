# Jedi
(*jedi()*)

## Overview

### Available Operations

* [get](#get) - Jedi endpoint

## get

Returns a message from a Jedi

### Example Usage

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

### Response

**[GetJediResponse](../../models/operations/GetJediResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |