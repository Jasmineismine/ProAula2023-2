
package co.edu.unicolombo.ProyectoDeAula20232.Controllers;

import co.edu.unicolombo.ProyectoDeAula20232.Models.Estudiantes;
import co.edu.unicolombo.ProyectoDeAula20232.Services.IEstudianteServicios;
import co.edu.unicolombo.ProyectoDeAula20232.Services.IProgramaServicios;
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
public class EstudianteControlador {
    
    @Autowired
    IEstudianteServicios studentService;
    
    @Autowired
    IProgramaServicios programService;
    
    @GetMapping("/Estudiantes")
    public String listarEstudiantes(Model modelo){
        List<Estudiantes> listaEstudiantes = (List<Estudiantes>)studentService.listarEstudiantes();
        modelo.addAttribute("estudiantes", listaEstudiantes);
        log.info("Ejecuntando el controlador listar estudiantes");
        return "Estudiantes/ListaEstudiantes";
    }
    
    
    @GetMapping("/RegistrarEstudiante")
    public String registarEstudiante(Model modelo){
        modelo.addAttribute("estudiante", new Estudiantes());
        modelo.addAttribute("programas", programService.listarProgramas(null));
        log.info("Ejecuntando el controlador registrar estudiante");
        return "Estudiantes/FormularioEstudiantes";
    }
    
    @PostMapping("/GuardarEstudiante")
    public String guardarEstudiante(@Valid @ModelAttribute Estudiantes estudiante , Errors errores){
        if(errores.hasErrors()){
            log.info("Ejecuntando el controlador guardar estudiante con errores");
            estudiante.setEstado("Activo");
            studentService.guardarEstudiante(estudiante);
            return "redirect:/Estudiantes";
        }
        estudiante.setEstado("Activo");
        studentService.guardarEstudiante(estudiante);
        log.info("Ejecuntando el controlador guardar estudiante sin errores");
        return "redirect:/Estudiantes";
    }
}
