package com.mja.service.impl;

import com.mja.dao.IBmiDAO;
import com.mja.model.Bmi;
import com.mja.service.IBmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BmiServiceImpl implements IBmiService {

    @Autowired
    IBmiDAO bmiDAO;

    @Override
    public Bmi save(Bmi bmi) {
        return this.bmiDAO.saveBmi(bmi);
    }

    @Override
    public List<Bmi> getAllBims() {
        return this.bmiDAO.getAllBmis();
    }

    @Override
    public double calculateAverageBmi() {
        List<Bmi> bmiList = this.bmiDAO.getAllBmis();
        double result = 0;
        for (Bmi bmi : bmiList) {
            result += bmi.getBmiValue();
        }

        result = (double) Math.round((result / bmiList.size()) * 100) / 100;
        return result;
    }

}
