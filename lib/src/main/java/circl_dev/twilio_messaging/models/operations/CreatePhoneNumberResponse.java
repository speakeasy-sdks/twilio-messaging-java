/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreatePhoneNumberResponse {
    
    public String contentType;

    public CreatePhoneNumberResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public CreatePhoneNumberResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreatePhoneNumberResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created
     */
    
    public circl_dev.twilio_messaging.models.shared.MessagingV1ServicePhoneNumber messagingV1ServicePhoneNumber;

    public CreatePhoneNumberResponse withMessagingV1ServicePhoneNumber(circl_dev.twilio_messaging.models.shared.MessagingV1ServicePhoneNumber messagingV1ServicePhoneNumber) {
        this.messagingV1ServicePhoneNumber = messagingV1ServicePhoneNumber;
        return this;
    }
    
    public CreatePhoneNumberResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
