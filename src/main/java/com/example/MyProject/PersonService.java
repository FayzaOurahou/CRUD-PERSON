package com.example.MyProject;

import java.util.List;

public interface PersonService {
	
	List<Person> list();
	Person listId(int id);
	Person add (Person p);
	Person edit(Person p);
	Person delete(int id);
	
}
