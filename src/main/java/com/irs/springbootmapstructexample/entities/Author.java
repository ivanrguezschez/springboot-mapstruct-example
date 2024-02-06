package com.irs.springbootmapstructexample.entities;

import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Basic
	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Basic
	@Column(name = "surname", nullable = false, length = 50)
	private String surname;

	@Basic
	@Column(name = "birth_date", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "author_book", 
		joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"), 
		inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
	private Set<Book> books = new HashSet<>();
}
