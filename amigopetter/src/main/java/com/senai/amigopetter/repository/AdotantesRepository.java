package com.senai.amigopetter.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.amigopetter.model.Adotantes;

@Repository
public interface AdotantesRepository extends JpaRepository<Adotantes, Integer>{

}
