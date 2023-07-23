# TwilioMessaging SDK

## Overview

Twilio - Messaging: This is the public Twilio REST API.

### Available Operations

* [createAlphaSender](#createalphasender)
* [createBrandRegistrationOtp](#createbrandregistrationotp)
* [createBrandRegistrations](#createbrandregistrations)
* [createBrandVetting](#createbrandvetting)
* [createExternalCampaign](#createexternalcampaign)
* [createLinkshorteningMessagingService](#createlinkshorteningmessagingservice)
* [createPhoneNumber](#createphonenumber)
* [createService](#createservice)
* [createShortCode](#createshortcode)
* [createTollfreeVerification](#createtollfreeverification)
* [createUsAppToPerson](#createusapptoperson)
* [deleteAlphaSender](#deletealphasender)
* [deleteDomainCertV4](#deletedomaincertv4)
* [deleteLinkshorteningMessagingService](#deletelinkshorteningmessagingservice)
* [deletePhoneNumber](#deletephonenumber)
* [deleteService](#deleteservice)
* [deleteShortCode](#deleteshortcode)
* [deleteUsAppToPerson](#deleteusapptoperson)
* [fetchAlphaSender](#fetchalphasender)
* [fetchBrandRegistrations](#fetchbrandregistrations)
* [fetchBrandVetting](#fetchbrandvetting)
* [fetchDeactivation](#fetchdeactivation) - Fetch a list of all United States numbers that have been deactivated on a specific date.
* [fetchDomainCertV4](#fetchdomaincertv4)
* [fetchDomainConfig](#fetchdomainconfig)
* [fetchDomainConfigMessagingService](#fetchdomainconfigmessagingservice)
* [fetchLinkshorteningMessagingServiceDomainAssociation](#fetchlinkshorteningmessagingservicedomainassociation)
* [fetchPhoneNumber](#fetchphonenumber)
* [fetchService](#fetchservice)
* [fetchShortCode](#fetchshortcode)
* [fetchTollfreeVerification](#fetchtollfreeverification)
* [fetchUsAppToPerson](#fetchusapptoperson)
* [fetchUsAppToPersonUsecase](#fetchusapptopersonusecase)
* [fetchUsecase](#fetchusecase)
* [listAlphaSender](#listalphasender)
* [listBrandRegistrations](#listbrandregistrations)
* [listBrandVetting](#listbrandvetting)
* [listPhoneNumber](#listphonenumber)
* [listService](#listservice)
* [listShortCode](#listshortcode)
* [listTollfreeVerification](#listtollfreeverification)
* [listUsAppToPerson](#listusapptoperson)
* [updateBrandRegistrations](#updatebrandregistrations)
* [updateDomainCertV4](#updatedomaincertv4)
* [updateDomainConfig](#updatedomainconfig)
* [updateService](#updateservice)
* [updateTollfreeVerification](#updatetollfreeverification)

## createAlphaSender

### Example Usage

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

            CreateAlphaSenderRequest req = new CreateAlphaSenderRequest("unde") {{
                requestBody = new CreateAlphaSenderCreateAlphaSenderRequest("nulla");;
            }};            

            CreateAlphaSenderResponse res = sdk.twilioMessaging.createAlphaSender(req, new CreateAlphaSenderSecurity("corrupti", "illum") {{
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.CreateAlphaSenderRequest](../../models/operations/CreateAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.CreateAlphaSenderSecurity](../../models/operations/CreateAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateAlphaSenderResponse](../../models/operations/CreateAlphaSenderResponse.md)**


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

            CreateBrandRegistrationOtpRequest req = new CreateBrandRegistrationOtpRequest("vel");            

            CreateBrandRegistrationOtpResponse res = sdk.twilioMessaging.createBrandRegistrationOtp(req, new CreateBrandRegistrationOtpSecurity("error", "deserunt") {{
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

            CreateBrandRegistrationsCreateBrandRegistrationsRequest req = new CreateBrandRegistrationsCreateBrandRegistrationsRequest("suscipit", "iure") {{
                brandType = "magnam";
                mock = false;
                skipAutomaticSecVet = false;
            }};            

            CreateBrandRegistrationsResponse res = sdk.twilioMessaging.createBrandRegistrations(req, new CreateBrandRegistrationsSecurity("debitis", "ipsa") {{
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

            CreateBrandVettingRequest req = new CreateBrandVettingRequest("delectus") {{
                requestBody = new CreateBrandVettingCreateBrandVettingRequest(BrandVettingEnumVettingProvider.CAMPAIGN_VERIFY) {{
                    vettingId = "tempora";
                }};;
            }};            

            CreateBrandVettingResponse res = sdk.twilioMessaging.createBrandVetting(req, new CreateBrandVettingSecurity("suscipit", "molestiae") {{
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


## createExternalCampaign

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateExternalCampaignCreateExternalCampaignRequest;
import circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse;
import circl_dev.twilio_messaging.models.operations.CreateExternalCampaignSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateExternalCampaignCreateExternalCampaignRequest req = new CreateExternalCampaignCreateExternalCampaignRequest("minus", "placeat");            

            CreateExternalCampaignResponse res = sdk.twilioMessaging.createExternalCampaign(req, new CreateExternalCampaignSecurity("voluptatum", "iusto") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ExternalCampaign != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                          | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                          | [circl_dev.twilio_messaging.models.operations.CreateExternalCampaignCreateExternalCampaignRequest](../../models/operations/CreateExternalCampaignCreateExternalCampaignRequest.md) | :heavy_check_mark:                                                                                                                                                                 | The request object to use for the request.                                                                                                                                         |
| `security`                                                                                                                                                                         | [circl_dev.twilio_messaging.models.operations.CreateExternalCampaignSecurity](../../models/operations/CreateExternalCampaignSecurity.md)                                           | :heavy_check_mark:                                                                                                                                                                 | The security requirements to use for the request.                                                                                                                                  |
| `serverURL`                                                                                                                                                                        | *String*                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                 | An optional server URL to use.                                                                                                                                                     |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse](../../models/operations/CreateExternalCampaignResponse.md)**


## createLinkshorteningMessagingService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceRequest;
import circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceResponse;
import circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateLinkshorteningMessagingServiceRequest req = new CreateLinkshorteningMessagingServiceRequest("excepturi", "nisi");            

            CreateLinkshorteningMessagingServiceResponse res = sdk.twilioMessaging.createLinkshorteningMessagingService(req, new CreateLinkshorteningMessagingServiceSecurity("recusandae", "temporibus") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1LinkshorteningMessagingService != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceRequest](../../models/operations/CreateLinkshorteningMessagingServiceRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceSecurity](../../models/operations/CreateLinkshorteningMessagingServiceSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |
| `serverURL`                                                                                                                                                          | *String*                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                   | An optional server URL to use.                                                                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateLinkshorteningMessagingServiceResponse](../../models/operations/CreateLinkshorteningMessagingServiceResponse.md)**


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

            CreatePhoneNumberRequest req = new CreatePhoneNumberRequest("ab") {{
                requestBody = new CreatePhoneNumberCreatePhoneNumberRequest("quis");;
            }};            

            CreatePhoneNumberResponse res = sdk.twilioMessaging.createPhoneNumber(req, new CreatePhoneNumberSecurity("veritatis", "deserunt") {{
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

            CreateServiceCreateServiceRequest1 req = new CreateServiceCreateServiceRequest1("perferendis") {{
                areaCodeGeomatch = false;
                fallbackMethod = CreateServiceCreateServiceRequestFallbackMethod.POST;
                fallbackToLongCode = false;
                fallbackUrl = "https://well-informed-screamer.com";
                inboundMethod = CreateServiceCreateServiceRequestInboundMethod.DELETE;
                inboundRequestUrl = "https://wonderful-investor.net";
                mmsConverter = false;
                scanMessageContent = ServiceEnumScanMessageContent.DISABLE;
                smartEncoding = false;
                statusCallback = "http://meager-seabass.net";
                stickySender = false;
                synchronousValidation = false;
                useInboundWebhookOnNumber = false;
                usecase = "dicta";
                validityPeriod = 720633L;
            }};            

            CreateServiceResponse res = sdk.twilioMessaging.createService(req, new CreateServiceSecurity("officia", "occaecati") {{
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


## createShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeCreateShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.CreateShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            CreateShortCodeRequest req = new CreateShortCodeRequest("fugit") {{
                requestBody = new CreateShortCodeCreateShortCodeRequest("deleniti");;
            }};            

            CreateShortCodeResponse res = sdk.twilioMessaging.createShortCode(req, new CreateShortCodeSecurity("hic", "optio") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceShortCode != null) {
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
| `request`                                                                                                                  | [circl_dev.twilio_messaging.models.operations.CreateShortCodeRequest](../../models/operations/CreateShortCodeRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [circl_dev.twilio_messaging.models.operations.CreateShortCodeSecurity](../../models/operations/CreateShortCodeSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `serverURL`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.CreateShortCodeResponse](../../models/operations/CreateShortCodeResponse.md)**


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

            CreateTollfreeVerificationCreateTollfreeVerificationRequest req = new CreateTollfreeVerificationCreateTollfreeVerificationRequest("totam", "beatae", "commodi", "molestiae",                 new String[]{{
                                add("qui"),
                                add("impedit"),
                            }}, TollfreeVerificationEnumOptInType.VIA_TEXT, "esse", "ipsum",                 new String[]{{
                                add("aspernatur"),
                                add("perferendis"),
                                add("ad"),
                            }}, "natus") {{
                additionalInformation = "sed";
                businessCity = "iste";
                businessContactEmail = "dolor";
                businessContactFirstName = "natus";
                businessContactLastName = "laboriosam";
                businessContactPhone = "hic";
                businessCountry = "saepe";
                businessPostalCode = "fuga";
                businessStateProvinceRegion = "in";
                businessStreetAddress = "corporis";
                businessStreetAddress2 = "iste";
                customerProfileSid = "iure";
                externalReferenceId = "saepe";
            }};            

            CreateTollfreeVerificationResponse res = sdk.twilioMessaging.createTollfreeVerification(req, new CreateTollfreeVerificationSecurity("quidem", "architecto") {{
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

            CreateUsAppToPersonRequest req = new CreateUsAppToPersonRequest("ipsa") {{
                requestBody = new CreateUsAppToPersonCreateUsAppToPersonRequest("reiciendis", "est", false, false, "mollitia",                 new String[]{{
                                    add("dolores"),
                                    add("dolorem"),
                                    add("corporis"),
                                }}, "explicabo") {{
                    helpKeywords = new String[]{{
                        add("enim"),
                        add("omnis"),
                        add("nemo"),
                        add("minima"),
                    }};
                    helpMessage = "excepturi";
                    optInKeywords = new String[]{{
                        add("iure"),
                    }};
                    optInMessage = "culpa";
                    optOutKeywords = new String[]{{
                        add("sapiente"),
                        add("architecto"),
                        add("mollitia"),
                        add("dolorem"),
                    }};
                    optOutMessage = "culpa";
                }};;
            }};            

            CreateUsAppToPersonResponse res = sdk.twilioMessaging.createUsAppToPerson(req, new CreateUsAppToPersonSecurity("consequuntur", "repellat") {{
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


## deleteAlphaSender

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderResponse;
import circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteAlphaSenderRequest req = new DeleteAlphaSenderRequest("mollitia", "occaecati");            

            DeleteAlphaSenderResponse res = sdk.twilioMessaging.deleteAlphaSender(req, new DeleteAlphaSenderSecurity("numquam", "commodi") {{
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderRequest](../../models/operations/DeleteAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderSecurity](../../models/operations/DeleteAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteAlphaSenderResponse](../../models/operations/DeleteAlphaSenderResponse.md)**


## deleteDomainCertV4

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Request;
import circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Response;
import circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Security;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteDomainCertV4Request req = new DeleteDomainCertV4Request("quam");            

            DeleteDomainCertV4Response res = sdk.twilioMessaging.deleteDomainCertV4(req, new DeleteDomainCertV4Security("molestiae", "velit") {{
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Request](../../models/operations/DeleteDomainCertV4Request.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Security](../../models/operations/DeleteDomainCertV4Security.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteDomainCertV4Response](../../models/operations/DeleteDomainCertV4Response.md)**


## deleteLinkshorteningMessagingService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceRequest;
import circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceResponse;
import circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteLinkshorteningMessagingServiceRequest req = new DeleteLinkshorteningMessagingServiceRequest("error", "quia");            

            DeleteLinkshorteningMessagingServiceResponse res = sdk.twilioMessaging.deleteLinkshorteningMessagingService(req, new DeleteLinkshorteningMessagingServiceSecurity("quis", "vitae") {{
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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceRequest](../../models/operations/DeleteLinkshorteningMessagingServiceRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceSecurity](../../models/operations/DeleteLinkshorteningMessagingServiceSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |
| `serverURL`                                                                                                                                                          | *String*                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                   | An optional server URL to use.                                                                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteLinkshorteningMessagingServiceResponse](../../models/operations/DeleteLinkshorteningMessagingServiceResponse.md)**


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

            DeletePhoneNumberRequest req = new DeletePhoneNumberRequest("laborum", "animi");            

            DeletePhoneNumberResponse res = sdk.twilioMessaging.deletePhoneNumber(req, new DeletePhoneNumberSecurity("enim", "odit") {{
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

            DeleteServiceRequest req = new DeleteServiceRequest("quo");            

            DeleteServiceResponse res = sdk.twilioMessaging.deleteService(req, new DeleteServiceSecurity("sequi", "tenetur") {{
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


## deleteShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.DeleteShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.DeleteShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.DeleteShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            DeleteShortCodeRequest req = new DeleteShortCodeRequest("ipsam", "id");            

            DeleteShortCodeResponse res = sdk.twilioMessaging.deleteShortCode(req, new DeleteShortCodeSecurity("possimus", "aut") {{
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [circl_dev.twilio_messaging.models.operations.DeleteShortCodeRequest](../../models/operations/DeleteShortCodeRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [circl_dev.twilio_messaging.models.operations.DeleteShortCodeSecurity](../../models/operations/DeleteShortCodeSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `serverURL`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.DeleteShortCodeResponse](../../models/operations/DeleteShortCodeResponse.md)**


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

            DeleteUsAppToPersonRequest req = new DeleteUsAppToPersonRequest("quasi", "error");            

            DeleteUsAppToPersonResponse res = sdk.twilioMessaging.deleteUsAppToPerson(req, new DeleteUsAppToPersonSecurity("temporibus", "laborum") {{
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


## fetchAlphaSender

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.FetchAlphaSenderResponse;
import circl_dev.twilio_messaging.models.operations.FetchAlphaSenderSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchAlphaSenderRequest req = new FetchAlphaSenderRequest("quasi", "reiciendis");            

            FetchAlphaSenderResponse res = sdk.twilioMessaging.fetchAlphaSender(req, new FetchAlphaSenderSecurity("voluptatibus", "vero") {{
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

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [circl_dev.twilio_messaging.models.operations.FetchAlphaSenderRequest](../../models/operations/FetchAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [circl_dev.twilio_messaging.models.operations.FetchAlphaSenderSecurity](../../models/operations/FetchAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |
| `serverURL`                                                                                                                  | *String*                                                                                                                     | :heavy_minus_sign:                                                                                                           | An optional server URL to use.                                                                                               |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchAlphaSenderResponse](../../models/operations/FetchAlphaSenderResponse.md)**


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

            FetchBrandRegistrationsRequest req = new FetchBrandRegistrationsRequest("nihil");            

            FetchBrandRegistrationsResponse res = sdk.twilioMessaging.fetchBrandRegistrations(req, new FetchBrandRegistrationsSecurity("praesentium", "voluptatibus") {{
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

            FetchBrandVettingRequest req = new FetchBrandVettingRequest("ipsa", "omnis");            

            FetchBrandVettingResponse res = sdk.twilioMessaging.fetchBrandVetting(req, new FetchBrandVettingSecurity("voluptate", "cum") {{
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


## fetchDeactivation

Fetch a list of all United States numbers that have been deactivated on a specific date.

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDeactivationRequest;
import circl_dev.twilio_messaging.models.operations.FetchDeactivationResponse;
import circl_dev.twilio_messaging.models.operations.FetchDeactivationSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDeactivationRequest req = new FetchDeactivationRequest() {{
                date = LocalDate.parse("2022-12-17");
            }};            

            FetchDeactivationResponse res = sdk.twilioMessaging.fetchDeactivation(req, new FetchDeactivationSecurity("reprehenderit", "ut") {{
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDeactivationRequest](../../models/operations/FetchDeactivationRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDeactivationSecurity](../../models/operations/FetchDeactivationSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDeactivationResponse](../../models/operations/FetchDeactivationResponse.md)**


## fetchDomainCertV4

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Request;
import circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Response;
import circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Security;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDomainCertV4Request req = new FetchDomainCertV4Request("maiores");            

            FetchDomainCertV4Response res = sdk.twilioMessaging.fetchDomainCertV4(req, new FetchDomainCertV4Security("dicta", "corporis") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainCertV4 != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Request](../../models/operations/FetchDomainCertV4Request.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Security](../../models/operations/FetchDomainCertV4Security.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDomainCertV4Response](../../models/operations/FetchDomainCertV4Response.md)**


## fetchDomainConfig

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigRequest;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDomainConfigRequest req = new FetchDomainConfigRequest("dolore");            

            FetchDomainConfigResponse res = sdk.twilioMessaging.fetchDomainConfig(req, new FetchDomainConfigSecurity("iusto", "dicta") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainConfig != null) {
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
| `request`                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigRequest](../../models/operations/FetchDomainConfigRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigSecurity](../../models/operations/FetchDomainConfigSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse](../../models/operations/FetchDomainConfigResponse.md)**


## fetchDomainConfigMessagingService

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceRequest;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceResponse;
import circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchDomainConfigMessagingServiceRequest req = new FetchDomainConfigMessagingServiceRequest("harum");            

            FetchDomainConfigMessagingServiceResponse res = sdk.twilioMessaging.fetchDomainConfigMessagingService(req, new FetchDomainConfigMessagingServiceSecurity("enim", "accusamus") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainConfigMessagingService != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceRequest](../../models/operations/FetchDomainConfigMessagingServiceRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceSecurity](../../models/operations/FetchDomainConfigMessagingServiceSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |
| `serverURL`                                                                                                                                                    | *String*                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                             | An optional server URL to use.                                                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchDomainConfigMessagingServiceResponse](../../models/operations/FetchDomainConfigMessagingServiceResponse.md)**


## fetchLinkshorteningMessagingServiceDomainAssociation

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationRequest;
import circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationResponse;
import circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchLinkshorteningMessagingServiceDomainAssociationRequest req = new FetchLinkshorteningMessagingServiceDomainAssociationRequest("commodi");            

            FetchLinkshorteningMessagingServiceDomainAssociationResponse res = sdk.twilioMessaging.fetchLinkshorteningMessagingServiceDomainAssociation(req, new FetchLinkshorteningMessagingServiceDomainAssociationSecurity("repudiandae", "quae") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1LinkshorteningMessagingServiceDomainAssociation != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                            | Type                                                                                                                                                                                                 | Required                                                                                                                                                                                             | Description                                                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                            | [circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationRequest](../../models/operations/FetchLinkshorteningMessagingServiceDomainAssociationRequest.md)   | :heavy_check_mark:                                                                                                                                                                                   | The request object to use for the request.                                                                                                                                                           |
| `security`                                                                                                                                                                                           | [circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationSecurity](../../models/operations/FetchLinkshorteningMessagingServiceDomainAssociationSecurity.md) | :heavy_check_mark:                                                                                                                                                                                   | The security requirements to use for the request.                                                                                                                                                    |
| `serverURL`                                                                                                                                                                                          | *String*                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                   | An optional server URL to use.                                                                                                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchLinkshorteningMessagingServiceDomainAssociationResponse](../../models/operations/FetchLinkshorteningMessagingServiceDomainAssociationResponse.md)**


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

            FetchPhoneNumberRequest req = new FetchPhoneNumberRequest("ipsum", "quidem");            

            FetchPhoneNumberResponse res = sdk.twilioMessaging.fetchPhoneNumber(req, new FetchPhoneNumberSecurity("molestias", "excepturi") {{
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

            FetchServiceRequest req = new FetchServiceRequest("pariatur");            

            FetchServiceResponse res = sdk.twilioMessaging.fetchService(req, new FetchServiceSecurity("modi", "praesentium") {{
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


## fetchShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.FetchShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.FetchShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchShortCodeRequest req = new FetchShortCodeRequest("rem", "voluptates");            

            FetchShortCodeResponse res = sdk.twilioMessaging.fetchShortCode(req, new FetchShortCodeSecurity("quasi", "repudiandae") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceShortCode != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [circl_dev.twilio_messaging.models.operations.FetchShortCodeRequest](../../models/operations/FetchShortCodeRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [circl_dev.twilio_messaging.models.operations.FetchShortCodeSecurity](../../models/operations/FetchShortCodeSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |
| `serverURL`                                                                                                              | *String*                                                                                                                 | :heavy_minus_sign:                                                                                                       | An optional server URL to use.                                                                                           |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchShortCodeResponse](../../models/operations/FetchShortCodeResponse.md)**


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

            FetchTollfreeVerificationRequest req = new FetchTollfreeVerificationRequest("sint");            

            FetchTollfreeVerificationResponse res = sdk.twilioMessaging.fetchTollfreeVerification(req, new FetchTollfreeVerificationSecurity("veritatis", "itaque") {{
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

            FetchUsAppToPersonRequest req = new FetchUsAppToPersonRequest("incidunt", "enim");            

            FetchUsAppToPersonResponse res = sdk.twilioMessaging.fetchUsAppToPerson(req, new FetchUsAppToPersonSecurity("consequatur", "est") {{
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


## fetchUsAppToPersonUsecase

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseRequest;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseResponse;
import circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchUsAppToPersonUsecaseRequest req = new FetchUsAppToPersonUsecaseRequest("quibusdam") {{
                brandRegistrationSid = "explicabo";
            }};            

            FetchUsAppToPersonUsecaseResponse res = sdk.twilioMessaging.fetchUsAppToPersonUsecase(req, new FetchUsAppToPersonUsecaseSecurity("deserunt", "distinctio") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1ServiceUsAppToPersonUsecase != null) {
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
| `request`                                                                                                                                      | [circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseRequest](../../models/operations/FetchUsAppToPersonUsecaseRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseSecurity](../../models/operations/FetchUsAppToPersonUsecaseSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |
| `serverURL`                                                                                                                                    | *String*                                                                                                                                       | :heavy_minus_sign:                                                                                                                             | An optional server URL to use.                                                                                                                 |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchUsAppToPersonUsecaseResponse](../../models/operations/FetchUsAppToPersonUsecaseResponse.md)**


## fetchUsecase

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse;
import circl_dev.twilio_messaging.models.operations.FetchUsecaseSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            FetchUsecaseResponse res = sdk.twilioMessaging.fetchUsecase(new FetchUsecaseSecurity("quibusdam", "labore") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1Usecase != null) {
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
| `security`                                                                                                           | [circl_dev.twilio_messaging.models.operations.FetchUsecaseSecurity](../../models/operations/FetchUsecaseSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |
| `serverURL`                                                                                                          | *String*                                                                                                             | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |


### Response

**[circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse](../../models/operations/FetchUsecaseResponse.md)**


## listAlphaSender

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListAlphaSenderRequest;
import circl_dev.twilio_messaging.models.operations.ListAlphaSenderResponse;
import circl_dev.twilio_messaging.models.operations.ListAlphaSenderSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListAlphaSenderRequest req = new ListAlphaSenderRequest("modi") {{
                page = 183191L;
                pageSize = 397821L;
                pageToken = "cupiditate";
            }};            

            ListAlphaSenderResponse res = sdk.twilioMessaging.listAlphaSender(req, new ListAlphaSenderSecurity("quos", "perferendis") {{
                password = "";
                username = "";
            }});

            if (res.listAlphaSenderResponse != null) {
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
| `request`                                                                                                                  | [circl_dev.twilio_messaging.models.operations.ListAlphaSenderRequest](../../models/operations/ListAlphaSenderRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [circl_dev.twilio_messaging.models.operations.ListAlphaSenderSecurity](../../models/operations/ListAlphaSenderSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |
| `serverURL`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | An optional server URL to use.                                                                                             |


### Response

**[circl_dev.twilio_messaging.models.operations.ListAlphaSenderResponse](../../models/operations/ListAlphaSenderResponse.md)**


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
                page = 164940L;
                pageSize = 828940L;
                pageToken = "ipsam";
            }};            

            ListBrandRegistrationsResponse res = sdk.twilioMessaging.listBrandRegistrations(req, new ListBrandRegistrationsSecurity("alias", "fugit") {{
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

            ListBrandVettingRequest req = new ListBrandVettingRequest("dolorum") {{
                page = 569618L;
                pageSize = 270008L;
                pageToken = "facilis";
                vettingProvider = BrandVettingEnumVettingProvider.CAMPAIGN_VERIFY;
            }};            

            ListBrandVettingResponse res = sdk.twilioMessaging.listBrandVetting(req, new ListBrandVettingSecurity("tempore", "labore") {{
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

            ListPhoneNumberRequest req = new ListPhoneNumberRequest("delectus") {{
                page = 433288L;
                pageSize = 248753L;
                pageToken = "eligendi";
            }};            

            ListPhoneNumberResponse res = sdk.twilioMessaging.listPhoneNumber(req, new ListPhoneNumberSecurity("sint", "aliquid") {{
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
                page = 592042L;
                pageSize = 896039L;
                pageToken = "sint";
            }};            

            ListServiceResponse res = sdk.twilioMessaging.listService(req, new ListServiceSecurity("officia", "dolor") {{
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


## listShortCode

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.ListShortCodeRequest;
import circl_dev.twilio_messaging.models.operations.ListShortCodeResponse;
import circl_dev.twilio_messaging.models.operations.ListShortCodeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            ListShortCodeRequest req = new ListShortCodeRequest("debitis") {{
                page = 952749L;
                pageSize = 680056L;
                pageToken = "in";
            }};            

            ListShortCodeResponse res = sdk.twilioMessaging.listShortCode(req, new ListShortCodeSecurity("in", "illum") {{
                password = "";
                username = "";
            }});

            if (res.listShortCodeResponse != null) {
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
| `request`                                                                                                              | [circl_dev.twilio_messaging.models.operations.ListShortCodeRequest](../../models/operations/ListShortCodeRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [circl_dev.twilio_messaging.models.operations.ListShortCodeSecurity](../../models/operations/ListShortCodeSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |
| `serverURL`                                                                                                            | *String*                                                                                                               | :heavy_minus_sign:                                                                                                     | An optional server URL to use.                                                                                         |


### Response

**[circl_dev.twilio_messaging.models.operations.ListShortCodeResponse](../../models/operations/ListShortCodeResponse.md)**


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

            ListTollfreeVerificationResponse res = sdk.twilioMessaging.listTollfreeVerification(req, new ListTollfreeVerificationSecurity("facere", "ea") {{
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

            ListUsAppToPersonRequest req = new ListUsAppToPersonRequest("aliquid") {{
                page = 675439L;
                pageSize = 881104L;
                pageToken = "non";
            }};            

            ListUsAppToPersonResponse res = sdk.twilioMessaging.listUsAppToPerson(req, new ListUsAppToPersonSecurity("occaecati", "enim") {{
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

            UpdateBrandRegistrationsRequest req = new UpdateBrandRegistrationsRequest("accusamus");            

            UpdateBrandRegistrationsResponse res = sdk.twilioMessaging.updateBrandRegistrations(req, new UpdateBrandRegistrationsSecurity("delectus", "quidem") {{
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


## updateDomainCertV4

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Request;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Response;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Security;
import circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4UpdateDomainCertV4Request;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            UpdateDomainCertV4Request req = new UpdateDomainCertV4Request("provident") {{
                requestBody = new UpdateDomainCertV4UpdateDomainCertV4Request("nam");;
            }};            

            UpdateDomainCertV4Response res = sdk.twilioMessaging.updateDomainCertV4(req, new UpdateDomainCertV4Security("id", "blanditiis") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainCertV4 != null) {
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
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Request](../../models/operations/UpdateDomainCertV4Request.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Security](../../models/operations/UpdateDomainCertV4Security.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.UpdateDomainCertV4Response](../../models/operations/UpdateDomainCertV4Response.md)**


## updateDomainConfig

### Example Usage

```java
package hello.world;

import circl_dev.twilio_messaging.TwilioMessaging;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigRequest;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigSecurity;
import circl_dev.twilio_messaging.models.operations.UpdateDomainConfigUpdateDomainConfigRequest;

public class Application {
    public static void main(String[] args) {
        try {
            TwilioMessaging sdk = TwilioMessaging.builder()
                .build();

            UpdateDomainConfigRequest req = new UpdateDomainConfigRequest("deleniti") {{
                requestBody = new UpdateDomainConfigUpdateDomainConfigRequest() {{
                    callbackUrl = "https://embarrassed-peacock.info";
                    continueOnFailure = false;
                    disableHttps = false;
                    fallbackUrl = "http://personal-occurrence.info";
                }};;
            }};            

            UpdateDomainConfigResponse res = sdk.twilioMessaging.updateDomainConfig(req, new UpdateDomainConfigSecurity("perferendis", "nihil") {{
                password = "";
                username = "";
            }});

            if (res.messagingV1DomainConfig != null) {
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
| `request`                                                                                                                        | [circl_dev.twilio_messaging.models.operations.UpdateDomainConfigRequest](../../models/operations/UpdateDomainConfigRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [circl_dev.twilio_messaging.models.operations.UpdateDomainConfigSecurity](../../models/operations/UpdateDomainConfigSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |
| `serverURL`                                                                                                                      | *String*                                                                                                                         | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |


### Response

**[circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse](../../models/operations/UpdateDomainConfigResponse.md)**


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

            UpdateServiceRequest req = new UpdateServiceRequest("magnam") {{
                requestBody = new UpdateServiceUpdateServiceRequest1() {{
                    areaCodeGeomatch = false;
                    fallbackMethod = UpdateServiceUpdateServiceRequestFallbackMethod.PUT;
                    fallbackToLongCode = false;
                    fallbackUrl = "https://flamboyant-dwarf.info";
                    friendlyName = "natus";
                    inboundMethod = UpdateServiceUpdateServiceRequestInboundMethod.PUT;
                    inboundRequestUrl = "http://ugly-cash.com";
                    mmsConverter = false;
                    scanMessageContent = ServiceEnumScanMessageContent.INHERIT;
                    smartEncoding = false;
                    statusCallback = "http://nippy-flour.name";
                    stickySender = false;
                    synchronousValidation = false;
                    useInboundWebhookOnNumber = false;
                    usecase = "quos";
                    validityPeriod = 574325L;
                }};;
            }};            

            UpdateServiceResponse res = sdk.twilioMessaging.updateService(req, new UpdateServiceSecurity("accusantium", "mollitia") {{
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

            UpdateTollfreeVerificationRequest req = new UpdateTollfreeVerificationRequest("reiciendis") {{
                requestBody = new UpdateTollfreeVerificationUpdateTollfreeVerificationRequest() {{
                    additionalInformation = "mollitia";
                    businessCity = "ad";
                    businessContactEmail = "eum";
                    businessContactFirstName = "dolor";
                    businessContactLastName = "necessitatibus";
                    businessContactPhone = "odit";
                    businessCountry = "nemo";
                    businessName = "quasi";
                    businessPostalCode = "iure";
                    businessStateProvinceRegion = "doloribus";
                    businessStreetAddress = "debitis";
                    businessStreetAddress2 = "eius";
                    businessWebsite = "maxime";
                    messageVolume = "deleniti";
                    notificationEmail = "facilis";
                    optInImageUrls = new String[]{{
                        add("architecto"),
                        add("architecto"),
                    }};
                    optInType = TollfreeVerificationEnumOptInType.MOBILE_QR_CODE;
                    productionMessageSample = "ullam";
                    useCaseCategories = new String[]{{
                        add("nihil"),
                        add("repellat"),
                        add("quibusdam"),
                    }};
                    useCaseSummary = "sed";
                }};;
            }};            

            UpdateTollfreeVerificationResponse res = sdk.twilioMessaging.updateTollfreeVerification(req, new UpdateTollfreeVerificationSecurity("saepe", "pariatur") {{
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

