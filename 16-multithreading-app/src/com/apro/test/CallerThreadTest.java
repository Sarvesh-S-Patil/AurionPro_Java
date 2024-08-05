package com.apro.test;

import com.apro.threads.CallMe;
import com.apro.threads.CallerThread;

public class CallerThreadTest {
	public static void main(String[] args) {
		CallMe target = new CallMe();
		CallerThread thread1 = new CallerThread("Hello",target);
		CallerThread thread2 = new CallerThread("Good day",target);
		CallerThread thread3 = new CallerThread("Bye",target);

	}

}
