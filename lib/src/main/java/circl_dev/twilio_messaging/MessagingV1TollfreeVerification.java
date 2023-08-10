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
import org.apache.http.NameValuePair;

public class MessagingV1TollfreeVerification {
	
    /**
	 * CREATE_TOLLFREE_VERIFICATION_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] CREATE_TOLLFREE_VERIFICATION_SERVERS = {
        "https://messaging.twilio.com",
    };
	
    /**
	 * FETCH_TOLLFREE_VERIFICATION_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] FETCH_TOLLFREE_VERIFICATION_SERVERS = {
        "https://messaging.twilio.com",
    };
	
    /**
	 * LIST_TOLLFREE_VERIFICATION_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] LIST_TOLLFREE_VERIFICATION_SERVERS = {
        "https://messaging.twilio.com",
    };
	
    /**
	 * UPDATE_TOLLFREE_VERIFICATION_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] UPDATE_TOLLFREE_VERIFICATION_SERVERS = {
        "https://messaging.twilio.com",
    };
	
	private SDKConfiguration sdkConfiguration;

	public MessagingV1TollfreeVerification(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    public circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationResponse createTollfreeVerification(circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationCreateTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationSecurity security) throws Exception {
        return this.createTollfreeVerification(request, security, null);
    }

    public circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationResponse createTollfreeVerification(circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationCreateTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(CREATE_TOLLFREE_VERIFICATION_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(baseUrl, "/v1/Tollfree/Verifications");
        
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

        circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationResponse res = new circl_dev.twilio_messaging.models.operations.CreateTollfreeVerificationResponse(contentType, httpRes.statusCode()) {{
            messagingV1TollfreeVerification = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.shared.MessagingV1TollfreeVerification out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.shared.MessagingV1TollfreeVerification.class);
                res.messagingV1TollfreeVerification = out;
            }
        }

        return res;
    }

    public circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationResponse fetchTollfreeVerification(circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationSecurity security) throws Exception {
        return this.fetchTollfreeVerification(request, security, null);
    }

    public circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationResponse fetchTollfreeVerification(circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(FETCH_TOLLFREE_VERIFICATION_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationRequest.class, baseUrl, "/v1/Tollfree/Verifications/{Sid}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = circl_dev.twilio_messaging.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationResponse res = new circl_dev.twilio_messaging.models.operations.FetchTollfreeVerificationResponse(contentType, httpRes.statusCode()) {{
            messagingV1TollfreeVerification = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.shared.MessagingV1TollfreeVerification out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.shared.MessagingV1TollfreeVerification.class);
                res.messagingV1TollfreeVerification = out;
            }
        }

        return res;
    }

    public circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationResponse listTollfreeVerification(circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationSecurity security) throws Exception {
        return this.listTollfreeVerification(request, security, null);
    }

    public circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationResponse listTollfreeVerification(circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(LIST_TOLLFREE_VERIFICATION_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(baseUrl, "/v1/Tollfree/Verifications");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = circl_dev.twilio_messaging.utils.Utils.getQueryParams(circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = circl_dev.twilio_messaging.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationResponse res = new circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationResponse(contentType, httpRes.statusCode()) {{
            listTollfreeVerificationResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationListTollfreeVerificationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.operations.ListTollfreeVerificationListTollfreeVerificationResponse.class);
                res.listTollfreeVerificationResponse = out;
            }
        }

        return res;
    }

    public circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationResponse updateTollfreeVerification(circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationSecurity security) throws Exception {
        return this.updateTollfreeVerification(request, security, null);
    }

    public circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationResponse updateTollfreeVerification(circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationRequest request, circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(UPDATE_TOLLFREE_VERIFICATION_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationRequest.class, baseUrl, "/v1/Tollfree/Verifications/{Sid}", request, null);
        
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

        circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationResponse res = new circl_dev.twilio_messaging.models.operations.UpdateTollfreeVerificationResponse(contentType, httpRes.statusCode()) {{
            messagingV1TollfreeVerification = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 202) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.shared.MessagingV1TollfreeVerification out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.shared.MessagingV1TollfreeVerification.class);
                res.messagingV1TollfreeVerification = out;
            }
        }

        return res;
    }
}