# messagingV1PhoneNumber

### Available Operations

* [createPhoneNumber](#createphonenumber)
* [deletePhoneNumber](#deletephonenumber)
* [fetchPhoneNumber](#fetchphonenumber)
* [listPhoneNumber](#listphonenumber)

## createPhoneNumber

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreatePhoneNumberCreatePhoneNumberRequest;
import circl_dev.twilio_messaging.models.operations.CreatePhoneNumberRequest;
import circl_dev.twilio_messaging.models.operations.CreatePhoneNumberResponse;
import circl_dev.twilio_messaging.models.operations.CreatePhoneNumberSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreatePhoneNumberRequest req = new CreatePhoneNumberRequest("accusantium") {{
                requestBody = new CreatePhoneNumberCreatePhoneNumberRequest("iure");;
            }};            

            CreatePhoneNumberResponse res = sdk.messagingV1PhoneNumber.createPhoneNumber(req, new CreatePhoneNumberSecurity("culpa", "doloribus") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServicePhoneNumber != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.CreatePhoneNumberRequest](../../models/operations/CreatePhoneNumberRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.CreatePhoneNumberSecurity](../../models/operations/CreatePhoneNumberSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.CreatePhoneNumberResponse](../../models/operations/CreatePhoneNumberResponse.md)**


## deletePhoneNumber

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeletePhoneNumberRequest;
import circl_dev.twilio_messaging.models.operations.DeletePhoneNumberResponse;
import circl_dev.twilio_messaging.models.operations.DeletePhoneNumberSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeletePhoneNumberRequest req = new DeletePhoneNumberRequest("sapiente", "architecto");            

            DeletePhoneNumberResponse res = sdk.messagingV1PhoneNumber.deletePhoneNumber(req, new DeletePhoneNumberSecurity("mollitia", "dolorem") {{
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.DeletePhoneNumberRequest](../../models/operations/DeletePhoneNumberRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.DeletePhoneNumberSecurity](../../models/operations/DeletePhoneNumberSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.DeletePhoneNumberResponse](../../models/operations/DeletePhoneNumberResponse.md)**


## fetchPhoneNumber

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchPhoneNumberRequest;
import circl_dev.twilio_messaging.models.operations.FetchPhoneNumberResponse;
import circl_dev.twilio_messaging.models.operations.FetchPhoneNumberSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchPhoneNumberRequest req = new FetchPhoneNumberRequest("culpa", "consequuntur");            

            FetchPhoneNumberResponse res = sdk.messagingV1PhoneNumber.fetchPhoneNumber(req, new FetchPhoneNumberSecurity("repellat", "mollitia") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServicePhoneNumber != null) {
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
| `request`                                                                                                                    | [circl_dev.twilio_messaging.models.operations.FetchPhoneNumberRequest](../../models/operations/FetchPhoneNumberRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [circl_dev.twilio_messaging.models.operations.FetchPhoneNumberSecurity](../../models/operations/FetchPhoneNumberSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |
| `serverURL`                                                                                                                  | *String*                                                                                                                     | :heavy_minus_sign:                                                                                                           | An optional server URL to use.                                                                                               |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchPhoneNumberResponse](../../models/operations/FetchPhoneNumberResponse.md)**


## listPhoneNumber

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListPhoneNumberRequest;
import circl_dev.twilio_messaging.models.operations.ListPhoneNumberResponse;
import circl_dev.twilio_messaging.models.operations.ListPhoneNumberSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListPhoneNumberRequest req = new ListPhoneNumberRequest("occaecati") {{
                page = 253291L;
                pageSize = 414369L;
                pageToken = "quam";
            }};            

            ListPhoneNumberResponse res = sdk.messagingV1PhoneNumber.listPhoneNumber(req, new ListPhoneNumberSecurity("molestiae", "velit") {{
                password = "";
                username = "";
            }});

            if (res.listPhoneNumberResponse != null) {
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
| `request`                                                                                                                  | [circl_dev.twilio_messaging.models.operations.ListPhoneNumberRequest](../../models/operations/ListPhoneNumberRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [circl_dev.twilio_messaging.models.operations.ListPhoneNumberSecurity](../../models/operations/ListPhoneNumberSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `serverURL`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.ListPhoneNumberResponse](../../models/operations/ListPhoneNumberResponse.md)**

