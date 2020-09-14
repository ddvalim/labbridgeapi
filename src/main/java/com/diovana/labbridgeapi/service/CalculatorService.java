package com.diovana.labbridgeapi.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public long calculateFactorial(long value) {
        long factorial = 1;
        for(int i = 1; i <= value; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
