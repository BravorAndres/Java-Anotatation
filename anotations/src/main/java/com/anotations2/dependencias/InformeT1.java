package com.anotations2.dependencias;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("InformeT1")
public class InformeT1 implements Informe {

    private String Informe;
    private Date fecha;

    @Override
    public String getInforme() {
        return "Informe tipo 1";
    }

    @Override
    public String eliminarInforme() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
