package com.senai.amigopetter.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doadores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doadores {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(nullable = false)
private String nome;

@Column(nullable = false)
private String cpf;

@Column(nullable = false)
private String telefone;

@Column(nullable = false)
private String email;

@Column(nullable = false)
private LocalDate dt_registro;

@Column(nullable = false)
private LocalDate dt_update;

@Column(nullable = false)
private LocalDate dt_nascimento;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "login_id")
private Login login;
}
