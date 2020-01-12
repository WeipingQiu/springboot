package com.qiuweiping.microservices.service;

import com.qiuweiping.microservices.domain.Multiplication;
import org.apache.juli.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MultiplicationServiceTest.class)
@Import(MultiplicationServiceImpl.class)
public class MultiplicationServiceTest {

    Logger logger = LoggerFactory.getLogger(MultiplicationServiceTest.class);

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Test
    public void createRandomMultiplicationTest() {
        logger.debug("Start Debug level");
        given(randomGeneratorService.generatorRandomFactor()).willReturn(50, 30);
        Multiplication multiplication = multiplicationService.createRandomMultiplication();
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);
        logger.debug("End");
    }
}
