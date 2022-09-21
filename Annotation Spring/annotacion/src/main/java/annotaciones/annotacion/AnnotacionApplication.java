package annotaciones.annotacion;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class AnnotacionApplication {

	

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(configuracion.class);
		//Comercial miComercial = contexto.getBean("ComercialAuto",Comercial.class);
			
		System.out.println("Funciona");
		
	}

}
