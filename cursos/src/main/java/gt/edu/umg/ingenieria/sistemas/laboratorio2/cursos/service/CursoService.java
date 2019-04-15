package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao.CursoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class CursoService {
    @Autowired
    private CursoRepository cursorepo;
    
    public List<Curso> retornocursos(){
        return (List<Curso>) this.cursorepo.findAll();
    }
    
    public Curso insertarcurso(Curso c1){
        return this.cursorepo.save(c1);
    }
}
