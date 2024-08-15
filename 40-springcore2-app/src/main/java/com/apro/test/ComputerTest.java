package com.apro.test;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apro.model.Computer;
import com.apro.model.HardDisk;
import com.apro.model.config;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Computer computer = (Computer) context.getBean("computer","Computer.class");
		System.out.println(computer);

	}

}
