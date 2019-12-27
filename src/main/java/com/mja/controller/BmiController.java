package com.mja.controller;

import com.mja.model.Bmi;
import com.mja.service.IBmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BmiController {

    @Autowired
    IBmiService bmiService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndex(Model model) {
        model.addAttribute("bmiModel", new Bmi());
        return "index";
    }
}
