package Fromativa1Semana3P2package;

import java.util.List;

public class Paciente {
    private int id;
    private String nombre;
    private String rut;
    private String telefono;
    private String medicoCabecera;
    private List<Consulta> consultas;
    private List<DetalleAtencion> detalleAtencion;

    public Paciente(int id, String nombre,String rut, String telefono, String medicoCabecera, List<Consulta> consultas,List<DetalleAtencion> detalleAtencion)
    {
        this.id=id;
        this.nombre=nombre;
        this.rut=rut;
        this.telefono=telefono;
        this.medicoCabecera=medicoCabecera;
        this.consultas=consultas;
        this.detalleAtencion=detalleAtencion;
    }

    //Getter y Setters
    public int getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }
    
    public String getRut()
    {
        return rut;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public String getMedicoCabecera()
    {
        return medicoCabecera;
    }

    public List<Consulta> getConsultas()
    {
        return consultas;
    }

    public List<DetalleAtencion> getDetalleAtencion()
    {
        return detalleAtencion;
    }
}
