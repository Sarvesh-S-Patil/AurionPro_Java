package com.apro.model;

public class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		super();
		this.q = q;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while(true) {
			int n = q.get();
		}
		
	}
	
	

}
