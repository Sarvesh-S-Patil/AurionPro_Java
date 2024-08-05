package com.apro.threads;

public class MyThread  extends Thread{
	
	
	public MyThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for(int i=5;i>=0;i--) {
			System.out.println(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
