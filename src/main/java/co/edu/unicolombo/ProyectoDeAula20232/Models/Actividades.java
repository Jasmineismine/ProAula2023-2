
package co.edu.unicolombo.ProyectoDeAula20232.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "Actividades", catalog = "ProAula_BD")
@Entity
@Data
public class Actividades implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActividad;
    
    @Column(name="nombre", nullable = false, length = 100)
    private String nombre;
    
    @Column(name="tipo", nullable = false, length = 15)
    private String tipo;
    
    @Column(name="estado", nullable = false, length = 15)
    private String estado;

}
