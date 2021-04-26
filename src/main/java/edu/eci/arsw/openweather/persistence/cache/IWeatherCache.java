package edu.eci.arsw.openweather.persistence.cache;

import edu.eci.arsw.openweather.entities.City;
import org.springframework.stereotype.Service;

/**
 * Interfaz de IWeatherCache
 */
@Service
public interface IWeatherCache {

    /**
     * Método para obtener una ciudad que este almacenada en cache
     *
     * @param name - nombre de la ciudad
     * @return - City
     */
    City getCityWeatherByName(String name);

    /**
     * Método para guardar una ciudad en cache
     *
     * @param city - city
     */
    void saveCityOnCache(City city);

    /**
     * Método para eliminar una ciudad del cache
     *
     * @param name - name
     */
    void deleteCityOnCache(String name);

    /**
     * Revisar si una ciudad esta en cache o no.
     *
     * @param name - name
     * @return - si la ciudad esta o no en cache
     */
    Boolean checkCityCache(String name);
}
