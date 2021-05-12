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

    private static final String contentType = "application/json";

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
            response.type(contentType);
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
