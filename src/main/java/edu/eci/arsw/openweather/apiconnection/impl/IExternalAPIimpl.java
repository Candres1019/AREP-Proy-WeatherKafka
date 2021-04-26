package edu.eci.arsw.openweather.apiconnection.impl;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.openweather.apiconnection.IExternalAPI;
import edu.eci.arsw.openweather.entities.City;
import edu.eci.arsw.openweather.exceptions.IWeatherAppException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Clase IExternalAPIimpl encargada de implementar la interfaz IExternalAPI
 */
@Service
@Component(value = "externalApiConsumer")
public class IExternalAPIimpl implements IExternalAPI {

    private static final String apiKey = "24229680e5ecb0bd6da37b29bbcb81de";

    /**
     * Método encargado de consultar el clima de una ciudad a partir de su nombre, a un recurso externo.
     *
     * @param name - Nombre de la ciudad a consultar
     * @return - Objeto City con información completa de la ciudad
     * @throws IWeatherAppException - IWeatherAppException
     */
    @Override
    public City getCityWeatherByName(String name) throws IWeatherAppException {
        City city;
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + name + "&appid=" + apiKey;
        try {
            HttpResponse<JsonNode> response = Unirest
                    .get(url)
                    .asJson();
            JSONObject jsonObject = response.getBody().getArray().getJSONObject(0);
            city = new Gson().fromJson(jsonObject.toString(), City.class);
            return city;
        } catch (UnirestException e) {
            throw new IWeatherAppException(IWeatherAppException.CITY_INFORMATION_NOT_FOUND);
        }
    }

}
