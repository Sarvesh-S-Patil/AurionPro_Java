package com.apro.test;

import com.apro.model.Consumer;
import com.apro.model.Producer;
import com.apro.model.Q;

public class CommunicationTest {
	public static void main(String[] args) {
		Q q = new Q();
		System.out.println("----------------------------------------");
		new Producer(q);
		new Consumer(q);
	}

}
