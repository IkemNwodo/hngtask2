package com.ikem.hngtask2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ArithmeticQuestion {

    @JsonProperty("operation_type")

    private String question;

}
