package com.learndeutsch.exercises.controller;
import com.learndeutsch.exercises.entity.Exercise;
import com.learndeutsch.exercises.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("exercises/{category}")
    public ResponseEntity<List<Exercise>> getExeciseByECategory(@PathVariable("category") String category){
        List<Exercise> exerciseList = exerciseService.getExercisesByECategory(category);
        return new ResponseEntity<List<Exercise>>(exerciseList, HttpStatus.OK);
    }

    @PostMapping("exercise")
    public ResponseEntity<Void> addExercise(@RequestBody Exercise exercise) {
        boolean flag = exerciseService.addExercise(exercise);
        if (flag == false){
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }

        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("exercise")
    public ResponseEntity<Void> updateExercise(@RequestBody Exercise exercise){
        boolean flag = exerciseService.updateExercise(exercise);
        if (flag == false){
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("exercise/{id}")
    public ResponseEntity<Void> deleteExercise(@PathVariable("id") Long id){
        exerciseService.deleteExercise(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
