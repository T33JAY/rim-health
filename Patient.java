/*
 * @name 			RIM Health
 * 
 * @author	 		Maryam Modibbo
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Mon, 22nd April, 2019
 * 
 * */


import java.util.concurrent.atomic.AtomicInteger;

public class Patient {

    private static final AtomicInteger count = new AtomicInteger(0);

    private String patientID;
    
    private String patientName;
    
    private int patientAge;
    
    private String  patientGender;
    
    private String patientAddress;
    
    private String condition;
    
    private Ward ward;

    
    
    public Patient (String patientName, int patientAge,String patientGender,
    		        String patientAddress, String condition)
    {
        
    	this.patientID = "FMC-P-0" + count.incrementAndGet();
        
    	this.patientName = patientName;
        
    	this.patientAge = patientAge;

    	this.patientGender = patientGender;
        
        this.patientAddress = patientAddress;
        
        this.condition = condition;

    
    }   

    public void setpatientID(String patientID){
        
    	this.patientID = patientID;
    
    }
    
    public String getpatientID(){
        
    	return patientID;
    
    }

    public void setpatientName(String patientName){
        
    	this.patientName = patientName;
    
    }
    
    public String getpatientName(){
        
    	return patientName;
    
    }

    public void setpatientAge(int patientAge){
        
    	this.patientAge = patientAge;
    
    }
    
    public int getpatientAge(){
        
    	return patientAge;
    
    }

    public void setpatientGender(String patientGender){
        
    	this.patientGender = patientGender;
    
    }
    
    public String getpatientGender(){
        
    	return patientGender;
    
    }
    
    public void setpatientAddress(String patientAddress){
        
    	this.patientAddress = patientAddress;
    
    }
    
    public String getpatientAddress(){
        
    	return patientAddress;
    
    }

    public void setCondition(String condition){
        
    	this.condition = condition;
    
    }

    public Ward getWard() {
        return this.ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public void requestCheckup(){
        System.out.println("You've successfully requested for a check-up.");
    }
    
    @Override
    public String toString(){
        
    	return (
    			"Patient ID: "+ this.patientID +"\nPatient Name: "+ patientName +"\nPatient Age: "+ this.patientAge +
                        "\nPatient Gender: "+ this.patientGender +"\n Patient Address: "+ this.patientAddress +
                        "\nPatient Condition: "+ this.condition +"\n Patient Ward: "+ this.ward
    	);
    }

}
