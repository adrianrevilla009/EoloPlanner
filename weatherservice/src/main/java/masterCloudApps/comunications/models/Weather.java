package masterCloudApps.comunications.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Weather extends PanacheEntity {
    public String city;
    public String weather;

    public Weather() {
    }

    public Weather(String city, String weather) {
        this.city = city;
        this.weather = weather;
    }
}
