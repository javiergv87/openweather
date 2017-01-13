package services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Javi on 13/01/2017.
 */
public class Main {

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String humidity;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String pressure;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String temp_max;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String temp_min;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String temp;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String sea_level;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String grnd_level;

    public String getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(String grnd_level) {
        this.grnd_level = grnd_level;
    }

    public String getSea_level() {
        return sea_level;
    }

    public void setSea_level(String sea_level) {
        this.sea_level = sea_level;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getPressure ()
    {
        return pressure;
    }

    public void setPressure (String pressure)
    {
        this.pressure = pressure;
    }

    public String getTemp_max ()
    {
        return temp_max;
    }

    public void setTemp_max (String temp_max)
    {
        this.temp_max = temp_max;
    }

    public String getTemp_min ()
    {
        return temp_min;
    }

    public void setTemp_min (String temp_min)
    {
        this.temp_min = temp_min;
    }

    public String getTemp ()
    {
        return temp;
    }

    public void setTemp (String temp)
    {
        this.temp = temp;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [humidity = "+humidity+", pressure = "+pressure+", temp_max = "+temp_max+", temp_min = "+temp_min+", temp = "+temp+"]";
    }
}
