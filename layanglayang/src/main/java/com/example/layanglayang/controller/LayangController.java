package com.example.layanglayang.controller;

import com.example.layanglayang.dto.InputDto;
import com.example.layanglayang.dto.OutputDto;
import com.example.layanglayang.service.LayangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LayangController {
    @Autowired
    private LayangService layangService;

    @PostMapping("/layang")
    public ResponseEntity<OutputDto> calculatorEndPoint(@RequestBody InputDto input){
        double result = layangService.calculateResult(input);
        OutputDto output = new OutputDto();
        output.setDiagonal1(input.getDiagonal1());
        output.setDiagonal2(input.getDiagonal2());
        output.setOperation("Luas Layang Layang");
        output.setResult(result);
        return ResponseEntity.ok(output);
    }

}
