package projeto.pmmanutencao.trecho.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.pmmanutencao.trecho.model.Trecho;
import projeto.pmmanutencao.trecho.service.TrechoService;

import java.util.List;

@RestController
@RequestMapping("/trechos")
@RequiredArgsConstructor
public class TrechoController {

    private final TrechoService trechoService;


    @GetMapping("/listar")
    public ResponseEntity<List<Trecho>> listarDefeitos() {
        return ResponseEntity.ok(trechoService.listarDefeitos());
    }

    @GetMapping("/encontrar/{id}")
    public ResponseEntity<Trecho> encontrarDefeito(@PathVariable Integer id) {
        return ResponseEntity.ok(trechoService.encontrarDefeito(id));
    }

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public void encontrarDefeito(@RequestBody Trecho trecho) {
        trechoService.registrarDefeito(trecho);
    }

}
