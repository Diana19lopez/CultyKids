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
@Table(name="Puntajefinal")
		
		public class PuntajeFinal implements Serializable { 
		private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;

	@Column(name="puntuacionfinal")
	private String puntuacionfinal;
	
	@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="usuario_id",nullable=false)
	private Usuario usuario;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="respuesta_id",nullable=false)
	private Respuesta respuesta;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}
	public Respuesta getRespuesta() {
		return respuesta;
	}
}
