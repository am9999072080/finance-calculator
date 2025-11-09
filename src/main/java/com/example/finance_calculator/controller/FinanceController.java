package com.example.finance_calculator.controller;

import com.example.finance_calculator.model.FinancialAttitude;
import com.example.finance_calculator.model.NetBalanceResponse;
import com.example.finance_calculator.service.FinanceService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @Operation(description = "Calculate the net balance or profit based on provided financial data.")
    @PostMapping("/calculate")
    public NetBalanceResponse calculateNetBalance(@RequestBody FinancialAttitude finance) {
        return financeService.calculateNetBalance(finance);
    }
}
