package com.learndeutsch.exercises.repository;

import com.learndeutsch.exercises.entity.Exercise;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExerciseRepository extends CrudRepository<Exercise, Long>{
    List<Exercise> findByECategory(String category);
}
