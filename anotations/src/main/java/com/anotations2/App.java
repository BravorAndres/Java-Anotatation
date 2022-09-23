package com.anotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.anotations2.Componentes.ContenedorConfig;
import com.anotations2.Componentes.empleado;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ContenedorConfig.class);
        System.out.println("Funciona 1.0");
        empleado profesor1 = contexto.getBean("Docente",empleado.class);

        System.out.println(profesor1.getInformeEmpleado());
        System.out.println("Funciona");
            
    }
}
