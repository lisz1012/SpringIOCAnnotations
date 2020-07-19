package com.lisz.service;

import com.lisz.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService2 extends PersonService {
	@Autowired
	private PersonDao dao;

	public void save() {
		System.out.println("personService2");
		dao.save();
	}
}
