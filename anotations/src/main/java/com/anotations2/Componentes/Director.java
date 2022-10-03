package com.anotations2.Componentes;

import com.anotations2.dependencias.Informe;

public class Director implements empleado{


    private String Nombre;
    private Long id;
    private int horastrabajadas;
    private int salHora;
    private String Contrato;

    //Dependencias

    
    private Informe InformeDirector;


    public Director (Informe InformeDirector){
        this.InformeDirector = InformeDirector;
    }

    @Override
    public String TipoContrato() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public int salario() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setParametros(String name, Long id, int horastrabajadas, int salHora, String contrato) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getInformeEmpleado() {
        return InformeDirector.getInforme();
        
    }
    
}
