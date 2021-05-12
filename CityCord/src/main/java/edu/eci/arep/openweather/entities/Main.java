package edu.eci.arep.openweather.entities;

/**
 * Clase Main
 */
public class Main {

    private Double temp;
    private Double temp_min;
    private Integer humidity;
    private Integer pressure;
    private Double feels_like;
    private Double temp_max;

    /**
     * Constructor de la clase Main
     *
     * @param temp       - temp
     * @param temp_min   - temp_min
     * @param humidity   - humedad
     * @param pressure   - presión
     * @param feels_like - como se siente la temp
     * @param temp_max   - temp_max
     */
    public Main(Double temp, Double temp_min, Integer humidity, Integer pressure, Double feels_like, Double temp_max) {
        this.temp = temp;
        this.temp_min = temp_min;
        this.humidity = humidity;
        this.pressure = pressure;
        this.feels_like = feels_like;
        this.temp_max = temp_max;
    }

    /**
     * Método get del atributo temp
     *
     * @return - temp
     */
    public Double getTemp() {
        return temp;
    }

    /**
     * Método set del atributo temp
     *
     * @param temp - temp
     */
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    /**
     * Método get del atributo temp_min
     *
     * @return - temp_min
     */
    public Double getTemp_min() {
        return temp_min;
    }

    /**
     * Método set del atributo temp_min
     *
     * @param temp_min - temp_min
     */
    public void setTemp_min(Double temp_min) {
        this.temp_min = temp_min;
    }

    /**
     * Método get del atributo humidity
     *
     * @return - humidity
     */
    public Integer getHumidity() {
        return humidity;
    }

    /**
     * Método set del atributo humidity
     *
     * @param humidity - humidity
     */
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    /**
     * Método get del atributo pressure
     *
     * @return - pressure
     */
    public Integer getPressure() {
        return pressure;
    }

    /**
     * Método set del atributo pressure
     *
     * @param pressure - pressure
     */
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    /**
     * Método get del atributo feels_like
     *
     * @return - feels_like
     */
    public Double getFeels_like() {
        return feels_like;
    }

    /**
     * Método set del atributo feels_like
     *
     * @param feels_like - feels_like
     */
    public void setFeels_like(Double feels_like) {
        this.feels_like = feels_like;
    }

    /**
     * Método get del atributo temp_max
     *
     * @return - temp_max
     */
    public Double getTemp_max() {
        return temp_max;
    }

    /**
     * Método set del atributo temp_max
     *
     * @param temp_max - temp_max
     */
    public void setTemp_max(Double temp_max) {
        this.temp_max = temp_max;
    }

}
