package com.apro.isp.violation.test;

import com.apro.isp.violation.model.ILabour;
import com.apro.isp.violation.model.IRobot;
import com.apro.isp.violation.model.IWorker;

public class WorkerTest {
	public static void main(String[] args) {
		IWorker labour = new ILabour();
		IWorker robot = new IRobot();
		labour.startWork();
		robot.startWork();
	}
}
