
package co.edu.unicolombo.ProyectoDeAula20232.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class inicioControlador {
    
    @GetMapping("/")
    public String inicio(Model modelo){  
        return "index";
    }
}
