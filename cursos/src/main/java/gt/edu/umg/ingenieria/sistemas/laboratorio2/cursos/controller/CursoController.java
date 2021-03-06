package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Curso;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service.CursoService;
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
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoservicio;
    
    @GetMapping("/buscarTodos")
    public List<Curso> buscarTodos(){
        return this.cursoservicio.retornocursos();
    }
    
    @PostMapping("/crear")
    public Curso crear(@RequestBody (required = true) Curso c1){
        return this.cursoservicio.insertarcurso(c1);
    }
}
