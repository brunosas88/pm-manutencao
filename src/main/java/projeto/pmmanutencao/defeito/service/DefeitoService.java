package projeto.pmmanutencao.defeito.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.pmmanutencao.defeito.model.Defeito;
import projeto.pmmanutencao.defeito.repository.DefeitoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefeitoService {

    private final DefeitoRepository defeitoRepository;
    @Transactional
    public List<Defeito> listarDefeitos() {
        return defeitoRepository.findAll();
    }

    public Defeito encontrarDefeito(Integer id) {
        return defeitoRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    public void registrarDefeito(Defeito defeito) {
        defeitoRepository.save(defeito);
    }
}
