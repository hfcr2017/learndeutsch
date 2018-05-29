package com.learndeutsch.exercises.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="exercises")
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

}
