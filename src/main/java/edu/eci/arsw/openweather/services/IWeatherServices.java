package edu.eci.arsw.openweather.services;

import edu.eci.arsw.openweather.entities.City;
import edu.eci.arsw.openweather.exceptions.IWeatherAppException;
import org.springframework.stereotype.Service;

/**
 * Interfaz IWeatherServices
 */
@Service
public interface IWeatherServices {

    /**
     * Método para obtener una ciudad dado su nombre.
     *
     * @param name - name
     * @return - Ciudad
     * @throws IWeatherAppException - IWeatherAppException
     */
    City getCityByName(String name) throws IWeatherAppException;

}