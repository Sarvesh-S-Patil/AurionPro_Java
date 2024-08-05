package com.apro.test;

import com.apro.model.ITest;
import com.apro.model.Reference;

public class ReferenceTest {
	public static void main(String[] args) {
		ITest reference = Reference::new;
		method(reference);
		Reference object = new Reference();
		ITest reference2=object::print;
		method(reference2);
		ITest reference3 = Reference::staticPrint;
		method(reference3);
	}

	public static void method(ITest test) {
		test.run();
	}
}
