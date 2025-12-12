package com.senai.amigopetter.model;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import com.senai.amigopetter.model.enums.Disponibilidade;
import com.senai.amigopetter.model.enums.Porte;
import com.senai.amigopetter.model.enums.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "pets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pets {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;
private String raca;
private int idade;

@Enumerated(EnumType.STRING)
private Porte porte;

@Enumerated(EnumType.STRING)
private Sexo sexo;

@Enumerated(EnumType.STRING)
private Disponibilidade disponiilidade;

private String fotos;
private String cor;
private String vacinado;

@Column(nullable = false, name = "qtd_doses")
private int qtdDoses;

@Column(nullable = false, name = "dt_registro")
private LocalDate dtRegistro;

private Boolean castrado;

@Column(nullable = false, columnDefinition = "text")
private String descricao;

@ManyToAny
@JoinColumn(name = "fk_especie")
private Especies especie;
}
