package com.springframework.springAOP.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.springAOP.Service.ProductService;

public class SpringAopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("/com/springframework/springAOP/Test/configAOP.xml");
		ProductService  productService = (ProductService) context.getBean("productService");
		System.out.print("Multiplication Result :: " + productService.multiply(101, 101));
	}

}
