package com.zhouyu;

import com.zhouyu.boot.ZhouyuSpringApplication;
import com.zhouyu.boot.ZhouyuSpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@ZhouyuSpringBootApplication
public class Test {

	@Bean
	public DispatcherServlet dispacherServlet(){
		DispatcherServlet dispacherServlet = new DispatcherServlet();
		return dispacherServlet;
	}

	public static void main(String[] args) {
		ZhouyuSpringApplication.run(Test.class);
	}
}
