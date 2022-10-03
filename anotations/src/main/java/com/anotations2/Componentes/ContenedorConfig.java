package com.anotations2.Componentes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.anotations2.dependencias.Informe;
import com.anotations2.dependencias.InformeDirector;

@Configuration
@ComponentScan("com.anotations2")
public class ContenedorConfig {
    

    //creacion bean tipo Director
    @Bean
    public Informe informeDirector(){
        return new InformeDirector();
    }

    @Bean
    public empleado DirectorInstituto(){
        return new Director(informeDirector());
    }
}
