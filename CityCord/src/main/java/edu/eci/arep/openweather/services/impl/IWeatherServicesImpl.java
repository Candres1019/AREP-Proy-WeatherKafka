package edu.eci.arep.openweather.services.impl;

import edu.eci.arep.openweather.apiconnection.IExternalAPI;
import edu.eci.arep.openweather.apiconnection.impl.IExternalAPIimpl;
import edu.eci.arep.openweather.entities.City;
import edu.eci.arep.openweather.exceptions.IWeatherAppException;
import edu.eci.arep.openweather.services.IWeatherServices;

/**
 * Clase que implementa la interfaz IWeatherServices
 */
public class IWeatherServicesImpl implements IWeatherServices {

    IExternalAPI iExternalAPI = new IExternalAPIimpl();

    /**
     * Método para obtener una ciudad dado su nombre.
     *
     * @param name - name
     * @return - Ciudad
     * @throws IWeatherAppException - IWeatherAppException
     */
    @Override
    public City getCityByName(String name) throws IWeatherAppException {
        return iExternalAPI.getCityWeatherByName(name);
    }

    @Override
    public City getCityWeatherByID(Integer id) throws IWeatherAppException {
        return iExternalAPI.getCityWeatherByID(id);
    }

    @Override
    public City getCityWeatherByLatLon(Double lat, Double lon) throws IWeatherAppException {
        return iExternalAPI.getCityWeatherByLatLon(lat, lon);
    }

}
