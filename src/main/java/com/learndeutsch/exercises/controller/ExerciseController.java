package com.learndeutsch.exercises.controller;
//import com.learndeutsch.exercises.entity.Exercise;

import com.learndeutsch.exercises.entity.Nouns;
import com.learndeutsch.exercises.service.NounsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    private NounsService nounsService;

    @GetMapping("noun")
    public ResponseEntity<List<Nouns>> getNouns(){
        List<Nouns> nounsList = nounsService.getNounsWithArticle();
        return new ResponseEntity(nounsList, HttpStatus.OK);
    }
}
