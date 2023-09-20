
package co.edu.unicolombo.ProyectoDeAula20232.Implementations;

import co.edu.unicolombo.ProyectoDeAula20232.Dao.ICrudActividadesProgramadas;
import co.edu.unicolombo.ProyectoDeAula20232.Models.ActividadesProgramadas;
import co.edu.unicolombo.ProyectoDeAula20232.Services.IActividadProgramadaServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadProgramadaServicioImp implements IActividadProgramadaServicios{
    
    @Autowired
    ICrudActividadesProgramadas crudActividad;

    @Override
    public List<ActividadesProgramadas> listarActividadesProgramadas(String palabra) {
        if(palabra != null){
            return crudActividad.buscarActividadesProgramadas(palabra);
        }
        return crudActividad.listarActividadesProgramadasActivas();
    }

    @Override
    public void guardarActividadProgramada(ActividadesProgramadas activity) {
        crudActividad.save(activity);
    }

    @Override
    public void eliminarActividadProgramada(ActividadesProgramadas activity) {
        crudActividad.delete(activity);
    }

    @Override
    public ActividadesProgramadas buscarActividadProgramada(ActividadesProgramadas activity) {
        return crudActividad.findById(activity.getIdActividadProgramada()).orElse(null);
    }
    
}
