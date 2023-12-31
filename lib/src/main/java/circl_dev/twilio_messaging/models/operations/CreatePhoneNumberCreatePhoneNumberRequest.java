/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreatePhoneNumberCreatePhoneNumberRequest {
    /**
     * The SID of the Phone Number being added to the Service.
     */
    @SpeakeasyMetadata("form:name=PhoneNumberSid")
    public String phoneNumberSid;

    public CreatePhoneNumberCreatePhoneNumberRequest withPhoneNumberSid(String phoneNumberSid) {
        this.phoneNumberSid = phoneNumberSid;
        return this;
    }
    
    public CreatePhoneNumberCreatePhoneNumberRequest(@JsonProperty("PhoneNumberSid") String phoneNumberSid) {
        this.phoneNumberSid = phoneNumberSid;
  }
}
