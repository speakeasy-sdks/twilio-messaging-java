/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BrandRegistrationsEnumBrandFeedback {
    TAX_ID("TAX_ID"),
    STOCK_SYMBOL("STOCK_SYMBOL"),
    NONPROFIT("NONPROFIT"),
    GOVERNMENT_ENTITY("GOVERNMENT_ENTITY"),
    OTHERS("OTHERS");

    @JsonValue
    public final String value;

    private BrandRegistrationsEnumBrandFeedback(String value) {
        this.value = value;
    }
}
