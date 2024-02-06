package com.irs.springbootmapstructexample.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "email", nullable = false, length = 250)
	private String email;
	
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	
	@Column(name = "name", nullable = true, length = 50)
	private String name;
	
	@Column(name = "surname", nullable = true, length = 50)
	private String surname;
}
