package com.senai.amigopetter.model;

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

@Column(nullable = false)
private String nome;

@Column(nullable = false)
private String raca;

@Column(nullable = false) 
private String idade;

@Enumerated(EnumType.ORDINAL)
private Porte porte;

@Enumerated(EnumType.ORDINAL)
private Sexo sexo;



@Enumerated(EnumType.ORDINAL)
private Disponibilidade disponiilidade;

@Column(nullable = false)
private String fotos;

@Column(nullable = false)
private String cor;

@Column(nullable = false)
private String vacinado;

@Column(nullable = false)
private String qtd_doses;

@Column(nullable = false)
private String dt_registro;

@Column(nullable = false)
private String castrado;

@Column(nullable = false)
private String descricao;

@Column(nullable = false)
private String especie;

@Column(nullable = false)
private String fotos;

}
