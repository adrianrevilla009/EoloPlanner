package masterCloudApps.comunications.server.controllers;

import masterCloudApps.comunications.server.dtos.EolicPlantCreateDto;
import masterCloudApps.comunications.server.models.EoloPlant;
import masterCloudApps.comunications.server.services.EoloPlantService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentRequest;

@Controller
public class EoloPlantController {
    private final EoloPlantService eoloPlantService;

    public EoloPlantController(EoloPlantService eoloPlantService) {
        this.eoloPlantService = eoloPlantService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<Object> findAll() {
        List<EoloPlant> eoloPlantList = this.eoloPlantService.findAll();
        if (eoloPlantList.size() > 0) {
            return ResponseEntity.ok(eoloPlantList);
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/")
    public ResponseEntity<Object> save(@RequestBody EolicPlantCreateDto eolicPlantCreateDto) {
        EoloPlant eoloPlant = this.eoloPlantService.save(eolicPlantCreateDto);
        if (eoloPlant != null) {
            URI location = fromCurrentRequest().path(eoloPlant.getId().toString()).buildAndExpand(eoloPlant.getId()).toUri();
            return ResponseEntity.created(location).body(eoloPlant);
        }
        return ResponseEntity.internalServerError().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<EoloPlant> deleteById(@PathVariable("id") Long id) {
        Optional<EoloPlant> eoloPlant = this.eoloPlantService.deleteById(id);
        return ResponseEntity.of(eoloPlant);
    }
}
