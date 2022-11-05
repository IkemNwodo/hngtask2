package com.ikem.hngtask2.service;

import com.ikem.hngtask2.dto.ArithmeticQuestion;
import com.ikem.hngtask2.dto.ArithmeticRequest;
import com.ikem.hngtask2.dto.ArithmeticResponse;

public interface ArithmeticService{
    ArithmeticResponse solve(ArithmeticRequest request);

    ArithmeticResponse solveFromQuestion(ArithmeticQuestion request);
    Integer add(Integer x, Integer y);

    Integer subtract(Integer x, Integer y);

    Integer multiply(Integer x, Integer y);

    Integer divide(Integer x, Integer y);
}
