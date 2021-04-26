package edu.eci.arsw.openweather.apiconnection;

import edu.eci.arsw.openweather.entities.City;
import edu.eci.arsw.openweather.exceptions.IWeatherAppException;
import org.springframework.stereotype.Service;

/**
 * Interfaz IExternalAPI
 */
@Service
public interface IExternalAPI {

    /**
     * Método encargado de consultar el clima de una ciudad a partir de su nombre.
     *
     * @param name - Nombre de la ciudad a consultar
     * @return - Objeto City con información completa de la ciudad
     * @throws IWeatherAppException - IWeatherAppException
     */
    City getCityWeatherByName(String name) throws IWeatherAppException;

}

