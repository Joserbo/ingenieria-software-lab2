package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jose
 */
@Repository
public interface CursoRepository extends CrudRepository<Curso,Long>{
    
}
