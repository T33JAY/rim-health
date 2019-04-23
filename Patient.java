/*
 * @name 			RIM Health
 * 
 * @authors 		Maryam Modibbo
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Mon, 22nd April, 2019
 * 
 * */


public class Patient {
	
    private int patientID;
    
    private String patientName;
    
    private int patientAge;
    
    private String  patientGender;
    
    private String patientAddress;
    
    private String condition;
    
    private Ward ward;

    
    
    public Patient (
    		int patientID, String patientName, int patientAge,String patientGender, 
    		String patientAddress, String condition, Ward ward
    ) 
    {
        
    	this.patientID = patientID;
        
    	this.patientName = patientName;
        
    	this.patientAge = patientAge;
        
    	this.patientGender = patientGender;
        
        this.patientAddress = patientAddress;
        
        this.condition = condition;
        
        this.ward = ward;
    
    }   

    public void setpatientID(int patientID){
        
    	this.patientID = patientID;
    
    }
    
    public int getpatientID(){
        
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
    
    /**
    public String getCondition(){
        
    	return disease;
    }
    **/
    
    @Override
    public String toString(){
        
    	return (
    			patientID +" "+ patientName +" "+ patientAge +" "+ 
    			patientGender +" "+ patientAddress +" "+ condition +" "+ ward
    	);
    }

}
