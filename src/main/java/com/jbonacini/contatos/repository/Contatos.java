package com.jbonacini.contatos.repository;

import com.jbonacini.contatos.model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos  extends JpaRepository<Contato, Long> {
    
}
