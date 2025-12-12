package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.model.Adocoes;

@Repository
public interface AdocoesRepository extends JpaRepository<Adocoes, Integer>{

}