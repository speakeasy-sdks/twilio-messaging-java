/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListServiceListServiceResponse - OK
 */

public class ListServiceListServiceResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    public ListServiceListServiceResponseMeta meta;

    public ListServiceListServiceResponse withMeta(ListServiceListServiceResponseMeta meta) {
        this.meta = meta;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("services")
    public circl_dev.twilio_messaging.models.shared.MessagingV1Service[] services;

    public ListServiceListServiceResponse withServices(circl_dev.twilio_messaging.models.shared.MessagingV1Service[] services) {
        this.services = services;
        return this;
    }
    
    public ListServiceListServiceResponse(){}
}