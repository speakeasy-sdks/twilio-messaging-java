/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class FetchDomainCertV4Response {
    
    public String contentType;

    public FetchDomainCertV4Response withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public FetchDomainCertV4Response withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public FetchDomainCertV4Response withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public circl_dev.twilio_messaging.models.shared.MessagingV1DomainCertV4 messagingV1DomainCertV4;

    public FetchDomainCertV4Response withMessagingV1DomainCertV4(circl_dev.twilio_messaging.models.shared.MessagingV1DomainCertV4 messagingV1DomainCertV4) {
        this.messagingV1DomainCertV4 = messagingV1DomainCertV4;
        return this;
    }
    
    public FetchDomainCertV4Response(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}