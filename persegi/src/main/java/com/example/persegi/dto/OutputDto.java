package com.example.persegi.dto;

public class OutputDto extends InputDto{
    private String operation;
    private Integer result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
