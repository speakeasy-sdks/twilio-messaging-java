# UpdateDomainConfigUpdateDomainConfigRequest


## Fields

| Field                                                                                                                                                                                                                                                                                             | Type                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `callbackUrl`                                                                                                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                | URL to receive click events to your webhook whenever the recipients click on the shortened links                                                                                                                                                                                                  |
| `continueOnFailure`                                                                                                                                                                                                                                                                               | *Boolean*                                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                                | Boolean field to set customer delivery preference when there is a failure in linkShortening service                                                                                                                                                                                               |
| `disableHttps`                                                                                                                                                                                                                                                                                    | *Boolean*                                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                                | Customer's choice to send links with/without "https://" attached to shortened url. If true, messages will not be sent with https:// at the beginning of the url. If false, messages will be sent with https:// at the beginning of the url. False is the default behavior if it is not specified. |
| `fallbackUrl`                                                                                                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                | Any requests we receive to this domain that do not match an existing shortened message will be redirected to the fallback url. These will likely be either expired messages, random misdirected traffic, or intentional scraping.                                                                 |