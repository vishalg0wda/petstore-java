<!-- Start SDK Example Usage [usage] -->
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