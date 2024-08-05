package com.apro.test;

public class RunnableThread implements Runnable {
	
	private Thread thread;

	public RunnableThread() {
		super();
		thread = new Thread(this);
		thread.start();
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	@Override
	public void run() {
		for(int i=5;i>0;i++) {
			System.out.println(Thread.currentThread());
			Thread currentThread = Thread.currentThread();
			try {
				currentThread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
