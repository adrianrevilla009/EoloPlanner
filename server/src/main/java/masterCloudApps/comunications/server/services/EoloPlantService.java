package masterCloudApps.comunications.server.services;

import masterCloudApps.comunications.server.dtos.EolicPlantCreateDto;
import masterCloudApps.comunications.server.models.EoloPlant;

import java.util.List;
import java.util.Optional;

public interface EoloPlantService {
    List<EoloPlant> findAll();
    EoloPlant save(EolicPlantCreateDto eolicPlantCreateDto);
    Optional<EoloPlant> deleteById(Long id);

}
