/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.ProyectoDeAula20232.Services;

import co.edu.unicolombo.ProyectoDeAula20232.Models.Horarios;
import java.util.List;

/**
 *
 * @author Soplanos
 */
public interface IHorarioServicio {
    
    public List<Horarios> ListarHorarios();
    
    public void GuardarHorario(Horarios schedule);
    
    public void EliminarHorario(Horarios schedule);
    
    public Horarios BuscarHorario(Horarios schedule);
    
}
