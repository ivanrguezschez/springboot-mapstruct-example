package com.irs.springbootmapstructexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irs.springbootmapstructexample.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
