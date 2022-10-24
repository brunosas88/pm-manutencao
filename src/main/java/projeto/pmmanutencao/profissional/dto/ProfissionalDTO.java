package projeto.pmmanutencao.profissional.dto;

import lombok.*;
import projeto.pmmanutencao.profissional.model.Profissional;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProfissionalDTO {
    @NotBlank
    private String nome;
    @NotBlank
    private String matricula;
    @NotBlank
    private String filiacao;
    @NotBlank
    private String utd;

    public static ProfissionalDTO converterParaDTO(Profissional profissional) {
        ProfissionalDTO dto = new ProfissionalDTO();
        dto.setNome(profissional.getNome());
        dto.setMatricula(profissional.getMatricula());
        dto.setFiliacao(profissional.getFiliacao());
        dto.setUtd(profissional.getUtd());
        return dto;
    }
}
