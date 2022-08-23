package com.example.springbootplayground.controller;

import com.example.springbootplayground.dto.MyDomainDto;
import com.example.springbootplayground.repository.MyDomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MyController {

    private final MyDomainRepository myDomainRepository;

    @GetMapping("/endpoint")
    public List<MyDomainDto> endpoint() {
        return myDomainRepository.findAll().stream().map(MyDomainDto::from).toList();
    }

}
