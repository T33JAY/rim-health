/*
 * @name 			RIM Health
 * 
 * @authors 		Ross Hart
 * 					Ruth Gideon
 * 					Inagbo Tamuno
 * 					Maryam Modibbo
 * 
 * @description 	A CSC 306 class challenge to implement a Bank in Java.
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
