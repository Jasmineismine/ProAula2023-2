
package co.edu.unicolombo.ProyectoDeAula20232.Dao;

import co.edu.unicolombo.ProyectoDeAula20232.Models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICrudUsuario extends JpaRepository<Usuarios, String>{
    
}
