package com.qiuweiping.microservices.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGeneratorServiceImpl implements RandomGeneratorService {
    final static int MINIMUM_FACTOR = 11;
    final static int MAXMUM_FACTOR = 99;

    @Override
    public int generatorRandomFactor() {
       return new Random().nextInt((MAXMUM_FACTOR  - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
    }
}
