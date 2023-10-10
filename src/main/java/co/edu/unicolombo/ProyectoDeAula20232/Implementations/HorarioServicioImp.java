
package co.edu.unicolombo.ProyectoDeAula20232.Implementations;

import co.edu.unicolombo.ProyectoDeAula20232.Dao.ICrudHorarios;
import co.edu.unicolombo.ProyectoDeAula20232.Models.Horarios;
import co.edu.unicolombo.ProyectoDeAula20232.Services.IHorarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioServicioImp implements IHorarioServicio{
    
@Autowired 
private ICrudHorarios crudHorario;

    @Override
    public List<Horarios> ListarHorarios() {
        List<Horarios>listaHorarios = (List<Horarios>)crudHorario.findAll();
        return listaHorarios;
    }

    @Override
    public void GuardarHorario(Horarios schedule) {
        crudHorario.save(schedule);
    }

    @Override
    public void EliminarHorario(Horarios schedule) {
        crudHorario.delete(schedule);
    }

    @Override
    public Horarios BuscarHorario(Horarios schedule) {
        return crudHorario.findById(schedule.getIdHorario()).orElse(null);
    }
    
}
