# messagingV1BrandRegistrationOtp

### Available Operations

* [createBrandRegistrationOtp](#createbrandregistrationotp)

## createBrandRegistrationOtp

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationOtpRequest;
import circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationOtpResponse;
import circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationOtpSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateBrandRegistrationOtpRequest req = new CreateBrandRegistrationOtpRequest("at");            

            CreateBrandRegistrationOtpResponse res = sdk.messagingV1BrandRegistrationOtp.createBrandRegistrationOtp(req, new CreateBrandRegistrationOtpSecurity("at", "maiores") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1BrandRegistrationsBrandRegistrationOtp != null) {
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
| `request`                                                                                                                                        | [circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationOtpRequest](../../models/operations/CreateBrandRegistrationOtpRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationOtpSecurity](../../models/operations/CreateBrandRegistrationOtpSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |
| `serverURL`                                                                                                                                      | *String*                                                                                                                                         | :heavy_minus_sign:                                                                                                                               | An optional server URL to use.                                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateBrandRegistrationOtpResponse](../../models/operations/CreateBrandRegistrationOtpResponse.md)**

