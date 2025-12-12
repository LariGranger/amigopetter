package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.model.Especies;

@Repository
public interface EspeciesRepository extends JpaRepository<Especies, Integer>{

}
