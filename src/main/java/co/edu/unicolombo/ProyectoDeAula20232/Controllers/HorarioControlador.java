
package co.edu.unicolombo.ProyectoDeAula20232.Controllers;

import co.edu.unicolombo.ProyectoDeAula20232.Models.Estudiantes;
import co.edu.unicolombo.ProyectoDeAula20232.Models.Horarios;
import co.edu.unicolombo.ProyectoDeAula20232.Services.IActividadServicios;
import co.edu.unicolombo.ProyectoDeAula20232.Services.IHorarioServicio;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class HorarioControlador {
    @Autowired
    IHorarioServicio horarioServicio;
    IActividadServicios actividadServicio;
    
    @GetMapping("/Horarios")
    public String listarHorarios(Model modelo){
        List<Horarios> listaHorarios = (List<Horarios>)horarioServicio.ListarHorarios();
        modelo.addAttribute("horarios", listaHorarios);
        log.info("Ejecuntando el controlador listar horarios");
        return "Horarios/listaHorarios";
    }
    
    @GetMapping("/RegistrarHorario")
    public String registarHorario(Model modelo){
        modelo.addAttribute("horario", new Horarios());
        modelo.addAttribute("actividad", actividadServicio.listarActividades(null));
        log.info("Ejecuntando el controlador registrar horario");
        return "Horarios/FormularioHorarios";
    }
    
    @PostMapping("/GuardarHorario")
    public String guardarEstudiante(@Valid @ModelAttribute Horarios horario , Errors errores){
        if(errores.hasErrors()){
            log.info("Ejecuntando el controlador guardar horario con errores");
            horarioServicio.GuardarHorario(horario);
            return "redirect:/Horarios";
        }
        
        horarioServicio.GuardarHorario(horario);
        log.info("Ejecuntando el controlador guardar horario sin errores");
        return "redirect:/Horarios";
    }
}
