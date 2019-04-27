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

public class Surgeon extends Doctor {


    private int yearsofExperience;
    
    private final String specialty;

    
    
    public Surgeon(String dname, String did, String dlevel, int sexp, String sspec, String f) {
        
    	super(dname, did, dlevel);
        
    	this.yearsofExperience = sexp;
        
    	this.specialty = sspec;
    
    }
    
    public Integer getyearsofExperience() {
        
    	return yearsofExperience;
    
    }

    public String getspeciality() {
        
    	return specialty;
    
    }
    
    @Override
    public String toString() {
        
    	return (super.getName() + "" + specialty);
    
    }

    public void operate() {
        
    	System.out.println("Operation in progress");
    
    }

}