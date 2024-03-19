package com.capaub.SQL.controller;

import com.capaub.SQL.service.JoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
    public List<Map<String, Object>> callSp(@RequestParam int year) {
        return joService.callSpJoPaysRankedForYear(year);
    }
}