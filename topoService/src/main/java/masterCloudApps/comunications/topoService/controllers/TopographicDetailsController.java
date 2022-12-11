package masterCloudApps.comunications.topoService.controllers;

import masterCloudApps.comunications.topoService.data.TopographicDetailsDataLoader;
import masterCloudApps.comunications.topoService.models.TopographicDetails;
import masterCloudApps.comunications.topoService.services.TopographicDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping(value = "/api/topographicdetails")
public class TopographicDetailsController {
    private final TopographicDetailsService topographicDetailsService;
    private final TopographicDetailsDataLoader topographicDetailsDataLoader;

    public TopographicDetailsController(TopographicDetailsService topographicDetailsService,
                                        TopographicDetailsDataLoader topographicDetailsDataLoader) {
        this.topographicDetailsService = topographicDetailsService;
        this.topographicDetailsDataLoader = topographicDetailsDataLoader;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TopographicDetails> findById(@PathVariable("id") String id) {
        Optional<TopographicDetails> topographicDetails = this.topographicDetailsService.findById(id);
        return ResponseEntity.of(topographicDetails);
    }
}
