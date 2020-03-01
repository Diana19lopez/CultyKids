package com.lgd.CultyKids.models.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity
@Table(name="Lecciones")

public class Lecciones { 

@Id
private Long id;

@Column(name="enunciado")
private String enunciado;

@Column(name="imagen")
private String imagen;


@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="pregunta_id",nullable=false)
private Pregunta pregunta;

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="nivel_id",nullable=false)
private Nivel nivel;
}

