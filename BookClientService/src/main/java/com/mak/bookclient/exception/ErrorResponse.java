package com.mak.bookclient.exception;

import lombok.Data;

@Data
public class ErrorResponse {

    private String code;
    private String description;
}
