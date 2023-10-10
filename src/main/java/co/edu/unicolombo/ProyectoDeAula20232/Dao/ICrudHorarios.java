
package co.edu.unicolombo.ProyectoDeAula20232.Dao;

import co.edu.unicolombo.ProyectoDeAula20232.Models.Horarios;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ICrudHorarios extends JpaRepository<Horarios, Long>{
    
}
