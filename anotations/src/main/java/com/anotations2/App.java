package com.anotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.anotations2.Componentes.ContenedorConfig;
import com.anotations2.Componentes.empleado;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ContenedorConfig.class);
        System.out.println("Funciona 1.0");
        empleado profesor1 = contexto.getBean("Docente",empleado.class);
        empleado profesor2 = contexto.getBean("Docente",empleado.class);


        profesor1.setParametros("juan",64537l,65,787,"fijo");
       
        profesor2.setParametros("Maria",48723l,89,98,"Nomina");

        if(profesor1==profesor2){
            System.out.println("SON EL MISMO");
        }else{
            System.out.println("SON DIFERENTES");
        }

        System.out.println(profesor1.getInformeEmpleado());
        System.out.println("Funciona");

    }
}
