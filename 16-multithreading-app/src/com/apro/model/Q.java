package com.apro.model;

public class Q {
	int n=0;
	boolean value=false;
	
	public synchronized int get() {
		while(!value) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("GOT : "+n);
		value=false;
		notify();
		return n;
	}
	
	public synchronized void put(int n) {
		while(value) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("PUT : "+n);
		value= true;
		notify();
		
	}
}
