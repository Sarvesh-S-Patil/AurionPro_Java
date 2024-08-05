package com.apro.isp.solution.test;

import com.apro.isp.solution.model.IRobot;
import com.apro.isp.solution.model.IWorkable;
import com.apro.isp.solution.model.ILabour;

public class WorkerTest {
	public static void main(String[] args) {
		IWorkable labour = new ILabour();
		IWorkable robot = new IRobot();
		labour.start();
		robot.start();
	}

}
