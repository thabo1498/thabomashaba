package com.enviro.assessment.grad001.thabomashaba.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.thabomashaba.data.EnvironmentalData;
import com.enviro.assessment.grad001.thabomashaba.service.EnvironmentalDataService;

@RestController
@RequestMapping("/environmentalData")
public class EnvironmentalDataController {
    @Autowired
    EnvironmentalDataService environmentalDataService;

    @GetMapping("/{id}")//retrives the resource
    public ResponseEntity<EnvironmentalData> getEnvironmentalData(@PathVariable Long id)
    {
        return new ResponseEntity<>(environmentalDataService.getEnvironmentalData(id),HttpStatus.OK);
    }

    @PostMapping //creates the resource or data
    public ResponseEntity<EnvironmentalData> saveEnvironmentalData(@RequestBody EnvironmentalData environmentalData)
    {
        return new ResponseEntity<>(environmentalDataService.saveEnvironmentalData(environmentalData), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteEnvronmentalData(@PathVariable Long id)
    {
        environmentalDataService.deleteEnvironmentalData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EnvironmentalData>>getAllEnviroData()
    {
        return new ResponseEntity<>(environmentalDataService.getAllEnviroData(),HttpStatus.OK);
    }
}
