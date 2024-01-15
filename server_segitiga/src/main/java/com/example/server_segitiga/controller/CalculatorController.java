package com.example.server_segitiga.controller;

import com.example.server_segitiga.dto.InputDto;
import com.example.server_segitiga.dto.OutputDto;
import com.example.server_segitiga.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/segitiga")
    public ResponseEntity<OutputDto> calculatorEndPoint(@RequestBody InputDto input){
        double result = calculatorService.calculateResult(input);
        OutputDto output = new OutputDto();
        output.setAlas(input.getAlas());
        output.setTinggi(input.getTinggi());
        output.setOperation("Luas Segitiga");
        output.setResult(result);
        return ResponseEntity.ok(output);
    }
}
