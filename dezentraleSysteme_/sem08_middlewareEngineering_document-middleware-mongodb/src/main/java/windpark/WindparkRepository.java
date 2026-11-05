package main.java.windpark;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WindparkRepository extends MongoRepository<WindengineData, String> {

    public WindengineData findByWindengineID(String windengineID);
    public List<WindengineData> findByWindparkID(String windparkID);

}
