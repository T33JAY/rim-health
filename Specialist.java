/*
 * @name 			RIM Health
 * 
 * @authors 		Ruth Gideon
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Mon, 22nd April, 2019
 * 
 * */

//import java.util.List;

public class Specialist extends Doctor {

    //private List<Prescription> prescriptions;
    
	//private List<Test> test;

    private int yearsofExperience;
   
    private String specialty;
    
    //private String name;

    
    
    public Specialist(String a, String b, String c, int g, String h, String i) {
        
    	super(a, b, c);
        
    	this.yearsofExperience = g;
        
    	this.specialty = h;
        
    	//this.name = i;
    
    }

    
    /**
    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<Test> getTest() {
        return test;
    }
    

    public void setTest(List<Test> test) {
        this.test = test;
    }
    **/

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
    
}

