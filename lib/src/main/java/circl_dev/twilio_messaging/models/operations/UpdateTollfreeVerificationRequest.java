/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateTollfreeVerificationRequest {
    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    public UpdateTollfreeVerificationUpdateTollfreeVerificationRequest requestBody;

    public UpdateTollfreeVerificationRequest withRequestBody(UpdateTollfreeVerificationUpdateTollfreeVerificationRequest requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * The unique string to identify Tollfree Verification.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=Sid")
    public String sid;

    public UpdateTollfreeVerificationRequest withSid(String sid) {
        this.sid = sid;
        return this;
    }
    
    public UpdateTollfreeVerificationRequest(@JsonProperty("Sid") String sid) {
        this.sid = sid;
  }
}
