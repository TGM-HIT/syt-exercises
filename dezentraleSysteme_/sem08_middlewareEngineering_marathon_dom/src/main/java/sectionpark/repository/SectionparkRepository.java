package main.java.sectionpark;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SectionparkRepository extends MongoRepository<TimingstationData, String> {

    public TimingstationData findByTimingstationID(String timingstationID);
    public List<TimingstationData> findBySectionparkID(String sectionparkID);

}
