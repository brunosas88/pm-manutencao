package projeto.pmmanutencao.profissional.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.pmmanutencao.profissional.dto.ProfissionalDTO;
import projeto.pmmanutencao.profissional.model.Profissional;
import projeto.pmmanutencao.profissional.repository.ProfissionalRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfissionalService {

    private final ProfissionalRepository profissionalRepository;

    @Transactional
    public void registrarProfissional(ProfissionalDTO profissionalDTO) {
        profissionalRepository.save(Profissional.converterParaModelo(profissionalDTO));
    }

    public ProfissionalDTO encontrarProfissional(String matricula) {
        return ProfissionalDTO.converterParaDTO(profissionalRepository.findProfissionalByMatricula(matricula));
    }

    public List<ProfissionalDTO> listarProfissionais() {
        return profissionalRepository.findAll().stream().map(ProfissionalDTO::converterParaDTO).collect(Collectors.toList());
    }


}
