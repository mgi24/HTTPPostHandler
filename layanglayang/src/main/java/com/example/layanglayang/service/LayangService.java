package com.example.layanglayang.service;

import com.example.layanglayang.dto.InputDto;
import org.springframework.stereotype.Service;

@Service
public class LayangService {
    public double calculateResult(InputDto input){
        return (double)(input.getDiagonal1()*input.getDiagonal2())/2;

    }

}
