package com.lgd.CultyKids.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="Usuario")
		
		public class Usuario { 
		
	@Id
		private Long id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="clave")
	private String clave;
	
}