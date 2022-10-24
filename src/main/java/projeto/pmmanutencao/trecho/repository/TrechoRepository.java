package projeto.pmmanutencao.trecho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.pmmanutencao.trecho.model.Trecho;

@Repository
public interface TrechoRepository extends JpaRepository<Trecho, Integer> {
}
