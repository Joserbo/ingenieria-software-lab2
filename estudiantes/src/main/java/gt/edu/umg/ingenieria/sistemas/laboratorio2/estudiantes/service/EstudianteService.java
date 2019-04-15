package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.dao.EstudianteRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianterepo;
    
    public List<Estudiante> retornoestudiante(){
        return (List<Estudiante>) this.estudianterepo.findAll();
    }
    
    public Estudiante insertar(Estudiante e1){
        return this.estudianterepo.save(e1);
    }
    
}
