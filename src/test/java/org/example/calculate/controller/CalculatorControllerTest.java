package org.example.calculate.controller;

import org.example.calculate.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculatorControllerTest {
    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private CalculatorController calculatorController;

    @Test
    void calculateVacationPayWhenRequestNull() {
        //when then
        assertNull(calculatorController.calculateVacationPay(null));
    }

    @Test
    void calculateVacationPay() {
        //given
        VacationPayRq rq = new VacationPayRq();
        rq.setNumberOfVacationDays(10);
        rq.setSalary(BigDecimal.TEN);

        when(calculatorService.calculateVacationPay(BigDecimal.TEN, 10)).thenReturn(BigDecimal.valueOf(20));

        //when
        BigDecimal actualResult = (BigDecimal) calculatorController.calculateVacationPay(rq);

        //then
        assertNotNull(actualResult);
        assertEquals(BigDecimal.valueOf(20), actualResult);
    }
}