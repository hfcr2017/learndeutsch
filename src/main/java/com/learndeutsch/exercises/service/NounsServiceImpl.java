package com.learndeutsch.exercises.service;

import com.learndeutsch.exercises.entity.Nouns;
import com.learndeutsch.exercises.repository.NounsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NounsServiceImpl implements NounsService {

    @Autowired
    private NounsRepository nounsRepository;

    @Override
    public List<Nouns> getNounsWithArticle() {
        return nounsRepository.findAll();
    }
}
