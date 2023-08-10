# messagingV1UsAppToPerson

### Available Operations

* [createUsAppToPerson](#createusapptoperson)
* [deleteUsAppToPerson](#deleteusapptoperson)
* [fetchUsAppToPerson](#fetchusapptoperson)
* [listUsAppToPerson](#listusapptoperson)

## createUsAppToPerson

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateUsAppToPersonCreateUsAppToPersonRequest;
import circl_dev.twilio_messaging.models.operations.CreateUsAppToPersonRequest;
import circl_dev.twilio_messaging.models.operations.CreateUsAppToPersonResponse;
import circl_dev.twilio_messaging.models.operations.CreateUsAppToPersonSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateUsAppToPersonRequest req = new CreateUsAppToPersonRequest("labore") {{
                requestBody = new CreateUsAppToPersonCreateUsAppToPersonRequest("labore", "suscipit", false, false, "natus",                 new String[]{{
                                    add("eum"),
                                    add("vero"),
                                    add("aspernatur"),
                                }}, "architecto") {{
                    helpKeywords = new String[]{{
                        add("et"),
                        add("excepturi"),
                    }};
                    helpMessage = "ullam";
                    optInKeywords = new String[]{{
                        add("quos"),
                        add("sint"),
                        add("accusantium"),
                    }};
                    optInMessage = "mollitia";
                    optOutKeywords = new String[]{{
                        add("mollitia"),
                        add("ad"),
                        add("eum"),
                        add("dolor"),
                    }};
                    optOutMessage = "necessitatibus";
                }};;
            }};            

            CreateUsAppToPersonResponse res = sdk.messagingV1UsAppToPerson.createUsAppToPerson(req, new CreateUsAppToPersonSecurity("odit", "nemo") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceUsAppToPerson != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [circl_dev.twilio_messaging.models.operations.CreateUsAppToPersonRequest](../../models/operations/CreateUsAppToPersonRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [circl_dev.twilio_messaging.models.operations.CreateUsAppToPersonSecurity](../../models/operations/CreateUsAppToPersonSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `serverURL`                                                                                                                        | *String*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateUsAppToPersonResponse](../../models/operations/CreateUsAppToPersonResponse.md)**


## deleteUsAppToPerson

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteUsAppToPersonRequest;
import circl_dev.twilio_messaging.models.operations.DeleteUsAppToPersonResponse;
import circl_dev.twilio_messaging.models.operations.DeleteUsAppToPersonSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteUsAppToPersonRequest req = new DeleteUsAppToPersonRequest("quasi", "iure");            

            DeleteUsAppToPersonResponse res = sdk.messagingV1UsAppToPerson.deleteUsAppToPerson(req, new DeleteUsAppToPersonSecurity("doloribus", "debitis") {{
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [circl_dev.twilio_messaging.models.operations.DeleteUsAppToPersonRequest](../../models/operations/DeleteUsAppToPersonRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [circl_dev.twilio_messaging.models.operations.DeleteUsAppToPersonSecurity](../../models/operations/DeleteUsAppToPersonSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |
| `serverURL`                                                                                                                        | *String*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | An optional server URL to use.                                                                                                     |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteUsAppToPersonResponse](../../models/operations/DeleteUsAppToPersonResponse.md)**


## fetchUsAppToPerson

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonRequest;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonResponse;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchUsAppToPersonRequest req = new FetchUsAppToPersonRequest("eius", "maxime");            

            FetchUsAppToPersonResponse res = sdk.messagingV1UsAppToPerson.fetchUsAppToPerson(req, new FetchUsAppToPersonSecurity("deleniti", "facilis") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceUsAppToPerson != null) {
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
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonRequest](../../models/operations/FetchUsAppToPersonRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonSecurity](../../models/operations/FetchUsAppToPersonSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonResponse](../../models/operations/FetchUsAppToPersonResponse.md)**


## listUsAppToPerson

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListUsAppToPersonRequest;
import circl_dev.twilio_messaging.models.operations.ListUsAppToPersonResponse;
import circl_dev.twilio_messaging.models.operations.ListUsAppToPersonSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListUsAppToPersonRequest req = new ListUsAppToPersonRequest("in") {{
                page = 100226L;
                pageSize = 99569L;
                pageToken = "repudiandae";
            }};            

            ListUsAppToPersonResponse res = sdk.messagingV1UsAppToPerson.listUsAppToPerson(req, new ListUsAppToPersonSecurity("ullam", "expedita") {{
                password = "";
                username = "";
            }});

            if (res.listUsAppToPersonResponse != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.ListUsAppToPersonRequest](../../models/operations/ListUsAppToPersonRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.ListUsAppToPersonSecurity](../../models/operations/ListUsAppToPersonSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.ListUsAppToPersonResponse](../../models/operations/ListUsAppToPersonResponse.md)**

