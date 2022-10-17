package org.example.calculate.service;

import java.math.BigDecimal;

public interface CalculatorService {
    /**
     * Расчет отпускных
     * @param salary заработная плата
     * @param numberOfVacationDays количество дней отпуска
     */
    BigDecimal calculateVacationPay(BigDecimal salary, int numberOfVacationDays);
}
