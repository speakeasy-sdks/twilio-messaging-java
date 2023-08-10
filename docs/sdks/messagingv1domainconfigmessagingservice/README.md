# messagingV1DomainConfigMessagingService

### Available Operations

* [fetchDomainConfigMessagingService](#fetchdomainconfigmessagingservice)

## fetchDomainConfigMessagingService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceRequest;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceResponse;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDomainConfigMessagingServiceRequest req = new FetchDomainConfigMessagingServiceRequest("saepe");            

            FetchDomainConfigMessagingServiceResponse res = sdk.messagingV1DomainConfigMessagingService.fetchDomainConfigMessagingService(req, new FetchDomainConfigMessagingServiceSecurity("quidem", "architecto") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainConfigMessagingService != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceRequest](../../models/operations/FetchDomainConfigMessagingServiceRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceSecurity](../../models/operations/FetchDomainConfigMessagingServiceSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |
| `serverURL`                                                                                                                                                    | *String*                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                             | An optional server URL to use.                                                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceResponse](../../models/operations/FetchDomainConfigMessagingServiceResponse.md)**

