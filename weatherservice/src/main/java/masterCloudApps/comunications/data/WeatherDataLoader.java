package masterCloudApps.comunications.data;

import io.quarkus.runtime.StartupEvent;
import masterCloudApps.comunications.models.Weather;
import masterCloudApps.comunications.repositories.WeatherRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class WeatherDataLoader {
    @Inject
    public WeatherRepository weatherRepository;

    @Transactional
    void onStart(@Observes StartupEvent ev) {
        weatherRepository.persist(new Weather("Madrid", "Sunny"));
        weatherRepository.persist(new Weather("Barcelona", "Sunny"));
        weatherRepository.persist(new Weather("Oviedo", "Rainy"));
        weatherRepository.persist(new Weather("Alicante", "Rainy"));

    }
}
