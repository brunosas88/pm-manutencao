package projeto.pmmanutencao.profissional.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projeto.pmmanutencao.profissional.dto.ProfissionalDTO;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "profissional")
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private String nome;

    @Column (unique = true, nullable = false)
    private String matricula;

    @Column (nullable = false)
    private String filiacao;

    @Column(nullable = false)
    private String utd;

    public static Profissional converterParaModelo(ProfissionalDTO profissionalDTO) {
        Profissional model = new Profissional();
        model.setNome(profissionalDTO.getNome());
        model.setMatricula(profissionalDTO.getMatricula());
        model.setFiliacao(profissionalDTO.getFiliacao());
        model.setUtd(profissionalDTO.getUtd());
        return model;
    }
}
