/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateAlphaSenderResponse {
    
    public String contentType;

    public CreateAlphaSenderResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateAlphaSenderResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateAlphaSenderResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created
     */
    
    public circl_dev.twilio_messaging.models.shared.MessagingV1ServiceAlphaSender messagingV1ServiceAlphaSender;

    public CreateAlphaSenderResponse withMessagingV1ServiceAlphaSender(circl_dev.twilio_messaging.models.shared.MessagingV1ServiceAlphaSender messagingV1ServiceAlphaSender) {
        this.messagingV1ServiceAlphaSender = messagingV1ServiceAlphaSender;
        return this;
    }
    
    public CreateAlphaSenderResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}