package masterCloudApps.comunications.server.services;

import masterCloudApps.comunications.server.dtos.EolicPlantCreateDto;
import masterCloudApps.comunications.server.models.EoloPlant;
import masterCloudApps.comunications.server.repositories.EoloPlantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EoloPlantServiceImpl implements EoloPlantService{
    private final EoloPlantRepository eoloPlantRepository;

    public EoloPlantServiceImpl(EoloPlantRepository eoloPlantRepository) {
        this.eoloPlantRepository = eoloPlantRepository;
    }

    @Override
    public List<EoloPlant> findAll() {
        return this.eoloPlantRepository.findAll();
    }

    @Override
    public EoloPlant save(EolicPlantCreateDto eolicPlantCreateDto) {
        EoloPlant eoloPlant = new EoloPlant();
        eoloPlant.setCity(eolicPlantCreateDto.getCity());
        // TODO call to services to set planning attr
        // use imperative programming to set it
        return this.eoloPlantRepository.save(eoloPlant);
    }

    @Override
    public Optional<EoloPlant> deleteById(Long id) {
        Optional<EoloPlant> eoloPlant = this.eoloPlantRepository.findById(id);
        this.eoloPlantRepository.deleteById(id);
        return eoloPlant;
    }
}
