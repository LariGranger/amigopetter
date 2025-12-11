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

@Column(nullable = false)
private String usuario;

@Column(nullable = false)
private String email;

@Column(nullable = false)
private String telefone;

@Column(nullable = false)
private String senha;
}

