/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.shared;

import circl_dev.twilio_messaging.utils.DateTimeDeserializer;
import circl_dev.twilio_messaging.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * MessagingV1ServiceUsAppToPerson - Created
 */

public class MessagingV1ServiceUsAppToPerson {
    /**
     * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that the Campaign belongs to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_sid")
    public String accountSid;

    public MessagingV1ServiceUsAppToPerson withAccountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }
    
    /**
     * The unique string to identify the A2P brand.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("brand_registration_sid")
    public String brandRegistrationSid;

    public MessagingV1ServiceUsAppToPerson withBrandRegistrationSid(String brandRegistrationSid) {
        this.brandRegistrationSid = brandRegistrationSid;
        return this;
    }
    
    /**
     * The Campaign Registry (TCR) Campaign ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaign_id")
    public String campaignId;

    public MessagingV1ServiceUsAppToPerson withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    
    /**
     * Campaign status. Examples: IN_PROGRESS, VERIFIED, FAILED.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaign_status")
    public String campaignStatus;

    public MessagingV1ServiceUsAppToPerson withCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
        return this;
    }
    
    /**
     * The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_created")
    public OffsetDateTime dateCreated;

    public MessagingV1ServiceUsAppToPerson withDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_updated")
    public OffsetDateTime dateUpdated;

    public MessagingV1ServiceUsAppToPerson withDateUpdated(OffsetDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }
    
    /**
     * A short description of what this SMS campaign does. Min length: 40 characters. Max length: 4096 characters.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public MessagingV1ServiceUsAppToPerson withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Details indicating why a campaign registration failed. These errors can indicate one or more fields that were incorrect or did not meet review requirements.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public Object[] errors;

    public MessagingV1ServiceUsAppToPerson withErrors(Object[] errors) {
        this.errors = errors;
        return this;
    }
    
    /**
     * Indicate that this SMS campaign will send messages that contain links.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_embedded_links")
    public Boolean hasEmbeddedLinks;

    public MessagingV1ServiceUsAppToPerson withHasEmbeddedLinks(Boolean hasEmbeddedLinks) {
        this.hasEmbeddedLinks = hasEmbeddedLinks;
        return this;
    }
    
    /**
     * Indicates that this SMS campaign will send messages that contain phone numbers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_embedded_phone")
    public Boolean hasEmbeddedPhone;

    public MessagingV1ServiceUsAppToPerson withHasEmbeddedPhone(Boolean hasEmbeddedPhone) {
        this.hasEmbeddedPhone = hasEmbeddedPhone;
        return this;
    }
    
    /**
     * End users should be able to text in a keyword to receive help. Those keywords must be provided as part of the campaign registration request. This field is required if managing help keywords yourself (i.e. not using Twilio's Default or Advanced Opt Out features). Values must be alphanumeric. 255 character maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("help_keywords")
    public String[] helpKeywords;

    public MessagingV1ServiceUsAppToPerson withHelpKeywords(String[] helpKeywords) {
        this.helpKeywords = helpKeywords;
        return this;
    }
    
    /**
     * When customers receive the help keywords from their end users, Twilio customers are expected to send back an auto-generated response; this may include the brand name and additional support contact information. This field is required if managing help keywords yourself (i.e. not using Twilio's Default or Advanced Opt Out features). 20 character minimum. 320 character maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("help_message")
    public String helpMessage;

    public MessagingV1ServiceUsAppToPerson withHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
        return this;
    }
    
    /**
     * Indicates whether the campaign was registered externally or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_externally_registered")
    public Boolean isExternallyRegistered;

    public MessagingV1ServiceUsAppToPerson withIsExternallyRegistered(Boolean isExternallyRegistered) {
        this.isExternallyRegistered = isExternallyRegistered;
        return this;
    }
    
    /**
     * Details around how a consumer opts-in to their campaign, therefore giving consent to receive their messages. If multiple opt-in methods can be used for the same campaign, they must all be listed. 40 character minimum. 2048 character maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_flow")
    public String messageFlow;

    public MessagingV1ServiceUsAppToPerson withMessageFlow(String messageFlow) {
        this.messageFlow = messageFlow;
        return this;
    }
    
    /**
     * Message samples, at least 1 and up to 5 sample messages (at least 2 for starter/sole proprietor), &gt;=20 chars, &lt;=1024 chars each.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_samples")
    public String[] messageSamples;

    public MessagingV1ServiceUsAppToPerson withMessageSamples(String[] messageSamples) {
        this.messageSamples = messageSamples;
        return this;
    }
    
    /**
     * The SID of the [Messaging Service](https://www.twilio.com/docs/messaging/services/api) that the resource is associated with.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messaging_service_sid")
    public String messagingServiceSid;

    public MessagingV1ServiceUsAppToPerson withMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
        return this;
    }
    
    /**
     * A boolean that specifies whether campaign is a mock or not. Mock campaigns will be automatically created if using a mock brand. Mock campaigns should only be used for testing purposes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mock")
    public Boolean mock;

    public MessagingV1ServiceUsAppToPerson withMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    
    /**
     * If end users can text in a keyword to start receiving messages from this campaign, those keywords must be provided. This field is required if end users can text in a keyword to start receiving messages from this campaign. Values must be alphanumeric. 255 character maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("opt_in_keywords")
    public String[] optInKeywords;

    public MessagingV1ServiceUsAppToPerson withOptInKeywords(String[] optInKeywords) {
        this.optInKeywords = optInKeywords;
        return this;
    }
    
    /**
     * If end users can text in a keyword to start receiving messages from this campaign, the auto-reply messages sent to the end users must be provided. The opt-in response should include the Brand name, confirmation of opt-in enrollment to a recurring message campaign, how to get help, and clear description of how to opt-out. This field is required if end users can text in a keyword to start receiving messages from this campaign. 20 character minimum. 320 character maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("opt_in_message")
    public String optInMessage;

    public MessagingV1ServiceUsAppToPerson withOptInMessage(String optInMessage) {
        this.optInMessage = optInMessage;
        return this;
    }
    
    /**
     * End users should be able to text in a keyword to stop receiving messages from this campaign. Those keywords must be provided. This field is required if managing opt out keywords yourself (i.e. not using Twilio's Default or Advanced Opt Out features). Values must be alphanumeric. 255 character maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("opt_out_keywords")
    public String[] optOutKeywords;

    public MessagingV1ServiceUsAppToPerson withOptOutKeywords(String[] optOutKeywords) {
        this.optOutKeywords = optOutKeywords;
        return this;
    }
    
    /**
     * Upon receiving the opt-out keywords from the end users, Twilio customers are expected to send back an auto-generated response, which must provide acknowledgment of the opt-out request and confirmation that no further messages will be sent. It is also recommended that these opt-out messages include the brand name. This field is required if managing opt out keywords yourself (i.e. not using Twilio's Default or Advanced Opt Out features). 20 character minimum. 320 character maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("opt_out_message")
    public String optOutMessage;

    public MessagingV1ServiceUsAppToPerson withOptOutMessage(String optOutMessage) {
        this.optOutMessage = optOutMessage;
        return this;
    }
    
    /**
     * Rate limit and/or classification set by each carrier, Ex. AT&amp;T or T-Mobile.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate_limits")
    public Object rateLimits;

    public MessagingV1ServiceUsAppToPerson withRateLimits(Object rateLimits) {
        this.rateLimits = rateLimits;
        return this;
    }
    
    /**
     * The unique string that identifies a US A2P Compliance resource `QE2c6890da8086d771620e9b13fadeba0b`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sid")
    public String sid;

    public MessagingV1ServiceUsAppToPerson withSid(String sid) {
        this.sid = sid;
        return this;
    }
    
    /**
     * The absolute URL of the US App to Person resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;

    public MessagingV1ServiceUsAppToPerson withUrl(String url) {
        this.url = url;
        return this;
    }
    
    /**
     * A2P Campaign Use Case. Examples: [ 2FA, EMERGENCY, MARKETING, SOLE_PROPRIETOR...]. SOLE_PROPRIETOR campaign use cases can only be created by SOLE_PROPRIETOR Brands, and there can only be one SOLE_PROPRIETOR campaign created per SOLE_PROPRIETOR Brand.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("us_app_to_person_usecase")
    public String usAppToPersonUsecase;

    public MessagingV1ServiceUsAppToPerson withUsAppToPersonUsecase(String usAppToPersonUsecase) {
        this.usAppToPersonUsecase = usAppToPersonUsecase;
        return this;
    }
    
    public MessagingV1ServiceUsAppToPerson(){}
}