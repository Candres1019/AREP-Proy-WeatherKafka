package edu.eci.arsw.openweather.exceptions;

/**
 * Clase de excepción IWeatherAppException
 */
public class IWeatherAppException extends Exception {

    public static String CITY_INFORMATION_NOT_FOUND = "Información De Ciudad No Encontrada";

    /**
     * Constructor de la clase IWeatherAppException
     *
     * @param message - Mensaje de la excepción
     */
    public IWeatherAppException(String message) {
        super(message);
    }

}