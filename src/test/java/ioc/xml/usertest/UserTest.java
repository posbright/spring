package ioc.xml.usertest;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.com.dzm.xml.entity.User;
import ioc.com.dzm.xml.service.UserService;

public class UserTest {

	ApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("测试开始");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("测试结束！！");
	}

	/**
	 * 通过set方法进行依赖注入，注入对象通过xml进行配置
	 */
	@Test
	public void insertUser() {
		//加载配置信息并创建spring容器
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从spring 容器中取得userService的对象
		UserService userService = context.getBean("userService", UserService.class);
		User u = new User();
		boolean bo = userService.insertUser(u);
		System.out.println(bo);
		User user = userService.selectUser(1);
		System.out.println(user.toString());
	}

}
