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
@Table(name="Lecciones")

	public class Lecciones implements Serializable { 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
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
	
	public Long getId() {
		return id;
	}
	public void setId (Long id) {
		this.id = id;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public Pregunta getPregunta() {
		return pregunta;
	}
	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

}

