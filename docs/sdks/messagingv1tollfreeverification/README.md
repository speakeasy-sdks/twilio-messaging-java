# messagingV1TollfreeVerification

### Available Operations

* [createTollfreeVerification](#createtollfreeverification)
* [fetchTollfreeVerification](#fetchtollfreeverification)
* [listTollfreeVerification](#listtollfreeverification)
* [updateTollfreeVerification](#updatetollfreeverification)

## createTollfreeVerification

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationCreateTollfreeVerificationRequest;
import circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationResponse;
import circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationSecurity;
import circl_dev.twilio_messaging.models.shared.TollfreeVerificationEnumOptInType;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateTollfreeVerificationCreateTollfreeVerificationRequest req = new CreateTollfreeVerificationCreateTollfreeVerificationRequest("modi", "qui", "aliquid", "cupiditate",                 new String[]{{
                                add("perferendis"),
                                add("magni"),
                                add("assumenda"),
                            }}, TollfreeVerificationEnumOptInType.WEB_FORM, "alias", "fugit",                 new String[]{{
                                add("excepturi"),
                                add("tempora"),
                                add("facilis"),
                            }}, "tempore") {{
                additionalInformation = "labore";
                businessCity = "delectus";
                businessContactEmail = "eum";
                businessContactFirstName = "non";
                businessContactLastName = "eligendi";
                businessContactPhone = "sint";
                businessCountry = "aliquid";
                businessPostalCode = "provident";
                businessStateProvinceRegion = "necessitatibus";
                businessStreetAddress = "sint";
                businessStreetAddress2 = "officia";
                customerProfileSid = "dolor";
                externalReferenceId = "debitis";
            }};            

            CreateTollfreeVerificationResponse res = sdk.messagingV1TollfreeVerification.createTollfreeVerification(req, new CreateTollfreeVerificationSecurity("a", "dolorum") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1TollfreeVerification != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                          | Type                                                                                                                                                                                               | Required                                                                                                                                                                                           | Description                                                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                          | [circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationCreateTollfreeVerificationRequest](../../models/operations/CreateTollfreeVerificationCreateTollfreeVerificationRequest.md) | :heavy_check_mark:                                                                                                                                                                                 | The request object to use for the request.                                                                                                                                                         |
| `security`                                                                                                                                                                                         | [circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationSecurity](../../models/operations/CreateTollfreeVerificationSecurity.md)                                                   | :heavy_check_mark:                                                                                                                                                                                 | The security requirements to use for the request.                                                                                                                                                  |
| `serverURL`                                                                                                                                                                                        | *String*                                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                                 | An optional server URL to use.                                                                                                                                                                     |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationResponse](../../models/operations/CreateTollfreeVerificationResponse.md)**


## fetchTollfreeVerification

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationRequest;
import circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationResponse;
import circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchTollfreeVerificationRequest req = new FetchTollfreeVerificationRequest("in");            

            FetchTollfreeVerificationResponse res = sdk.messagingV1TollfreeVerification.fetchTollfreeVerification(req, new FetchTollfreeVerificationSecurity("in", "illum") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1TollfreeVerification != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationRequest](../../models/operations/FetchTollfreeVerificationRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationSecurity](../../models/operations/FetchTollfreeVerificationSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |
| `serverURL`                                                                                                                                    | *String*                                                                                                                                       | :heavy_minus_sign:                                                                                                                             | An optional server URL to use.                                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationResponse](../../models/operations/FetchTollfreeVerificationResponse.md)**


## listTollfreeVerification

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationRequest;
import circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationResponse;
import circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationSecurity;
import circl_dev.twilio_messaging.models.shared.TollfreeVerificationEnumStatus;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListTollfreeVerificationRequest req = new ListTollfreeVerificationRequest() {{
                page = 978571L;
                pageSize = 699479L;
                pageToken = "dicta";
                status = TollfreeVerificationEnumStatus.IN_REVIEW;
                tollfreePhoneNumberSid = "cumque";
            }};            

            ListTollfreeVerificationResponse res = sdk.messagingV1TollfreeVerification.listTollfreeVerification(req, new ListTollfreeVerificationSecurity("facere", "ea") {{
                password = "";
                username = "";
            }});

            if (res.listTollfreeVerificationResponse != null) {
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
| `request`                                                                                                                                    | [circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationRequest](../../models/operations/ListTollfreeVerificationRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationSecurity](../../models/operations/ListTollfreeVerificationSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |
| `serverURL`                                                                                                                                  | *String*                                                                                                                                     | :heavy_minus_sign:                                                                                                                           | An optional server URL to use.                                                                                                               |


### Response

**[circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationResponse](../../models/operations/ListTollfreeVerificationResponse.md)**


## updateTollfreeVerification

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationRequest;
import circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationResponse;
import circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationSecurity;
import circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationUpdateTollfreeVerificationRequest;
import circl_dev.twilio_messaging.models.shared.TollfreeVerificationEnumOptInType;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            UpdateTollfreeVerificationRequest req = new UpdateTollfreeVerificationRequest("aliquid") {{
                requestBody = new UpdateTollfreeVerificationUpdateTollfreeVerificationRequest() {{
                    additionalInformation = "laborum";
                    businessCity = "accusamus";
                    businessContactEmail = "non";
                    businessContactFirstName = "occaecati";
                    businessContactLastName = "enim";
                    businessContactPhone = "accusamus";
                    businessCountry = "delectus";
                    businessName = "quidem";
                    businessPostalCode = "provident";
                    businessStateProvinceRegion = "nam";
                    businessStreetAddress = "id";
                    businessStreetAddress2 = "blanditiis";
                    businessWebsite = "deleniti";
                    messageVolume = "sapiente";
                    notificationEmail = "amet";
                    optInImageUrls = new String[]{{
                        add("nisi"),
                        add("vel"),
                        add("natus"),
                    }};
                    optInType = TollfreeVerificationEnumOptInType.VIA_TEXT;
                    productionMessageSample = "molestiae";
                    useCaseCategories = new String[]{{
                        add("nihil"),
                    }};
                    useCaseSummary = "magnam";
                }};;
            }};            

            UpdateTollfreeVerificationResponse res = sdk.messagingV1TollfreeVerification.updateTollfreeVerification(req, new UpdateTollfreeVerificationSecurity("distinctio", "id") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1TollfreeVerification != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationRequest](../../models/operations/UpdateTollfreeVerificationRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationSecurity](../../models/operations/UpdateTollfreeVerificationSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |
| `serverURL`                                                                                                                                      | *String*                                                                                                                                         | :heavy_minus_sign:                                                                                                                               | An optional server URL to use.                                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationResponse](../../models/operations/UpdateTollfreeVerificationResponse.md)**

