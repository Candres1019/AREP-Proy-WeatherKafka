package edu.eci.arsw.openweather.entities;

/**
 * Clase Clouds
 */
public class Clouds {

    private Integer all;

    /**
     * Constructor de la clase Clouds
     *
     * @param all - all
     */
    public Clouds(Integer all) {
        this.all = all;
    }

    /**
     * Método get del atributo all
     *
     * @return - all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * Método set del atributo all
     *
     * @param all - all
     */
    public void setAll(Integer all) {
        this.all = all;
    }

}