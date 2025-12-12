package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.model.Pets;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Integer> {

}
