package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.model.Adocoes;
import com.senai.amigopetter.model.enums.StatusAdocao;

import java.util.List;


@Repository
public interface AdocoesRepository extends JpaRepository<Adocoes, Integer>{
    List<Adocoes> findByAdotante_Id(Integer idAdotante);
    List<Adocoes> findByDoador_Id(Integer idDoador);
    List<Adocoes> findByPet_Id(Integer idPet);
    List<Adocoes> findByAdotante_Id(StatusAdocao statusAdocao);
}