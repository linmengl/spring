package com.springboot.springbootgradle;

import com.springboot.springbootgradle.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootGradleApplicationTests {

	@Test
	public void contextLoads() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestController.class);
		TestController testController = (TestController) context.getBean("testController");
		testController.test(20,"a");
	}

}
