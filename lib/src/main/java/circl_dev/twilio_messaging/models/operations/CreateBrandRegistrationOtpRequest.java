/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateBrandRegistrationOtpRequest {
    /**
     * Brand Registration Sid of Sole Proprietor Brand.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=BrandRegistrationSid")
    public String brandRegistrationSid;

    public CreateBrandRegistrationOtpRequest withBrandRegistrationSid(String brandRegistrationSid) {
        this.brandRegistrationSid = brandRegistrationSid;
        return this;
    }
    
    public CreateBrandRegistrationOtpRequest(@JsonProperty("BrandRegistrationSid") String brandRegistrationSid) {
        this.brandRegistrationSid = brandRegistrationSid;
  }
}