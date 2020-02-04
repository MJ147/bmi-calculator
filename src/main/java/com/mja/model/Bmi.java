package com.mja.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bmi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int weight;
    private int height;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private double bmiValue;

}
