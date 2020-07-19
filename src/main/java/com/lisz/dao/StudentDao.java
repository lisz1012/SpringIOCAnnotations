package com.lisz.dao;

import com.lisz.bean.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao extends BaseDao<Student> {
	@Override
	public void save() {
		System.out.println("保存学生");
	}
}
