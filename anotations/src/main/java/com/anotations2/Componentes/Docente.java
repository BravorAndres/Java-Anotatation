package com.anotations2.Componentes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.anotations2.dependencias.Informe;
import com.anotations2.dependencias.InformeT1;


//import lombok.Data;
//import lombok.NoArgsConstructor;

@Component("Docente")
public class Docente implements empleado {

    private String Nombre;
    private Long id;
    private int horastrabajadas;
    private int salHora;
    private String Contrato;

    //Dependencias
    private Informe InformeDocente;

    
    @Autowired
    public Docente(InformeT1 InformeDocente){
        this.InformeDocente = InformeDocente;
    }



/* 
    public Docente(){
        Nombre = "eduardo";
        id = 1398823l;
        horastrabajadas = 40;
        salHora = 20000;
    } */

    @Override
    public int salario() {
        return salHora*horastrabajadas;
    }

    @Override
    public String TipoContrato() {
        return Contrato;
    }

    @Override
    public String getInformeEmpleado() {
        return InformeDocente.getInforme();
    }
    
}
