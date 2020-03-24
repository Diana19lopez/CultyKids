package com.lgd.CultyKids.models.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Seleccion")

	public class Seleccion implements Serializable{ 
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="opcion")
	private String opcion;


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pregunta_id",nullable=false)
		private Pregunta pregunta;
	
	public Long getId(){
		return id;
		
	}
	
	public void setId(Long id){
		this.id = id;	
	}
	
	public String opcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	
	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
}

	
