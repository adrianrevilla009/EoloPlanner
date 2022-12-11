package masterCloudApps.comunications.topoService.data;

import jakarta.annotation.PostConstruct;
import masterCloudApps.comunications.topoService.models.TopographicDetails;
import masterCloudApps.comunications.topoService.repositories.TopographicDetailsRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class TopographicDetailsDataLoader {
    private final TopographicDetailsRepository topographicDetailsRepository;

    public TopographicDetailsDataLoader(TopographicDetailsRepository topographicDetailsRepository) {
        this.topographicDetailsRepository = topographicDetailsRepository;
    }

    @PostConstruct
    public void init() {
        TopographicDetails topographicDetails1 = new TopographicDetails("Madrid", "Flat");
        TopographicDetails topographicDetails2 = new TopographicDetails("Barcelona", "Flat");
        TopographicDetails topographicDetails3 = new TopographicDetails("Jaca", "Flat");
        TopographicDetails topographicDetails4 = new TopographicDetails("Andorra", "Flat");
        TopographicDetails topographicDetails5 = new TopographicDetails("Valencia", "Flat");
        TopographicDetails topographicDetails6 = new TopographicDetails("Sevilla", "Flat");
        TopographicDetails topographicDetails7 = new TopographicDetails("Zaragoza", "Flat");
        TopographicDetails topographicDetails8 = new TopographicDetails("Málaga", "Flat");
        TopographicDetails topographicDetails9 = new TopographicDetails("Murcia", "Mountain");
        TopographicDetails topographicDetails10 = new TopographicDetails("Palma", "Mountain");
        TopographicDetails topographicDetails11 = new TopographicDetails("Bilbao", "Mountain");
        TopographicDetails topographicDetails12 = new TopographicDetails("Alicante", "Mountain");
        TopographicDetails topographicDetails13 = new TopographicDetails("Córdoba", "Mountain");
        TopographicDetails topographicDetails14 = new TopographicDetails("Valladolid", "Mountain");
        TopographicDetails topographicDetails15 = new TopographicDetails("Vigo", "Mountain");
        TopographicDetails topographicDetails16 = new TopographicDetails("Gijón", "Mountain");
        TopographicDetails topographicDetails17 = new TopographicDetails("Vitoria", "Mountain");

        List<TopographicDetails> topographicDetailsList = new ArrayList<>(Arrays.asList(topographicDetails1,
                topographicDetails2, topographicDetails3, topographicDetails4, topographicDetails5, topographicDetails6,
                topographicDetails7, topographicDetails8, topographicDetails9, topographicDetails10, topographicDetails11,
                topographicDetails12, topographicDetails13, topographicDetails14, topographicDetails15, topographicDetails16,
                topographicDetails17));

        this.topographicDetailsRepository.saveAll(topographicDetailsList);
    }
}
