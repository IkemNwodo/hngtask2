package com.ikem.hngtask2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.Pattern;

@Getter
public class ArithmeticRequest {
    @JsonProperty("operation_type")
    private String OperationType;

    //@Pattern(regexp = "[0-9]$", message = "Invalid input! This allows only numbers")
    private Integer x;

    //@Pattern(regexp = "[0-9]$", message = "Invalid input! This allows only numbers")
    private Integer y;
}
