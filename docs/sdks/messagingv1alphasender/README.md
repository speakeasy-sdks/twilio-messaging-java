# messagingV1AlphaSender

### Available Operations

* [createAlphaSender](#createalphasender)
* [deleteAlphaSender](#deletealphasender)
* [fetchAlphaSender](#fetchalphasender)
* [listAlphaSender](#listalphasender)

## createAlphaSender

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateAlphaSenderCreateAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.CreateAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.CreateAlphaSenderResponse;
import circl_dev.twilio_messaging.models.operations.CreateAlphaSenderSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateAlphaSenderRequest req = new CreateAlphaSenderRequest("unde") {{
                requestBody = new CreateAlphaSenderCreateAlphaSenderRequest("nulla");;
            }};            

            CreateAlphaSenderResponse res = sdk.messagingV1AlphaSender.createAlphaSender(req, new CreateAlphaSenderSecurity("corrupti", "illum") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceAlphaSender != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.CreateAlphaSenderRequest](../../models/operations/CreateAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.CreateAlphaSenderSecurity](../../models/operations/CreateAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateAlphaSenderResponse](../../models/operations/CreateAlphaSenderResponse.md)**


## deleteAlphaSender

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderResponse;
import circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteAlphaSenderRequest req = new DeleteAlphaSenderRequest("vel", "error");            

            DeleteAlphaSenderResponse res = sdk.messagingV1AlphaSender.deleteAlphaSender(req, new DeleteAlphaSenderSecurity("deserunt", "suscipit") {{
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderRequest](../../models/operations/DeleteAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderSecurity](../../models/operations/DeleteAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderResponse](../../models/operations/DeleteAlphaSenderResponse.md)**


## fetchAlphaSender

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.FetchAlphaSenderResponse;
import circl_dev.twilio_messaging.models.operations.FetchAlphaSenderSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchAlphaSenderRequest req = new FetchAlphaSenderRequest("iure", "magnam");            

            FetchAlphaSenderResponse res = sdk.messagingV1AlphaSender.fetchAlphaSender(req, new FetchAlphaSenderSecurity("debitis", "ipsa") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceAlphaSender != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [circl_dev.twilio_messaging.models.operations.FetchAlphaSenderRequest](../../models/operations/FetchAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [circl_dev.twilio_messaging.models.operations.FetchAlphaSenderSecurity](../../models/operations/FetchAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |
| `serverURL`                                                                                                                  | *String*                                                                                                                     | :heavy_minus_sign:                                                                                                           | An optional server URL to use.                                                                                               |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchAlphaSenderResponse](../../models/operations/FetchAlphaSenderResponse.md)**


## listAlphaSender

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.ListAlphaSenderResponse;
import circl_dev.twilio_messaging.models.operations.ListAlphaSenderSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListAlphaSenderRequest req = new ListAlphaSenderRequest("delectus") {{
                page = 272656L;
                pageSize = 383441L;
                pageToken = "molestiae";
            }};            

            ListAlphaSenderResponse res = sdk.messagingV1AlphaSender.listAlphaSender(req, new ListAlphaSenderSecurity("minus", "placeat") {{
                password = "";
                username = "";
            }});

            if (res.listAlphaSenderResponse != null) {
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
| `request`                                                                                                                  | [circl_dev.twilio_messaging.models.operations.ListAlphaSenderRequest](../../models/operations/ListAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [circl_dev.twilio_messaging.models.operations.ListAlphaSenderSecurity](../../models/operations/ListAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `serverURL`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.ListAlphaSenderResponse](../../models/operations/ListAlphaSenderResponse.md)**

