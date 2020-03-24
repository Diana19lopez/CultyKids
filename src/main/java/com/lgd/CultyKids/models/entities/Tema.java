package com.lgd.CultyKids.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Tema")
		
		public class Tema implements Serializable { 
		private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
	
	@Column(name="tema")
	private String tema;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="nivel_id",nullable=false)
	private Nivel nivel;

	public Long getId() {
		return id;
	}
	public void setId (Long id) {
		this.id = id;
	}
	
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
}
