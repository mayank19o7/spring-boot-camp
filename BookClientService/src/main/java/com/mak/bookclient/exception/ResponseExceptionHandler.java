package com.mak.bookclient.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler for handling RuntimeExceptions.
 */
@RestControllerAdvice
public class ResponseExceptionHandler {

    /**
     * Handles RuntimeExceptions and returns a <code>ResponseEntity</code> with an <code>ErrorResponse</code>.
     *
     * @param ex The RuntimeException that was caught
     * @return <code>ResponseEntity</code> containing an <code>ErrorResponse</code> with the error code and description
     */
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorResponse> catchRuntimeException(RuntimeException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(HttpStatus.BAD_REQUEST.getReasonPhrase());
        errorResponse.setDescription(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
