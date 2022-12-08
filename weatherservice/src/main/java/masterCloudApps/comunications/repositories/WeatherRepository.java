package masterCloudApps.comunications.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import masterCloudApps.comunications.models.Weather;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class WeatherRepository implements PanacheRepository<Weather> {

    public Optional<Weather> findByCityOptional(String city) {
        return find("city", city).firstResultOptional();
    }
}
