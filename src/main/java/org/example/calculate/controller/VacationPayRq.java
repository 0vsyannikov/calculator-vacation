package org.example.calculate.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VacationPayRq {
    /**
     * Зарплата
     */
    private BigDecimal salary;

    /**
     * Количество дней отпуска
     */
    private int numberOfVacationDays;
}
