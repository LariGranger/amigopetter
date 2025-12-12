package com.senai.amigopetter.model;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

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

private String nome;
private String cpf;
private String telefone;
private String email;

@Column(nullable = false, name = "dt_registro")
private LocalDate dtRegistro;

@Column(nullable = false, name = "dt_update")
private LocalDate dtUpdate;

@Column(nullable = false, name = "dt_nascimento")
private LocalDate dtNascimento;

@ManyToAny
@JoinColumn(name = "fk_login")
private Login login;
}
