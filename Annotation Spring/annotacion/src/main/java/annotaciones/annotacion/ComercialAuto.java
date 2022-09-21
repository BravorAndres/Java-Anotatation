package annotaciones.annotacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialAuto implements Comercial{


    private String comercial1;
    private  int numeroRepeticiones;
    private InformeFinanciero informe1;


    @Autowired
    public ComercialAuto(InformeFinanciero informe1){
        this.informe1 = informe1;
    }

/* 
    @Autowired
    public void setInforme1(InformeFinanciero informe1){
        this.informe1 = informe1;
    } */

    @Override
    public String Nombre() {
     /*  comercial1 = "primer Comercial";
        return comercial1;*/
        return informe1.getInformeFinanciero();
    }

    @Override
    public int numero() {
        numeroRepeticiones = 8;
        return numeroRepeticiones;
    }
    


    
}