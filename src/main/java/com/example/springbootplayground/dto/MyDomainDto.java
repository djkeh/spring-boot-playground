package com.example.springbootplayground.dto;

import com.example.springbootplayground.domain.MyDomain;
import lombok.Value;

@Value(staticConstructor = "of")
public class MyDomainDto {
    Long id;
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
