package edu.eci.arep.openweather.entities;

/**
 * Clase Weather
 */
public class Weather {

    private String icon;
    private String description;
    private String main;
    private Integer id;

    /**
     * Constructor de la clase Weather
     *
     * @param icon        - icon
     * @param description - description
     * @param main        - main
     * @param id          - id
     */
    public Weather(String icon, String description, String main, Integer id) {
        this.icon = icon;
        this.description = description;
        this.main = main;
        this.id = id;
    }

    /**
     * Método get del atributo icon
     *
     * @return - icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Método set del atributo icon
     *
     * @param icon - icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Método get del atributo description
     *
     * @return - description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método set del atributo description
     *
     * @param description - description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método get del atributo main
     *
     * @return - main
     */
    public String getMain() {
        return main;
    }

    /**
     * Método set del atributo main
     *
     * @param main - main
     */
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * Método get del atributo id
     *
     * @return - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método set del atributo id
     *
     * @param id - id
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
