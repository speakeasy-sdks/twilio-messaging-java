/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListPhoneNumberResponse {
    
    public String contentType;

    public ListPhoneNumberResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public ListPhoneNumberListPhoneNumberResponse listPhoneNumberResponse;

    public ListPhoneNumberResponse withListPhoneNumberResponse(ListPhoneNumberListPhoneNumberResponse listPhoneNumberResponse) {
        this.listPhoneNumberResponse = listPhoneNumberResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public ListPhoneNumberResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListPhoneNumberResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListPhoneNumberResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
