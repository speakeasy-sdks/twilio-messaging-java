# twilio-messaging

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'circl_dev.twilio_messaging:twilio-messaging:1.12.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [TwilioMessaging SDK](docs/sdks/twiliomessaging/README.md)

* [createAlphaSender](docs/sdks/twiliomessaging/README.md#createalphasender)
* [createBrandRegistrationOtp](docs/sdks/twiliomessaging/README.md#createbrandregistrationotp)
* [createBrandRegistrations](docs/sdks/twiliomessaging/README.md#createbrandregistrations)
* [createBrandVetting](docs/sdks/twiliomessaging/README.md#createbrandvetting)
* [createExternalCampaign](docs/sdks/twiliomessaging/README.md#createexternalcampaign)
* [createLinkshorteningMessagingService](docs/sdks/twiliomessaging/README.md#createlinkshorteningmessagingservice)
* [createPhoneNumber](docs/sdks/twiliomessaging/README.md#createphonenumber)
* [createService](docs/sdks/twiliomessaging/README.md#createservice)
* [createShortCode](docs/sdks/twiliomessaging/README.md#createshortcode)
* [createTollfreeVerification](docs/sdks/twiliomessaging/README.md#createtollfreeverification)
* [createUsAppToPerson](docs/sdks/twiliomessaging/README.md#createusapptoperson)
* [deleteAlphaSender](docs/sdks/twiliomessaging/README.md#deletealphasender)
* [deleteDomainCertV4](docs/sdks/twiliomessaging/README.md#deletedomaincertv4)
* [deleteLinkshorteningMessagingService](docs/sdks/twiliomessaging/README.md#deletelinkshorteningmessagingservice)
* [deletePhoneNumber](docs/sdks/twiliomessaging/README.md#deletephonenumber)
* [deleteService](docs/sdks/twiliomessaging/README.md#deleteservice)
* [deleteShortCode](docs/sdks/twiliomessaging/README.md#deleteshortcode)
* [deleteUsAppToPerson](docs/sdks/twiliomessaging/README.md#deleteusapptoperson)
* [fetchAlphaSender](docs/sdks/twiliomessaging/README.md#fetchalphasender)
* [fetchBrandRegistrations](docs/sdks/twiliomessaging/README.md#fetchbrandregistrations)
* [fetchBrandVetting](docs/sdks/twiliomessaging/README.md#fetchbrandvetting)
* [fetchDeactivation](docs/sdks/twiliomessaging/README.md#fetchdeactivation) - Fetch a list of all United States numbers that have been deactivated on a specific date.
* [fetchDomainCertV4](docs/sdks/twiliomessaging/README.md#fetchdomaincertv4)
* [fetchDomainConfig](docs/sdks/twiliomessaging/README.md#fetchdomainconfig)
* [fetchDomainConfigMessagingService](docs/sdks/twiliomessaging/README.md#fetchdomainconfigmessagingservice)
* [fetchLinkshorteningMessagingServiceDomainAssociation](docs/sdks/twiliomessaging/README.md#fetchlinkshorteningmessagingservicedomainassociation)
* [fetchPhoneNumber](docs/sdks/twiliomessaging/README.md#fetchphonenumber)
* [fetchService](docs/sdks/twiliomessaging/README.md#fetchservice)
* [fetchShortCode](docs/sdks/twiliomessaging/README.md#fetchshortcode)
* [fetchTollfreeVerification](docs/sdks/twiliomessaging/README.md#fetchtollfreeverification)
* [fetchUsAppToPerson](docs/sdks/twiliomessaging/README.md#fetchusapptoperson)
* [fetchUsAppToPersonUsecase](docs/sdks/twiliomessaging/README.md#fetchusapptopersonusecase)
* [fetchUsecase](docs/sdks/twiliomessaging/README.md#fetchusecase)
* [listAlphaSender](docs/sdks/twiliomessaging/README.md#listalphasender)
* [listBrandRegistrations](docs/sdks/twiliomessaging/README.md#listbrandregistrations)
* [listBrandVetting](docs/sdks/twiliomessaging/README.md#listbrandvetting)
* [listPhoneNumber](docs/sdks/twiliomessaging/README.md#listphonenumber)
* [listService](docs/sdks/twiliomessaging/README.md#listservice)
* [listShortCode](docs/sdks/twiliomessaging/README.md#listshortcode)
* [listTollfreeVerification](docs/sdks/twiliomessaging/README.md#listtollfreeverification)
* [listUsAppToPerson](docs/sdks/twiliomessaging/README.md#listusapptoperson)
* [updateBrandRegistrations](docs/sdks/twiliomessaging/README.md#updatebrandregistrations)
* [updateDomainCertV4](docs/sdks/twiliomessaging/README.md#updatedomaincertv4)
* [updateDomainConfig](docs/sdks/twiliomessaging/README.md#updatedomainconfig)
* [updateService](docs/sdks/twiliomessaging/README.md#updateservice)
* [updateTollfreeVerification](docs/sdks/twiliomessaging/README.md#updatetollfreeverification)
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
