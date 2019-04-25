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

public class OperationTheater {
  
    private String theatreID;
    
    private String type;


    
    public OperationTheater(String theatreID, String type) {

        this.theatreID = theatreID;

        this.type = type;
        
    }

    public String getTheatreID() {

        return theatreID;

    }

    public void setTheatreID(String tID) {

        this.theatreID = tID;

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        this.type = type;

    }

}
