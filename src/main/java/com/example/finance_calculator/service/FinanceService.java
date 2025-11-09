package com.example.finance_calculator.service;

import com.example.finance_calculator.model.FinancialAttitude;
import com.example.finance_calculator.model.NetBalanceResponse;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    public NetBalanceResponse calculateNetBalance(FinancialAttitude finance) {
        // Формула расчета чистого баланса:
        // Чистый баланс = Активы + Доходы - Обязательства - Расходы
        double netBalance = finance.getAssets() + finance.getIncome()
                - finance.getLiabilities() - finance.getExpenses();

        if (netBalance >= 0) {
            return new NetBalanceResponse(netBalance, "Positive Balance");
        } else {
            return new NetBalanceResponse(netBalance, "Negative Balance");
        }
    }
}
