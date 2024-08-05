package com.apro.test;

public class ExceptionTest {
	public static void main(String[] args) {

		try {
			int number1=Integer.parseInt(args[0]);
			int number2=Integer.parseInt(args[1]);
			double result = number1/number2;
			System.out.println("Division is : "+result);
		}
		catch(ArithmeticException exception) {
			System.out.println("Enter valid number 2");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Division requires two number , please pass two numbers as arguments");
		}
		catch(NumberFormatException exception) {
			System.out.println("Enter arguments as numbers only");
		}
		catch(Exception exception) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Exit");
		}
		
	}

}
