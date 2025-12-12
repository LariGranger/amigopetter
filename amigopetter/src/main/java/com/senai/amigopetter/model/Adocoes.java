package com.senai.amigopetter.model;

import java.time.LocalDate;

import com.senai.amigopetter.model.enums.StatusAdocao;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Adocoes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "adotantes_id")
private Adotantes adotante;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "doadores_id")
private Doadores doador;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "pets_id")
private Pets pet;

@Column(nullable = false)
private LocalDate dt_adocao;

@Enumerated(EnumType.ORDINAL)
private StatusAdocao status;

@Column(nullable = false)
private String motivo_adotante;

@Column(nullable = false)
private String motivo_doador;

@Column(nullable = false)
private String observacoes;
}
