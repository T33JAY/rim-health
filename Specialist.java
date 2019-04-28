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

    
    private String specialty;

    
    
    public Specialist(String dname, String did, String dlevel, int slexp, String slspec) {
        
    	super(dname, did, dlevel, slexp);

        
    	this.specialty = slspec;
    
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

