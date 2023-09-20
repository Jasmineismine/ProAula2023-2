
package co.edu.unicolombo.ProyectoDeAula20232.Services;

import co.edu.unicolombo.ProyectoDeAula20232.Models.ActividadesProgramadas;
import java.util.List;

public interface IActividadProgramadaServicios {
    
    public List<ActividadesProgramadas> listarActividadesProgramadas(String palabra);
    
    public void guardarActividadProgramada(ActividadesProgramadas activity);
    
    public void eliminarActividadProgramada(ActividadesProgramadas activity);
    
    public ActividadesProgramadas buscarActividadProgramada(ActividadesProgramadas activity);
}
