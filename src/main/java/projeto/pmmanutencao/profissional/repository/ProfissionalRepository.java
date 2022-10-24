package projeto.pmmanutencao.profissional.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.pmmanutencao.profissional.model.Profissional;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {
    Profissional findProfissionalByMatricula(String matricula);
}
