package com.apro.model;

public class Producer implements Runnable{
	Q q;
	
	public Producer(Q q) {
		super();
		this.q = q;
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		int i=0;
		while(i<30) {
			q.put(i++);
		}
	}
}
