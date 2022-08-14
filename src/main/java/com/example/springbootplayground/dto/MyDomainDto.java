package com.example.springbootplayground.dto;

import com.example.springbootplayground.domain.MyDomain;
import lombok.Data;
import lombok.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data(staticConstructor = "of")
public class MyDomainDto {
    private final @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private final String name;
    private final Integer age;

    public static MyDomainDto from(MyDomain entity) {
        return new MyDomainDto(
                entity.getId(),
                entity.getName(),
                entity.getAge()
        );
    }
}
