package edu.eci.arsw.openweather.entities;

/**
 * Clase Wind
 */
public class Wind {

    private Integer deg;
    private Double speed;

    /**
     * Constructor de la clase Wind
     *
     * @param deg   - deg
     * @param speed - speed
     */
    public Wind(Integer deg, Double speed) {
        this.deg = deg;
        this.speed = speed;
    }

    /**
     * Método get del atributo deg
     *
     * @return - deg
     */
    public Integer getDeg() {
        return deg;
    }

    /**
     * Método set del atributo deg
     *
     * @param deg - deg
     */
    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    /**
     * Método get del atributo speed
     *
     * @return - speed
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * Método set del atributo speed
     *
     * @param speed - speed
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}