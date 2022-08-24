package annotaciones.annotacion;

import org.springframework.stereotype.Component;

@Component("ComercialAuto")
public class ComercialAuto implements Comercial{

    private String comercial1;
    private  int numeroRepeticiones;
    @Override
    public String Nombre() {
        comercial1 = "primer Comercial";
        return comercial1;
    }

    @Override
    public int numero() {
        numeroRepeticiones = 8;

        return numeroRepeticiones;
    }
    
    
}