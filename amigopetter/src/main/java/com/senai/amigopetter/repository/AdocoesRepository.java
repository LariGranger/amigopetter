package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.model.Adocoes;
import com.senai.amigopetter.model.enums.StatusAdocao;

import java.util.List;


@Repository
public interface AdocoesRepository extends JpaRepository<Adocoes, Integer>{
    List<Adocoes> findByAdotantes_Id(Integer idAdotantes);
    List<Adocoes> findByDoadores_Id(Integer idDoadores);
    List<Adocoes> findByPets_Id(Integer idPets);
    List<Adocoes> findByAdotantes_Id(StatusAdocao statusAdocao);
}