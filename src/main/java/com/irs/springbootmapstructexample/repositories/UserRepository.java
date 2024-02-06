package com.irs.springbootmapstructexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irs.springbootmapstructexample.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
