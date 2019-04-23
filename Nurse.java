/*
 * @name 			RIM Health
 * 
 * @author	 		Inagbo Tamuno
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Tue, 23rd April, 2019
 * 
 * */

public class Nurse {
  
	private String staffID;
	
	private String firstName;
	
	private String lastName;
	
	private String qualification;

	
	
    public Nurse(String staffID, String firstName, String lastName, String qualification) {

        this.staffID = staffID;

        this.firstName = firstName;

        this.lastName = lastName;

        this.qualification = qualification;
        
    }

    public String getstaffID() {

        return staffID;

    }

    public void setStaffID(String staffID) {

        this.staffID = staffID;

    }

    public String getWholeName() {

        return firstName + " " + lastName;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }


    public String getQualification() {

        return qualification;

    }

    public void setQualification(String qualification) {

        this.qualification = qualification;

    }

}
