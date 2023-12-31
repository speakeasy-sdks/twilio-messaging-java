/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging;

import circl_dev.twilio_messaging.utils.HTTPClient;
import circl_dev.twilio_messaging.utils.HTTPRequest;
import circl_dev.twilio_messaging.utils.JSON;
import circl_dev.twilio_messaging.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class MessagingV1ExternalCampaign {
	
    /**
	 * CREATE_EXTERNAL_CAMPAIGN_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] CREATE_EXTERNAL_CAMPAIGN_SERVERS = {
        "https://messaging.twilio.com",
    };
	
	private SDKConfiguration sdkConfiguration;

	public MessagingV1ExternalCampaign(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    public circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse createExternalCampaign(circl_dev.twilio_messaging.models.operations.CreateExternalCampaignCreateExternalCampaignRequest request, circl_dev.twilio_messaging.models.operations.CreateExternalCampaignSecurity security) throws Exception {
        return this.createExternalCampaign(request, security, null);
    }

    public circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse createExternalCampaign(circl_dev.twilio_messaging.models.operations.CreateExternalCampaignCreateExternalCampaignRequest request, circl_dev.twilio_messaging.models.operations.CreateExternalCampaignSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(CREATE_EXTERNAL_CAMPAIGN_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(baseUrl, "/v1/Services/PreregisteredUsa2p");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = circl_dev.twilio_messaging.utils.Utils.serializeRequestBody(request, "request", "form");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = circl_dev.twilio_messaging.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse res = new circl_dev.twilio_messaging.models.operations.CreateExternalCampaignResponse(contentType, httpRes.statusCode()) {{
            messagingV1ExternalCampaign = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.shared.MessagingV1ExternalCampaign out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.shared.MessagingV1ExternalCampaign.class);
                res.messagingV1ExternalCampaign = out;
            }
        }

        return res;
    }
}