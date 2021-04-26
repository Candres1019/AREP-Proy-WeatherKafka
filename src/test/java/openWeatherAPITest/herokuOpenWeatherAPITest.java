package openWeatherAPITest;

import com.google.gson.Gson;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.openweather.entities.City;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class herokuOpenWeatherAPITest {

    @Test
    public void shouldRespond200() throws IOException {
        String name = "London";
        HttpUriRequest request = new HttpGet("https://calderon-arsw-t2.herokuapp.com/weather/city/" + name);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_ACCEPTED, httpResponse.getStatusLine().getStatusCode());
    }

    @Test
    public void shouldRespond404() throws IOException {
        String name = "CiudadNoExiste";
        HttpUriRequest request = new HttpGet("https://calderon-arsw-t2.herokuapp.com/weather/city/" + name);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_NOT_FOUND, httpResponse.getStatusLine().getStatusCode());
    }

    @Test
    public void shouldRespondJson() throws IOException {
        String name = "Chia";
        String jsonMimeType = "application/json";
        HttpUriRequest request = new HttpGet("https://calderon-arsw-t2.herokuapp.com/weather/city/" + name);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        String mimeType = ContentType.getOrDefault(httpResponse.getEntity()).getMimeType();
        Assert.assertEquals(jsonMimeType, mimeType);
    }

    @Test
    public void shouldRespondSoachaCity() throws IOException, UnirestException {
        String name = "Soacha";
        com.mashape.unirest.http.HttpResponse<JsonNode> response = Unirest
                .get("https://calderon-arsw-t2.herokuapp.com/weather/city/" + name)
                .asJson();
        JSONObject jsonObject = response.getBody().getArray().getJSONObject(0);
        City city = new Gson().fromJson(jsonObject.toString(), City.class);
        Assert.assertEquals(name, city.getName());
    }

}
