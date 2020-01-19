package com.qiuweiping.microservices.service;

import com.qiuweiping.microservices.domain.Multiplication;
import com.qiuweiping.microservices.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
