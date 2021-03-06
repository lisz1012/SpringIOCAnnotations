package com.lisz.service;

import com.lisz.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service//("PersonService")
@Scope("prototype")
public class PersonService {
	@Autowired
	private PersonDao dao;

	public void save() {
		System.out.println("personService");
		dao.save();
	}

	public String getName() {
		return "name";
	}
}
