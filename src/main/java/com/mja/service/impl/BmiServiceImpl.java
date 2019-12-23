package com.mja.service.impl;

import com.mja.dao.IBmiDAO;
import com.mja.model.Bmi;
import com.mja.service.IBmiService;
import org.springframework.beans.factory.annotation.Autowired;

public class BmiServiceImpl implements IBmiService {

    @Autowired
    IBmiDAO bmiDAO;

    @Override
    public Bmi save(Bmi bmi) {
        return this.bmiDAO.saveBmi(bmi);
    }
}
