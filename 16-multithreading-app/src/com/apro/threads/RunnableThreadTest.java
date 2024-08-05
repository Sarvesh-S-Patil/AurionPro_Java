package com.apro.threads;

public class RunnableThreadTest {
	public static void main(String[] args) {
	 RunnableThreadTest thread1=  new RunnableThreadTest();
	 for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
