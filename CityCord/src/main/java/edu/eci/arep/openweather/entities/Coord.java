package edu.eci.arep.openweather.entities;

/**
 * Clase Coord
 */
public class Coord {

    private Double lon;
    private Double lat;

    /**
     * Constructor de la clase Coord
     *
     * @param lon - longitud
     * @param lat - latitud
     */
    public Coord(Double lon, Double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    /**
     * Método get del atributo lon
     *
     * @return - lon
     */
    public Double getLon() {
        return lon;
    }

    /**
     * Método set del atributo lon
     *
     * @param lon - lon
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * Método get del atributo lat
     *
     * @return - lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Método set del atributo lat
     *
     * @param lat - lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }
}