package com.example.finance_calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinancialAttitude {
    private double assets;
    private double liabilities;
    private double income;
    private double expenses;
}
