package projeto.pmmanutencao.config;


import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import projeto.pmmanutencao.exceptions.SystemValidationException;

import java.util.ArrayList;
import java.util.List;

import static projeto.pmmanutencao.utils.VariaveisGlobais.*;


@RestControllerAdvice
@RequiredArgsConstructor
public class ErrorHandle {

    private  final MessageSource messageSource;

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public String handleDataIntegrityViolationException(DataIntegrityViolationException exception) {
        return DATA_INTEGRITY_VIOLATION_EXCEPTION_MSG  + "\n" + exception.getMostSpecificCause().getLocalizedMessage();
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidFormatException.class)
    public String handleInvalidFormatException(InvalidFormatException exception) {
        return DATA_INVALID_FORMAT_EXCEPTION_MSG  + "\n" + exception.getMessage();
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(NullPointerException exception) {
        return NULL_POINTER_EXCEPTION_MSG + "\n" + exception.getMessage();
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<SystemValidationException> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        List<SystemValidationException> validationExceptions = new ArrayList<>();
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        fieldErrors.forEach(fieldError -> {
            String message =  messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
            SystemValidationException validationException = new SystemValidationException(fieldError.getField(), message);
            validationExceptions.add(validationException);
        });
        return validationExceptions;
    }
}
