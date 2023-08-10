# messagingV1BrandVetting

### Available Operations

* [createBrandVetting](#createbrandvetting)
* [fetchBrandVetting](#fetchbrandvetting)
* [listBrandVetting](#listbrandvetting)

## createBrandVetting

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateBrandVettingCreateBrandVettingRequest;
import circl_dev.twilio_messaging.models.operations.CreateBrandVettingRequest;
import circl_dev.twilio_messaging.models.operations.CreateBrandVettingResponse;
import circl_dev.twilio_messaging.models.operations.CreateBrandVettingSecurity;
import circl_dev.twilio_messaging.models.shared.BrandVettingEnumVettingProvider;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateBrandVettingRequest req = new CreateBrandVettingRequest("molestiae") {{
                requestBody = new CreateBrandVettingCreateBrandVettingRequest(BrandVettingEnumVettingProvider.CAMPAIGN_VERIFY) {{
                    vettingId = "quod";
                }};;
            }};            

            CreateBrandVettingResponse res = sdk.messagingV1BrandVetting.createBrandVetting(req, new CreateBrandVettingSecurity("quod", "esse") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1BrandRegistrationsBrandVetting != null) {
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
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.CreateBrandVettingRequest](../../models/operations/CreateBrandVettingRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.CreateBrandVettingSecurity](../../models/operations/CreateBrandVettingSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateBrandVettingResponse](../../models/operations/CreateBrandVettingResponse.md)**


## fetchBrandVetting

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchBrandVettingRequest;
import circl_dev.twilio_messaging.models.operations.FetchBrandVettingResponse;
import circl_dev.twilio_messaging.models.operations.FetchBrandVettingSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchBrandVettingRequest req = new FetchBrandVettingRequest("totam", "porro");            

            FetchBrandVettingResponse res = sdk.messagingV1BrandVetting.fetchBrandVetting(req, new FetchBrandVettingSecurity("dolorum", "dicta") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1BrandRegistrationsBrandVetting != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchBrandVettingRequest](../../models/operations/FetchBrandVettingRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchBrandVettingSecurity](../../models/operations/FetchBrandVettingSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchBrandVettingResponse](../../models/operations/FetchBrandVettingResponse.md)**


## listBrandVetting

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListBrandVettingRequest;
import circl_dev.twilio_messaging.models.operations.ListBrandVettingResponse;
import circl_dev.twilio_messaging.models.operations.ListBrandVettingSecurity;
import circl_dev.twilio_messaging.models.shared.BrandVettingEnumVettingProvider;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListBrandVettingRequest req = new ListBrandVettingRequest("nam") {{
                page = 639921L;
                pageSize = 582020L;
                pageToken = "fugit";
                vettingProvider = BrandVettingEnumVettingProvider.CAMPAIGN_VERIFY;
            }};            

            ListBrandVettingResponse res = sdk.messagingV1BrandVetting.listBrandVetting(req, new ListBrandVettingSecurity("deleniti", "hic") {{
                password = "";
                username = "";
            }});

            if (res.listBrandVettingResponse != null) {
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
| `request`                                                                                                                    | [circl_dev.twilio_messaging.models.operations.ListBrandVettingRequest](../../models/operations/ListBrandVettingRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [circl_dev.twilio_messaging.models.operations.ListBrandVettingSecurity](../../models/operations/ListBrandVettingSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |
| `serverURL`                                                                                                                  | *String*                                                                                                                     | :heavy_minus_sign:                                                                                                           | An optional server URL to use.                                                                                               |


### Response

**[circl_dev.twilio_messaging.models.operations.ListBrandVettingResponse](../../models/operations/ListBrandVettingResponse.md)**

