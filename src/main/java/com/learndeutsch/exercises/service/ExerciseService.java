package com.learndeutsch.exercises.service;

import com.learndeutsch.exercises.entity.Exercise;

import java.util.List;

public interface ExerciseService {
    List<Exercise> getExercisesByCategory(String category);
}
