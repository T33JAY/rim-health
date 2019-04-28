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

import java.util.concurrent.atomic.AtomicInteger;

public class Ward {

	private static final AtomicInteger count = new AtomicInteger(0);

	private String wardNum;
	
	private String type;
	
	
	
	public Ward(String wType) {
    	
		wardNum = "FMC-W-0" + count;
        
        type = wType;
        
    }
	
	public String getWardNum() {
		
		return this.wardNum;
		
	}
	
	public String getType() {
		
		return this.type;
		
	}
	
}
