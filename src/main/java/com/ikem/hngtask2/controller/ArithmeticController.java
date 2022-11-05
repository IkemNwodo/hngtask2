package com.ikem.hngtask2.controller;

import com.ikem.hngtask2.dto.ArithmeticQuestion;
import com.ikem.hngtask2.dto.ArithmeticRequest;
import com.ikem.hngtask2.dto.ArithmeticResponse;
import com.ikem.hngtask2.service.ArithmeticService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/arithmetic")
public class ArithmeticController {

    private ArithmeticService service;

    public ArithmeticController(ArithmeticService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ArithmeticResponse> solve(@Valid @RequestBody ArithmeticRequest request){
        return new ResponseEntity<>(service.solve(request), HttpStatus.OK);
    }

    @PostMapping("/question")
    public ResponseEntity<ArithmeticResponse> solve(@Valid @RequestBody ArithmeticQuestion request){
        return new ResponseEntity<>(service.solveFromQuestion(request), HttpStatus.OK);
    }
}
