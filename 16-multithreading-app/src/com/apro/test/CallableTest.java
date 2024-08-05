package com.apro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.apro.model.NewTask;

public class CallableTest {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> val =  executor.submit(new NewTask());
		
		List<NewTask> list = new ArrayList<NewTask>();
		list.add(new NewTask());
		list.add(new NewTask());
		list.add(new NewTask());
		list.add(new NewTask());
		list.add(new NewTask());
		list.add(new NewTask());
		
		try {
			//System.out.println(val.get());
			List<Future<Integer>> futures= executor.invokeAll(list);
			for(Future<Integer> future : futures) {
				System.out.println(future.get());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
