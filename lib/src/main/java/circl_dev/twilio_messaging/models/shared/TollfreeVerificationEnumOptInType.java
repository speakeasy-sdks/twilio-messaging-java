/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TollfreeVerificationEnumOptInType {
    VERBAL("VERBAL"),
    WEB_FORM("WEB_FORM"),
    PAPER_FORM("PAPER_FORM"),
    VIA_TEXT("VIA_TEXT"),
    MOBILE_QR_CODE("MOBILE_QR_CODE");

    @JsonValue
    public final String value;

    private TollfreeVerificationEnumOptInType(String value) {
        this.value = value;
    }
}