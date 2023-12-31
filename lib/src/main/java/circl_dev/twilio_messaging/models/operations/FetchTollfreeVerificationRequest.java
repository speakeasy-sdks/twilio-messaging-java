/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FetchTollfreeVerificationRequest {
    /**
     * The unique string to identify Tollfree Verification.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=Sid")
    public String sid;

    public FetchTollfreeVerificationRequest withSid(String sid) {
        this.sid = sid;
        return this;
    }
    
    public FetchTollfreeVerificationRequest(@JsonProperty("Sid") String sid) {
        this.sid = sid;
  }
}
