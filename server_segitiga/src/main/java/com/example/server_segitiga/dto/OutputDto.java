package com.example.server_segitiga.dto;

public class OutputDto extends InputDto{
    private String operation;
    private double result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
