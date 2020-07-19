package com.lisz.service;

import com.lisz.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

// 这个类里面的T就相当于@Repository和@Qualifier括号里面的那个字符串标识
// @Autowired下面的这个BaseDao<T>相当于@Qualifier
// extends BaseDao/Service<Teacher/Student>相当于@Service("Teacher/Student")
// 应用的时候是两个Service各自注入各自的Dao
public class BaseService<T>{
	@Autowired
	private BaseDao<T> baseDao;

	public void save() {
		baseDao.save();
	}
}
