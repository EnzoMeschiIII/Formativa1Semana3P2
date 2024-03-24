package Fromativa1Semana3P2package;

public class DetalleAtencion {
    private int codigo;
    private int examenes;
    private int valorExamen;
    private int valorConsulta;

    public DetalleAtencion(int codigo, int examenes, int valorExamen,int valorConsulta)
    {
        this.codigo=codigo;
        this.examenes=examenes;
        this.valorExamen=valorExamen;
        this.valorConsulta=valorConsulta;
    }

    //Getter y Setters
    public int getCodigo()
    {
        return codigo;
    }

    public int getExamenes()
    {
        return examenes;
    }

    public int getValorExamen()
    {
       return valorExamen;
    }

    public int getValorConsulta()
    {
        return valorConsulta;
    }
}
