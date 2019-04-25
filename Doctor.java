/*
 * @name 			RIM Health
 * 
 * @author	 		Ruth Gideon
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Mon, 22nd April, 2019
 * 
 * */

import java.util.List;

public class Doctor {

	private String name;
	
	private String StaffID;
	
	private String level;
    
	private List<Patient> patientlist;

    

    public Doctor(String a, String b, String c) {
        
    	this.name = a;
        
    	this.StaffID = c;
        
    	this.level = b;
    	
    }

    public String getName() {
        
    	return name;
    
    }

    public String getLevel() {
        
    	return level;
    
    }

    public String getStaffID() {
        
    	return StaffID;
    
    }

    public List<Patient> getPatientList() {
        
    	return patientlist;
    
    }

    public void checkup() {
        
    	System.out.println("Doctor is diagnosing.");
    
    }

}
