package com.ikem.hngtask2.service;

import com.ikem.hngtask2.dto.ArithmeticQuestion;
import com.ikem.hngtask2.dto.ArithmeticRequest;
import com.ikem.hngtask2.dto.ArithmeticResponse;
import com.ikem.hngtask2.dto.enums.OperationType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ArithmeticServiceImpl implements ArithmeticService {

    @Override
    public ArithmeticResponse solve(ArithmeticRequest request) {
        ArithmeticResponse response = new ArithmeticResponse();

        switch (request.getOperationType().toLowerCase()) {
            case "addition":
                response.setOperationType(OperationType.ADDITION);
                response.setResult(add(request.getX(), request.getY()));
                break;
            case "subtraction":
                response.setOperationType(OperationType.SUBTRACTION);
                response.setResult(subtract(request.getX(), request.getY()));
                break;
            case "division":
                response.setOperationType(OperationType.DIVISION);
                response.setResult(divide(request.getX(), request.getY()));
            case "multiplication":
                response.setOperationType(OperationType.MULTIPLICATION);
                response.setResult(multiply(request.getX(), request.getY()));
        }
        return response;
    }

    @Override
    public ArithmeticResponse solveFromQuestion(ArithmeticQuestion request) {
        String question = request.getQuestion();

        Matcher m = Pattern.compile("[0-9]+").matcher(question);
        List<Integer> numbers = new ArrayList<>();
        while (m.find()) {
            numbers.add(Integer.parseInt(m.group()));
        }

        Integer x = numbers.get(0);
        Integer y = numbers.get(1);
        ArithmeticResponse response = new ArithmeticResponse();

        if (question.toLowerCase().contains("add") || question.toLowerCase().contains("addition")) {
            response.setOperationType(OperationType.ADDITION);
            response.setResult(add(x, y));

        } else if (question.toLowerCase().contains("subtract") || question.toLowerCase().contains("subtraction")) {
            response.setOperationType(OperationType.SUBTRACTION);
            response.setResult(subtract(x, y));

        } else if (question.toLowerCase().contains("multiply") || question.toLowerCase().contains("times") || question.toLowerCase().contains("multiplication")) {
            response.setOperationType(OperationType.MULTIPLICATION);
            response.setResult(multiply(x, y));

        } else if (question.toLowerCase().contains("divide") || question.toLowerCase().contains("division")){
            response.setOperationType(OperationType.DIVISION);
            response.setResult(divide(x, y));
        }

        /*switch (question) {
            case "add":
            case "addition":
                response.setOperationType(OperationType.ADDITION.getValue());
                response.setResult(add(x, y));
                break;
            case "subtract":
            case "subtraction":
                response.setOperationType(OperationType.SUBTRACTION.getValue());
                response.setResult(subtract(x, y));
                break;
            case "division":
                response.setOperationType(OperationType.DIVISION.getValue());
                response.setResult(divide(request.getX(), request.getY()));
            case "multiply":
                response.setOperationType(OperationType.MULTIPLICATION.getValue());
                response.setResult(add(request.getX(), request.getY()));
        }*/
        return response;
    }

    @Override
    public Integer add(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public Integer subtract(Integer x, Integer y) {
        return x - y;
    }

    @Override
    public Integer multiply(Integer x, Integer y) {
        return x * y;
    }

    @Override
    public Integer divide(Integer x, Integer y) {
        return x / y;
    }
}
