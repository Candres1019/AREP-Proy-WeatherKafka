package edu.eci.arsw.openweather.entities;

/**
 * Clase Sys
 */
public class Sys {

    private String country;
    private Integer sunrise;
    private Integer sunset;
    private Integer id;
    private Integer type;

    /**
     * Constructor de la clase Sys
     *
     * @param country - pais
     * @param sunrise - amanecer
     * @param sunset  - atardecer
     * @param id      - id
     * @param type    - tipo
     */
    public Sys(String country, Integer sunrise, Integer sunset, Integer id, Integer type) {
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.id = id;
        this.type = type;
    }

    /**
     * Método get del atributo country
     *
     * @return - country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Método set del atributo country
     *
     * @param country - country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Método get del atributo sunrise
     *
     * @return - sunrise
     */
    public Integer getSunrise() {
        return sunrise;
    }

    /**
     * Método set del atributo sunrise
     *
     * @param sunrise - sunrise
     */
    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * Método get del atributo sunset
     *
     * @return - sunset
     */
    public Integer getSunset() {
        return sunset;
    }

    /**
     * Método set del atributo sunset
     *
     * @param sunset - sunset
     */
    public void setSunset(Integer sunset) {
        this.sunset = sunset;
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
     * Método get del atributo type
     *
     * @return - type
     */
    public Integer getType() {
        return type;
    }

    /**
     * Método set del atributo type
     *
     * @param type - type
     */
    public void setType(Integer type) {
        this.type = type;
    }
}