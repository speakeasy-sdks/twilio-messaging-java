# messagingV1DomainConfig

### Available Operations

* [fetchDomainConfig](#fetchdomainconfig)
* [updateDomainConfig](#updatedomainconfig)

## fetchDomainConfig

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigRequest;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDomainConfigRequest req = new FetchDomainConfigRequest("ad");            

            FetchDomainConfigResponse res = sdk.messagingV1DomainConfig.fetchDomainConfig(req, new FetchDomainConfigSecurity("natus", "sed") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainConfig != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigRequest](../../models/operations/FetchDomainConfigRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigSecurity](../../models/operations/FetchDomainConfigSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse](../../models/operations/FetchDomainConfigResponse.md)**


## updateDomainConfig

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigRequest;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigSecurity;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigUpdateDomainConfigRequest;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            UpdateDomainConfigRequest req = new UpdateDomainConfigRequest("iste") {{
                requestBody = new UpdateDomainConfigUpdateDomainConfigRequest() {{
                    callbackUrl = "http://periodic-glasses.org";
                    continueOnFailure = false;
                    disableHttps = false;
                    fallbackUrl = "https://reckless-illustration.info";
                }};;
            }};            

            UpdateDomainConfigResponse res = sdk.messagingV1DomainConfig.updateDomainConfig(req, new UpdateDomainConfigSecurity("iste", "iure") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainConfig != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.UpdateDomainConfigRequest](../../models/operations/UpdateDomainConfigRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.UpdateDomainConfigSecurity](../../models/operations/UpdateDomainConfigSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse](../../models/operations/UpdateDomainConfigResponse.md)**

