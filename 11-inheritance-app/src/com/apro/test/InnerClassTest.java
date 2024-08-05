package com.apro.test;
import com.apro.Model.InnerClass;

public class InnerClassTest {
	public static void main(String[] args) {
		InnerClass.inner innerClass = new InnerClass().new inner();
		innerClass.show();
		InnerClass outer = new InnerClass();
		outer.show();
	}

}

//Accessing Outer Class Members: Inner classes have access to the members of the enclosing class (both fields and methods), even if they are private. This allows for better encapsulation.
//Instance and Memory: Non-static inner classes maintain a reference to an instance of the outer class, which may affect memory usage.
//Scoping and Visibility: Inner classes can help logically group classes that are closely related, improving code clarity and maintainability.


//Static nested classes:

//These are declared with the static keyword inside another class.
//They cannot access the instance variables and methods of the outer class directly (unless through an object reference).
//They can have static members of their own.


//Non-static nested classes (Inner classes):

//These are defined without the static keyword inside another class.
//They have access to the outer class's instance variables and methods, even if they are private.
