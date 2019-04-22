/*
 * @name 			RIM Health
 * 
 * @authors 		Ruth Gideon
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Sat, 20th April, 2019
 * 
 * */

public class Surgeon extends Doctor {

    private int yearsofExperience;
    
    private final String specialty;
    
    private final String name;

    
    
    public Surgeon(String a, String b, String c, int d, String e, String f) {
        
    	super(a, b, c);
        
    	this.yearsofExperience = d;
        
    	this.specialty = e;
        
    	this.name = f;
    
    }
    
    public Integer getyearsofExperience() {
        
    	return yearsofExperience;
    
    }

    public String getspeciality() {
        
    	return specialty;
    
    }
    
    @Override
    public String toString() {
        
    	return (name + "" + specialty);
    
    }

    public void operate() {
        
    	System.out.println("Surgeon is operating.");
    
    }

}