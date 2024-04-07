package io.trainee.organiser.asspect;

import io.trainee.organiser.user.exception.UserNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
@Slf4j
@AllArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    private  final MessageSource messageSource;
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleInvalidArgument(MethodArgumentNotValidException exception, Locale locale)
    {
        Map<String,String>errorMap=new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error->
        {
            errorMap.put(error.getField(),error.getDefaultMessage());
        });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public Map<String, String> handleInvalidId(MethodArgumentTypeMismatchException exception, Locale locale) {
        Map<String,String>errorMap=new HashMap<>();
        errorMap.put("message", messageSource.getMessage("id.invalid", null, locale));
        return errorMap;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String,String>handleUserNotFoundException(UserNotFoundException exception)
    {
        Map<String,String>errorMap=new HashMap<>();
        errorMap.put("message",exception.getMessage());
        return errorMap;
    }
}
