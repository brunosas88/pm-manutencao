package projeto.pmmanutencao.defeito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.pmmanutencao.defeito.model.Defeito;

@Repository
public interface DefeitoRepository extends JpaRepository<Defeito, Integer> {
}
