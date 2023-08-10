# messagingV1ShortCode

### Available Operations

* [createShortCode](#createshortcode)
* [deleteShortCode](#deleteshortcode)
* [fetchShortCode](#fetchshortcode)
* [listShortCode](#listshortcode)

## createShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeCreateShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateShortCodeRequest req = new CreateShortCodeRequest("praesentium") {{
                requestBody = new CreateShortCodeCreateShortCodeRequest("rem");;
            }};            

            CreateShortCodeResponse res = sdk.messagingV1ShortCode.createShortCode(req, new CreateShortCodeSecurity("voluptates", "quasi") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceShortCode != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [circl_dev.twilio_messaging.models.operations.CreateShortCodeRequest](../../models/operations/CreateShortCodeRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [circl_dev.twilio_messaging.models.operations.CreateShortCodeSecurity](../../models/operations/CreateShortCodeSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `serverURL`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateShortCodeResponse](../../models/operations/CreateShortCodeResponse.md)**


## deleteShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.DeleteShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.DeleteShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteShortCodeRequest req = new DeleteShortCodeRequest("repudiandae", "sint");            

            DeleteShortCodeResponse res = sdk.messagingV1ShortCode.deleteShortCode(req, new DeleteShortCodeSecurity("veritatis", "itaque") {{
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [circl_dev.twilio_messaging.models.operations.DeleteShortCodeRequest](../../models/operations/DeleteShortCodeRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [circl_dev.twilio_messaging.models.operations.DeleteShortCodeSecurity](../../models/operations/DeleteShortCodeSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `serverURL`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteShortCodeResponse](../../models/operations/DeleteShortCodeResponse.md)**


## fetchShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.FetchShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.FetchShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchShortCodeRequest req = new FetchShortCodeRequest("incidunt", "enim");            

            FetchShortCodeResponse res = sdk.messagingV1ShortCode.fetchShortCode(req, new FetchShortCodeSecurity("consequatur", "est") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceShortCode != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [circl_dev.twilio_messaging.models.operations.FetchShortCodeRequest](../../models/operations/FetchShortCodeRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [circl_dev.twilio_messaging.models.operations.FetchShortCodeSecurity](../../models/operations/FetchShortCodeSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |
| `serverURL`                                                                                                              | *String*                                                                                                                 | :heavy_minus_sign:                                                                                                       | An optional server URL to use.                                                                                           |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchShortCodeResponse](../../models/operations/FetchShortCodeResponse.md)**


## listShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.ListShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.ListShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListShortCodeRequest req = new ListShortCodeRequest("quibusdam") {{
                page = 131797L;
                pageSize = 647174L;
                pageToken = "distinctio";
            }};            

            ListShortCodeResponse res = sdk.messagingV1ShortCode.listShortCode(req, new ListShortCodeSecurity("quibusdam", "labore") {{
                password = "";
                username = "";
            }});

            if (res.listShortCodeResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [circl_dev.twilio_messaging.models.operations.ListShortCodeRequest](../../models/operations/ListShortCodeRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [circl_dev.twilio_messaging.models.operations.ListShortCodeSecurity](../../models/operations/ListShortCodeSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |
| `serverURL`                                                                                                            | *String*                                                                                                               | :heavy_minus_sign:                                                                                                     | An optional server URL to use.                                                                                         |


### Response

**[circl_dev.twilio_messaging.models.operations.ListShortCodeResponse](../../models/operations/ListShortCodeResponse.md)**

