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


public class Specialist extends Doctor {

    private int yearsofExperience;
    
    private String specialty;

    
    
    public Specialist(String dname, String did, String dlevel, int slexp, String slspec, String i) {
        
    	super(dname, did, dlevel);
        
    	this.yearsofExperience = slexp;
        
    	this.specialty = slspec;
    
    }

    public int getYearsofExperience() {
        
    	return yearsofExperience;
    	
    }

    public void setYearsofExperience(int yearsofExperience) {
        
    	this.yearsofExperience = yearsofExperience;
    	
    }

    public String getSpecialty() {
        
    	return specialty;
    	
    }

    public void setSpecialty(String specialty) {
        
    	this.specialty = specialty;
    
    }
    
    public void diagnosepatient() {
    	
    	System.out.println("The patient is being diagnosed by the specialist");
    
    }
    
}

