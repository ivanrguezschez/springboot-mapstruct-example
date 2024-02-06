package com.irs.springbootmapstructexample.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users") // Si la tabla se llama "user" Spring da un error, la tabla no se puede llamar "user" 
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Basic
	@Column(name = "email", nullable = false, length = 250)
	private String email;

	@Basic
	@Column(name = "password", nullable = false, length = 50)
	private String password;

	@Basic
	@Column(name = "name", nullable = true, length = 50)
	private String name;

	@Basic
	@Column(name = "surname", nullable = true, length = 50)
	private String surname;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_book", 
		joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), 
		inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
	private Set<Book> books = new HashSet<>();
}
