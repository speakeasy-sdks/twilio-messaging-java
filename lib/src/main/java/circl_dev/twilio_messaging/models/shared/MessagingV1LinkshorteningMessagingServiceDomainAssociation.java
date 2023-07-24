/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessagingV1LinkshorteningMessagingServiceDomainAssociation - OK
 */

public class MessagingV1LinkshorteningMessagingServiceDomainAssociation {
    /**
     * The unique string that we created to identify the Domain resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain_sid")
    public String domainSid;

    public MessagingV1LinkshorteningMessagingServiceDomainAssociation withDomainSid(String domainSid) {
        this.domainSid = domainSid;
        return this;
    }
    
    /**
     * The unique string that identifies the messaging service
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messaging_service_sid")
    public String messagingServiceSid;

    public MessagingV1LinkshorteningMessagingServiceDomainAssociation withMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;

    public MessagingV1LinkshorteningMessagingServiceDomainAssociation withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public MessagingV1LinkshorteningMessagingServiceDomainAssociation(){}
}
