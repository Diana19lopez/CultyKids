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
@Table(name="PuntajeFinal")
		
		public class PuntajeFinal implements Serializable { 
		private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	
	@Column(name="rango")
	private String rango;
	
	@Column(name="acertadas")
	private String acertadas;

	@Column(name="puntuacionfinal")
	private String puntuacionfinal;
	
	@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="usuario_id",nullable=false)
	private Tema usuario;

	
}