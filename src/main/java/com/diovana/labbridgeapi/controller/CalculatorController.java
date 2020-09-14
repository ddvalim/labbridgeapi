package com.diovana.labbridgeapi.controller;

import com.diovana.labbridgeapi.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/api/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/{valor}")
    public long getFactorial(@PathVariable long valor ) {
        return calculatorService.calculateFactorial(valor);
    }


}
