# messagingV1LinkshorteningMessagingServiceDomainAssociation

### Available Operations

* [fetchLinkshorteningMessagingServiceDomainAssociation](#fetchlinkshorteningmessagingservicedomainassociation)

## fetchLinkshorteningMessagingServiceDomainAssociation

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationRequest;
import circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationResponse;
import circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchLinkshorteningMessagingServiceDomainAssociationRequest req = new FetchLinkshorteningMessagingServiceDomainAssociationRequest("nemo");            

            FetchLinkshorteningMessagingServiceDomainAssociationResponse res = sdk.messagingV1LinkshorteningMessagingServiceDomainAssociation.fetchLinkshorteningMessagingServiceDomainAssociation(req, new FetchLinkshorteningMessagingServiceDomainAssociationSecurity("minima", "excepturi") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1LinkshorteningMessagingServiceDomainAssociation != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                            | Type                                                                                                                                                                                                 | Required                                                                                                                                                                                             | Description                                                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                            | [circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationRequest](../../models/operations/FetchLinkshorteningMessagingServiceDomainAssociationRequest.md)   | :heavy_check_mark:                                                                                                                                                                                   | The request object to use for the request.                                                                                                                                                           |
| `security`                                                                                                                                                                                           | [circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationSecurity](../../models/operations/FetchLinkshorteningMessagingServiceDomainAssociationSecurity.md) | :heavy_check_mark:                                                                                                                                                                                   | The security requirements to use for the request.                                                                                                                                                    |
| `serverURL`                                                                                                                                                                                          | *String*                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                   | An optional server URL to use.                                                                                                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationResponse](../../models/operations/FetchLinkshorteningMessagingServiceDomainAssociationResponse.md)**

