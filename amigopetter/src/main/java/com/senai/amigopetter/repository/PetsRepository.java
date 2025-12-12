package com.senai.amigopetter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.model.Pets;
import com.senai.amigopetter.model.enums.Disponibilidade;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Integer> {
    List<Pets> findByDisponibilidade(Disponibilidade disponiilidade);

    List<Pets> findByEspecie_Id(Integer idEspecie);
}
