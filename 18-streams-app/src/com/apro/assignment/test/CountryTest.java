package com.apro.assignment.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.apro.assignment.model.Country;
import com.apro.assignment.model.Region;

public class CountryTest {
	public static void main(String[] args) {
		List<Country> countries = new ArrayList<>();
		
		try {
			File file = new File("D:\\AproJava Training\\18-streams-app\\src\\com\\apro\\assignment\\test\\CountryList.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] splitLine = line.split(",");
				String shortName = splitLine[0].trim().substring(1, splitLine[0].length()-1);
				String countryName= splitLine[1].trim().substring(1,splitLine[1].length()-2);
				int regionId = (int)(splitLine[2].trim().charAt(0)-'0');
				countries.add(new Country(shortName,countryName,regionId));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String countryName = getCountryName(countries, "IT");
		List<String> countriesByRegion = getCountriesByRegion(countries, 1);
		Long countryCountByRegion = getCountryCountByRegion(countries, Region.Europe);
		System.out.println(countryName);
		System.out.println(countriesByRegion);
		System.out.println(countryCountByRegion);
		
		
	}
	
	public static String getCountryName(List<Country> countries,String countryCode) {
		List<Country> ans = countries.stream().filter((country)->country.getShortName().equals(countryCode)).collect(Collectors.toList());
		return ans.get(0).getCountryName();
	}
	
	public static List<String> getCountriesByRegion(List<Country>countries,int regionId){
		List<String> ans = countries.stream()
									.filter((country) -> country.getRegionId()==regionId)
									.map((country)-> country.getCountryName())
									.distinct()
									.collect(Collectors.toList());
		return ans;
		
	}
	
	public static long getCountryCountByRegion(List<Country>countries,Region region) {
		long count = countries.stream()
							.filter((country)->country.getRegion()==region)
							.map((country)-> country.getCountryName())
							.distinct()
							.count();
		return count;
		
	}

}
