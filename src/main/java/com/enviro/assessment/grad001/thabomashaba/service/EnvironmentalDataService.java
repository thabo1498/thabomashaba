package com.enviro.assessment.grad001.thabomashaba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.thabomashaba.data.EnvironmentalData;

@Service
public interface EnvironmentalDataService {

    EnvironmentalData getEnvironmentalData(Long id);
    EnvironmentalData saveEnvironmentalData(EnvironmentalData environmentalData);
    void deleteEnvironmentalData(Long id);
    List <EnvironmentalData>getAllEnviroData();
    
}
