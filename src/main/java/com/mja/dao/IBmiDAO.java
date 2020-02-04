package com.mja.dao;

import com.mja.model.Bmi;

import java.util.List;

public interface IBmiDAO {
    Bmi saveBmi(Bmi bmi);
    List<Bmi> getAllBmis();
}
