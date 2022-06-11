package com.example.MyProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService{

	@Autowired
	private PersonRepository repository;

	public List<Person> list() {
		 
		return repository.findAll();
	}

	public Person listId(int id) {
		return repository.findOne(id);
	}

	public Person add(Person p) {
		return repository.save(p);
	}

	public Person edit(Person p) {
		return repository.save(p);
	}

	public Person delete(int id) {
		Person p = repository.findOne(id);
		if(p!=null) {
			repository.delete(p);
		}
		return p;
	}

	
	

}
