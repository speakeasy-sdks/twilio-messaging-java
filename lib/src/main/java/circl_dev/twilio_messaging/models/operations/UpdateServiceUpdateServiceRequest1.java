/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;


public class UpdateServiceUpdateServiceRequest1 {
    /**
     * Whether to enable [Area Code Geomatch](https://www.twilio.com/docs/sms/services#area-code-geomatch) on the Service Instance.
     */
    @SpeakeasyMetadata("form:name=AreaCodeGeomatch")
    public Boolean areaCodeGeomatch;

    public UpdateServiceUpdateServiceRequest1 withAreaCodeGeomatch(Boolean areaCodeGeomatch) {
        this.areaCodeGeomatch = areaCodeGeomatch;
        return this;
    }
    
    /**
     * The HTTP method we should use to call `fallback_url`. Can be: `GET` or `POST`.
     */
    @SpeakeasyMetadata("form:name=FallbackMethod")
    public UpdateServiceUpdateServiceRequestFallbackMethod fallbackMethod;

    public UpdateServiceUpdateServiceRequest1 withFallbackMethod(UpdateServiceUpdateServiceRequestFallbackMethod fallbackMethod) {
        this.fallbackMethod = fallbackMethod;
        return this;
    }
    
    /**
     * Whether to enable [Fallback to Long Code](https://www.twilio.com/docs/sms/services#fallback-to-long-code) for messages sent through the Service instance.
     */
    @SpeakeasyMetadata("form:name=FallbackToLongCode")
    public Boolean fallbackToLongCode;

    public UpdateServiceUpdateServiceRequest1 withFallbackToLongCode(Boolean fallbackToLongCode) {
        this.fallbackToLongCode = fallbackToLongCode;
        return this;
    }
    
    /**
     * The URL that we call using `fallback_method` if an error occurs while retrieving or executing the TwiML from the Inbound Request URL. If the `use_inbound_webhook_on_number` field is enabled then the webhook url defined on the phone number will override the `fallback_url` defined for the Messaging Service.
     */
    @SpeakeasyMetadata("form:name=FallbackUrl")
    public String fallbackUrl;

    public UpdateServiceUpdateServiceRequest1 withFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }
    
    /**
     * A descriptive string that you create to describe the resource. It can be up to 64 characters long.
     */
    @SpeakeasyMetadata("form:name=FriendlyName")
    public String friendlyName;

    public UpdateServiceUpdateServiceRequest1 withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }
    
    /**
     * The HTTP method we should use to call `inbound_request_url`. Can be `GET` or `POST` and the default is `POST`.
     */
    @SpeakeasyMetadata("form:name=InboundMethod")
    public UpdateServiceUpdateServiceRequestInboundMethod inboundMethod;

    public UpdateServiceUpdateServiceRequest1 withInboundMethod(UpdateServiceUpdateServiceRequestInboundMethod inboundMethod) {
        this.inboundMethod = inboundMethod;
        return this;
    }
    
    /**
     * The URL we call using `inbound_method` when a message is received by any phone number or short code in the Service. When this property is `null`, receiving inbound messages is disabled. All messages sent to the Twilio phone number or short code will not be logged and received on the Account. If the `use_inbound_webhook_on_number` field is enabled then the webhook url defined on the phone number will override the `inbound_request_url` defined for the Messaging Service.
     */
    @SpeakeasyMetadata("form:name=InboundRequestUrl")
    public String inboundRequestUrl;

    public UpdateServiceUpdateServiceRequest1 withInboundRequestUrl(String inboundRequestUrl) {
        this.inboundRequestUrl = inboundRequestUrl;
        return this;
    }
    
    /**
     * Whether to enable the [MMS Converter](https://www.twilio.com/docs/sms/services#mms-converter) for messages sent through the Service instance.
     */
    @SpeakeasyMetadata("form:name=MmsConverter")
    public Boolean mmsConverter;

    public UpdateServiceUpdateServiceRequest1 withMmsConverter(Boolean mmsConverter) {
        this.mmsConverter = mmsConverter;
        return this;
    }
    
    @SpeakeasyMetadata("form:name=ScanMessageContent")
    public circl_dev.twilio_messaging.models.shared.ServiceEnumScanMessageContent scanMessageContent;

    public UpdateServiceUpdateServiceRequest1 withScanMessageContent(circl_dev.twilio_messaging.models.shared.ServiceEnumScanMessageContent scanMessageContent) {
        this.scanMessageContent = scanMessageContent;
        return this;
    }
    
    /**
     * Whether to enable [Smart Encoding](https://www.twilio.com/docs/sms/services#smart-encoding) for messages sent through the Service instance.
     */
    @SpeakeasyMetadata("form:name=SmartEncoding")
    public Boolean smartEncoding;

    public UpdateServiceUpdateServiceRequest1 withSmartEncoding(Boolean smartEncoding) {
        this.smartEncoding = smartEncoding;
        return this;
    }
    
    /**
     * The URL we should call to [pass status updates](https://www.twilio.com/docs/sms/api/message-resource#message-status-values) about message delivery.
     */
    @SpeakeasyMetadata("form:name=StatusCallback")
    public String statusCallback;

    public UpdateServiceUpdateServiceRequest1 withStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }
    
    /**
     * Whether to enable [Sticky Sender](https://www.twilio.com/docs/sms/services#sticky-sender) on the Service instance.
     */
    @SpeakeasyMetadata("form:name=StickySender")
    public Boolean stickySender;

    public UpdateServiceUpdateServiceRequest1 withStickySender(Boolean stickySender) {
        this.stickySender = stickySender;
        return this;
    }
    
    /**
     * Reserved.
     */
    @SpeakeasyMetadata("form:name=SynchronousValidation")
    public Boolean synchronousValidation;

    public UpdateServiceUpdateServiceRequest1 withSynchronousValidation(Boolean synchronousValidation) {
        this.synchronousValidation = synchronousValidation;
        return this;
    }
    
    /**
     * A boolean value that indicates either the webhook url configured on the phone number will be used or `inbound_request_url`/`fallback_url` url will be called when a message is received from the phone number. If this field is enabled then the webhook url defined on the phone number will override the `inbound_request_url`/`fallback_url` defined for the Messaging Service.
     */
    @SpeakeasyMetadata("form:name=UseInboundWebhookOnNumber")
    public Boolean useInboundWebhookOnNumber;

    public UpdateServiceUpdateServiceRequest1 withUseInboundWebhookOnNumber(Boolean useInboundWebhookOnNumber) {
        this.useInboundWebhookOnNumber = useInboundWebhookOnNumber;
        return this;
    }
    
    /**
     * A string that describes the scenario in which the Messaging Service will be used. Examples: [notification, marketing, verification, poll ..]
     */
    @SpeakeasyMetadata("form:name=Usecase")
    public String usecase;

    public UpdateServiceUpdateServiceRequest1 withUsecase(String usecase) {
        this.usecase = usecase;
        return this;
    }
    
    /**
     * How long, in seconds, messages sent from the Service are valid. Can be an integer from `1` to `14,400`.
     */
    @SpeakeasyMetadata("form:name=ValidityPeriod")
    public Long validityPeriod;

    public UpdateServiceUpdateServiceRequest1 withValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    
    public UpdateServiceUpdateServiceRequest1(){}
}
