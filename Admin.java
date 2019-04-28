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

import java.util.concurrent.atomic.AtomicInteger;


public class Admin {

    private static final AtomicInteger count = new AtomicInteger(0);

    private String adminID;
    
    private String adminName;
    
    

    public Admin (String adminName) {

        this.adminID = "FMC-P-0" + count.incrementAndGet();
        
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

        System.out.println("\nTotal sum of medical expenses forwarded to the accounting department");
    
    }
    
    public void maintainRecords() {

        System.out.println("\nDatabase updated.");
    
    }

    public void assignNurse(Nurse nurse, Patient patient) {
    
        System.out.println(
        		"You have successfully assigned Nurse " + nurse.getFirstName() +
        		" to the patient with ID "+ patient.getpatientID()
        );
    
    }

    public void admitPatient(Patient patient, Hospital hospital, String wardType) {
        
    	patient.setWard(hospital.openWard(wardType));
        
    	System.out.println("You have successfully admitted " + patient.getpatientName() + "as a patient");
    
    }


    public void assignSurgeon(Surgeon surgeon, Patient patient) {
        
    	System.out.println("You have successfully assigned a surgeon to " + patient.getpatientName());
    
    }

}
