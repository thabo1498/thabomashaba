package com.enviro.assessment.grad001.thabomashaba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.thabomashaba.data.EnvironmentalData;
import com.enviro.assessment.grad001.thabomashaba.exception.EnviroDataNotFoundException;
import com.enviro.assessment.grad001.thabomashaba.repo.EnvironmentalDataRepo;

@Service
public class EnvironmentalDataServiceImpl implements EnvironmentalDataService {

    @Autowired
    EnvironmentalDataRepo environmentalDataRepo;

    @Override
    public EnvironmentalData saveEnvironmentalData(EnvironmentalData environmentalData) 
    {
        return environmentalDataRepo.save(environmentalData);
    }
    @Override
    public void deleteEnvironmentalData(Long id) 
    {
        environmentalDataRepo.deleteById(id);
    }

    @Override
    public List<EnvironmentalData> getAllEnviroData() 
    {
        return (List<EnvironmentalData>)environmentalDataRepo.findAll();
    }
    @Override
    public EnvironmentalData getEnvironmentalData(Long id) {
        EnvironmentalData enviroData =  environmentalDataRepo.findById(id).get();
        
        if(enviroData != null)
        {
            
            System.out.println(enviroData);
            return enviroData;

        }else{
            
            System.out.println(enviroData);
            
            System.out.println("Failed "+ id);
            throw new EnviroDataNotFoundException(id);
        }      
    }
}
