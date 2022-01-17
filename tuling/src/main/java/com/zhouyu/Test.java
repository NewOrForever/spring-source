package com.zhouyu;

import com.zhouyu.service.AService;
import com.zhouyu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();



		// 测试getSingle()这个解决循环依赖核心方法的bug
		// getSingle方法需要加入sleep来模拟阻塞
		// AService和BService类上使用@Lazy注解，为了不在spring容器初始化的时候创建bean而是在使用的时候创建bean
		/*new Thread(){
			@Override
			public void run() {
				AService aService = (AService) applicationContext.getBean("AService");
				System.out.println(aService);
			}
		}.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		new Thread(){
			@Override
			public void run() {
				AService aService = (AService) applicationContext.getBean("AService");
				System.out.println(aService);
			}
		}.start();*/

	}
}
