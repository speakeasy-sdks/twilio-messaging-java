/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListPhoneNumberListPhoneNumberResponse - OK
 */

public class ListPhoneNumberListPhoneNumberResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    public ListPhoneNumberListPhoneNumberResponseMeta meta;

    public ListPhoneNumberListPhoneNumberResponse withMeta(ListPhoneNumberListPhoneNumberResponseMeta meta) {
        this.meta = meta;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_numbers")
    public circl_dev.twilio_messaging.models.shared.MessagingV1ServicePhoneNumber[] phoneNumbers;

    public ListPhoneNumberListPhoneNumberResponse withPhoneNumbers(circl_dev.twilio_messaging.models.shared.MessagingV1ServicePhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    
    public ListPhoneNumberListPhoneNumberResponse(){}
}