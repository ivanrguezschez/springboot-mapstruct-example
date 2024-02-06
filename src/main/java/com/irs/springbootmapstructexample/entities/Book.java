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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Basic
	@Column(name = "title", nullable = false, length = 250)
	private String title;

	@Basic
	@Column(name = "release_date", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date releaseDate;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	private Set<Author> authors = new HashSet<>();

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	private Set<User> users = new HashSet<>();
}
