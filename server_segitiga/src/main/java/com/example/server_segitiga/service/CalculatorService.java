package com.example.server_segitiga.service;

import com.example.server_segitiga.dto.InputDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculateResult(InputDto input){
        return (double)(input.getAlas() * input.getTinggi())/2;

    }
}
