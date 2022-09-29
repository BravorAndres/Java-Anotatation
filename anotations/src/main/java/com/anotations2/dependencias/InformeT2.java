package com.anotations2.dependencias;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("InformeT2")
public class InformeT2 implements Informe {
    
    private String Informe;
    private Date fecha;

    @Override
    public String getInforme() {
        return "Informe tipo 2";
    }

    @Override
    public String eliminarInforme() {
        // TODO Auto-generated method stub
        return null;
    }

}
