# messagingV1Deactivations

### Available Operations

* [fetchDeactivation](#fetchdeactivation) - Fetch a list of all United States numbers that have been deactivated on a specific date.

## fetchDeactivation

Fetch a list of all United States numbers that have been deactivated on a specific date.

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDeactivationRequest;
import circl_dev.twilio_messaging.models.operations.FetchDeactivationResponse;
import circl_dev.twilio_messaging.models.operations.FetchDeactivationSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDeactivationRequest req = new FetchDeactivationRequest() {{
                date = LocalDate.parse("2021-06-08");
            }};            

            FetchDeactivationResponse res = sdk.messagingV1Deactivations.fetchDeactivation(req, new FetchDeactivationSecurity("beatae", "commodi") {{
                password = "";
                username = "";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDeactivationRequest](../../models/operations/FetchDeactivationRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDeactivationSecurity](../../models/operations/FetchDeactivationSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDeactivationResponse](../../models/operations/FetchDeactivationResponse.md)**

