package com.ikem.hngtask2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ikem.hngtask2.dto.enums.OperationType;
import lombok.Data;
import lombok.Setter;

@Setter
@Data
public class ArithmeticResponse {
    private String slackUsername = "Ikem";
    @JsonProperty("operation_type")
    private OperationType OperationType;
    private Integer result;
}
