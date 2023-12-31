/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListBrandVettingListBrandVettingResponse - OK
 */

public class ListBrandVettingListBrandVettingResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public circl_dev.twilio_messaging.models.shared.MessagingV1BrandRegistrationsBrandVetting[] data;

    public ListBrandVettingListBrandVettingResponse withData(circl_dev.twilio_messaging.models.shared.MessagingV1BrandRegistrationsBrandVetting[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    public ListBrandVettingListBrandVettingResponseMeta meta;

    public ListBrandVettingListBrandVettingResponse withMeta(ListBrandVettingListBrandVettingResponseMeta meta) {
        this.meta = meta;
        return this;
    }
    
    public ListBrandVettingListBrandVettingResponse(){}
}
