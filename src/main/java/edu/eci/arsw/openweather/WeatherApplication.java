package edu.eci.arsw.openweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicación Principal WeatherApplication
 */
@SpringBootApplication
public class WeatherApplication {

    /**
     * Método main de ejecución
     *
     * @param args - args
     */
    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

}