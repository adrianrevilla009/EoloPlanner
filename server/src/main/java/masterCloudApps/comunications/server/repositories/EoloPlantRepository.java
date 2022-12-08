package masterCloudApps.comunications.server.repositories;

import masterCloudApps.comunications.server.models.EoloPlant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EoloPlantRepository extends JpaRepository<EoloPlant, Long> {
}
