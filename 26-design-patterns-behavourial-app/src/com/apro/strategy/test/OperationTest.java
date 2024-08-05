package com.apro.strategy.test;

import com.apro.strategy.model.AdditionOperation;
import com.apro.strategy.model.MultiplicationOperation;
import com.apro.strategy.model.OperationStrategy;

public class OperationTest {
	public static void main(String[] args) {
		OperationStrategy operationStrategy = new OperationStrategy(new AdditionOperation());
		operationStrategy.doOperation(5, 10);
		operationStrategy.setOperation(new MultiplicationOperation());
		operationStrategy.doOperation(5, 10);
	}

}
