package com.example.persegi.service;

import com.example.persegi.dto.InputDto;
import org.springframework.stereotype.Service;

@Service
public class PersegiService {
    public Integer calculateResult(InputDto input){
        return input.getSisi()*input.getSisi();

    }
}
