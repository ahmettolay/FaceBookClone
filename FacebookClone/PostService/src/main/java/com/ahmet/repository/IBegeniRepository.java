package com.ahmet.repository;

import com.ahmet.repository.entity.Begeni;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBegeniRepository extends MongoRepository<Begeni,String> {
}
