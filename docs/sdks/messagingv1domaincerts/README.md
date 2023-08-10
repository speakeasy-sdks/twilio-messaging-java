# messagingV1DomainCerts

### Available Operations

* [deleteDomainCertV4](#deletedomaincertv4)
* [fetchDomainCertV4](#fetchdomaincertv4)
* [updateDomainCertV4](#updatedomaincertv4)

## deleteDomainCertV4

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Request;
import circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Response;
import circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Security;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteDomainCertV4Request req = new DeleteDomainCertV4Request("molestiae");            

            DeleteDomainCertV4Response res = sdk.messagingV1DomainCerts.deleteDomainCertV4(req, new DeleteDomainCertV4Security("modi", "qui") {{
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Request](../../models/operations/DeleteDomainCertV4Request.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Security](../../models/operations/DeleteDomainCertV4Security.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Response](../../models/operations/DeleteDomainCertV4Response.md)**


## fetchDomainCertV4

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Request;
import circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Response;
import circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Security;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDomainCertV4Request req = new FetchDomainCertV4Request("impedit");            

            FetchDomainCertV4Response res = sdk.messagingV1DomainCerts.fetchDomainCertV4(req, new FetchDomainCertV4Security("cum", "esse") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainCertV4 != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Request](../../models/operations/FetchDomainCertV4Request.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Security](../../models/operations/FetchDomainCertV4Security.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Response](../../models/operations/FetchDomainCertV4Response.md)**


## updateDomainCertV4

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Request;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Response;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Security;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4UpdateDomainCertV4Request;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            UpdateDomainCertV4Request req = new UpdateDomainCertV4Request("ipsum") {{
                requestBody = new UpdateDomainCertV4UpdateDomainCertV4Request("excepturi");;
            }};            

            UpdateDomainCertV4Response res = sdk.messagingV1DomainCerts.updateDomainCertV4(req, new UpdateDomainCertV4Security("aspernatur", "perferendis") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainCertV4 != null) {
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
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Request](../../models/operations/UpdateDomainCertV4Request.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Security](../../models/operations/UpdateDomainCertV4Security.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Response](../../models/operations/UpdateDomainCertV4Response.md)**

