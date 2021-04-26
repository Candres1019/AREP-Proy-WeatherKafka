package edu.eci.arsw.openweather.services.impl;

import edu.eci.arsw.openweather.apiconnection.IExternalAPI;
import edu.eci.arsw.openweather.entities.City;
import edu.eci.arsw.openweather.exceptions.IWeatherAppException;
import edu.eci.arsw.openweather.persistence.cache.IWeatherCache;
import edu.eci.arsw.openweather.services.IWeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Clase que implementa la interfaz IWeatherServices
 */
@Service
@Component(value = "weatherServiceImpl")
public class IWeatherServicesImpl implements IWeatherServices {

    @Autowired
    @Qualifier("externalApiConsumer")
    IExternalAPI iExternalAPI;

    @Autowired
    @Qualifier("weatherCache")
    IWeatherCache iWeatherCache;

    /**
     * Método para obtener una ciudad dado su nombre.
     *
     * @param name - name
     * @return - Ciudad
     * @throws IWeatherAppException - IWeatherAppException
     */
    @Override
    public City getCityByName(String name) throws IWeatherAppException {
        City city;
        if (!iWeatherCache.checkCityCache(name)) {
            city = iExternalAPI.getCityWeatherByName(name);
            iWeatherCache.saveCityOnCache(city);
        } else {
            city = iWeatherCache.getCityWeatherByName(name);
        }
        return city;
    }

}
