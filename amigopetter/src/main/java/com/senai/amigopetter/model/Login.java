package com.senai.amigopetter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "login")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Login {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

private String usuario;
private String email;
private String telefone;
private String senha;
}

