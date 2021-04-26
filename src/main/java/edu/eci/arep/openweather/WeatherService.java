package edu.eci.arep.openweather;

import edu.eci.arep.openweather.entities.City;
import edu.eci.arep.openweather.services.IWeatherServices;
import edu.eci.arep.openweather.services.impl.IWeatherServicesImpl;
import org.json.JSONObject;

import static spark.Spark.*;

/**
 * Clase WeatherService
 */
public class WeatherService {

    /**
     * Metodo principal encargado realziar la inicicion y el llamado html, para enviar
     * y recibir datos.
     *
     * @param args - "" utilizaremos
     */
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/static");
        init();
        get("/city/name", (request, response) -> {
            response.type("application/json");
            String cityName = request.queryParams("name");
            try {
                response.status(200);
                IWeatherServices iWeatherServices = new IWeatherServicesImpl();
                City city = iWeatherServices.getCityByName(cityName);
                return new JSONObject(city);
            } catch (Exception e) {
                response.status(404);
                return "No se puede consultar la ciudad";
            }
        });
        get("/city/id", (request, response) -> {
            response.type("application/json");
            Integer cityID = Integer.valueOf(request.queryParams("id"));
            try {
                response.status(200);
                IWeatherServices iWeatherServices = new IWeatherServicesImpl();
                City city = iWeatherServices.getCityWeatherByID(cityID);
                return new JSONObject(city);
            } catch (Exception e) {
                e.printStackTrace();
                response.status(404);
                return "No se puede consultar la ciudad";
            }
        });
        get("/city/cord", (request, response) -> {
            response.type("application/json");
            Double longitud = Double.valueOf(request.queryParams("lon"));
            Double latitud = Double.valueOf(request.queryParams("lat"));
            try {
                response.status(200);
                IWeatherServices iWeatherServices = new IWeatherServicesImpl();
                City city = iWeatherServices.getCityWeatherByLatLon(longitud, latitud);
                return new JSONObject(city);
            } catch (Exception e) {
                e.printStackTrace();
                response.status(404);
                return "No se puede consultar la ciudad";
            }
        });
    }


    /**
     * Retorna el puerto por el que deberia correr el servidor, creado para evitar errores en un ambiente de
     * despliegue no local
     *
     * @return - puerto.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }
}
