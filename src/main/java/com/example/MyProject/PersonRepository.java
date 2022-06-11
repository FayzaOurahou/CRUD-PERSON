package com.example.MyProject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	
        List<Person>findAll();
	    Person findOne(int id);
	    Person save(Person p);
        void delete(Person p);

}
