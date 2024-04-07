package com.enviro.assessment.grad001.thabomashaba.exception;

public class EnviroDataNotFoundException extends RuntimeException {

    public EnviroDataNotFoundException(Long id) {
        super("The Environmental Data of Id: '" +id+" Does not exist in our records");
    }

}
