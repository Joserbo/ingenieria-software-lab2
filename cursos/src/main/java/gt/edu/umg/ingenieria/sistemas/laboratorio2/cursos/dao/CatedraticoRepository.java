package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Catedratico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jose
 */
@Repository
public interface CatedraticoRepository extends CrudRepository<Catedratico,Long>{
    
}
