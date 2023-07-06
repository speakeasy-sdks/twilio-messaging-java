/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FetchBrandRegistrationsRequest {
    /**
     * The SID of the Brand Registration resource to fetch.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=Sid")
    public String sid;

    public FetchBrandRegistrationsRequest withSid(String sid) {
        this.sid = sid;
        return this;
    }
    
    public FetchBrandRegistrationsRequest(@JsonProperty("Sid") String sid) {
        this.sid = sid;
  }
}