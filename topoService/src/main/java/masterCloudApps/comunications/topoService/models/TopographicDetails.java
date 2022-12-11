package masterCloudApps.comunications.topoService.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class TopographicDetails {
    @Id
    private String id;
    private String landscape;

}
