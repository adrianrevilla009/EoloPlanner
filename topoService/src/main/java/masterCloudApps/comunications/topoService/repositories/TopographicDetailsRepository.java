package masterCloudApps.comunications.topoService.repositories;

import masterCloudApps.comunications.topoService.models.TopographicDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopographicDetailsRepository extends MongoRepository<TopographicDetails, String> {
}
