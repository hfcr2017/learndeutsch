package com.learndeutsch.exercises.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="EXERCISES")
public class Exercise implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="E_ID")
    private long exerciseId;

    @Column(name="E_FIRST_PART")
    private String eFirstPart;

    @Column(name="E_SECOND_PART")
    private String eSecondPart;

    @Column(name="E_SOLUTION")
    private String eSolution;

    @Column(name="E_OPTION_1")
    private String eOption1;

    @Column(name="E_OPTION_2")
    private String eOption2;

    @Column(name="E_CATEGORY")
    private String eCategory;

    public long getExerciseId() {
        return exerciseId;
    }
    public void setExerciseId(long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String geteFirstPart() {
        return eFirstPart;
    }

    public void seteFirstPart(String eFirstPart) {
        this.eFirstPart = eFirstPart;
    }

    public String geteSecondPart() {
        return eSecondPart;
    }

    public void seteSecondPart(String eSecondPart) {
        this.eSecondPart = eSecondPart;
    }

    public String geteSolution() {
        return eSolution;
    }

    public void seteSolution(String eSolution) {
        this.eSolution = eSolution;
    }

    public String geteOption1() {
        return eOption1;
    }

    public void seteOption1(String eOption1) {
        this.eOption1 = eOption1;
    }

    public String geteOption2() {
        return eOption2;
    }

    public void seteOption2(String eOption2) {
        this.eOption2 = eOption2;
    }

    public String geteCategory() {
        return eCategory;
    }

    public void seteCategory(String eCategory) {
        this.eCategory = eCategory;
    }
}
