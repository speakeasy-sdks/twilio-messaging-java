# messagingV1BrandRegistration

### Available Operations

* [createBrandRegistrations](#createbrandregistrations)
* [fetchBrandRegistrations](#fetchbrandregistrations)
* [listBrandRegistrations](#listbrandregistrations)
* [updateBrandRegistrations](#updatebrandregistrations)

## createBrandRegistrations

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationsCreateBrandRegistrationsRequest;
import circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationsResponse;
import circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateBrandRegistrationsCreateBrandRegistrationsRequest req = new CreateBrandRegistrationsCreateBrandRegistrationsRequest("voluptatum", "iusto") {{
                brandType = "excepturi";
                mock = false;
                skipAutomaticSecVet = false;
            }};            

            CreateBrandRegistrationsResponse res = sdk.messagingV1BrandRegistration.createBrandRegistrations(req, new CreateBrandRegistrationsSecurity("nisi", "recusandae") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1BrandRegistrations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                  | Type                                                                                                                                                                                       | Required                                                                                                                                                                                   | Description                                                                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                                  | [circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationsCreateBrandRegistrationsRequest](../../models/operations/CreateBrandRegistrationsCreateBrandRegistrationsRequest.md) | :heavy_check_mark:                                                                                                                                                                         | The request object to use for the request.                                                                                                                                                 |
| `security`                                                                                                                                                                                 | [circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationsSecurity](../../models/operations/CreateBrandRegistrationsSecurity.md)                                               | :heavy_check_mark:                                                                                                                                                                         | The security requirements to use for the request.                                                                                                                                          |
| `serverURL`                                                                                                                                                                                | *String*                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                         | An optional server URL to use.                                                                                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationsResponse](../../models/operations/CreateBrandRegistrationsResponse.md)**


## fetchBrandRegistrations

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchBrandRegistrationsRequest;
import circl_dev.twilio_messaging.models.operations.FetchBrandRegistrationsResponse;
import circl_dev.twilio_messaging.models.operations.FetchBrandRegistrationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchBrandRegistrationsRequest req = new FetchBrandRegistrationsRequest("temporibus");            

            FetchBrandRegistrationsResponse res = sdk.messagingV1BrandRegistration.fetchBrandRegistrations(req, new FetchBrandRegistrationsSecurity("ab", "quis") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1BrandRegistrations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [circl_dev.twilio_messaging.models.operations.FetchBrandRegistrationsRequest](../../models/operations/FetchBrandRegistrationsRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [circl_dev.twilio_messaging.models.operations.FetchBrandRegistrationsSecurity](../../models/operations/FetchBrandRegistrationsSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |
| `serverURL`                                                                                                                                | *String*                                                                                                                                   | :heavy_minus_sign:                                                                                                                         | An optional server URL to use.                                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchBrandRegistrationsResponse](../../models/operations/FetchBrandRegistrationsResponse.md)**


## listBrandRegistrations

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListBrandRegistrationsRequest;
import circl_dev.twilio_messaging.models.operations.ListBrandRegistrationsResponse;
import circl_dev.twilio_messaging.models.operations.ListBrandRegistrationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListBrandRegistrationsRequest req = new ListBrandRegistrationsRequest() {{
                page = 87129L;
                pageSize = 648172L;
                pageToken = "perferendis";
            }};            

            ListBrandRegistrationsResponse res = sdk.messagingV1BrandRegistration.listBrandRegistrations(req, new ListBrandRegistrationsSecurity("ipsam", "repellendus") {{
                password = "";
                username = "";
            }});

            if (res.listBrandRegistrationsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [circl_dev.twilio_messaging.models.operations.ListBrandRegistrationsRequest](../../models/operations/ListBrandRegistrationsRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [circl_dev.twilio_messaging.models.operations.ListBrandRegistrationsSecurity](../../models/operations/ListBrandRegistrationsSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |
| `serverURL`                                                                                                                              | *String*                                                                                                                                 | :heavy_minus_sign:                                                                                                                       | An optional server URL to use.                                                                                                           |


### Response

**[circl_dev.twilio_messaging.models.operations.ListBrandRegistrationsResponse](../../models/operations/ListBrandRegistrationsResponse.md)**


## updateBrandRegistrations

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.UpdateBrandRegistrationsRequest;
import circl_dev.twilio_messaging.models.operations.UpdateBrandRegistrationsResponse;
import circl_dev.twilio_messaging.models.operations.UpdateBrandRegistrationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            UpdateBrandRegistrationsRequest req = new UpdateBrandRegistrationsRequest("sapiente");            

            UpdateBrandRegistrationsResponse res = sdk.messagingV1BrandRegistration.updateBrandRegistrations(req, new UpdateBrandRegistrationsSecurity("quo", "odit") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1BrandRegistrations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [circl_dev.twilio_messaging.models.operations.UpdateBrandRegistrationsRequest](../../models/operations/UpdateBrandRegistrationsRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [circl_dev.twilio_messaging.models.operations.UpdateBrandRegistrationsSecurity](../../models/operations/UpdateBrandRegistrationsSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |
| `serverURL`                                                                                                                                  | *String*                                                                                                                                     | :heavy_minus_sign:                                                                                                                           | An optional server URL to use.                                                                                                               |


### Response

**[circl_dev.twilio_messaging.models.operations.UpdateBrandRegistrationsResponse](../../models/operations/UpdateBrandRegistrationsResponse.md)**

