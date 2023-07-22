/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListBrandVettingResponse {
    
    public String contentType;

    public ListBrandVettingResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public ListBrandVettingListBrandVettingResponse listBrandVettingResponse;

    public ListBrandVettingResponse withListBrandVettingResponse(ListBrandVettingListBrandVettingResponse listBrandVettingResponse) {
        this.listBrandVettingResponse = listBrandVettingResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public ListBrandVettingResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListBrandVettingResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListBrandVettingResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
