package com.apro.threads;

public class MytThreadTest {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 =  new MyThread();
		MyThread thread3 = new MyThread();
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
	}

}
