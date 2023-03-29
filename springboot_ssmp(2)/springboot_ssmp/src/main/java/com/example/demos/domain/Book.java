package com.example.demos.domain;

import lombok.Data;
import lombok.Getter;

//lombok:一个Java类库，提供了一组注解，简化POJO实体类开发
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
