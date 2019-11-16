package org.wildtales.wildtalesspringapp.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.wildtales.wildtalesspringapp.model.Tale;

import java.util.List;


public interface TalesRepository extends MongoRepository<Tale, String> {
    List<Tale> findAll();
}
