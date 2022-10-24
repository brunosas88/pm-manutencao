package projeto.pmmanutencao.profissional.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProfissionalLoginDTO {
    @NotBlank
    private String matricula;
}
