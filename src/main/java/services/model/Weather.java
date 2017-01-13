package services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Javi on 13/01/2017.
 */
public class Weather {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String id;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String icon;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String description;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String main;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getMain ()
    {
        return main;
    }

    public void setMain (String main)
    {
        this.main = main;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", icon = "+icon+", description = "+description+", main = "+main+"]";
    }
}
