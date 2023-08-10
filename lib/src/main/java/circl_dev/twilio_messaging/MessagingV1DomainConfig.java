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

public class MessagingV1DomainConfig {
	
    /**
	 * FETCH_DOMAIN_CONFIG_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] FETCH_DOMAIN_CONFIG_SERVERS = {
        "https://messaging.twilio.com",
    };
	
    /**
	 * UPDATE_DOMAIN_CONFIG_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] UPDATE_DOMAIN_CONFIG_SERVERS = {
        "https://messaging.twilio.com",
    };
	
	private SDKConfiguration sdkConfiguration;

	public MessagingV1DomainConfig(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    public circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse fetchDomainConfig(circl_dev.twilio_messaging.models.operations.FetchDomainConfigRequest request, circl_dev.twilio_messaging.models.operations.FetchDomainConfigSecurity security) throws Exception {
        return this.fetchDomainConfig(request, security, null);
    }

    public circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse fetchDomainConfig(circl_dev.twilio_messaging.models.operations.FetchDomainConfigRequest request, circl_dev.twilio_messaging.models.operations.FetchDomainConfigSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(FETCH_DOMAIN_CONFIG_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(circl_dev.twilio_messaging.models.operations.FetchDomainConfigRequest.class, baseUrl, "/v1/LinkShortening/Domains/{DomainSid}/Config", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = circl_dev.twilio_messaging.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse res = new circl_dev.twilio_messaging.models.operations.FetchDomainConfigResponse(contentType, httpRes.statusCode()) {{
            messagingV1DomainConfig = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.shared.MessagingV1DomainConfig out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.shared.MessagingV1DomainConfig.class);
                res.messagingV1DomainConfig = out;
            }
        }

        return res;
    }

    public circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse updateDomainConfig(circl_dev.twilio_messaging.models.operations.UpdateDomainConfigRequest request, circl_dev.twilio_messaging.models.operations.UpdateDomainConfigSecurity security) throws Exception {
        return this.updateDomainConfig(request, security, null);
    }

    public circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse updateDomainConfig(circl_dev.twilio_messaging.models.operations.UpdateDomainConfigRequest request, circl_dev.twilio_messaging.models.operations.UpdateDomainConfigSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(UPDATE_DOMAIN_CONFIG_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(circl_dev.twilio_messaging.models.operations.UpdateDomainConfigRequest.class, baseUrl, "/v1/LinkShortening/Domains/{DomainSid}/Config", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = circl_dev.twilio_messaging.utils.Utils.serializeRequestBody(request, "requestBody", "form");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = circl_dev.twilio_messaging.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse res = new circl_dev.twilio_messaging.models.operations.UpdateDomainConfigResponse(contentType, httpRes.statusCode()) {{
            messagingV1DomainConfig = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 201) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.shared.MessagingV1DomainConfig out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.shared.MessagingV1DomainConfig.class);
                res.messagingV1DomainConfig = out;
            }
        }

        return res;
    }
}