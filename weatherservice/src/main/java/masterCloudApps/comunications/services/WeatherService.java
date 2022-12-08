package masterCloudApps.comunications.services;

import masterCloudApps.comunications.models.Weather;

import java.util.Optional;

public interface WeatherService {
    Optional<Weather> findByCityOptional(String city);
}
