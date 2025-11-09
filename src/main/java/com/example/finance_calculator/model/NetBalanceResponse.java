package com.example.finance_calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NetBalanceResponse {
    private double netBalance;
    private String message;
}
