package com.diovana.labbridgeapi.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalculatorService {
    public static Map <Long, Long> historic = new HashMap<>();

    public long calculateFactorial(long value) {
        long factorial = 1;
        for(int i = 1; i <= value; i++) {
            factorial *= i;
        }
        historic.put(value, factorial);
        return factorial;
    }

    public static Map<Long, Long> getHistoric(){
        return historic;
    }
}
