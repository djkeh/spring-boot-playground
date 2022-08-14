package com.example.springbootplayground.dto;

import com.example.springbootplayground.domain.MyDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class MyDomainDto {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String name;
    private Integer age;

    protected MyDomainDto() {}

    public MyDomainDto(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static MyDomainDto of(Long id, String name, Integer age) {
        return new MyDomainDto(id, name, age);
    }

    public static MyDomainDto from(MyDomain entity) {
        return new MyDomainDto(
                entity.getId(),
                entity.getName(),
                entity.getAge()
        );
    }
}
