package edu.eci.arsw.openweather.controllers;

import edu.eci.arsw.openweather.services.IWeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controlador WeatherController para las solicitudes de la aplicación
 */
@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    @Autowired
    @Qualifier("weatherServiceImpl")
    IWeatherServices iWeatherServices;

    /**
     * Método para obtener la información de una ciudad dado su nombre
     *
     * @param name - name
     * @return - ObjetoJSon de la Ciudad con su información
     */
    @RequestMapping(method = RequestMethod.GET, value = "/city/{name}")
    public ResponseEntity<?> getCityWeatherByName(@PathVariable String name) {
        try {
            return new ResponseEntity<>(iWeatherServices.getCityByName(name), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(WeatherController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
