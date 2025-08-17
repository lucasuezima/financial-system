package com.example.financial.service.impl;

import com.example.financial.dto.DataDTO;
import com.example.financial.service.FinancialService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialServiceImpl implements FinancialService {

    @Override
    public List<DataDTO> findAll() {
        return List.of();
    }
}
