package com.learndeutsch.exercises.controller;

import com.learndeutsch.exercises.entity.Exercise;
import com.learndeutsch.exercises.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("exercises/{category}")
    public ResponseEntity<List<Exercise>> getExeciseByECategory(@PathVariable("category") String category){
        List<Exercise> exerciseList = exerciseService.getExercisesByECategory(category);
        return new ResponseEntity<List<Exercise>>(exerciseList, HttpStatus.OK);
    }
}
