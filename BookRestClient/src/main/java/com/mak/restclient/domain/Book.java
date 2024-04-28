package com.mak.restclient.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Book {
    private Long id;
    private String name;
    private Double price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publishedDate;
}
