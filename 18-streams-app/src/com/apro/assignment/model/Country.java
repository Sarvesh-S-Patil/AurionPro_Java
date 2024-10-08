package com.apro.assignment.model;

public class Country {
	private String shortName;
	private String countryName;
	private Region region;
	
	public Country(String shortName, String countryName,int regionID) {
		super();
		this.shortName = shortName;
		this.countryName = countryName;
		setRegion(regionID);
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setRegion(int id) {
		switch(id) {
			case 1:
				this.region =Region.Europe;
				break;
			case 2:
				this.region=Region.America;
				break;
			case 3:
				this.region=Region.Asia;
				break;
			case 4:
				this.region=Region.MiddleEastAsiaAndAfrica;
				break;
			default:
				System.out.println("Invalid Region ID");
		}
	}
	
	public int getRegionId(){
		switch(region) {
			case Europe:
				return 1;
			case America:
				return 2;
			case Asia:
				return 3;
			case MiddleEastAsiaAndAfrica:
				return 4;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Country [shortName=" + shortName + ", countryName=" + countryName + ", region=" + region + "]";
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
		
	
	

}
