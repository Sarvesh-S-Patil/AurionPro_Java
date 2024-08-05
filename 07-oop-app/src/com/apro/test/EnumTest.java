package com.apro.test;

public class EnumTest {
	enum Month{
		JAN,
		FEB,
		MAR,
		APR,
		MAY,
		JUN,
		JUL,
		AUG,
		SEPT,
		OCT,
		NOV,
		DEC
	}
	public static void main(String[] args) {
		Month month = Month.JAN;
		switch(month) {
			case FEB:
			case MAR:
			case APR:
			case MAY:
				System.out.println("Summer");
				break;
			case JUN:
			case JUL:
			case AUG:
			case SEPT:
				System.out.println("Monsoon");
				break;
			case OCT:
			case NOV:
			case DEC:
			case JAN:
				System.out.println("Winter");
				break;
				
		}
	}

}
