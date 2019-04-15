package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao.CatedraticoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Catedratico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class CatedraticoService {
    @Autowired
    private CatedraticoRepository catedraticorepo;
    
    public List<Catedratico> retornocatedratico(){
        return (List<Catedratico>) this.catedraticorepo.findAll();
    }
    
    public Catedratico ingresocatedratico(Catedratico c1){
        return this.catedraticorepo.save(c1);
    }
}
