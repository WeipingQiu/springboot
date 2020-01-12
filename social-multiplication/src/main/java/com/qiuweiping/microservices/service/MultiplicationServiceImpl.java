package com.qiuweiping.microservices.service;

import com.qiuweiping.microservices.domain.Multiplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements  MultiplicationService {
    private Logger log = LoggerFactory.getLogger(MultiplicationServiceImpl.class);

    private RandomGeneratorService randomGeneratorService;

    @Autowired
    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        log.debug("Start to createRandomMultiplication");
        int factorA = randomGeneratorService.generatorRandomFactor();
        int factorB = randomGeneratorService.generatorRandomFactor();
        return new Multiplication(factorA, factorB);
    }
}
