package projeto.pmmanutencao.trecho.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.pmmanutencao.trecho.model.Trecho;
import projeto.pmmanutencao.trecho.repository.TrechoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrechoService {

    private final TrechoRepository trechoRepository;
    @Transactional
    public List<Trecho> listarDefeitos() {
        return trechoRepository.findAll();
    }

    public Trecho encontrarDefeito(Integer id) {
        return trechoRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    public void registrarDefeito(Trecho trecho) {
        trechoRepository.save(trecho);
    }
}
