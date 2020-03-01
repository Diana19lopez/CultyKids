package com.lgd.CultyKids.models.entities;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity
@Table(name="Seleccion")

public class Seleccion { 

@Id
private Long id;

@Column(name="opcion")
private String opcion;


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pregunta_id",nullable=false)
		private Pregunta pregunta;
	
}
