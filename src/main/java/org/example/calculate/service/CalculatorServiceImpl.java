package org.example.calculate.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private static final BigDecimal MONTH_IN_YEAR = BigDecimal.valueOf(12);
    private static final BigDecimal VACATION_PAY_RATIO = BigDecimal.valueOf(29.3);

    @Override
    public BigDecimal calculateVacationPay(BigDecimal salary, int numberVacationDays) {
        return salary.divide(MONTH_IN_YEAR, RoundingMode.HALF_EVEN)
                .divide(VACATION_PAY_RATIO, RoundingMode.HALF_EVEN)
                .multiply(BigDecimal.valueOf(numberVacationDays))
                .setScale(2, RoundingMode.HALF_EVEN);
    }
}
