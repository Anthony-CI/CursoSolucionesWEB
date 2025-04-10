package com.example.demo.model;

import org.apache.el.parser.AstFalse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "publishers")
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Integer IdPublisher;
	@Column(nullable = false)
	private String Name;
	@Column(nullable = false,length = 150)
	private String Address;
	
	
	
	//public Publisher() {}


/*
	public Publisher(Integer idPublisher, String name) {
		
		IdPublisher = idPublisher;
		Name = name;
	}

*/

	/*
	public Integer getIdPublisher() {
		return IdPublisher;
	}



	public void setIdPublisher(Integer idPublisher) {
		IdPublisher = idPublisher;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}
	*/
	
	
}
