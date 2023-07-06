/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FetchDomainCertV4Request {
    /**
     * Unique string used to identify the domain that this certificate should be associated with.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=DomainSid")
    public String domainSid;

    public FetchDomainCertV4Request withDomainSid(String domainSid) {
        this.domainSid = domainSid;
        return this;
    }
    
    public FetchDomainCertV4Request(@JsonProperty("DomainSid") String domainSid) {
        this.domainSid = domainSid;
  }
}