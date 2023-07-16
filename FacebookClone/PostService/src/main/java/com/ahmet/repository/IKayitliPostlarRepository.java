package com.ahmet.repository;

import com.ahmet.repository.entity.KayitliPostlar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKayitliPostlarRepository extends MongoRepository<KayitliPostlar,String> {
}
