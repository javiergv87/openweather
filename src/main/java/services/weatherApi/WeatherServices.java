package services.weatherApi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.config.ClientConfig;
import com.sun.deploy.util.SessionState;
import com.sun.deploy.util.StringUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import services.api.RestClientManager;
import services.model.WeatherResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Javi on 13/01/2017.
 */
public class WeatherServices {

    private final Logger logger = LogManager.getLogManager().getLogger(WeatherServices.class.getName());

    private RestClientManager restClientManager;

    private static String BASE_URL = "http://api.openweathermap.org/data/2.5";

    private static String WEATHER_PATH = "/weather";

    private static String CITY_PARAMETER = "?q=%s";

    private static String ID_PARAMETER = "?id=%s";

    private static String COORD_PARAMETER= "?lat=%s&lon=%s";

    private static String UNITS = "units=%s";

    private static String AND_PARAMETER = "&";

    public WeatherServices() {
        restClientManager = new RestClientManager();
    }

    public WeatherResponse getWeatherAtCity(String city, String apiKey) throws Exception {
        Map<String,String> headers= new HashMap<>();
        String uri = BASE_URL.concat(WEATHER_PATH).concat(String.format(CITY_PARAMETER,city));
        headers.put("X-API-KEY",apiKey);
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        WeatherResponse response = objectMapper.readValue(restClientManager.get(uri,headers), WeatherResponse.class);
        return response;

    }

    public WeatherResponse getWeatherAtCityByCoordinates(String lon, String lat, String apiKey) throws Exception {
        Map<String,String> headers= new HashMap<>();
        String uri = BASE_URL.concat(WEATHER_PATH).concat(String.format(COORD_PARAMETER,lat,lon));
        headers.put("X-API-KEY",apiKey);
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        WeatherResponse response = objectMapper.readValue(restClientManager.get(uri,headers), WeatherResponse.class);
        return response;

    }

    public WeatherResponse getWeatherAtCityById(String id, String apiKey) throws Exception {
        Map<String,String> headers= new HashMap<>();
        String uri = BASE_URL.concat(WEATHER_PATH).concat(String.format(ID_PARAMETER,id));
        headers.put("X-API-KEY",apiKey);
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        WeatherResponse response = objectMapper.readValue(restClientManager.get(uri,headers), WeatherResponse.class);
        return response;

    }

    public WeatherResponse getWeatherByCityIdAndUnit(String id,String units,String apiKey) throws Exception {
        Map<String,String> headers= new HashMap<>();
        String uri = BASE_URL.concat(WEATHER_PATH).concat(String.format(ID_PARAMETER,id)).concat(AND_PARAMETER).concat(String.format(UNITS,units));
        headers.put("X-API-KEY",apiKey);
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        WeatherResponse response = objectMapper.readValue(restClientManager.get(uri,headers), WeatherResponse.class);
        return response;
    }

}