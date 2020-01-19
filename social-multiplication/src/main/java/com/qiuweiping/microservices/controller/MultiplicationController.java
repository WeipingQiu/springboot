package com.qiuweiping.microservices.controller;

import com.qiuweiping.microservices.domain.Multiplication;
import com.qiuweiping.microservices.service.MultiplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiplications")
public class MultiplicationController {

    private Logger log = LoggerFactory.getLogger(MultiplicationController.class);
    private final MultiplicationService multiplicationService;

    @Autowired
    public MultiplicationController(final MultiplicationService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }

    @GetMapping("/random")
    Multiplication getRandomMultiplication() {
        log.info("Handling GET request for random");
        return multiplicationService.createRandomMultiplication();
    }

}
