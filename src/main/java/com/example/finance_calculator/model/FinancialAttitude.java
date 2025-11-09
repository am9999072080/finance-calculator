package com.example.finance_calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinancialAttitude {
    private Double assets;
    private Double liabilities;
    private Double income;
    private Double expenses;
}
