package com.senai.amigopetter.model;

import java.time.LocalDate;
import com.senai.amigopetter.model.enums.StatusAdocao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "adocoes")
public class Adocoes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@ManyToMany
@JoinColumn(name = "fk_adotantes")
private Adotantes adotante;

@ManyToMany
@JoinColumn(name = "fk_doadores")
private Doadores doador;

@ManyToMany
@JoinColumn(name = "fk_pets")
private Pets pet;

@Column(nullable = false, name = "dt_adocao")
private LocalDate dtAdocao;

@Enumerated(EnumType.STRING)
@Column(nullable = false, name = "status_adocao")
private StatusAdocao status;

@Column(nullable = false, name = "motivo_adotante")
private String motivoAdotante;

@Column(nullable = false, name = "motivo_doador")
private String motivoDoador;

@Column(nullable = false, name = "observacoes")
private String observacoes;
}
