package com.example.springbootplayground.repository;

import com.example.springbootplayground.domain.MyDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDomainRepository extends JpaRepository<MyDomain, Long> {
}
