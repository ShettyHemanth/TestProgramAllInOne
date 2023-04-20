package com.hemanth.AllinOneProgram.exceptionHandler;

import com.hemanth.AllinOneProgram.exception.StudentIdNotFoundException;
import com.hemanth.AllinOneProgram.exception.StudentNameNotFoundException;
import com.hemanth.AllinOneProgram.responseClass.ResponseClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalHandler
{




        @org.springframework.web.bind.annotation.ExceptionHandler
        ResponseEntity<ResponseClass> handleException(StudentIdNotFoundException sn)
        {
            ResponseClass rcc=new ResponseClass();
            rcc.setStatusCode(HttpStatus.NOT_FOUND.value());
            rcc.setMessage(sn.getMessage());
            rcc.setTimeStamp(System.currentTimeMillis());

            return new ResponseEntity<>(rcc,HttpStatus.NOT_FOUND);

        }


        @org.springframework.web.bind.annotation.ExceptionHandler
        ResponseEntity<ResponseClass> handleNameException(StudentNameNotFoundException snn)
        {
            ResponseClass rcc=new ResponseClass();
            rcc.setStatusCode(HttpStatus.NOT_FOUND.value());
            rcc.setMessage(snn.getMessage());
            rcc.setTimeStamp(System.currentTimeMillis());

            return new ResponseEntity<>(rcc,HttpStatus.NOT_FOUND);
        }





    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex)
    {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) ->
        {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
    }



    }


