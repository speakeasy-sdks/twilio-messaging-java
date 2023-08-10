# messagingV1ExternalCampaign

### Available Operations

* [createExternalCampaign](#createexternalcampaign)

## createExternalCampaign

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateExternalCampaignCreateExternalCampaignRequest;
import circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse;
import circl_dev.twilio_messaging.models.operations.CreateExternalCampaignSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateExternalCampaignCreateExternalCampaignRequest req = new CreateExternalCampaignCreateExternalCampaignRequest("ipsa", "reiciendis");            

            CreateExternalCampaignResponse res = sdk.messagingV1ExternalCampaign.createExternalCampaign(req, new CreateExternalCampaignSecurity("est", "mollitia") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ExternalCampaign != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                          | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                          | [circl_dev.twilio_messaging.models.operations.CreateExternalCampaignCreateExternalCampaignRequest](../../models/operations/CreateExternalCampaignCreateExternalCampaignRequest.md) | :heavy_check_mark:                                                                                                                                                                 | The request object to use for the request.                                                                                                                                         |
| `security`                                                                                                                                                                         | [circl_dev.twilio_messaging.models.operations.CreateExternalCampaignSecurity](../../models/operations/CreateExternalCampaignSecurity.md)                                           | :heavy_check_mark:                                                                                                                                                                 | The security requirements to use for the request.                                                                                                                                  |
| `serverURL`                                                                                                                                                                        | *String*                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                 | An optional server URL to use.                                                                                                                                                     |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse](../../models/operations/CreateExternalCampaignResponse.md)**

