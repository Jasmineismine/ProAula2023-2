
package co.edu.unicolombo.ProyectoDeAula20232.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo")
@Table(name = "Usuarios", catalog = "ProAula_BD")
public class Usuarios implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "cedula")
    @NotEmpty
    private String cedula;
    
    @Column(name = "nombre")
    @NotEmpty
    private String nombre;
    
    @Column(name = "apellidos")
    @NotEmpty
    private String apellidos;
    
    @Column(name = "correo")
    @Email
    @NotEmpty
    private String correo;
    
    @Column(name = "telefono")
    @NotEmpty
    private String telefono;
    
    @Column(name = "password")
    @NotEmpty
    private String contraseña;
    
    @Column(name = "estado")
    @NotEmpty
    private String estado;
    
    @Column(name = "tipo")
    @NotEmpty
    private String tipo;
}
