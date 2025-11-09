package com.example.finance_calculator.controller;

import com.example.finance_calculator.model.FinancialAttitude;
import com.example.finance_calculator.model.NetBalanceResponse;
import com.example.finance_calculator.service.FinanceService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/") //маршрут контроллера
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    /**
     * Метод для показа основной HTML-страницы.
     */
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String showIndexPage() {
        return "index.html"; //Возвращаем имя файла
    }

    /**
     * POST-метод для расчёта чистого баланса на основании переданных данных.
     *
     * @param finance объект с данными актива, пассива, дохода и расхода
     * @return объект с результатом расчёта чистого баланса
     */
    @Operation(description = "Вычисление чистого баланса или прибыли по данным финансовой матрицы.")


    @PostMapping("/calculate")
    public ResponseEntity<NetBalanceResponse> calculateNetBalance(@RequestBody FinancialAttitude finance) {
        NetBalanceResponse response = financeService.calculateNetBalance(finance);
        return ResponseEntity.ok(response);
    }
}
