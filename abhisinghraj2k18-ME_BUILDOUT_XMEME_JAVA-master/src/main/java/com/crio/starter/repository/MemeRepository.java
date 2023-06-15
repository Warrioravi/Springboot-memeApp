package com.crio.starter.repository;

import java.util.List;
import java.util.Optional;
import com.crio.starter.data.MemeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemeRepository extends MongoRepository<MemeEntity,Long> {
    public Optional<MemeEntity> findById(Long id);

    @Query("{'name' : ?0,'url' : ?1 , 'caption' : ?2}")
    public List<MemeEntity> findMemes(String name,String url,String caption);

    
}
