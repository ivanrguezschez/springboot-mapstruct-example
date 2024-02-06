package com.irs.springbootmapstructexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irs.springbootmapstructexample.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
