# twilio-messaging

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'circl_dev.twilio_messaging:twilio-messaging:1.16.0'
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

            CreateAlphaSenderResponse res = sdk.messagingV1AlphaSender.createAlphaSender(req, new CreateAlphaSenderSecurity("distinctio", "quibusdam") {{
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


### [messagingV1AlphaSender](docs/sdks/messagingv1alphasender/README.md)

* [createAlphaSender](docs/sdks/messagingv1alphasender/README.md#createalphasender)
* [deleteAlphaSender](docs/sdks/messagingv1alphasender/README.md#deletealphasender)
* [fetchAlphaSender](docs/sdks/messagingv1alphasender/README.md#fetchalphasender)
* [listAlphaSender](docs/sdks/messagingv1alphasender/README.md#listalphasender)

### [messagingV1BrandRegistration](docs/sdks/messagingv1brandregistration/README.md)

* [createBrandRegistrations](docs/sdks/messagingv1brandregistration/README.md#createbrandregistrations)
* [fetchBrandRegistrations](docs/sdks/messagingv1brandregistration/README.md#fetchbrandregistrations)
* [listBrandRegistrations](docs/sdks/messagingv1brandregistration/README.md#listbrandregistrations)
* [updateBrandRegistrations](docs/sdks/messagingv1brandregistration/README.md#updatebrandregistrations)

### [messagingV1BrandRegistrationOtp](docs/sdks/messagingv1brandregistrationotp/README.md)

* [createBrandRegistrationOtp](docs/sdks/messagingv1brandregistrationotp/README.md#createbrandregistrationotp)

### [messagingV1BrandVetting](docs/sdks/messagingv1brandvetting/README.md)

* [createBrandVetting](docs/sdks/messagingv1brandvetting/README.md#createbrandvetting)
* [fetchBrandVetting](docs/sdks/messagingv1brandvetting/README.md#fetchbrandvetting)
* [listBrandVetting](docs/sdks/messagingv1brandvetting/README.md#listbrandvetting)

### [messagingV1Deactivations](docs/sdks/messagingv1deactivations/README.md)

* [fetchDeactivation](docs/sdks/messagingv1deactivations/README.md#fetchdeactivation) - Fetch a list of all United States numbers that have been deactivated on a specific date.

### [messagingV1DomainCerts](docs/sdks/messagingv1domaincerts/README.md)

* [deleteDomainCertV4](docs/sdks/messagingv1domaincerts/README.md#deletedomaincertv4)
* [fetchDomainCertV4](docs/sdks/messagingv1domaincerts/README.md#fetchdomaincertv4)
* [updateDomainCertV4](docs/sdks/messagingv1domaincerts/README.md#updatedomaincertv4)

### [messagingV1DomainConfig](docs/sdks/messagingv1domainconfig/README.md)

* [fetchDomainConfig](docs/sdks/messagingv1domainconfig/README.md#fetchdomainconfig)
* [updateDomainConfig](docs/sdks/messagingv1domainconfig/README.md#updatedomainconfig)

### [messagingV1DomainConfigMessagingService](docs/sdks/messagingv1domainconfigmessagingservice/README.md)

* [fetchDomainConfigMessagingService](docs/sdks/messagingv1domainconfigmessagingservice/README.md#fetchdomainconfigmessagingservice)

### [messagingV1ExternalCampaign](docs/sdks/messagingv1externalcampaign/README.md)

* [createExternalCampaign](docs/sdks/messagingv1externalcampaign/README.md#createexternalcampaign)

### [messagingV1LinkshorteningMessagingService](docs/sdks/messagingv1linkshorteningmessagingservice/README.md)

* [createLinkshorteningMessagingService](docs/sdks/messagingv1linkshorteningmessagingservice/README.md#createlinkshorteningmessagingservice)
* [deleteLinkshorteningMessagingService](docs/sdks/messagingv1linkshorteningmessagingservice/README.md#deletelinkshorteningmessagingservice)

### [messagingV1LinkshorteningMessagingServiceDomainAssociation](docs/sdks/messagingv1linkshorteningmessagingservicedomainassociation/README.md)

* [fetchLinkshorteningMessagingServiceDomainAssociation](docs/sdks/messagingv1linkshorteningmessagingservicedomainassociation/README.md#fetchlinkshorteningmessagingservicedomainassociation)

### [messagingV1PhoneNumber](docs/sdks/messagingv1phonenumber/README.md)

* [createPhoneNumber](docs/sdks/messagingv1phonenumber/README.md#createphonenumber)
* [deletePhoneNumber](docs/sdks/messagingv1phonenumber/README.md#deletephonenumber)
* [fetchPhoneNumber](docs/sdks/messagingv1phonenumber/README.md#fetchphonenumber)
* [listPhoneNumber](docs/sdks/messagingv1phonenumber/README.md#listphonenumber)

### [messagingV1Service](docs/sdks/messagingv1service/README.md)

* [createService](docs/sdks/messagingv1service/README.md#createservice)
* [deleteService](docs/sdks/messagingv1service/README.md#deleteservice)
* [fetchService](docs/sdks/messagingv1service/README.md#fetchservice)
* [listService](docs/sdks/messagingv1service/README.md#listservice)
* [updateService](docs/sdks/messagingv1service/README.md#updateservice)

### [messagingV1ShortCode](docs/sdks/messagingv1shortcode/README.md)

* [createShortCode](docs/sdks/messagingv1shortcode/README.md#createshortcode)
* [deleteShortCode](docs/sdks/messagingv1shortcode/README.md#deleteshortcode)
* [fetchShortCode](docs/sdks/messagingv1shortcode/README.md#fetchshortcode)
* [listShortCode](docs/sdks/messagingv1shortcode/README.md#listshortcode)

### [messagingV1TollfreeVerification](docs/sdks/messagingv1tollfreeverification/README.md)

* [createTollfreeVerification](docs/sdks/messagingv1tollfreeverification/README.md#createtollfreeverification)
* [fetchTollfreeVerification](docs/sdks/messagingv1tollfreeverification/README.md#fetchtollfreeverification)
* [listTollfreeVerification](docs/sdks/messagingv1tollfreeverification/README.md#listtollfreeverification)
* [updateTollfreeVerification](docs/sdks/messagingv1tollfreeverification/README.md#updatetollfreeverification)

### [messagingV1UsAppToPerson](docs/sdks/messagingv1usapptoperson/README.md)

* [createUsAppToPerson](docs/sdks/messagingv1usapptoperson/README.md#createusapptoperson)
* [deleteUsAppToPerson](docs/sdks/messagingv1usapptoperson/README.md#deleteusapptoperson)
* [fetchUsAppToPerson](docs/sdks/messagingv1usapptoperson/README.md#fetchusapptoperson)
* [listUsAppToPerson](docs/sdks/messagingv1usapptoperson/README.md#listusapptoperson)

### [messagingV1UsAppToPersonUsecase](docs/sdks/messagingv1usapptopersonusecase/README.md)

* [fetchUsAppToPersonUsecase](docs/sdks/messagingv1usapptopersonusecase/README.md#fetchusapptopersonusecase)

### [messagingV1Usecase](docs/sdks/messagingv1usecase/README.md)

* [fetchUsecase](docs/sdks/messagingv1usecase/README.md#fetchusecase)
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
