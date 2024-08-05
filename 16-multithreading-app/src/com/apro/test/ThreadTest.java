package com.apro.test;

public class ThreadTest {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		thread.setName("MyThread");
		for(int i=0;i<5;i++) {
			System.out.println(thread.getName()+" : "+i);
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
