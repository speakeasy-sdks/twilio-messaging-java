/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessagingV1ServiceUsAppToPersonUsecase - OK
 */

public class MessagingV1ServiceUsAppToPersonUsecase {
    /**
     * Human readable name, code, description and post_approval_required (indicates whether or not post approval is required for this Use Case) of A2P Campaign Use Cases.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("us_app_to_person_usecases")
    public Object[] usAppToPersonUsecases;

    public MessagingV1ServiceUsAppToPersonUsecase withUsAppToPersonUsecases(Object[] usAppToPersonUsecases) {
        this.usAppToPersonUsecases = usAppToPersonUsecases;
        return this;
    }
    
    public MessagingV1ServiceUsAppToPersonUsecase(){}
}
