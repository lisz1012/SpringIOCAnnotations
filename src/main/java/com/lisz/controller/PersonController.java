package com.lisz.controller;

import com.lisz.service.PersonService;
import com.lisz.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

	/**
	 * 通过@Autowired注解能够完成自动注入的功能，默认按照类型自动注入
	 * 如果找到一个，则直接赋值；如果没找到则抛出异常；如果找到多个就会按照变量名作为id继续装配：匹配上了继续装配，否则抛出异常
	 * 要存在这么个类名等于这里的变量名首字母大写，这样才可以转换为变量名对应的ID。如果变量名是personService2，但是还想要
	 * PersonService的对象注入进来，那就要写 @Qualifier
	 */
	@Autowired
	//@Qualifier("PersonService")
	private PersonService personService2;

	public void save() {
		personService2.save();
	}
}
