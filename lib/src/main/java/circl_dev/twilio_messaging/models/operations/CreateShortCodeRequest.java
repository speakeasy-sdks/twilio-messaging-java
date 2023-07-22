/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateShortCodeRequest {
    @SpeakeasyMetadata("request:mediaType=application/x-www-form-urlencoded")
    public CreateShortCodeCreateShortCodeRequest requestBody;

    public CreateShortCodeRequest withRequestBody(CreateShortCodeCreateShortCodeRequest requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * The SID of the [Service](https://www.twilio.com/docs/chat/rest/service-resource) to create the resource under.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ServiceSid")
    public String serviceSid;

    public CreateShortCodeRequest withServiceSid(String serviceSid) {
        this.serviceSid = serviceSid;
        return this;
    }
    
    public CreateShortCodeRequest(@JsonProperty("ServiceSid") String serviceSid) {
        this.serviceSid = serviceSid;
  }
}
