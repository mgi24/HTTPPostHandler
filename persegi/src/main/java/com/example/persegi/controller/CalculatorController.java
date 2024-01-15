package com.example.persegi.controller;

import com.example.persegi.dto.InputDto;
import com.example.persegi.dto.OutputDto;
import com.example.persegi.service.PersegiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private PersegiService persegiService;

    @PostMapping("/persegi")
    public ResponseEntity<OutputDto> calculatorEndPoint(@RequestBody InputDto input){
        Integer result = persegiService.calculateResult(input);
        OutputDto output = new OutputDto();
        output.setSisi(input.getSisi());
        output.setOperation("Luas Persegi");
        output.setResult(result);
        return ResponseEntity.ok(output);
    }
}
