package com.lisz.controller;

import com.lisz.dao.PersonDao;
import com.lisz.service.PersonService;
import com.lisz.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

	/**
	 * 通过@Autowired注解能够完成自动注入的功能，默认按照类型自动注入
	 * 如果找到一个，则直接赋值；如果没找到则抛出异常；如果找到多个就会按照变量名作为id,与类型首字母小写之后的结果继续查找并装配：
	 * 匹配上了继续装配，否则抛出异常
	 * 要存在这么个类名等于这里的变量名首字母大写，这样才可以转换为变量名对应的ID。如果变量名是personService2，但是还想要
	 * PersonService的对象注入进来，那就要写 @Qualifier
	 * 使用@Resource可以完成@Autowired相同的功能，但是区别是@Resource位于javax.annotation.Resource 是JDK提供的功能，
	 * 而@Autowired是spring提供的功能，@Resource可以在其他框架中使用，而@Autowired只能在Spring中使用，@Resource扩展性好
	 * 一些。@Resource按照名称装配，@Autowired按照类型进行装配。@Autowired先type后name，@Resource反之
	 */
	@Autowired
	//@Qualifier("PersonService")
	private PersonService personService2;

	public void save() {
		personService2.save();
	}

	@Autowired
	public void testAutowiredAtMethods(){
		// 当@Autowired添加到方法上的时候，此方法在创建对象的时候会默认调用
		System.out.println("hello");
	}

	@Autowired
	public void testAutowiredAtMethods2(@Qualifier("personDao") PersonDao personDao){
		// 当@Autowired添加到方法上的时候，此方法在创建对象的时候会默认调用
		// 同时方法中的参数会自动装配，从spring容器中传进来
		personDao.update();
	}
}
