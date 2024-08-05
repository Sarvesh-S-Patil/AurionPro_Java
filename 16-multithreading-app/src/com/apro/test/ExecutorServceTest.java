package com.apro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.apro.model.Task;

public class ExecutorServceTest {
	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processors : "+ coreCount);
		ExecutorService executor = Executors.newFixedThreadPool(coreCount);
		for(int i=0;i<100;i++) {
			executor.execute(new Task());
		}
	}

}
