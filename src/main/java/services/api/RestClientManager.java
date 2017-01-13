package services.api;

import com.jayway.restassured.RestAssured;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import services.weatherApi.WeatherServices;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static org.apache.http.protocol.HTTP.USER_AGENT;

/**
 * Created by Javi on 13/01/2017.
 */
public class RestClientManager {

    private HttpClient httpClient;
    private HttpGet getRequest;
    private HttpPost postRequest;

    private final Logger logger = LogManager.getLogManager().getLogger(WeatherServices.class.getName());

    public RestClientManager(){

        httpClient = HttpClientBuilder.create().build();

    }


    public String get(final String url, final Map<String,String> headers) throws Exception {
        getRequest = new HttpGet(url);
        getRequest.addHeader("User-Agent", USER_AGENT);
        if(headers!=null && !headers.isEmpty()){
            for(String key:headers.keySet()){
                getRequest.addHeader(key,headers.get(key));
            }

        }
        try {
            HttpResponse response = httpClient.execute(getRequest);
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);
            return result;
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error creating Get request");
            throw new Exception("Error creating Get request");
        }
    }

}
