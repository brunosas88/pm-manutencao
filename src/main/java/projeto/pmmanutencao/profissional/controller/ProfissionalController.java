package projeto.pmmanutencao.profissional.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.pmmanutencao.profissional.dto.ProfissionalDTO;
import projeto.pmmanutencao.profissional.service.ProfissionalService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/profissional")
@RequiredArgsConstructor
public class ProfissionalController {

    private final ProfissionalService profissionalService;

    @GetMapping("/listar")
    public ResponseEntity<List<ProfissionalDTO>> listarProfissionais() {
        return ResponseEntity.ok(profissionalService.listarProfissionais());
    }

    @GetMapping("/encontrar/{matricula}")
    public ResponseEntity<ProfissionalDTO> encontrarProfissional(@PathVariable String matricula) {
        return ResponseEntity.ok(profissionalService.encontrarProfissional(matricula));
    }

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public void registrarProfissional(@Valid @RequestBody ProfissionalDTO profissionalDTO) {
        profissionalService.registrarProfissional(profissionalDTO);
    }
}
