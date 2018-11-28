package com.learndeutsch.exercises.repository;

import com.learndeutsch.exercises.entity.Nouns;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NounsRepository extends MongoRepository<Nouns, String> {
    List<Nouns> findAll();
}
