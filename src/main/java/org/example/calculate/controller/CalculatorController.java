package org.example.calculate.controller;

import lombok.RequiredArgsConstructor;
import org.example.calculate.service.CalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;

    @PostMapping(value = "/vacationPay")
    public Object calculateVacationPay(@RequestBody VacationPayRq request) {
        if(request == null){
            return null;
        }
        return calculatorService.calculateVacationPay(request.getSalary(), request.getNumberOfVacationDays());
    }
}
