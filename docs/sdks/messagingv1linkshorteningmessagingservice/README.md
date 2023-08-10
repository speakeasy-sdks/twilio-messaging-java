# messagingV1LinkshorteningMessagingService

### Available Operations

* [createLinkshorteningMessagingService](#createlinkshorteningmessagingservice)
* [deleteLinkshorteningMessagingService](#deletelinkshorteningmessagingservice)

## createLinkshorteningMessagingService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceRequest;
import circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceResponse;
import circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateLinkshorteningMessagingServiceRequest req = new CreateLinkshorteningMessagingServiceRequest("laborum", "dolores");            

            CreateLinkshorteningMessagingServiceResponse res = sdk.messagingV1LinkshorteningMessagingService.createLinkshorteningMessagingService(req, new CreateLinkshorteningMessagingServiceSecurity("dolorem", "corporis") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1LinkshorteningMessagingService != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceRequest](../../models/operations/CreateLinkshorteningMessagingServiceRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceSecurity](../../models/operations/CreateLinkshorteningMessagingServiceSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |
| `serverURL`                                                                                                                                                          | *String*                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                   | An optional server URL to use.                                                                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceResponse](../../models/operations/CreateLinkshorteningMessagingServiceResponse.md)**


## deleteLinkshorteningMessagingService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceRequest;
import circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceResponse;
import circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteLinkshorteningMessagingServiceRequest req = new DeleteLinkshorteningMessagingServiceRequest("explicabo", "nobis");            

            DeleteLinkshorteningMessagingServiceResponse res = sdk.messagingV1LinkshorteningMessagingService.deleteLinkshorteningMessagingService(req, new DeleteLinkshorteningMessagingServiceSecurity("enim", "omnis") {{
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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceRequest](../../models/operations/DeleteLinkshorteningMessagingServiceRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceSecurity](../../models/operations/DeleteLinkshorteningMessagingServiceSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |
| `serverURL`                                                                                                                                                          | *String*                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                   | An optional server URL to use.                                                                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceResponse](../../models/operations/DeleteLinkshorteningMessagingServiceResponse.md)**

