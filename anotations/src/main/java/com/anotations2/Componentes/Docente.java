package com.anotations2.Componentes;

import org.springframework.stereotype.Component;

//import lombok.Data;
//import lombok.NoArgsConstructor;

@Component("Docente")
public class Docente implements empleado {

    private String Nombre;
    private Long id;
    private int horastrabajadas;
    private int salHora;
/* 
    public Docente(){
        Nombre = "eduardo";
        id = 1398823l;
        horastrabajadas = 40;
        salHora = 20000;
    } */

    @Override
    public int horasTrabajo() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int salarioXhora() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
