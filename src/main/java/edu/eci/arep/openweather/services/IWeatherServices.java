package edu.eci.arep.openweather.services;

import edu.eci.arep.openweather.entities.City;
import edu.eci.arep.openweather.exceptions.IWeatherAppException;

/**
 * Interfaz IWeatherServices
 */
public interface IWeatherServices {

    /**
     * Método para obtener una ciudad dado su nombre.
     *
     * @param name - name
     * @return - Ciudad
     * @throws IWeatherAppException - IWeatherAppException
     */
    City getCityByName(String name) throws IWeatherAppException;

    City getCityWeatherByID(Integer id) throws IWeatherAppException;

    City getCityWeatherByLatLon(Double lat, Double lon) throws IWeatherAppException;
}