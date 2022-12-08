package masterCloudApps.comunications.services;

import masterCloudApps.comunications.models.Weather;
import masterCloudApps.comunications.repositories.WeatherRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class WeatherServiceImpl implements WeatherService{
    @Inject
    public WeatherRepository weatherRepository;

    @Override
    public Optional<Weather> findByCityOptional(String city) {
        return weatherRepository.findByCityOptional(city);
    }
}
