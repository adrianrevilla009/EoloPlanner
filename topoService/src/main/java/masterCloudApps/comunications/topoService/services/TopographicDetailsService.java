package masterCloudApps.comunications.topoService.services;

import masterCloudApps.comunications.topoService.models.TopographicDetails;

import java.util.Optional;

public interface TopographicDetailsService {
    Optional<TopographicDetails> findById(String id);
}
