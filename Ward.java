/*
 * @name 			RIM Health
 * 
 * @authors 		Ross Hart
 * 					Ruth Gideon
 * 					Inagbo Tamuno
 * 					Maryam Modibbo
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Sat, 20th April, 2019
 * 
 * */

public class Ward {

	private String wardNum;
	
	private String type;
	
	private String facility;
	
	public Ward(String wNum, String wType, String wFacility) {
    	
		wardNum = wNum;
        
        type = wType;
        
        facility = wFacility;
        
    }
	
	public String getWardNum() {
		
		return this.wardNum;
		
	}
	
	public String getType() {
		
		return this.type;
		
	}
	
	public String getFacility() {
		
		return this.facility;
		
	}
	
}
