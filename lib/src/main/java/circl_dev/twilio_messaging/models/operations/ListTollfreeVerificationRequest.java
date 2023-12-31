/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging.models.operations;

import circl_dev.twilio_messaging.utils.SpeakeasyMetadata;


public class ListTollfreeVerificationRequest {
    /**
     * The page index. This value is simply for client state.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=Page")
    public Long page;

    public ListTollfreeVerificationRequest withPage(Long page) {
        this.page = page;
        return this;
    }
    
    /**
     * How many resources to return in each list page. The default is 50, and the maximum is 1000.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=PageSize")
    public Long pageSize;

    public ListTollfreeVerificationRequest withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    /**
     * The page token. This is provided by the API.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=PageToken")
    public String pageToken;

    public ListTollfreeVerificationRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    /**
     * The compliance status of the Tollfree Verification record.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=Status")
    public circl_dev.twilio_messaging.models.shared.TollfreeVerificationEnumStatus status;

    public ListTollfreeVerificationRequest withStatus(circl_dev.twilio_messaging.models.shared.TollfreeVerificationEnumStatus status) {
        this.status = status;
        return this;
    }
    
    /**
     * The SID of the Phone Number associated with the Tollfree Verification.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=TollfreePhoneNumberSid")
    public String tollfreePhoneNumberSid;

    public ListTollfreeVerificationRequest withTollfreePhoneNumberSid(String tollfreePhoneNumberSid) {
        this.tollfreePhoneNumberSid = tollfreePhoneNumberSid;
        return this;
    }
    
    public ListTollfreeVerificationRequest(){}
}
