/*
 * @name 			RIM Health
 * 
 * @author	 		Ross Hart
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Sat, 20th April, 2019
 * 
 * */

public class Ward {

	private String wardNum;
	
	private String type;
	
	
	
	public Ward(String wNum, String wType) {
    	
		wardNum = wNum;
        
        type = wType;
        
    }
	
	public String getWardNum() {
		
		return this.wardNum;
		
	}
	
	public String getType() {
		
		return this.type;
		
	}
	
}
