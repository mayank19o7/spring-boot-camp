package com.mak.simplecrud.exception;

import lombok.Data;

@Data
public class ErrorResponse {

    private String code;
    private String description;
}
