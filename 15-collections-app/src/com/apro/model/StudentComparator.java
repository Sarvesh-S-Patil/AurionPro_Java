package com.apro.model;

import java.util.Comparator;

public class StudentComparator {
	
	public static class StudentRollNumberComparator  implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getRollNumber()>o2.getRollNumber()) {
				return 1;
			}
			if(o1.getRollNumber()<o2.getRollNumber()) {
				return -1;
			}
			return 0;
		}

	}
	
	public static class StudentPercentageComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getPercentage()>o2.getPercentage()) {
				return 1;
			}
			if(o1.getPercentage()<o2.getPercentage()) {
				return -1;
			}
			return 0;
		}

	}
	
	public static class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			String name1 = o1.getName();
			String name2 = o2.getName();
			return name1.compareTo(name2);
		}

	}


}
