package com.example.financial.controller;

import com.example.financial.dto.DataDTO;
import com.example.financial.service.FinancialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/financial")
public class FinancialController {

    private final FinancialService financialService;

    public FinancialController(FinancialService financialService) {
        this.financialService = financialService;
    }

    @GetMapping
    public ResponseEntity<List<DataDTO>> listAll() {
        List<DataDTO> data = financialService.findAll();
        return ResponseEntity.ok(data);
    }
}
