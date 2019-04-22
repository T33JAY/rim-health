/*
 * @name 			RIM Health
 * 
 * @authors 		Ross Hart
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Sat, 20th April, 2019
 * 
 * */

public class Lab {
	
	private String facility;
	
	private String labNum;
	
	
	
	public Lab(String lFacility, String lNum) {
    	
		facility = lFacility;
        
        labNum = lNum;
        
    }
	
	public String getFacility() {
		
		return this.facility;
		
	}
	
	public String getLabNum() {
		
		return this.labNum;
		
	}
	
}
