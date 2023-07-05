<!-- Start SDK Example Usage -->
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

            CreateAlphaSenderRequest req = new CreateAlphaSenderRequest("corrupti") {{
                requestBody = new CreateAlphaSenderCreateAlphaSenderRequest("provident");;
            }};            

            CreateAlphaSenderResponse res = sdk.createAlphaSender(req, new CreateAlphaSenderSecurity("distinctio", "quibusdam") {{
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
<!-- End SDK Example Usage -->