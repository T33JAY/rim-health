/*
 * @name 			RIM Health
 * 
 * @authors 		Ross Hart
 * 					Ruth Gideon
 * 					Inagbo Tamuno
 * 					Maryam Modibbo
 * 
 * @description 	A CSC 306 class challenge to implement a Bank in Java.
 * 
 * @date			Sat, 20th April, 2019
 * 
 * */

import java.util.ArrayList;

public class Hospital {
	
	private String name;
	
	private String address;
	
	private Integer numberOfStaff;
	
	private ArrayList<Ward> wards;
	
	public Hospital(String hName, String hAddress, Integer hNumOfStaff) {
    	
		name = hName;
        
        address = hAddress;
        
        numberOfStaff = hNumOfStaff;
        
        wards = new ArrayList<Ward>();
        
    }
	
	public String getName() {
		
		return this.name;
		
	}
	
	public String getAddress() {
		
		return this.address;
		
	}
	
	public Integer getNumOfStaff() {
		
		return this.numberOfStaff;
		
	}
	
	public  ArrayList<Ward> getWards() {
		
		return this.wards;
		
	}
	
}
