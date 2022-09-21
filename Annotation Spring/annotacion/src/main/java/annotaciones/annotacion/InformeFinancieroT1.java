package annotaciones.annotacion;

import org.springframework.stereotype.Component;


@Component
public class InformeFinancieroT1 implements InformeFinanciero{

    private String Informe;

  //  @Override
    public String getInformeFinanciero() {
       return Informe;
    }

    
    public InformeFinancieroT1(String informe){
        this.Informe = informe;
    }

    
}
