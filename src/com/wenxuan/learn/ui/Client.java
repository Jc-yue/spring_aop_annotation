package com.wenxuan.learn.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wenxuan.learn.service.CustomerService;

public class Client {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		customerService.updateCustomer(10L);
	}
}
