package co.edu.unicolombo.ProyectoDeAula20232.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="Horario", catalog="ProAula_BD")
@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="idActividad", referencedColumnName = "idActividad")

public class Horarios extends Actividades implements Serializable{
    public static final long serializableVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    private long idHorario;
    @Column(name = "dia", nullable = false, length = 30)
    @NotEmpty
    private Date dia;
    @Column(name = "horaInicio", nullable = false, length = 65)
    @NotEmpty
    private Date horaInicio;
    @Column(name = "horaFin", nullable = false, length = 65)
    @NotEmpty
    private Date horaFin;
    @ManyToOne()
    @JoinColumn(name = "idActividad")
    private Actividades idActividad;
   
}
