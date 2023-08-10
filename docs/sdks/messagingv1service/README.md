# messagingV1Service

### Available Operations

* [createService](#createservice)
* [deleteService](#deleteservice)
* [fetchService](#fetchservice)
* [listService](#listservice)
* [updateService](#updateservice)

## createService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateServiceCreateServiceRequest1;
import circl_dev.twilio_messaging.models.operations.CreateServiceCreateServiceRequestFallbackMethod;
import circl_dev.twilio_messaging.models.operations.CreateServiceCreateServiceRequestInboundMethod;
import circl_dev.twilio_messaging.models.operations.CreateServiceResponse;
import circl_dev.twilio_messaging.models.operations.CreateServiceSecurity;
import circl_dev.twilio_messaging.models.shared.ServiceEnumScanMessageContent;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateServiceCreateServiceRequest1 req = new CreateServiceCreateServiceRequest1("error") {{
                areaCodeGeomatch = false;
                fallbackMethod = CreateServiceCreateServiceRequestFallbackMethod.HEAD;
                fallbackToLongCode = false;
                fallbackUrl = "http://cautious-poker.name";
                inboundMethod = CreateServiceCreateServiceRequestInboundMethod.GET;
                inboundRequestUrl = "http://sophisticated-conifer.org";
                mmsConverter = false;
                scanMessageContent = ServiceEnumScanMessageContent.ENABLE;
                smartEncoding = false;
                statusCallback = "https://sugary-afoul.com";
                stickySender = false;
                synchronousValidation = false;
                useInboundWebhookOnNumber = false;
                usecase = "error";
                validityPeriod = 837945L;
            }};            

            CreateServiceResponse res = sdk.messagingV1Service.createService(req, new CreateServiceSecurity("laborum", "quasi") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1Service != null) {
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
| `request`                                                                                                                                        | [circl_dev.twilio_messaging.models.operations.CreateServiceCreateServiceRequest1](../../models/operations/CreateServiceCreateServiceRequest1.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [circl_dev.twilio_messaging.models.operations.CreateServiceSecurity](../../models/operations/CreateServiceSecurity.md)                           | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |
| `serverURL`                                                                                                                                      | *String*                                                                                                                                         | :heavy_minus_sign:                                                                                                                               | An optional server URL to use.                                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateServiceResponse](../../models/operations/CreateServiceResponse.md)**


## deleteService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteServiceRequest;
import circl_dev.twilio_messaging.models.operations.DeleteServiceResponse;
import circl_dev.twilio_messaging.models.operations.DeleteServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteServiceRequest req = new DeleteServiceRequest("reiciendis");            

            DeleteServiceResponse res = sdk.messagingV1Service.deleteService(req, new DeleteServiceSecurity("voluptatibus", "vero") {{
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [circl_dev.twilio_messaging.models.operations.DeleteServiceRequest](../../models/operations/DeleteServiceRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [circl_dev.twilio_messaging.models.operations.DeleteServiceSecurity](../../models/operations/DeleteServiceSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |
| `serverURL`                                                                                                            | *String*                                                                                                               | :heavy_minus_sign:                                                                                                     | An optional server URL to use.                                                                                         |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteServiceResponse](../../models/operations/DeleteServiceResponse.md)**


## fetchService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchServiceRequest;
import circl_dev.twilio_messaging.models.operations.FetchServiceResponse;
import circl_dev.twilio_messaging.models.operations.FetchServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchServiceRequest req = new FetchServiceRequest("nihil");            

            FetchServiceResponse res = sdk.messagingV1Service.fetchService(req, new FetchServiceSecurity("praesentium", "voluptatibus") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1Service != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [circl_dev.twilio_messaging.models.operations.FetchServiceRequest](../../models/operations/FetchServiceRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [circl_dev.twilio_messaging.models.operations.FetchServiceSecurity](../../models/operations/FetchServiceSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |
| `serverURL`                                                                                                          | *String*                                                                                                             | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchServiceResponse](../../models/operations/FetchServiceResponse.md)**


## listService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListServiceRequest;
import circl_dev.twilio_messaging.models.operations.ListServiceResponse;
import circl_dev.twilio_messaging.models.operations.ListServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListServiceRequest req = new ListServiceRequest() {{
                page = 55714L;
                pageSize = 604846L;
                pageToken = "voluptate";
            }};            

            ListServiceResponse res = sdk.messagingV1Service.listService(req, new ListServiceSecurity("cum", "perferendis") {{
                password = "";
                username = "";
            }});

            if (res.listServiceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [circl_dev.twilio_messaging.models.operations.ListServiceRequest](../../models/operations/ListServiceRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [circl_dev.twilio_messaging.models.operations.ListServiceSecurity](../../models/operations/ListServiceSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |
| `serverURL`                                                                                                        | *String*                                                                                                           | :heavy_minus_sign:                                                                                                 | An optional server URL to use.                                                                                     |


### Response

**[circl_dev.twilio_messaging.models.operations.ListServiceResponse](../../models/operations/ListServiceResponse.md)**


## updateService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.UpdateServiceRequest;
import circl_dev.twilio_messaging.models.operations.UpdateServiceResponse;
import circl_dev.twilio_messaging.models.operations.UpdateServiceSecurity;
import circl_dev.twilio_messaging.models.operations.UpdateServiceUpdateServiceRequest1;
import circl_dev.twilio_messaging.models.operations.UpdateServiceUpdateServiceRequestFallbackMethod;
import circl_dev.twilio_messaging.models.operations.UpdateServiceUpdateServiceRequestInboundMethod;
import circl_dev.twilio_messaging.models.shared.ServiceEnumScanMessageContent;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            UpdateServiceRequest req = new UpdateServiceRequest("doloremque") {{
                requestBody = new UpdateServiceUpdateServiceRequest1() {{
                    areaCodeGeomatch = false;
                    fallbackMethod = UpdateServiceUpdateServiceRequestFallbackMethod.POST;
                    fallbackToLongCode = false;
                    fallbackUrl = "http://wooden-cabin.info";
                    friendlyName = "dolore";
                    inboundMethod = UpdateServiceUpdateServiceRequestInboundMethod.POST;
                    inboundRequestUrl = "http://reliable-evaluation.org";
                    mmsConverter = false;
                    scanMessageContent = ServiceEnumScanMessageContent.ENABLE;
                    smartEncoding = false;
                    statusCallback = "https://beautiful-crab.net";
                    stickySender = false;
                    synchronousValidation = false;
                    useInboundWebhookOnNumber = false;
                    usecase = "molestias";
                    validityPeriod = 566602L;
                }};;
            }};            

            UpdateServiceResponse res = sdk.messagingV1Service.updateService(req, new UpdateServiceSecurity("pariatur", "modi") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1Service != null) {
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
| `request`                                                                                                              | [circl_dev.twilio_messaging.models.operations.UpdateServiceRequest](../../models/operations/UpdateServiceRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [circl_dev.twilio_messaging.models.operations.UpdateServiceSecurity](../../models/operations/UpdateServiceSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |
| `serverURL`                                                                                                            | *String*                                                                                                               | :heavy_minus_sign:                                                                                                     | An optional server URL to use.                                                                                         |


### Response

**[circl_dev.twilio_messaging.models.operations.UpdateServiceResponse](../../models/operations/UpdateServiceResponse.md)**

