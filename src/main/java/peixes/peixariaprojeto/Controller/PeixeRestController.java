package peixes.peixariaprojeto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import peixes.peixariaprojeto.Model.Peixe;
import peixes.peixariaprojeto.Service.PeixeService;

@RestController
@RequestMapping("Peixes")
public class PeixeRestController {

    @Autowired
    private PeixeService peixeService;

    @GetMapping
    public ResponseEntity<Iterable<Peixe>> buscarTodos(){
        return ResponseEntity.ok(peixeService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Peixe> buscarPorId(@PathVariable Integer id) {
        return  ResponseEntity.ok(peixeService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Peixe> inserir(@RequestBody Peixe peixe) {
        peixeService.inserir(peixe);
        return ResponseEntity.ok(peixe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Peixe> atualizar(@PathVariable Integer id, @RequestBody Peixe peixe) {
        peixeService.atualizar(id, peixe);
        return ResponseEntity.ok(peixe);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Peixe> deletar(@PathVariable Integer id) {
        peixeService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
