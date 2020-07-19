package com.lisz.dao;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDao {


	public void save() {
		System.out.println("保存成功");
	}

	public void update() {
		System.out.println("更新成功");
	}
}
