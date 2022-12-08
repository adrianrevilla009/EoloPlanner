package masterCloudApps.comunications.topoService.services;

import masterCloudApps.comunications.topoService.models.TopographicDetails;
import masterCloudApps.comunications.topoService.repositories.TopographicDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopographicDetailsServiceImpl implements TopographicDetailsService{
    private final TopographicDetailsRepository topographicDetailsRepository;

    public TopographicDetailsServiceImpl(TopographicDetailsRepository topographicDetailsRepository) {
        this.topographicDetailsRepository = topographicDetailsRepository;
    }

    @Override
    public Optional<TopographicDetails> findById(String id) {
        return this.topographicDetailsRepository.findById(id);
    }
}
