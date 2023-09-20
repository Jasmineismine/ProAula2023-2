
package co.edu.unicolombo.ProyectoDeAula20232.Dao;

import co.edu.unicolombo.ProyectoDeAula20232.Models.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICrudEstudiantes extends JpaRepository<Estudiantes, String>{
    
}
