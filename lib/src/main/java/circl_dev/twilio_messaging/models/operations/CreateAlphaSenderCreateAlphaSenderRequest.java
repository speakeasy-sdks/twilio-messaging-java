/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAlphaSenderCreateAlphaSenderRequest {
    /**
     * The Alphanumeric Sender ID string. Can be up to 11 characters long. Valid characters are A-Z, a-z, 0-9, space, hyphen `-`, plus `+`, underscore `_` and ampersand `&amp;`. This value cannot contain only numbers.
     */
    @SpeakeasyMetadata("form:name=AlphaSender")
    public String alphaSender;

    public CreateAlphaSenderCreateAlphaSenderRequest withAlphaSender(String alphaSender) {
        this.alphaSender = alphaSender;
        return this;
    }
    
    public CreateAlphaSenderCreateAlphaSenderRequest(@JsonProperty("AlphaSender") String alphaSender) {
        this.alphaSender = alphaSender;
  }
}
