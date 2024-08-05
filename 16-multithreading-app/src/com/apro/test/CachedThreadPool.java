package com.apro.test;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.apro.model.Task;

public class CachedThreadPool {
	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=0;i<100;i++) {
			executor.execute(new Task());
		}
	}

}

