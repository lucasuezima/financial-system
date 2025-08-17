package com.example.financial.service;

import com.example.financial.dto.DataDTO;

import java.util.List;

public interface FinancialService {

    List<DataDTO> findAll();
}
