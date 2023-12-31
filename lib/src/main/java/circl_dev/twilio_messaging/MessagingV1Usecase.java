/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package circl_dev.twilio_messaging;

import circl_dev.twilio_messaging.utils.HTTPClient;
import circl_dev.twilio_messaging.utils.HTTPRequest;
import circl_dev.twilio_messaging.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class MessagingV1Usecase {
	
    /**
	 * FETCH_USECASE_SERVERS contains the list of server urls available to the SDK.
	 */
    public static final String[] FETCH_USECASE_SERVERS = {
        "https://messaging.twilio.com",
    };
	
	private SDKConfiguration sdkConfiguration;

	public MessagingV1Usecase(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    public circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse fetchUsecase(circl_dev.twilio_messaging.models.operations.FetchUsecaseSecurity security) throws Exception {
        return this.fetchUsecase(security, null);
    }

    public circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse fetchUsecase(circl_dev.twilio_messaging.models.operations.FetchUsecaseSecurity security, String serverURL) throws Exception {
        String baseUrl = circl_dev.twilio_messaging.utils.Utils.templateUrl(FETCH_USECASE_SERVERS[0], new java.util.HashMap<String, String>());
        if (serverURL != null && !serverURL.isBlank()) {
            baseUrl = serverURL;
        }
        
        String url = circl_dev.twilio_messaging.utils.Utils.generateURL(baseUrl, "/v1/Services/Usecases");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = circl_dev.twilio_messaging.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse res = new circl_dev.twilio_messaging.models.operations.FetchUsecaseResponse(contentType, httpRes.statusCode()) {{
            messagingV1Usecase = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (circl_dev.twilio_messaging.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                circl_dev.twilio_messaging.models.shared.MessagingV1Usecase out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), circl_dev.twilio_messaging.models.shared.MessagingV1Usecase.class);
                res.messagingV1Usecase = out;
            }
        }

        return res;
    }
}