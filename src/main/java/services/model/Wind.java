package services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Javi on 13/01/2017.
 */
public class Wind {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String speed;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String deg;

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    public String getDeg ()
    {
        return deg;
    }

    public void setDeg (String deg)
    {
        this.deg = deg;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [speed = "+speed+", deg = "+deg+"]";
    }
}
