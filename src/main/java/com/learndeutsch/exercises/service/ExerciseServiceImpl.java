package com.learndeutsch.exercises.service;

import com.learndeutsch.exercises.entity.Exercise;
import com.learndeutsch.exercises.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public List<Exercise> getExercisesByECategory(String category) {
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseRepository.findByECategory(category).forEach(e -> exerciseList.add(e));
        return exerciseList;
    }

    @Override
    public synchronized boolean addExercise(Exercise exercise) {
        List<Exercise> exerciseList = exerciseRepository.findByEFirstPartAndESecondPart(exercise.geteFirstPart(),exercise.geteSecondPart());
        if (exerciseList.size() > 0) {
            return false;
        } else {
            exerciseRepository.save(exercise);
            return true;
        }
    }
}
