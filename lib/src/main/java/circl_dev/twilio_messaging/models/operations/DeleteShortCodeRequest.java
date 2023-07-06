/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteShortCodeRequest {
    /**
     * The SID of the [Service](https://www.twilio.com/docs/chat/rest/service-resource) to delete the resource from.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ServiceSid")
    public String serviceSid;

    public DeleteShortCodeRequest withServiceSid(String serviceSid) {
        this.serviceSid = serviceSid;
        return this;
    }
    
    /**
     * The SID of the ShortCode resource to delete.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=Sid")
    public String sid;

    public DeleteShortCodeRequest withSid(String sid) {
        this.sid = sid;
        return this;
    }
    
    public DeleteShortCodeRequest(@JsonProperty("ServiceSid") String serviceSid, @JsonProperty("Sid") String sid) {
        this.serviceSid = serviceSid;
        this.sid = sid;
  }
}