package com.lisz;

import com.lisz.controller.PersonController;
import com.lisz.service.PersonService;
import com.lisz.service.StudentService;
import com.lisz.service.TeacherService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
给测试类起名字的时候最好不要叫"Test"，会跟"@Test"有冲突. 测试方法不可以有参数或者返回值.
 */

public class MyTest {
	// 不写参数的话会报错：BeanFactory not initialized or already closed - call 'refresh' before accessing
	private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");

	@Test
	public void test01() {

		// 第一个参数是bean名字，如果和xml文件里的bean的id对不上的话，会报错
		System.out.println(context.getBean("personController", PersonController.class));
		// 现在注释掉xml文件中的bean，改用注解
		System.out.println(context.getBean("personService", PersonService.class));
		// 再次获取，发现和上面的相等，单例。多例的话要再加一个注解：@Scope("prototype")
		System.out.println(context.getBean("personService", PersonService.class));
		// @Autowired
		PersonController controller = context.getBean("personController", PersonController.class);
		controller.save();
	}

	@Test
	public void test02() {
		StudentService studentService = context.getBean("studentService", StudentService.class);
		studentService.save();
		TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
		teacherService.save();
	}
}
