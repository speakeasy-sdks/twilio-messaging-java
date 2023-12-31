/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateUsAppToPersonResponse {
    
    public String contentType;

    public CreateUsAppToPersonResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateUsAppToPersonResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateUsAppToPersonResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created
     */
    
    public circl_dev.twilio_messaging.models.shared.MessagingV1ServiceUsAppToPerson messagingV1ServiceUsAppToPerson;

    public CreateUsAppToPersonResponse withMessagingV1ServiceUsAppToPerson(circl_dev.twilio_messaging.models.shared.MessagingV1ServiceUsAppToPerson messagingV1ServiceUsAppToPerson) {
        this.messagingV1ServiceUsAppToPerson = messagingV1ServiceUsAppToPerson;
        return this;
    }
    
    public CreateUsAppToPersonResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
