package com.apro.strategy.model;

public class OperationStrategy {
	IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	public void doOperation(int a,int b) {
		System.out.println(operation.doOperation(a, b));
	}
	

}
