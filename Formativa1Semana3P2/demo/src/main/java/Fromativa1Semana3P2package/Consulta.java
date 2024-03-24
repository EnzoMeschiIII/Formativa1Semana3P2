package Fromativa1Semana3P2package;

public class Consulta {
    private int codigo;
    private String motivoConsulta;
    private String especilidad;

    public Consulta(int codigo,String motivoConsulta, String especialidad)
    {
        this.codigo=codigo;
        this.motivoConsulta=motivoConsulta;
        this.especilidad=especialidad;
    }

    
     //Getter y Setters
     public int getCodigo()
     {
         return codigo;
     }
 
     public String getMotivoConsulta()
     {
         return motivoConsulta;
     }

     public String getEspecialidad()
     {
        return especilidad;
     }
}
