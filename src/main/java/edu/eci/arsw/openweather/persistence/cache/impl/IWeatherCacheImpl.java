package edu.eci.arsw.openweather.persistence.cache.impl;

import edu.eci.arsw.openweather.entities.City;
import edu.eci.arsw.openweather.persistence.cache.IWeatherCache;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Clase IWeatherCacheImpl que implemente IWeatherCache
 */
@Service
@Component(value = "weatherCache")
public class IWeatherCacheImpl implements IWeatherCache {

    private static final Map<String, City> cityMap = new ConcurrentHashMap<String, City>();

    /**
     * Método para obtener una ciudad que este almacenada en cache
     *
     * @param name - nombre de la ciudad
     * @return - City
     */
    @Override
    public City getCityWeatherByName(String name) {
        return cityMap.get(name);
    }

    /**
     * Método para guardar una ciudad en cache
     *
     * @param city - city
     */
    @Override
    public void saveCityOnCache(City city) {
        city.setInCache();
        cityMap.put(city.getName(), city);
    }

    /**
     * Método para eliminar una ciudad del cache
     *
     * @param name - name
     */
    @Override
    public void deleteCityOnCache(String name) {
        cityMap.remove(name);
    }

    /**
     * Revisar si una ciudad esta en cache o no, ademas de eliminarla si ha pasado su tiempo maximo en cache.
     *
     * @param name - name
     * @return - si la ciudad esta o no en cache
     */
    @Override
    public Boolean checkCityCache(String name) {
        City city = getCityWeatherByName(name);
        if (city == null) {
            return false;
        }
        if (!city.maxTimeNotCompleted()) {
            deleteCityOnCache(city.getName());
            return false;
        }
        return true;
    }

}
