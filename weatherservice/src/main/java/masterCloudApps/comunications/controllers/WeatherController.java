package masterCloudApps.comunications.controllers;

import masterCloudApps.comunications.models.Weather;
import masterCloudApps.comunications.services.WeatherService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/weather")
public class WeatherController {
    @Inject
    public WeatherService weatherService;

    @GET
    @Path("/{city}")
    public Weather getWeatherByCity(@PathParam("city") String city) {

        return weatherService.findByCityOptional(city).orElseThrow();
    }
}
