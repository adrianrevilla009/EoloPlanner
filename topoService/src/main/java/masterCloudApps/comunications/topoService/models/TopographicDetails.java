package masterCloudApps.comunications.topoService.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class TopographicDetails {
    @Id
    private String id;
    private String landscape;

}
