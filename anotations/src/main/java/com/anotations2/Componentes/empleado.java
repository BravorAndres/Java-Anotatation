package com.anotations2.Componentes;

public interface empleado {

    public String TipoContrato();
    public int salario();
    public void setParametros(String name,Long id,int horastrabajadas,int salHora,String contrato);
    public String getInformeEmpleado();
    

}
