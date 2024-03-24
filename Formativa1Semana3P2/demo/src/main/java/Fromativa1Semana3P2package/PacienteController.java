package Fromativa1Semana3P2package;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

@RestController
public class PacienteController 
{
    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteController()
    {
        pacientes.add(new Paciente(1, "Benjamin", "19365321-1", "+56915465478", "SergioRamos", 
                        Arrays.asList(new Consulta(1,"Dolor de estomago","Medicina General")),
                         Arrays.asList(new DetalleAtencion(1, 0, 0, 5000))));
        pacientes.add(new Paciente(2, "Roberto", "19455321-1", "+56915467678", "SergioRamos", 
                         Arrays.asList(new Consulta(2,"Dolor de Cabeza","Medicina General")),
                          Arrays.asList(new DetalleAtencion(2, 1, 15000, 5000))));
        List<Consulta> consultasMarcela = new ArrayList<>();
        consultasMarcela.add(new Consulta(3, "Mareos y antojos", "Ginecologia"));
        consultasMarcela.add(new Consulta(4, "Control de embarazo", "Ginecologia"));
        consultasMarcela.add(new Consulta(5, "Control de embarazo", "Ginecologia"));   
        List<DetalleAtencion> detallesMarcela = new ArrayList<>();
        detallesMarcela.add(new DetalleAtencion(3,1,15000,10000));
        detallesMarcela.add(new DetalleAtencion(4, 1, 15000, 10000)); 
        detallesMarcela.add(new DetalleAtencion(5, 2, 10000, 10000));     
        pacientes.add(new Paciente(3, "Marcela", "19364321-1", "+56915435478", "CarlosValdivia", 
                                           consultasMarcela,
                                           detallesMarcela));         
        pacientes.add(new Paciente(4, "Sebastian", "1935621-1", "+569155665478", "EstebanParedes", 
                           Arrays.asList(new Consulta(6,"Dolor al mover la rodilla","Traumatologia")),
                           Arrays.asList(new DetalleAtencion(6, 1, 6000, 8000))));
    }
    

    @GetMapping("/pacientes")
    public List <Paciente> getPacientes()
    {
        return pacientes;
    }

    @GetMapping("/pacientes/porId/{id}")
    public Paciente getPacientePorId(@PathVariable int id) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId() == id) {
                return paciente;
            }
        }
        return null;
    }

    @GetMapping("/pacientes/porMedico/{medicoCabecera}")
    public List<Paciente> getPacientesPorMedico(@PathVariable String medicoCabecera) {
    List<Paciente> pacientesPorMedico = new ArrayList<>();
    for (Paciente paciente : pacientes) {
        if (paciente.getMedicoCabecera().equals(medicoCabecera)) {
            pacientesPorMedico.add(paciente);
        }
    }
    return pacientesPorMedico;
    }

    @GetMapping("/pacientes/{pacienteId}/consultas/{codigo}")
    public ResponseEntity<Map<String, Object>> getPacienteConsultaPorCodigo(@PathVariable int pacienteId, @PathVariable int codigo) {
        Map<String, Object> retorno = new HashMap<>();

        Paciente paciente = null;
        for (Paciente p : pacientes) 
        {
            if (p.getId() == pacienteId) 
            {
                paciente = p;
                break;
            }
        }
        Consulta consulta = null;
        for (Consulta c : paciente.getConsultas()) 
        {
            if (c.getCodigo() == codigo) 
            {
                consulta = c;
                break;
            }
        }

        retorno.put("paciente", paciente);
        retorno.put("consulta", consulta);
        return ResponseEntity.ok().body(retorno);
    }

}
