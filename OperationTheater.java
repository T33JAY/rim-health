/*
 * @name 			RIM Health
 * 
 * @authors 		Inagbo Tamuno
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Sat, 20th April, 2019
 * 
 * */

public class OperationTheater {
  
    private String theatreID;
    
    private String type;
    
    private String facility;


    
    public OperationTheater(String theatreID, String type, String facility) {

        this.theatreID = theatreID;

        this.type = type;

        this.facility = facility;
        
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

    public String getFacility() {

        return facility;

    }

    public void setFacility(String facility) {

        this.facility = facility;

    }


}
