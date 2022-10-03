package com.anotations2.dependencias;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InformeDirector implements Informe{

    @Override
    public String getInforme() {
        return "Informe director instituto";
    }


    @Override
    public String eliminarInforme() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
