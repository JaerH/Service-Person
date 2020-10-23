package com.everis.person.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.person.entities.Person;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {

}
