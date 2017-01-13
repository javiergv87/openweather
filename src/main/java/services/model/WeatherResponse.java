package services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Javi on 13/01/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Coord coord;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Weather[] weather;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String base;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Main main;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Wind wind;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Clouds clouds;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String dt;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Sys sys;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String id;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String name;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String cod;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String visibility;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
