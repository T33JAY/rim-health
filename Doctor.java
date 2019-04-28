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

    	private int yearsOfExperience;
    
	private List<Patient> patientlist;

    

    public Doctor(String dname, String did, String dlevel, int yearsOfExperience) {
        
    	this.name = dname;
        
    	this.StaffID = did;
        
    	this.level = dlevel;

    	this.yearsOfExperience = yearsOfExperience;
    	
    }

    public String getName() {
        
    	return name;
    
    }

    public int getYearsOfExperience(){
        return this.yearsOfExperience;
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
        
    	System.out.println("Checkup in progress.");
    
    }

}
