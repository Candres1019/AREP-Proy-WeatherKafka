package edu.eci.arep.openweather.entities;

import java.util.Date;
import java.util.List;

/**
 * Clase City
 */
public class City {

    private final Long maxTimeOnCache = 500000L;
    private String name;
    private String base;
    private Integer cod;
    private Integer id;
    private Integer visibility;
    private Integer timezone;
    private Integer dt;
    private Main main;
    private Clouds clouds;
    private Sys sys;
    private Coord coord;
    private Wind wind;
    private List<Weather> weather;
    private Long dateOnCache;

    /**
     * Constructor vació de la clase City
     */
    public City() {
        //Constructor Vacio a Proposito
    }

    /**
     * Constructor de la clase City
     *
     * @param name       - nombre de la ciudad
     * @param base       - base
     * @param cod        - código de respuesta
     * @param id         - id
     * @param visibility - visibilidad
     * @param timezone   - timezone
     * @param dt         - dt
     * @param main       - información principal del clima
     * @param clouds     - nubes
     * @param sys        - sys
     * @param coord      - coordenadas
     * @param wind       - viento
     * @param weather    - clima
     */
    public City(String name, String base, Integer cod, Integer id, Integer visibility, Integer timezone, Integer dt, Main main, Clouds clouds, Sys sys, Coord coord, Wind wind, List<Weather> weather) {
        this.name = name;
        this.base = base;
        this.cod = cod;
        this.id = id;
        this.visibility = visibility;
        this.timezone = timezone;
        this.dt = dt;
        this.main = main;
        this.clouds = clouds;
        this.sys = sys;
        this.coord = coord;
        this.wind = wind;
        this.weather = weather;
    }

    /**
     * Método get del atributo visibility
     *
     * @return - visibility
     */
    public Integer getVisibility() {
        return visibility;
    }

    /**
     * Método set del atributo visibility
     *
     * @param visibility - visibility
     */
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    /**
     * Método get del atributo timezone
     *
     * @return - timezone
     */
    public Integer getTimezone() {
        return timezone;
    }

    /**
     * Método set del atributo timezone
     *
     * @param timezone - timezone
     */
    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    /**
     * Método get del atributo main
     *
     * @return - main
     */
    public Main getMain() {
        return main;
    }

    /**
     * Método set del atributo main
     *
     * @param main - main
     */
    public void setMain(Main main) {
        this.main = main;
    }

    /**
     * Método get del atributo clouds
     *
     * @return - clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * Método set del atributo clouds
     *
     * @param clouds - clouds
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     * Método get del atributo sys
     *
     * @return - sys
     */
    public Sys getSys() {
        return sys;
    }

    /**
     * Método set del atributo sys
     *
     * @param sys - sys
     */
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    /**
     * Método get del atributo dt
     *
     * @return - dt
     */
    public Integer getDt() {
        return dt;
    }

    /**
     * Método set del atributo dt
     *
     * @param dt - dt
     */
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    /**
     * Método get del atributo coord
     *
     * @return - coord
     */
    public Coord getCoord() {
        return coord;
    }

    /**
     * Método set del atributo coord
     *
     * @param coord - coord
     */
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    /**
     * Método get del atributo weather
     *
     * @return - Weather
     */
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     * Método set del atributo weather
     *
     * @param weather - weather
     */
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    /**
     * Método get del atributo name
     *
     * @return - name
     */
    public String getName() {
        return name;
    }

    /**
     * Método set del atributo name
     *
     * @param name - name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método get del atributo base
     *
     * @return - base
     */
    public String getBase() {
        return base;
    }

    /**
     * Método set del atributo base
     *
     * @param base - base
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * Método get del atributo cod
     *
     * @return - cod
     */
    public Integer getCod() {
        return cod;
    }

    /**
     * Método set del atributo cod
     *
     * @param cod - cod
     */
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    /**
     * Método get del atributo id
     *
     * @return - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método set del atributo id
     *
     * @param id - id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método get del atributo wind
     *
     * @return - wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Método set del atributo wind
     *
     * @param wind - wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * Método encargado de poner la hora en mill en la cual fue ingresado el Objeto a cache.
     */
    public void setInCache() {
        dateOnCache = new Date().getTime();
    }

    /**
     * Método encargado de decir si ha pasado la cantidad de tiempo maxima del objeto en cache
     *
     * @return - si no se ha completado o no el tiempo maximo en cache
     */
    public Boolean maxTimeNotCompleted() {
        return dateOnCache < (dateOnCache + maxTimeOnCache);
    }

}
