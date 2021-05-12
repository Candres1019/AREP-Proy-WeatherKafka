package edu.eci.arep.openweather.apiconnection;

import edu.eci.arep.openweather.entities.City;
import edu.eci.arep.openweather.exceptions.IWeatherAppException;

/**
 * Interfaz IExternalAPI
 */
public interface IExternalAPI {

    /**
     * Método encargado de consultar el clima de una ciudad a partir de su nombre.
     *
     * @param name - Nombre de la ciudad a consultar
     * @return - Objeto City con información completa de la ciudad
     * @throws IWeatherAppException - IWeatherAppException
     */
    City getCityWeatherByName(String name) throws IWeatherAppException;

    City getCityWeatherByID(Integer ID) throws IWeatherAppException;

    City getCityWeatherByLatLon(Double lat, Double lon) throws IWeatherAppException;
}

