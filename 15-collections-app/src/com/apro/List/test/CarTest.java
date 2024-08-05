package com.apro.List.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.apro.List.Car;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> cars= new ArrayList<Car>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Cars : ");
		int carCount = scanner.nextInt();
		scanner.nextLine();
		
		createCars(carCount,cars,scanner);
		System.out.println("All");
		for(Car car : cars) {
			System.out.println(car);
			
		}
		
		System.out.println("Max mileage car is : ");
		Car maxMileage = maxMileageCar(cars);
		System.out.println(maxMileage);
	}

	private static void createCars(int carCount, ArrayList<Car> cars, Scanner scanner) {
		// TODO Auto-generated method stub
		for(int i=0;i<carCount;i++) {
			System.out.println("Enter Car ID :");
			int carId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Company Name :");
			String companyName=scanner.nextLine();
			System.out.println("Enter Price :");
			double price=scanner.nextDouble();
			scanner.nextLine();
			System.out.println( "Enter Mileage");
			double mileage=scanner.nextDouble();
			scanner.nextLine();
			Car car = new Car(carId, companyName, price, mileage);
			cars.add(car);
			System.out.println("CAR created successfully");
		
		}
	}
	
	public static Car maxMileageCar(ArrayList<Car> cars) {
		double mileage=0;
		Car maxCar= new Car() ;
		for(Car car : cars) {
			if(car.getMileage()>mileage) {
				mileage= car.getMileage();
				maxCar=car;
			}
		}
		return maxCar;
	}
}