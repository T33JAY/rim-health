/*
 * @name 			RIM Health
 * 
 * @authors 		Inagbo Tamuno
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Wed, 24th April, 2019
 * 
 * */

public class Admin {

    private String adminID;
    
    private String adminName;
    
    

    public Admin (String adminID, String adminName) {
    	
        this.adminID = adminID;
        
        this.adminName = adminName;
    
    }

    public String getAdminID() {
     
    	return adminID;
    
    }

    public void setAdminID(String adminID) {
        
    	this.adminID = adminID;
    
    }

    public String getAdminName() {
    	
        return adminName;
    
    }

    public void setAdminName(String adminName) {
        
    	this.adminName = adminName;
    
    }

    public void generateBill() {
    
    	//TO DO: Logic??
    
    }
    
    public void maintainRecords() {
        
    	//TO DO: Logic??
    
    }

    public void assignNurse(Nurse nurse, Patient patient) {
    
        System.out.println("You have successfully assigned Nurse "+nurse.getFirstName()+" to the patient with ID " +patient.getpatientID());
    
    }

    public void admitPatient(Patient patient) {
        /* 
        TO DO: Check for unassigned ward (already existing instances)
               Assign to the ward to the patient with patientID 
        */
        System.out.println("You have successfully admitted "+patient.getpatientName()+" as a patient");
    
    }


    public void assignSurgeon(Doctor doctor, Patient patient) {
        
    	System.out.println("You have successfully assigned a surgeon to "+patient.getpatientName());
    
    }

}
