/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateServiceCreateServiceRequestInboundMethod - The HTTP method we should use to call `inbound_request_url`. Can be `GET` or `POST` and the default is `POST`.
 */
public enum CreateServiceCreateServiceRequestInboundMethod {
    HEAD("HEAD"),
    GET("GET"),
    POST("POST"),
    PATCH("PATCH"),
    PUT("PUT"),
    DELETE("DELETE");

    @JsonValue
    public final String value;

    private CreateServiceCreateServiceRequestInboundMethod(String value) {
        this.value = value;
    }
}
