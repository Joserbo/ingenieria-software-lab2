package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Catedratico;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service.CatedraticoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping("/catedratico")
public class CatedraticoController {
    @Autowired
    private CatedraticoService catedraticoservicio;
    
    @GetMapping("/buscarTodos")
    public List<Catedratico> buscarTodos(){
        return this.catedraticoservicio.retornocatedratico();
    }
    
    @PostMapping("registrar")
    public Catedratico registrar(@RequestBody (required = true) Catedratico c1){
        return this.catedraticoservicio.ingresocatedratico(c1);
    }
}
