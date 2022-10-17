package org.example.calculate.service;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void calculateVacationPayWhenSalaryNull(){
        assertNull(calculatorService.calculateVacationPay(null, 0));
    }

    @Test
    void calculateVacationPay(){
        //when
        BigDecimal actualResult = calculatorService.calculateVacationPay(BigDecimal.valueOf(350000), 12);

        //then
        assertEquals(BigDecimal.valueOf(11940).setScale(2, RoundingMode.HALF_EVEN), actualResult);
    }
}