package com.learndeutsch.exercises.entity;

import org.springframework.data.annotation.Id;

//import javax.persistence.Embeddable;
//import javax.persistence.Entity;
import java.util.List;

//@Entity
public class Nouns {

    @Id
    private String id;

    private String article;

    private String noun;

    public String getArticle() {
        return article;
    }

    public String getNoun(){
        return noun;
    }
}
