package com.mja.service;

import com.mja.model.Bmi;

import java.util.List;

public interface IBmiService {
    Bmi save(Bmi bmi);

    List<Bmi> getAllBims();

    double calculateAverageBmi();
}
