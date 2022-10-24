package projeto.pmmanutencao.defeito.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.pmmanutencao.defeito.model.Defeito;
import projeto.pmmanutencao.defeito.service.DefeitoService;

import java.util.List;

@RestController
@RequestMapping("/defeitos")
@RequiredArgsConstructor
public class DefeitoController {

    private final DefeitoService defeitoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Defeito>> listarDefeitos() {
        return ResponseEntity.ok(defeitoService.listarDefeitos());
    }

    @GetMapping("/encontrar/{id}")
    public ResponseEntity<Defeito> encontrarDefeito(@PathVariable Integer id) {
        return ResponseEntity.ok(defeitoService.encontrarDefeito(id));
    }

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public void encontrarDefeito(@RequestBody Defeito defeito) {
        defeitoService.registrarDefeito(defeito);
    }

}
