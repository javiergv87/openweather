package services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Javi on 13/01/2017.
 */
public class Sys {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String message;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String id;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String sunset;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String sunrise;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String type;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String country;

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getSunset ()
    {
        return sunset;
    }

    public void setSunset (String sunset)
    {
        this.sunset = sunset;
    }

    public String getSunrise ()
    {
        return sunrise;
    }

    public void setSunrise (String sunrise)
    {
        this.sunrise = sunrise;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", id = "+id+", sunset = "+sunset+", sunrise = "+sunrise+", type = "+type+", country = "+country+"]";
    }
}

