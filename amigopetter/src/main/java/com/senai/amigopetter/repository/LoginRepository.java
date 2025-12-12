package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

}
