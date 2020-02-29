package com.lgd.CultyKids.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="Nivel")
		
		public class Nivel { 
		
	@Id
		private Long id;
	
	@Column(name="nivel")
	private String nivel;
	
}