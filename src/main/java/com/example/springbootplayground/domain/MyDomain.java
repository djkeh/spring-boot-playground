package com.example.springbootplayground.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
public class MyDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter private String name;
    @Setter private Integer age;

    protected MyDomain() {}

    public MyDomain(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
