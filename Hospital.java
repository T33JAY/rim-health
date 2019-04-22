/*
 * @name 			RIM Health
 * 
 * @authors 		Ross Hart
 * 					Ruth Gideon
 * 					Inagbo Tamuno
 * 					Maryam Modibbo
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
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
	
	private ArrayList<Lab> labs;
	
	private ArrayList<OperationTheater> theaters;
	
	private ArrayList<Doctor> doctors;
	
	private ArrayList<Nurse> nurses;
	
	private ArrayList<Patient> patients;
	
	
	public Hospital(String hName, String hAddress, ArrayList<Doctor> hDoctors, ArrayList<Nurse> hNurses, ArrayList<Patient> hPatients) {
    	
		name = hName;
        
        address = hAddress;
        
        //numberOfStaff = hNumOfStaff;
        
        wards = new ArrayList<Ward>();
        
        labs = new ArrayList<Lab>();
        
        theaters = new ArrayList<OperationTheater>();
        
        doctors = hDoctors;
        
        nurses = hNurses;
        
        patients = hPatients;
        
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
	
	public  ArrayList<Lab> getLabs() {
		
		return this.labs;
		
	}
	
	public  ArrayList<OperationTheater> getTheaters() {
		
		return this.theaters;
		
	}
	
	public  ArrayList<Doctor> getDoctors() {
		
		return this.doctors;
		
	}
	
	public  ArrayList<Nurse> getNurses() {
		
		return this.nurses;
		
	}
	
	public  ArrayList<Patient> getPatients() {
		
		return this.patients;
		
	}
	
    public void openWard(String wNum, String wType, String wFacility) {
    	
    	Ward wd = new Ward(wNum, wType, wFacility);
    	
    	wards.add(wd);
    	
    }
    
    public void openLab(String lFacility, String lNum) {
    	
    	Lab lb = new Lab(lFacility, lNum);
    	
    	labs.add(lb);
    	
    }
	
}
