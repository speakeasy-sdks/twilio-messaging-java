# messagingV1Usecase

### Available Operations

* [fetchUsecase](#fetchusecase)

## fetchUsecase

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse;
import circl_dev.twilio_messaging.models.operations.FetchUsecaseSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchUsecaseResponse res = sdk.messagingV1Usecase.fetchUsecase(new FetchUsecaseSecurity("saepe", "pariatur") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1Usecase != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                           | [circl_dev.twilio_messaging.models.operations.FetchUsecaseSecurity](../../models/operations/FetchUsecaseSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |
| `serverURL`                                                                                                          | *String*                                                                                                             | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse](../../models/operations/FetchUsecaseResponse.md)**

