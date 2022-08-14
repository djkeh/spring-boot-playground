package com.example.springbootplayground.dto;

import com.example.springbootplayground.domain.MyDomain;
import lombok.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Value(staticConstructor = "of")
public class MyDomainDto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    String name;
    Integer age;

    public static MyDomainDto from(MyDomain entity) {
        return new MyDomainDto(
                entity.getId(),
                entity.getName(),
                entity.getAge()
        );
    }
}
