/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteDomainCertV4Security {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic,name=password")
    public String password;

    public DeleteDomainCertV4Security withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic,name=username")
    public String username;

    public DeleteDomainCertV4Security withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public DeleteDomainCertV4Security(@JsonProperty("Username") String username, @JsonProperty("Password") String password) {
        this.username = username;
        this.password = password;
  }
}
