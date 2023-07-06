# CreateBrandRegistrationsCreateBrandRegistrationsRequest


## Fields

| Field                                                                                                                                                                  | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `a2PProfileBundleSid`                                                                                                                                                  | *String*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | A2P Messaging Profile Bundle Sid.                                                                                                                                      |
| `brandType`                                                                                                                                                            | *String*                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                     | Type of brand being created. One of: "STANDARD", "SOLE_PROPRIETOR". SOLE_PROPRIETOR is for low volume, SOLE_PROPRIETOR use cases. STANDARD is for all other use cases. |
| `customerProfileBundleSid`                                                                                                                                             | *String*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | Customer Profile Bundle Sid.                                                                                                                                           |
| `mock`                                                                                                                                                                 | *Boolean*                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                     | A boolean that specifies whether brand should be a mock or not. If true, brand will be registered as a mock brand. Defaults to false if no value is provided.          |
| `skipAutomaticSecVet`                                                                                                                                                  | *Boolean*                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                     | A flag to disable automatic secondary vetting for brands which it would otherwise be done.                                                                             |