package projeto.pmmanutencao.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SystemValidationException {

    private String field;
    private String message;

}
