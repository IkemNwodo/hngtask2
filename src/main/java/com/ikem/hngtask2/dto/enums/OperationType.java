package com.ikem.hngtask2.dto.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationType {

    ADDITION("addition"),
    SUBTRACTION("subtraction"),
    DIVISION("division"),
    MULTIPLICATION("multiplication");

    final String value;

    OperationType(String value){
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
