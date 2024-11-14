<!-- Start SDK Example Usage [usage] -->
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