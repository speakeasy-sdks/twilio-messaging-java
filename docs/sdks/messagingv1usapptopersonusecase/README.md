# messagingV1UsAppToPersonUsecase

### Available Operations

* [fetchUsAppToPersonUsecase](#fetchusapptopersonusecase)

## fetchUsAppToPersonUsecase

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseRequest;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseResponse;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchUsAppToPersonUsecaseRequest req = new FetchUsAppToPersonUsecaseRequest("nihil") {{
                brandRegistrationSid = "repellat";
            }};            

            FetchUsAppToPersonUsecaseResponse res = sdk.messagingV1UsAppToPersonUsecase.fetchUsAppToPersonUsecase(req, new FetchUsAppToPersonUsecaseSecurity("quibusdam", "sed") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceUsAppToPersonUsecase != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseRequest](../../models/operations/FetchUsAppToPersonUsecaseRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseSecurity](../../models/operations/FetchUsAppToPersonUsecaseSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |
| `serverURL`                                                                                                                                    | *String*                                                                                                                                       | :heavy_minus_sign:                                                                                                                             | An optional server URL to use.                                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseResponse](../../models/operations/FetchUsAppToPersonUsecaseResponse.md)**

