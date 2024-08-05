package com.apro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionString {
	public static void main(String[] args) {
		
		try {
			Class stringClass = Class.forName("java.lang.String");
			Constructor[] constructors = stringClass.getConstructors();
			for(Constructor constructor : constructors) {
				Class[] parameterTypes = constructor.getParameterTypes();
				System.out.println("Constructor "+constructor.getName());
				for(Class parameterType : parameterTypes) {
					System.out.print(parameterType.getSimpleName()+",");
				}
			}
			System.out.println();
			System.out.println("-----------------------------------------");
			Method[] methods =stringClass.getMethods();
			for(Method method : methods) {
				System.out.println(method.getName());
				Object[] pTypes =method.getGenericParameterTypes();
				for(Object obj:pTypes) {
					System.out.print(obj.toString()+" ");
				}
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

