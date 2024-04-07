package com.enviro.assessment.grad001.thabomashaba.data;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "enviro365")
public class EnvironmentalData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    
    @NotBlank(message = "Name of the Analyst cannot be blank")
    @Column(name= "analyst_name", nullable = false)
    private String analystName;


    @NotBlank(message = "air data must not be blank")
    @Column(name= "air", nullable = false)
    private String air;

    
    @NotBlank(message = "water data must not be blank")
    @Column(name= "water", nullable = false)
    private String water;

    
    @NotBlank(message = "soil data must not be blank")
    @Column(name= "soil", nullable = false)
    private String soil;


    public Long getId()
    {
        return this.id;
    }

    
    public String getAnalystName()
    {
        return this.analystName;
    }

    public String getAirData()
    {
        return this.air;
    }

    public String getWaterData()
    {
        return this.water;
    }

    public String getSoilData()
    {
        return this.soil;
    }

    public void setId(Long id){
        this.id=id;
    }

    public void setAnalystName(String analystName){
        this.analystName=analystName;
    }

    public void setAirData(String air){
        this.air=air;
    }

    public void setWaterData(String water){
        this.water=water;

    }

    public void setSoilData(String soil){
        this.soil=soil;
    }
}
