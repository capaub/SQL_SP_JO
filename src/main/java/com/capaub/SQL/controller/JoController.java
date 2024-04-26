package com.capaub.SQL.controller;

import com.capaub.SQL.service.JoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
public class JoController {

    private final JoService joService;

    @Autowired
    public JoController(JoService joService) {
        this.joService = joService;
    }

    @GetMapping("/callProcedure")
    public ModelAndView callSp(@RequestParam int year) {
        String jsonData = joService.convertListMapToJson(joService.callSpJoPaysRankedForYear(year));
        return new ModelAndView("chart", "jsonData", jsonData);
    }

}