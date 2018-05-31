package com.learndeutsch.exercises.service;

import com.learndeutsch.exercises.entity.Exercise;

import java.util.List;

public interface ExerciseService {
    List<Exercise> getExercisesByECategory(String category);
    boolean addExercise(Exercise exercise);
    boolean updateExercise(Exercise exercise);
    void deleteExercise(Long id);
}
