package com.qiuweiping.microservices.controller;

import com.qiuweiping.microservices.domain.MultiplicationResultAttempt;
import com.qiuweiping.microservices.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results")
public class MultiplicationResultAttemptController {
    private final MultiplicationService multiplicationService;

    @Autowired
    public MultiplicationResultAttemptController(final MultiplicationService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }

    public MultiplicationService getMultiplicationService() {
        return multiplicationService;
    }

    @PostMapping
    ResponseEntity<ResultResponse> postResult(@RequestBody MultiplicationResultAttempt multiplicationResultAttempt) {
        return ResponseEntity.ok(new ResultResponse(multiplicationService.checkAttempt(multiplicationResultAttempt)));
    }

    static final class ResultResponse {
        public  boolean correct;

        ResultResponse(final boolean correct) {
            this.correct = correct;
        }
        private ResultResponse() {

        }

        public boolean isCorrect() {
            return correct;
        }

    }
}
