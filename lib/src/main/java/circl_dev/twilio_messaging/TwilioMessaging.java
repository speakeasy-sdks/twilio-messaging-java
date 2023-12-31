/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging;

import circl_dev.twilio_messaging.utils.HTTPClient;
import circl_dev.twilio_messaging.utils.SpeakeasyHTTPClient;

/**
 * Twilio - Messaging: This is the public Twilio REST API.
 */
public class TwilioMessaging {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        "https://messaging.twilio.com",
	};
  	
    public MessagingV1AlphaSender messagingV1AlphaSender;
    public MessagingV1BrandRegistration messagingV1BrandRegistration;
    public MessagingV1BrandRegistrationOtp messagingV1BrandRegistrationOtp;
    public MessagingV1BrandVetting messagingV1BrandVetting;
    public MessagingV1Deactivations messagingV1Deactivations;
    public MessagingV1DomainCerts messagingV1DomainCerts;
    public MessagingV1DomainConfig messagingV1DomainConfig;
    public MessagingV1DomainConfigMessagingService messagingV1DomainConfigMessagingService;
    public MessagingV1ExternalCampaign messagingV1ExternalCampaign;
    public MessagingV1LinkshorteningMessagingService messagingV1LinkshorteningMessagingService;
    public MessagingV1LinkshorteningMessagingServiceDomainAssociation messagingV1LinkshorteningMessagingServiceDomainAssociation;
    public MessagingV1PhoneNumber messagingV1PhoneNumber;
    public MessagingV1Service messagingV1Service;
    public MessagingV1ShortCode messagingV1ShortCode;
    public MessagingV1TollfreeVerification messagingV1TollfreeVerification;
    public MessagingV1UsAppToPerson messagingV1UsAppToPerson;
    public MessagingV1UsAppToPersonUsecase messagingV1UsAppToPersonUsecase;
    public MessagingV1Usecase messagingV1Usecase;	

	private SDKConfiguration sdkConfiguration;

	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private SDKConfiguration sdkConfiguration = new SDKConfiguration();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.sdkConfiguration.defaultClient = client;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.sdkConfiguration.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.sdkConfiguration.serverUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(serverUrl, params);
			return this;
		}
		
		/**
		 * Allows the overriding of the default server by index
		 * @param serverIdx The server to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerIndex(int serverIdx) {
			this.sdkConfiguration.serverIdx = serverIdx;
			this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public TwilioMessaging build() throws Exception {
			if (this.sdkConfiguration.defaultClient == null) {
				this.sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
			}
			
			if (this.sdkConfiguration.securityClient == null) {
				this.sdkConfiguration.securityClient = this.sdkConfiguration.defaultClient;
			}
			
			if (this.sdkConfiguration.serverUrl == null || this.sdkConfiguration.serverUrl.isBlank()) {
				this.sdkConfiguration.serverUrl = SERVERS[0];
				this.sdkConfiguration.serverIdx = 0;
			}

			if (this.sdkConfiguration.serverUrl.endsWith("/")) {
				this.sdkConfiguration.serverUrl = this.sdkConfiguration.serverUrl.substring(0, this.sdkConfiguration.serverUrl.length() - 1);
			}
			
			return new TwilioMessaging(this.sdkConfiguration);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private TwilioMessaging(SDKConfiguration sdkConfiguration) throws Exception {
		this.sdkConfiguration = sdkConfiguration;
		
		this.messagingV1AlphaSender = new MessagingV1AlphaSender(this.sdkConfiguration);
		
		this.messagingV1BrandRegistration = new MessagingV1BrandRegistration(this.sdkConfiguration);
		
		this.messagingV1BrandRegistrationOtp = new MessagingV1BrandRegistrationOtp(this.sdkConfiguration);
		
		this.messagingV1BrandVetting = new MessagingV1BrandVetting(this.sdkConfiguration);
		
		this.messagingV1Deactivations = new MessagingV1Deactivations(this.sdkConfiguration);
		
		this.messagingV1DomainCerts = new MessagingV1DomainCerts(this.sdkConfiguration);
		
		this.messagingV1DomainConfig = new MessagingV1DomainConfig(this.sdkConfiguration);
		
		this.messagingV1DomainConfigMessagingService = new MessagingV1DomainConfigMessagingService(this.sdkConfiguration);
		
		this.messagingV1ExternalCampaign = new MessagingV1ExternalCampaign(this.sdkConfiguration);
		
		this.messagingV1LinkshorteningMessagingService = new MessagingV1LinkshorteningMessagingService(this.sdkConfiguration);
		
		this.messagingV1LinkshorteningMessagingServiceDomainAssociation = new MessagingV1LinkshorteningMessagingServiceDomainAssociation(this.sdkConfiguration);
		
		this.messagingV1PhoneNumber = new MessagingV1PhoneNumber(this.sdkConfiguration);
		
		this.messagingV1Service = new MessagingV1Service(this.sdkConfiguration);
		
		this.messagingV1ShortCode = new MessagingV1ShortCode(this.sdkConfiguration);
		
		this.messagingV1TollfreeVerification = new MessagingV1TollfreeVerification(this.sdkConfiguration);
		
		this.messagingV1UsAppToPerson = new MessagingV1UsAppToPerson(this.sdkConfiguration);
		
		this.messagingV1UsAppToPersonUsecase = new MessagingV1UsAppToPersonUsecase(this.sdkConfiguration);
		
		this.messagingV1Usecase = new MessagingV1Usecase(this.sdkConfiguration);
	}
}