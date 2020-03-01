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
@Table(name="Pregunta")
		
		public class Pregunta implements Serializable { 
		private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	
	@Column(name="enunciado")
	private String enunciado;
	
	@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="tema_id",nullable=false)
	private Tema tema;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="nivel_id",nullable=false)
	private Nivel nivel;
}
