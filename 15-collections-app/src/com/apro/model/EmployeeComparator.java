package com.apro.model;
import java.util.Comparator;
import com.apro.model.Employee;;
public class EmployeeComparator {
	
	public static class EmployeeIdComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getId()-o2.getId();
		}
		
	}
	
	public static class EmployeeNameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			String name1= o1.getName();
			String name2=o2.getName();
			return name1.compareTo(name2);
		}
		
	}
	
	public static class EmployeeSalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getSalary()>o2.getSalary()) {
				return 1;
			}
			if(o1.getSalary()<o2.getSalary()) {
				return -1;
			}
			return 0;
		}
	}
}
