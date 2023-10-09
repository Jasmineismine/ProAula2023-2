
package co.edu.unicolombo.ProyectoDeAula20232.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="Estudiantes", catalog = "ProAula_BD")
@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
public class Estudiantes extends Usuarios implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @ManyToOne()
    @JoinColumn(name = "idPrograma")
    @NotEmpty
    private Programas programa;
    
    @Column(name = "codigoEstudiantil")
    @NotEmpty
    private String codigoEstudiantil;
    
    @Column(name = "semestre")
    @NotEmpty
    private int semestre;
    
    
}
